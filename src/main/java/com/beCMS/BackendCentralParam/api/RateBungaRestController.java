package com.beCMS.BackendCentralParam.api;

import java.security.Principal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.beCMS.BackendCentralParam.model.RateBunga;
import com.beCMS.BackendCentralParam.model.userlogin.User;
import com.beCMS.BackendCentralParam.repository.RateBungaRepository;
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
@RequestMapping("/api/ratebunga")
@CrossOrigin(origins = "*")
public class RateBungaRestController {

    Logger logger = LoggerFactory.getLogger(RateBungaRestController.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RateBungaRepository rateBungaRepository;

    @PostMapping("/getalldata")
    public Map<String, Object> getAllDataRateBunga(Principal principal, Pageable pageable,
            HttpServletResponse response) {
        Map<String, Object> crunchifyMap = new HashMap<String, Object>();
        String id = principal.getName();

        String role = userRepository.cekRoles(id);
        logger.info("NIP : " + id);
        logger.info("ROLE : " + role);
        if (role.contains("USER")) {
            try {
                logger.info("Berhasil GET ALL DATA RateBunga");
                crunchifyMap.put("dataRateBunga", rateBungaRepository.getListDataRateBunga());
                crunchifyMap.put("code", "1");
            } catch (Exception e) {
                logger.error("ERROR");
                response.setStatus(400);
                crunchifyMap.put("code", "0");
                crunchifyMap.put("message", "Gagal membuka RateBunga!");
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

    @GetMapping("/getallskema")
    public Map<String, Object> getAllSkemaRateBunga(Principal principal, Pageable pageable,
            HttpServletResponse response) {
        Map<String, Object> crunchifyMap = new HashMap<String, Object>();
        String id = principal.getName();

        String role = userRepository.cekRoles(id);
        logger.info("NIP : " + id);
        logger.info("ROLE : " + role);
        if (role.contains("USER")) {
            try {
                logger.info("Berhasil GET ALL Skema RateBunga");
                crunchifyMap.put("dataSkema", rateBungaRepository.getListDataSkemaRateBunga());
                crunchifyMap.put("code", "1");
            } catch (Exception e) {
                logger.error("ERROR");
                response.setStatus(400);
                crunchifyMap.put("code", "0");
                crunchifyMap.put("message", "Gagal membuka RateBunga!");
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
    public Map<String, Object> getRateBunga(Principal principal,@PathVariable Integer id,
            HttpServletResponse response) {
        Map<String, Object> crunchifyMap = new HashMap<String, Object>();
        String userId = principal.getName();

        String role = userRepository.cekRoles(userId);
        if (role.contains("USER")) {
            try {
                logger.info("Berhasil RateBunga");
                crunchifyMap.put("rateBunga", rateBungaRepository.findById(id));
                crunchifyMap.put("code", "1");
            } catch (Exception e) {
                logger.error("ERROR");
                response.setStatus(400);
                crunchifyMap.put("code", "0");
                crunchifyMap.put("message", "Gagal membuka RateBunga!");
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
    public HashMap<String, String> insertRateBunga(@RequestBody RateBunga modelRateBunga,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        System.out.println("hey : " +modelRateBunga.toString());
        modelRateBunga.trace(user.getId());
        rateBungaRepository.save(modelRateBunga);

        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input RateBunga Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/inputAndSubmit", consumes = "application/json")
    public HashMap<String, String> insertAndSubmitRateBunga(@RequestBody RateBunga modelRateBunga,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        System.out.println("hey : " +modelRateBunga.toString());
        modelRateBunga.submit(user.getId());
        rateBungaRepository.save(modelRateBunga);
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit RateBunga Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/approveData", consumes = "application/json")
    public HashMap<String, String> approveDataRateBunga(@RequestBody RateBunga modelRateBunga,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        Optional<RateBunga> optionalRateBunga = rateBungaRepository.findById(modelRateBunga.getId());
        RateBunga approvalModel = optionalRateBunga.get();
        approvalModel.approve(user.getId());
        rateBungaRepository.save(approvalModel);
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit Tipe Konsumen Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/declineData", consumes = "application/json")
    public HashMap<String, String> declineDataRateBunga(@RequestBody RateBunga modelRateBunga,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        Optional<RateBunga> optionalRateBunga = rateBungaRepository.findById(modelRateBunga.getId());
        RateBunga approvalModel = optionalRateBunga.get();
        approvalModel.decline(user.getId());
        rateBungaRepository.save(approvalModel);
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit Tipe Konsumen Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/approve", consumes = "application/json")
    public HashMap<String, String> approveRateBunga(@RequestBody Map<String, Object> data,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));
        for(String id : idList) {
            System.out.println("Mengakses ID : "+id);
            Optional<RateBunga> optionalRateBunga = rateBungaRepository.findById(Integer.parseInt(id));
            RateBunga modelRateBunga = optionalRateBunga.get();
            modelRateBunga.approve(user.getId());
            rateBungaRepository.save(modelRateBunga);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit RateBunga Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/decline", consumes = "application/json")
    public HashMap<String, String> declineRateBunga(@RequestBody Map<String, Object> data,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));
        for(String id : idList) {
            Optional<RateBunga> optionalRateBunga = rateBungaRepository.findById(Integer.parseInt(id));
            RateBunga modelRateBunga = optionalRateBunga.get();
            modelRateBunga.decline(user.getId());
            rateBungaRepository.save(modelRateBunga);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit RateBunga Berhasil !");
        return crunchifyMap;
    }


    @PostMapping(path = "/delete", consumes = "application/json")
    public HashMap<String, String> deleteRateBunga(@RequestBody Map<String, Object> data,Principal principal) {
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));

        for(String id : idList) {
            Optional<RateBunga> optionalRateBunga = rateBungaRepository.findById(Integer.parseInt(id));
            RateBunga modelRateBunga = optionalRateBunga.get();
            rateBungaRepository.delete(modelRateBunga);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Delete RateBunga Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/submit", consumes = "application/json")
    public HashMap<String, String> submitRateBunga(@RequestBody Map<String, Object> data,Principal principal) {
        
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));
        User user = userRepository.findBynip(principal.getName());

        for(String id : idList) {
            Optional<RateBunga> optionalRateBunga = rateBungaRepository.findById(Integer.parseInt(id));
            RateBunga modelRateBunga = optionalRateBunga.get();
            modelRateBunga.submit(user.getId());
            rateBungaRepository.save(modelRateBunga);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Edit Dan Submit RateBunga Berhasil !");
        return crunchifyMap;
    }
}