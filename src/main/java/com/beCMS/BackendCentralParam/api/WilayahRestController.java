package com.beCMS.BackendCentralParam.api;

import java.security.Principal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.beCMS.BackendCentralParam.model.Wilayah;
import com.beCMS.BackendCentralParam.model.userlogin.User;
import com.beCMS.BackendCentralParam.repository.WilayahRepository;
import com.beCMS.BackendCentralParam.repository.UserRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/wilayah")
@CrossOrigin(origins = "*")
public class WilayahRestController {

    Logger logger = LoggerFactory.getLogger(WilayahRestController.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private WilayahRepository wilayahRepository;

    @PostMapping("/getalldata")
    public Map<String, Object> getAllDataWilayah(Principal principal, Pageable pageable,
            HttpServletResponse response) {
        Map<String, Object> crunchifyMap = new HashMap<String, Object>();
        String id = principal.getName();

        String role = userRepository.cekRoles(id);
        logger.info("NIP : " + id);
        logger.info("ROLE : " + role);
        if (role.contains("USER")) {
            try {
                logger.info("Berhasil GET ALL DATA Wilayah");
                crunchifyMap.put("dataWilayah", wilayahRepository.findAll());
                crunchifyMap.put("code", "1");
            } catch (Exception e) {
                logger.error("ERROR");
                response.setStatus(400);
                crunchifyMap.put("code", "0");
                crunchifyMap.put("message", "Gagal membuka Wilayah!");
            }
            return crunchifyMap;
        } else {
            logger.warn("TIDAK MEMILIKI HAK AKSES");
            response.setStatus(400);
            crunchifyMap.put("code", "00");
            crunchifyMap.put("message", "OOPS. SOMETHING WENT WRONG !");
            return crunchifyMap;
        }
    }

    @GetMapping("/{id}")
    public Map<String, Object> getWilayah(Principal principal,@PathVariable Integer id,
            HttpServletResponse response) {
        Map<String, Object> crunchifyMap = new HashMap<String, Object>();
        String userId = principal.getName();

        String role = userRepository.cekRoles(userId);
        if (role.contains("USER")) {
            try {
                logger.info("Berhasil Wilayah");
                crunchifyMap.put("wilayah", wilayahRepository.findById(id));
                crunchifyMap.put("code", "1");
            } catch (Exception e) {
                logger.error("ERROR");
                response.setStatus(400);
                crunchifyMap.put("code", "0");
                crunchifyMap.put("message", "Gagal membuka Wilayah!");
            }
            return crunchifyMap;
        } else {
            logger.warn("TIDAK MEMILIKI HAK AKSES");
            response.setStatus(400);
            crunchifyMap.put("code", "00");
            crunchifyMap.put("message", "OOPS. SOMETHING WENT WRONG !");
            return crunchifyMap;
        }
    }

    @PostMapping(path = "/input", consumes = "application/json")
    public HashMap<String, String> insertWilayah(@RequestBody Wilayah modelWilayah,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        System.out.println("hey : " +modelWilayah.toString());
        modelWilayah.trace(user.getId());
        wilayahRepository.save(modelWilayah);

        HashMap<String, String> crunchifyMap = new HashMap<String,String>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Wilayah Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/inputAndSubmit", consumes = "application/json")
    public HashMap<String, String> insertAndSubmitWilayah(@RequestBody Wilayah modelWilayah,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        System.out.println("hey : " +modelWilayah.toString());
        modelWilayah.submit(user.getId());
        wilayahRepository.save(modelWilayah);
        
        HashMap<String, String> crunchifyMap = new HashMap<String,String>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit Wilayah Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/approveData", consumes = "application/json")
    public HashMap<String, String> approveDataWilayah(@RequestBody Wilayah modelWilayah,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        Optional<Wilayah> optionalWilayah = wilayahRepository.findById(modelWilayah.getId());
        Wilayah approvalModel = optionalWilayah.get();
        approvalModel.approve(user.getId());
        wilayahRepository.save(approvalModel);
        
        HashMap<String, String> crunchifyMap = new HashMap<String,String>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit Tipe Konsumen Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/declineData", consumes = "application/json")
    public HashMap<String, String> declineDataWilayah(@RequestBody Wilayah modelWilayah,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        Optional<Wilayah> optionalWilayah = wilayahRepository.findById(modelWilayah.getId());
        Wilayah approvalModel = optionalWilayah.get();
        approvalModel.decline(user.getId());
        wilayahRepository.save(approvalModel);
        
        HashMap<String, String> crunchifyMap = new HashMap<String,String>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit Tipe Konsumen Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/approve", consumes = "application/json")
    public HashMap<String, String> approveWilayah(@RequestBody Map<String, Object> data,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));
        for(String id : idList) {
            System.out.println("Mengakses ID : "+id);
            Optional<Wilayah> optionalWilayah = wilayahRepository.findById(Integer.parseInt(id));
            Wilayah modelWilayah = optionalWilayah.get();
            modelWilayah.approve(user.getId());
            wilayahRepository.save(modelWilayah);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<String,String>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit Wilayah Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/decline", consumes = "application/json")
    public HashMap<String, String> declineWilayah(@RequestBody Map<String, Object> data,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));
        for(String id : idList) {
            Optional<Wilayah> optionalWilayah = wilayahRepository.findById(Integer.parseInt(id));
            Wilayah modelWilayah = optionalWilayah.get();
            modelWilayah.decline(user.getId());
            wilayahRepository.save(modelWilayah);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<String,String>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit Wilayah Berhasil !");
        return crunchifyMap;
    }


    @PostMapping(path = "/delete", consumes = "application/json")
    public HashMap<String, String> deleteWilayah(@RequestBody Map<String, Object> data,Principal principal) {
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));

        for(String id : idList) {
            Optional<Wilayah> optionalWilayah = wilayahRepository.findById(Integer.parseInt(id));
            Wilayah modelWilayah = optionalWilayah.get();
            wilayahRepository.delete(modelWilayah);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<String,String>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Delete Wilayah Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/submit", consumes = "application/json")
    public HashMap<String, String> submitWilayah(@RequestBody Map<String, Object> data,Principal principal) {
        
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));
        User user = userRepository.findBynip(principal.getName());

        for(String id : idList) {
            Optional<Wilayah> optionalWilayah = wilayahRepository.findById(Integer.parseInt(id));
            Wilayah modelWilayah = optionalWilayah.get();
            modelWilayah.submit(user.getId());
            wilayahRepository.save(modelWilayah);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<String,String>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Edit Dan Submit Wilayah Berhasil !");
        return crunchifyMap;
    }
}