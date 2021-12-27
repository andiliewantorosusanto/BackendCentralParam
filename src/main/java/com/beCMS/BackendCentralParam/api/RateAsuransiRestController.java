package com.beCMS.BackendCentralParam.api;

import java.security.Principal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.beCMS.BackendCentralParam.model.RateAsuransi;
import com.beCMS.BackendCentralParam.model.userlogin.User;
import com.beCMS.BackendCentralParam.repository.RateAsuransiRepository;
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
@RequestMapping("/api/rateasuransi")
@CrossOrigin(origins = "*")
public class RateAsuransiRestController {

    Logger logger = LoggerFactory.getLogger(RateAsuransiRestController.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RateAsuransiRepository rateAsuransiRepository;

    @PostMapping("/getalldata")
    public Map<String, Object> getAllDataRateAsuransi(Principal principal, Pageable pageable,
            HttpServletResponse response) {
        Map<String, Object> crunchifyMap = new HashMap<String, Object>();
        String id = principal.getName();

        String role = userRepository.cekRoles(id);
        logger.info("NIP : " + id);
        logger.info("ROLE : " + role);
        if (role.contains("USER")) {
            try {
                logger.info("Berhasil GET ALL DATA RateAsuransi");
                crunchifyMap.put("dataRateAsuransi", rateAsuransiRepository.getListDataRateAsuransi());
                crunchifyMap.put("code", "1");
            } catch (Exception e) {
                logger.error("ERROR");
                response.setStatus(400);
                crunchifyMap.put("code", "0");
                crunchifyMap.put("message", "Gagal membuka RateAsuransi!");
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
    public Map<String, Object> getRateAsuransi(Principal principal,@PathVariable Integer id,
            HttpServletResponse response) {
        Map<String, Object> crunchifyMap = new HashMap<String, Object>();
        String userId = principal.getName();

        String role = userRepository.cekRoles(userId);
        if (role.contains("USER")) {
            try {
                logger.info("Berhasil RateAsuransi");
                crunchifyMap.put("rateAsuransi", rateAsuransiRepository.findById(id));
                crunchifyMap.put("code", "1");
            } catch (Exception e) {
                logger.error("ERROR");
                response.setStatus(400);
                crunchifyMap.put("code", "0");
                crunchifyMap.put("message", "Gagal membuka RateAsuransi!");
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
    public HashMap<String, String> insertRateAsuransi(@RequestBody RateAsuransi rateAsuransi,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        System.out.println("hey : " +rateAsuransi.toString());
        rateAsuransi.trace(user.getId());
        rateAsuransiRepository.save(rateAsuransi);

        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input RateAsuransi Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/inputAndSubmit", consumes = "application/json")
    public HashMap<String, String> insertAndSubmitRateAsuransi(@RequestBody RateAsuransi rateAsuransi,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        System.out.println("hey : " +rateAsuransi.toString());
        rateAsuransi.submit(user.getId());
        rateAsuransiRepository.save(rateAsuransi);
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit RateAsuransi Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/approveData", consumes = "application/json")
    public HashMap<String, String> approveDataRateAsuransi(@RequestBody RateAsuransi modelRateAsuransi,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        Optional<RateAsuransi> optionalRateAsuransi = rateAsuransiRepository.findById(modelRateAsuransi.getId());
        RateAsuransi approvalModel = optionalRateAsuransi.get();
        approvalModel.approve(user.getId());
        rateAsuransiRepository.save(approvalModel);
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit Tipe Konsumen Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/declineData", consumes = "application/json")
    public HashMap<String, String> declineDataRateAsuransi(@RequestBody RateAsuransi modelRateAsuransi,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        Optional<RateAsuransi> optionalRateAsuransi = rateAsuransiRepository.findById(modelRateAsuransi.getId());
        RateAsuransi approvalModel = optionalRateAsuransi.get();
        approvalModel.decline(user.getId());
        rateAsuransiRepository.save(approvalModel);
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit Tipe Konsumen Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/approve", consumes = "application/json")
    public HashMap<String, String> approveRateAsuransi(@RequestBody Map<String, Object> data,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));
        for(String id : idList) {
            System.out.println("Mengakses ID : "+id);
            Optional<RateAsuransi> optionalRateAsuransi = rateAsuransiRepository.findById(Integer.parseInt(id));
            RateAsuransi rateAsuransi = optionalRateAsuransi.get();
            rateAsuransi.approve(user.getId());
            rateAsuransiRepository.save(rateAsuransi);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit RateAsuransi Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/decline", consumes = "application/json")
    public HashMap<String, String> declineRateAsuransi(@RequestBody Map<String, Object> data,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));
        for(String id : idList) {
            Optional<RateAsuransi> optionalRateAsuransi = rateAsuransiRepository.findById(Integer.parseInt(id));
            RateAsuransi rateAsuransi = optionalRateAsuransi.get();
            rateAsuransi.decline(user.getId());
            rateAsuransiRepository.save(rateAsuransi);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit RateAsuransi Berhasil !");
        return crunchifyMap;
    }


    @PostMapping(path = "/delete", consumes = "application/json")
    public HashMap<String, String> deleteRateAsuransi(@RequestBody Map<String, Object> data,Principal principal) {
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));

        for(String id : idList) {
            Optional<RateAsuransi> optionalRateAsuransi = rateAsuransiRepository.findById(Integer.parseInt(id));
            RateAsuransi rateAsuransi = optionalRateAsuransi.get();
            rateAsuransiRepository.delete(rateAsuransi);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Delete RateAsuransi Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/submit", consumes = "application/json")
    public HashMap<String, String> submitRateAsuransi(@RequestBody Map<String, Object> data,Principal principal) {
        
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));
        User user = userRepository.findBynip(principal.getName());

        for(String id : idList) {
            Optional<RateAsuransi> optionalRateAsuransi = rateAsuransiRepository.findById(Integer.parseInt(id));
            RateAsuransi rateAsuransi = optionalRateAsuransi.get();
            rateAsuransi.submit(user.getId());
            rateAsuransiRepository.save(rateAsuransi);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Edit Dan Submit RateAsuransi Berhasil !");
        return crunchifyMap;
    }
}