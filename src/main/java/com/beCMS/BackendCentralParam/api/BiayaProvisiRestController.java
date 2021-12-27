package com.beCMS.BackendCentralParam.api;

import java.security.Principal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.beCMS.BackendCentralParam.model.BiayaProvisi;
import com.beCMS.BackendCentralParam.model.userlogin.User;
import com.beCMS.BackendCentralParam.repository.BiayaProvisiRepository;
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
@RequestMapping("/api/biayaprovisi")
@CrossOrigin(origins = "*")
public class BiayaProvisiRestController {

    Logger logger = LoggerFactory.getLogger(BiayaProvisiRestController.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BiayaProvisiRepository biayaProvisiRepository;

    @PostMapping("/getalldata")
    public Map<String, Object> getAllDataBiayaProvisi(Principal principal, Pageable pageable,
            HttpServletResponse response) {
        Map<String, Object> crunchifyMap = new HashMap<String, Object>();
        String id = principal.getName();

        String role = userRepository.cekRoles(id);
        logger.info("NIP : " + id);
        logger.info("ROLE : " + role);
        if (role.contains("USER")) {
            try {
                logger.info("Berhasil GET ALL DATA BiayaProvisi");
                crunchifyMap.put("dataBiayaProvisi", biayaProvisiRepository.getListDataBiayaProvisi());
                crunchifyMap.put("code", "1");
            } catch (Exception e) {
                logger.error("ERROR");
                response.setStatus(400);
                crunchifyMap.put("code", "0");
                crunchifyMap.put("message", "Gagal membuka BiayaProvisi!");
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
    public Map<String, Object> getBiayaProvisi(Principal principal,@PathVariable Integer id,
            HttpServletResponse response) {
        Map<String, Object> crunchifyMap = new HashMap<String, Object>();
        String userId = principal.getName();

        String role = userRepository.cekRoles(userId);
        if (role.contains("USER")) {
            try {
                logger.info("Berhasil BiayaProvisi");
                crunchifyMap.put("biayaProvisi", biayaProvisiRepository.findById(id));
                crunchifyMap.put("code", "1");
            } catch (Exception e) {
                logger.error("ERROR");
                response.setStatus(400);
                crunchifyMap.put("code", "0");
                crunchifyMap.put("message", "Gagal membuka BiayaProvisi!");
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
    public HashMap<String, String> insertBiayaProvisi(@RequestBody BiayaProvisi biayaProvisi,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        System.out.println("hey : " +biayaProvisi.toString());
        biayaProvisi.trace(user.getId());
        biayaProvisiRepository.save(biayaProvisi);

        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input BiayaProvisi Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/inputAndSubmit", consumes = "application/json")
    public HashMap<String, String> insertAndSubmitBiayaProvisi(@RequestBody BiayaProvisi biayaProvisi,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        System.out.println("hey : " +biayaProvisi.toString());
        biayaProvisi.submit(user.getId());
        biayaProvisiRepository.save(biayaProvisi);
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit BiayaProvisi Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/approveData", consumes = "application/json")
    public HashMap<String, String> approveDataBiayaProvisi(@RequestBody BiayaProvisi modelBiayaProvisi,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        Optional<BiayaProvisi> optionalBiayaProvisi = biayaProvisiRepository.findById(modelBiayaProvisi.getId());
        BiayaProvisi approvalModel = optionalBiayaProvisi.get();
        approvalModel.approve(user.getId());
        biayaProvisiRepository.save(approvalModel);
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit Tipe Konsumen Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/declineData", consumes = "application/json")
    public HashMap<String, String> declineDataBiayaProvisi(@RequestBody BiayaProvisi modelBiayaProvisi,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        Optional<BiayaProvisi> optionalBiayaProvisi = biayaProvisiRepository.findById(modelBiayaProvisi.getId());
        BiayaProvisi approvalModel = optionalBiayaProvisi.get();
        approvalModel.decline(user.getId());
        biayaProvisiRepository.save(approvalModel);
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit Tipe Konsumen Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/approve", consumes = "application/json")
    public HashMap<String, String> approveBiayaProvisi(@RequestBody Map<String, Object> data,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));
        for(String id : idList) {
            System.out.println("Mengakses ID : "+id);
            Optional<BiayaProvisi> optionalBiayaProvisi = biayaProvisiRepository.findById(Integer.parseInt(id));
            BiayaProvisi biayaProvisi = optionalBiayaProvisi.get();
            biayaProvisi.approve(user.getId());
            biayaProvisiRepository.save(biayaProvisi);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit BiayaProvisi Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/decline", consumes = "application/json")
    public HashMap<String, String> declineBiayaProvisi(@RequestBody Map<String, Object> data,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));
        for(String id : idList) {
            Optional<BiayaProvisi> optionalBiayaProvisi = biayaProvisiRepository.findById(Integer.parseInt(id));
            BiayaProvisi biayaProvisi = optionalBiayaProvisi.get();
            biayaProvisi.decline(user.getId());
            biayaProvisiRepository.save(biayaProvisi);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit BiayaProvisi Berhasil !");
        return crunchifyMap;
    }


    @PostMapping(path = "/delete", consumes = "application/json")
    public HashMap<String, String> deleteBiayaProvisi(@RequestBody Map<String, Object> data,Principal principal) {
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));

        for(String id : idList) {
            Optional<BiayaProvisi> optionalBiayaProvisi = biayaProvisiRepository.findById(Integer.parseInt(id));
            BiayaProvisi biayaProvisi = optionalBiayaProvisi.get();
            biayaProvisiRepository.delete(biayaProvisi);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Delete BiayaProvisi Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/submit", consumes = "application/json")
    public HashMap<String, String> submitBiayaProvisi(@RequestBody Map<String, Object> data,Principal principal) {
        
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));
        User user = userRepository.findBynip(principal.getName());

        for(String id : idList) {
            Optional<BiayaProvisi> optionalBiayaProvisi = biayaProvisiRepository.findById(Integer.parseInt(id));
            BiayaProvisi biayaProvisi = optionalBiayaProvisi.get();
            biayaProvisi.submit(user.getId());
            biayaProvisiRepository.save(biayaProvisi);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Edit Dan Submit BiayaProvisi Berhasil !");
        return crunchifyMap;
    }
}