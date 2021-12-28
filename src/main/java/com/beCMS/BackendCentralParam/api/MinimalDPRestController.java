package com.beCMS.BackendCentralParam.api;

import java.security.Principal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.beCMS.BackendCentralParam.model.MinimalDP;
import com.beCMS.BackendCentralParam.model.userlogin.User;
import com.beCMS.BackendCentralParam.repository.MinimalDPRepository;
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
@RequestMapping("/api/minimaldp")
@CrossOrigin(origins = "*")
public class MinimalDPRestController {

    Logger logger = LoggerFactory.getLogger(MinimalDPRestController.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private MinimalDPRepository minimalDPRepository;

    @PostMapping("/getalldata")
    public Map<String, Object> getAllDataMinimalDP(Principal principal, Pageable pageable,
            HttpServletResponse response) {
        Map<String, Object> crunchifyMap = new HashMap<String, Object>();
        String id = principal.getName();

        String role = userRepository.cekRoles(id);
        logger.info("NIP : " + id);
        logger.info("ROLE : " + role);
        if (role.contains("USER")) {
            try {
                logger.info("Berhasil GET ALL DATA MinimalDP");
                crunchifyMap.put("dataMinimalDP", minimalDPRepository.getListDataMinimalDP());
                crunchifyMap.put("code", "1");
            } catch (Exception e) {
                System.out.println("err"+e.toString());
                logger.error("ERROR");
                response.setStatus(400);
                crunchifyMap.put("code", "0");
                crunchifyMap.put("message", "Gagal membuka MinimalDP!");
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
    public Map<String, Object> getMinimalDP(Principal principal,@PathVariable Integer id,
            HttpServletResponse response) {
        Map<String, Object> crunchifyMap = new HashMap<String, Object>();
        String userId = principal.getName();

        String role = userRepository.cekRoles(userId);
        if (role.contains("USER")) {
            try {
                logger.info("Berhasil MinimalDP");
                crunchifyMap.put("minimalDP", minimalDPRepository.findById(id));
                crunchifyMap.put("code", "1");
            } catch (Exception e) {
                logger.error("ERROR");
                response.setStatus(400);
                crunchifyMap.put("code", "0");
                crunchifyMap.put("message", "Gagal membuka MinimalDP!");
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
    public HashMap<String, String> insertMinimalDP(@RequestBody MinimalDP MinimalDP,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        System.out.println("hey : " +MinimalDP.toString());
        MinimalDP.trace(user.getId());
        minimalDPRepository.save(MinimalDP);

        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input MinimalDP Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/inputAndSubmit", consumes = "application/json")
    public HashMap<String, String> insertAndSubmitMinimalDP(@RequestBody MinimalDP MinimalDP,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        System.out.println("hey : " +MinimalDP.toString());
        MinimalDP.submit(user.getId());
        minimalDPRepository.save(MinimalDP);
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit MinimalDP Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/approveData", consumes = "application/json")
    public HashMap<String, String> approveDataMinimalDP(@RequestBody MinimalDP modelMinimalDP,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        Optional<MinimalDP> optionalMinimalDP = minimalDPRepository.findById(modelMinimalDP.getId());
        MinimalDP approvalModel = optionalMinimalDP.get();
        approvalModel.approve(user.getId());
        minimalDPRepository.save(approvalModel);
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit Tipe Konsumen Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/declineData", consumes = "application/json")
    public HashMap<String, String> declineDataMinimalDP(@RequestBody MinimalDP modelMinimalDP,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        Optional<MinimalDP> optionalMinimalDP = minimalDPRepository.findById(modelMinimalDP.getId());
        MinimalDP approvalModel = optionalMinimalDP.get();
        approvalModel.decline(user.getId());
        minimalDPRepository.save(approvalModel);
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit Tipe Konsumen Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/approve", consumes = "application/json")
    public HashMap<String, String> approveMinimalDP(@RequestBody Map<String, Object> data,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));
        for(String id : idList) {
            System.out.println("Mengakses ID : "+id);
            Optional<MinimalDP> optionalMinimalDP = minimalDPRepository.findById(Integer.parseInt(id));
            MinimalDP MinimalDP = optionalMinimalDP.get();
            MinimalDP.approve(user.getId());
            minimalDPRepository.save(MinimalDP);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit MinimalDP Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/decline", consumes = "application/json")
    public HashMap<String, String> declineMinimalDP(@RequestBody Map<String, Object> data,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));
        for(String id : idList) {
            Optional<MinimalDP> optionalMinimalDP = minimalDPRepository.findById(Integer.parseInt(id));
            MinimalDP MinimalDP = optionalMinimalDP.get();
            MinimalDP.decline(user.getId());
            minimalDPRepository.save(MinimalDP);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit MinimalDP Berhasil !");
        return crunchifyMap;
    }


    @PostMapping(path = "/delete", consumes = "application/json")
    public HashMap<String, String> deleteMinimalDP(@RequestBody Map<String, Object> data,Principal principal) {
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));

        for(String id : idList) {
            Optional<MinimalDP> optionalMinimalDP = minimalDPRepository.findById(Integer.parseInt(id));
            MinimalDP MinimalDP = optionalMinimalDP.get();
            minimalDPRepository.delete(MinimalDP);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Delete MinimalDP Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/submit", consumes = "application/json")
    public HashMap<String, String> submitMinimalDP(@RequestBody Map<String, Object> data,Principal principal) {
        
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));
        User user = userRepository.findBynip(principal.getName());

        for(String id : idList) {
            Optional<MinimalDP> optionalMinimalDP = minimalDPRepository.findById(Integer.parseInt(id));
            MinimalDP MinimalDP = optionalMinimalDP.get();
            MinimalDP.submit(user.getId());
            minimalDPRepository.save(MinimalDP);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Edit Dan Submit MinimalDP Berhasil !");
        return crunchifyMap;
    }
}