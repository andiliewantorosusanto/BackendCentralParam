package com.beCMS.BackendCentralParam.api;

import java.security.Principal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.beCMS.BackendCentralParam.model.TujuanPenggunaan;
import com.beCMS.BackendCentralParam.model.userlogin.User;
import com.beCMS.BackendCentralParam.repository.TujuanPenggunaanRepository;
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
@RequestMapping("/api/tujuanPenggunaan")
@CrossOrigin(origins = "*")
public class TujuanPenggunaanRestController {

    Logger logger = LoggerFactory.getLogger(TujuanPenggunaanRestController.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TujuanPenggunaanRepository tujuanPenggunaanRepository;

    @PostMapping("/getalldata")
    public Map<String, Object> getAllDataTujuanPenggunaan(Principal principal, Pageable pageable,
            HttpServletResponse response) {
        Map<String, Object> crunchifyMap = new HashMap<String, Object>();
        String id = principal.getName();

        String role = userRepository.cekRoles(id);
        logger.info("NIP : " + id);
        logger.info("ROLE : " + role);
        if (role.contains("USER")) {
            try {
                logger.info("Berhasil GET ALL DATA TujuanPenggunaan");
                crunchifyMap.put("dataTujuanPenggunaan", tujuanPenggunaanRepository.findAll());
                crunchifyMap.put("code", "1");
            } catch (Exception e) {
                logger.error("ERROR");
                response.setStatus(400);
                crunchifyMap.put("code", "0");
                crunchifyMap.put("message", "Gagal membuka TujuanPenggunaan!");
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
    public Map<String, Object> getTujuanPenggunaan(Principal principal,@PathVariable Integer id,
            HttpServletResponse response) {
        Map<String, Object> crunchifyMap = new HashMap<String, Object>();
        String userId = principal.getName();

        String role = userRepository.cekRoles(userId);
        if (role.contains("USER")) {
            try {
                logger.info("Berhasil TujuanPenggunaan");
                crunchifyMap.put("tujuanPenggunaan", tujuanPenggunaanRepository.findById(id));
                crunchifyMap.put("code", "1");
            } catch (Exception e) {
                logger.error("ERROR");
                response.setStatus(400);
                crunchifyMap.put("code", "0");
                crunchifyMap.put("message", "Gagal membuka TujuanPenggunaan!");
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
    public HashMap<String, String> insertTujuanPenggunaan(@RequestBody TujuanPenggunaan modelTujuanPenggunaan,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        System.out.println("hey : " +modelTujuanPenggunaan.toString());
        modelTujuanPenggunaan.trace(user.getId());
        tujuanPenggunaanRepository.save(modelTujuanPenggunaan);

        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input TujuanPenggunaan Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/inputAndSubmit", consumes = "application/json")
    public HashMap<String, String> insertAndSubmitTujuanPenggunaan(@RequestBody TujuanPenggunaan modelTujuanPenggunaan,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        System.out.println("hey : " +modelTujuanPenggunaan.toString());
        modelTujuanPenggunaan.submit(user.getId());
        tujuanPenggunaanRepository.save(modelTujuanPenggunaan);
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit TujuanPenggunaan Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/approveData", consumes = "application/json")
    public HashMap<String, String> approveDataTujuanPenggunaan(@RequestBody TujuanPenggunaan modelTujuanPenggunaan,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        modelTujuanPenggunaan.approve(user.getId());
        tujuanPenggunaanRepository.save(modelTujuanPenggunaan);
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit TujuanPenggunaan Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/declineData", consumes = "application/json")
    public HashMap<String, String> declineDataTujuanPenggunaan(@RequestBody TujuanPenggunaan modelTujuanPenggunaan,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        modelTujuanPenggunaan.decline(user.getId());
        tujuanPenggunaanRepository.save(modelTujuanPenggunaan);
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit TujuanPenggunaan Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/approve", consumes = "application/json")
    public HashMap<String, String> approveTujuanPenggunaan(@RequestBody Map<String, Object> data,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));
        for(String id : idList) {
            System.out.println("Mengakses ID : "+id);
            Optional<TujuanPenggunaan> optionalTujuanPenggunaan = tujuanPenggunaanRepository.findById(Integer.parseInt(id));
            TujuanPenggunaan modelTujuanPenggunaan = optionalTujuanPenggunaan.get();
            modelTujuanPenggunaan.approve(user.getId());
            tujuanPenggunaanRepository.save(modelTujuanPenggunaan);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit TujuanPenggunaan Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/decline", consumes = "application/json")
    public HashMap<String, String> declineTujuanPenggunaan(@RequestBody Map<String, Object> data,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));
        for(String id : idList) {
            Optional<TujuanPenggunaan> optionalTujuanPenggunaan = tujuanPenggunaanRepository.findById(Integer.parseInt(id));
            TujuanPenggunaan modelTujuanPenggunaan = optionalTujuanPenggunaan.get();
            modelTujuanPenggunaan.decline(user.getId());
            tujuanPenggunaanRepository.save(modelTujuanPenggunaan);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit TujuanPenggunaan Berhasil !");
        return crunchifyMap;
    }


    @PostMapping(path = "/delete", consumes = "application/json")
    public HashMap<String, String> deleteTujuanPenggunaan(@RequestBody Map<String, Object> data,Principal principal) {
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));

        for(String id : idList) {
            Optional<TujuanPenggunaan> optionalTujuanPenggunaan = tujuanPenggunaanRepository.findById(Integer.parseInt(id));
            TujuanPenggunaan modelTujuanPenggunaan = optionalTujuanPenggunaan.get();
            tujuanPenggunaanRepository.delete(modelTujuanPenggunaan);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Delete TujuanPenggunaan Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/submit", consumes = "application/json")
    public HashMap<String, String> submitTujuanPenggunaan(@RequestBody Map<String, Object> data,Principal principal) {
        
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));
        User user = userRepository.findBynip(principal.getName());

        for(String id : idList) {
            Optional<TujuanPenggunaan> optionalTujuanPenggunaan = tujuanPenggunaanRepository.findById(Integer.parseInt(id));
            TujuanPenggunaan modelTujuanPenggunaan = optionalTujuanPenggunaan.get();
            modelTujuanPenggunaan.submit(user.getId());
            tujuanPenggunaanRepository.save(modelTujuanPenggunaan);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Edit Dan Submit TujuanPenggunaan Berhasil !");
        return crunchifyMap;
    }
}