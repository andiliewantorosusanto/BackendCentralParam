package com.beCMS.BackendCentralParam.api;

import java.security.Principal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.beCMS.BackendCentralParam.model.BiayaFidusia;
import com.beCMS.BackendCentralParam.model.userlogin.User;
import com.beCMS.BackendCentralParam.repository.BiayaFidusiaRepository;
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
@RequestMapping("/api/rateBiayaFidusia")
@CrossOrigin(origins = "*")
public class BiayaFidusiaRestController {

    Logger logger = LoggerFactory.getLogger(BiayaFidusiaRestController.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BiayaFidusiaRepository biayaFidusiaRepository;

    @PostMapping("/getalldata")
    public Map<String, Object> getAllDataBiayaFidusia(Principal principal, Pageable pageable,
            HttpServletResponse response) {
        Map<String, Object> crunchifyMap = new HashMap<String, Object>();
        String id = principal.getName();

        String role = userRepository.cekRoles(id);
        logger.info("NIP : " + id);
        logger.info("ROLE : " + role);
        if (role.contains("USER")) {
            try {
                logger.info("Berhasil GET ALL DATA BiayaFidusia");
                crunchifyMap.put("dataBiayaFidusia", biayaFidusiaRepository.findAll());
                crunchifyMap.put("code", "1");
            } catch (Exception e) {
                logger.error("ERROR");
                response.setStatus(400);
                crunchifyMap.put("code", "0");
                crunchifyMap.put("message", "Gagal membuka BiayaFidusia!");
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
    public Map<String, Object> getBiayaFidusia(Principal principal,@PathVariable Integer id,
            HttpServletResponse response) {
        Map<String, Object> crunchifyMap = new HashMap<String, Object>();
        String userId = principal.getName();

        String role = userRepository.cekRoles(userId);
        if (role.contains("USER")) {
            try {
                logger.info("Berhasil BiayaFidusia");
                crunchifyMap.put("rateBiayaFidusia", biayaFidusiaRepository.findById(id));
                crunchifyMap.put("code", "1");
            } catch (Exception e) {
                logger.error("ERROR");
                response.setStatus(400);
                crunchifyMap.put("code", "0");
                crunchifyMap.put("message", "Gagal membuka BiayaFidusia!");
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
    public HashMap<String, String> insertBiayaFidusia(@RequestBody BiayaFidusia BiayaFidusia,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        System.out.println("hey : " +BiayaFidusia.toString());
        BiayaFidusia.trace(user.getId());
        biayaFidusiaRepository.save(BiayaFidusia);

        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input BiayaFidusia Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/inputAndSubmit", consumes = "application/json")
    public HashMap<String, String> insertAndSubmitBiayaFidusia(@RequestBody BiayaFidusia BiayaFidusia,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        System.out.println("hey : " +BiayaFidusia.toString());
        BiayaFidusia.submit(user.getId());
        biayaFidusiaRepository.save(BiayaFidusia);
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit BiayaFidusia Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/approveData", consumes = "application/json")
    public HashMap<String, String> approveDataBiayaFidusia(@RequestBody BiayaFidusia modelBiayaFidusia,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        Optional<BiayaFidusia> optionalBiayaFidusia = biayaFidusiaRepository.findById(modelBiayaFidusia.getId());
        BiayaFidusia approvalModel = optionalBiayaFidusia.get();
        approvalModel.approve(user.getId());
        biayaFidusiaRepository.save(approvalModel);
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit Tipe Konsumen Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/declineData", consumes = "application/json")
    public HashMap<String, String> declineDataBiayaFidusia(@RequestBody BiayaFidusia modelBiayaFidusia,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        Optional<BiayaFidusia> optionalBiayaFidusia = biayaFidusiaRepository.findById(modelBiayaFidusia.getId());
        BiayaFidusia approvalModel = optionalBiayaFidusia.get();
        approvalModel.decline(user.getId());
        biayaFidusiaRepository.save(approvalModel);
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit Tipe Konsumen Berhasil !");
        return crunchifyMap;
    }
    @PostMapping(path = "/approve", consumes = "application/json")
    public HashMap<String, String> approveBiayaFidusia(@RequestBody Map<String, Object> data,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));
        for(String id : idList) {
            System.out.println("Mengakses ID : "+id);
            Optional<BiayaFidusia> optionalBiayaFidusia = biayaFidusiaRepository.findById(Integer.parseInt(id));
            BiayaFidusia BiayaFidusia = optionalBiayaFidusia.get();
            BiayaFidusia.approve(user.getId());
            biayaFidusiaRepository.save(BiayaFidusia);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit BiayaFidusia Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/decline", consumes = "application/json")
    public HashMap<String, String> declineBiayaFidusia(@RequestBody Map<String, Object> data,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));
        for(String id : idList) {
            Optional<BiayaFidusia> optionalBiayaFidusia = biayaFidusiaRepository.findById(Integer.parseInt(id));
            BiayaFidusia BiayaFidusia = optionalBiayaFidusia.get();
            BiayaFidusia.decline(user.getId());
            biayaFidusiaRepository.save(BiayaFidusia);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit BiayaFidusia Berhasil !");
        return crunchifyMap;
    }


    @PostMapping(path = "/delete", consumes = "application/json")
    public HashMap<String, String> deleteBiayaFidusia(@RequestBody Map<String, Object> data,Principal principal) {
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));

        for(String id : idList) {
            Optional<BiayaFidusia> optionalBiayaFidusia = biayaFidusiaRepository.findById(Integer.parseInt(id));
            BiayaFidusia BiayaFidusia = optionalBiayaFidusia.get();
            biayaFidusiaRepository.delete(BiayaFidusia);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Delete BiayaFidusia Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/submit", consumes = "application/json")
    public HashMap<String, String> submitBiayaFidusia(@RequestBody Map<String, Object> data,Principal principal) {
        
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));
        User user = userRepository.findBynip(principal.getName());

        for(String id : idList) {
            Optional<BiayaFidusia> optionalBiayaFidusia = biayaFidusiaRepository.findById(Integer.parseInt(id));
            BiayaFidusia BiayaFidusia = optionalBiayaFidusia.get();
            BiayaFidusia.submit(user.getId());
            biayaFidusiaRepository.save(BiayaFidusia);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Edit Dan Submit BiayaFidusia Berhasil !");
        return crunchifyMap;
    }
}