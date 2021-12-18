package com.beCMS.BackendCentralParam.api;

import java.security.Principal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.beCMS.BackendCentralParam.model.BiayaAdmin;
import com.beCMS.BackendCentralParam.model.userlogin.User;
import com.beCMS.BackendCentralParam.repository.BiayaAdminRepository;
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
@RequestMapping("/api/biayaadmin")
@CrossOrigin(origins = "*")
public class BiayaAdminRestController {

    Logger logger = LoggerFactory.getLogger(BiayaAdminRestController.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BiayaAdminRepository biayaAdminRepository;

    @PostMapping("/getalldata")
    public Map<String, Object> getAllDataBiayaAdmin(Principal principal, Pageable pageable,
            HttpServletResponse response) {
        Map<String, Object> crunchifyMap = new HashMap<String, Object>();
        String id = principal.getName();

        String role = userRepository.cekRoles(id);
        logger.info("NIP : " + id);
        logger.info("ROLE : " + role);
        if (role.contains("USER")) {
            try {
                logger.info("Berhasil GET ALL DATA BiayaAdmin");
                crunchifyMap.put("dataBiayaAdmin", biayaAdminRepository.getListDataBiayaAdmin());
                crunchifyMap.put("code", "1");
            } catch (Exception e) {
                logger.error("ERROR");
                response.setStatus(400);
                crunchifyMap.put("code", "0");
                crunchifyMap.put("message", "Gagal membuka BiayaAdmin!");
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
    public Map<String, Object> getBiayaAdmin(Principal principal,@PathVariable Integer id,
            HttpServletResponse response) {
        Map<String, Object> crunchifyMap = new HashMap<String, Object>();
        String userId = principal.getName();

        String role = userRepository.cekRoles(userId);
        if (role.contains("USER")) {
            try {
                logger.info("Berhasil BiayaAdmin");
                crunchifyMap.put("biayaAdmin", biayaAdminRepository.findById(id));
                crunchifyMap.put("code", "1");
            } catch (Exception e) {
                logger.error("ERROR");
                response.setStatus(400);
                crunchifyMap.put("code", "0");
                crunchifyMap.put("message", "Gagal membuka BiayaAdmin!");
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
    public HashMap<String, String> insertBiayaAdmin(@RequestBody BiayaAdmin biayaAdmin,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        System.out.println("hey : " +biayaAdmin.toString());
        biayaAdmin.trace(user.getId());
        biayaAdminRepository.save(biayaAdmin);

        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input BiayaAdmin Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/inputAndSubmit", consumes = "application/json")
    public HashMap<String, String> insertAndSubmitBiayaAdmin(@RequestBody BiayaAdmin biayaAdmin,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        System.out.println("hey : " +biayaAdmin.toString());
        biayaAdmin.submit(user.getId());
        biayaAdminRepository.save(biayaAdmin);
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit BiayaAdmin Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/approveData", consumes = "application/json")
    public HashMap<String, String> approveDataBiayaAdmin(@RequestBody BiayaAdmin modelBiayaAdmin,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        Optional<BiayaAdmin> optionalBiayaAdmin = biayaAdminRepository.findById(modelBiayaAdmin.getId());
        BiayaAdmin approvalModel = optionalBiayaAdmin.get();
        approvalModel.approve(user.getId());
        biayaAdminRepository.save(approvalModel);
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit Tipe Konsumen Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/declineData", consumes = "application/json")
    public HashMap<String, String> declineDataBiayaAdmin(@RequestBody BiayaAdmin modelBiayaAdmin,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        Optional<BiayaAdmin> optionalBiayaAdmin = biayaAdminRepository.findById(modelBiayaAdmin.getId());
        BiayaAdmin approvalModel = optionalBiayaAdmin.get();
        approvalModel.decline(user.getId());
        biayaAdminRepository.save(approvalModel);
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit Tipe Konsumen Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/approve", consumes = "application/json")
    public HashMap<String, String> approveBiayaAdmin(@RequestBody Map<String, Object> data,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));
        for(String id : idList) {
            System.out.println("Mengakses ID : "+id);
            Optional<BiayaAdmin> optionalBiayaAdmin = biayaAdminRepository.findById(Integer.parseInt(id));
            BiayaAdmin biayaAdmin = optionalBiayaAdmin.get();
            biayaAdmin.approve(user.getId());
            biayaAdminRepository.save(biayaAdmin);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit BiayaAdmin Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/decline", consumes = "application/json")
    public HashMap<String, String> declineBiayaAdmin(@RequestBody Map<String, Object> data,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));
        for(String id : idList) {
            Optional<BiayaAdmin> optionalBiayaAdmin = biayaAdminRepository.findById(Integer.parseInt(id));
            BiayaAdmin biayaAdmin = optionalBiayaAdmin.get();
            biayaAdmin.decline(user.getId());
            biayaAdminRepository.save(biayaAdmin);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit BiayaAdmin Berhasil !");
        return crunchifyMap;
    }


    @PostMapping(path = "/delete", consumes = "application/json")
    public HashMap<String, String> deleteBiayaAdmin(@RequestBody Map<String, Object> data,Principal principal) {
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));

        for(String id : idList) {
            Optional<BiayaAdmin> optionalBiayaAdmin = biayaAdminRepository.findById(Integer.parseInt(id));
            BiayaAdmin biayaAdmin = optionalBiayaAdmin.get();
            biayaAdminRepository.delete(biayaAdmin);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Delete BiayaAdmin Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/submit", consumes = "application/json")
    public HashMap<String, String> submitBiayaAdmin(@RequestBody Map<String, Object> data,Principal principal) {
        
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));
        User user = userRepository.findBynip(principal.getName());

        for(String id : idList) {
            Optional<BiayaAdmin> optionalBiayaAdmin = biayaAdminRepository.findById(Integer.parseInt(id));
            BiayaAdmin biayaAdmin = optionalBiayaAdmin.get();
            biayaAdmin.submit(user.getId());
            biayaAdminRepository.save(biayaAdmin);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Edit Dan Submit BiayaAdmin Berhasil !");
        return crunchifyMap;
    }
}