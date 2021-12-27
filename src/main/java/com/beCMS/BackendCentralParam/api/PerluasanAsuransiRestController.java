package com.beCMS.BackendCentralParam.api;

import java.security.Principal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.beCMS.BackendCentralParam.model.PerluasanAsuransi;
import com.beCMS.BackendCentralParam.model.userlogin.User;
import com.beCMS.BackendCentralParam.repository.PerluasanAsuransiRepository;
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
@RequestMapping("/api/perluasanasuransi")
@CrossOrigin(origins = "*")
public class PerluasanAsuransiRestController {

    Logger logger = LoggerFactory.getLogger(PerluasanAsuransiRestController.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PerluasanAsuransiRepository ratePerluasanAsuransiRepository;

    @PostMapping("/getalldata")
    public Map<String, Object> getAllDataPerluasanAsuransi(Principal principal, Pageable pageable,
            HttpServletResponse response) {
        Map<String, Object> crunchifyMap = new HashMap<String, Object>();
        String id = principal.getName();

        String role = userRepository.cekRoles(id);
        logger.info("NIP : " + id);
        logger.info("ROLE : " + role);
        if (role.contains("USER")) {
            try {
                logger.info("Berhasil GET ALL DATA PerluasanAsuransi");
                crunchifyMap.put("dataPerluasanAsuransi", ratePerluasanAsuransiRepository.getListDataPerluasanAsuransi());
                crunchifyMap.put("code", "1");
            } catch (Exception e) {
                logger.error("ERROR");
                response.setStatus(400);
                crunchifyMap.put("code", "0");
                crunchifyMap.put("message", "Gagal membuka PerluasanAsuransi!");
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
    public Map<String, Object> getPerluasanAsuransi(Principal principal,@PathVariable Integer id,
            HttpServletResponse response) {
        Map<String, Object> crunchifyMap = new HashMap<String, Object>();
        String userId = principal.getName();

        String role = userRepository.cekRoles(userId);
        if (role.contains("USER")) {
            try {
                logger.info("Berhasil PerluasanAsuransi");
                crunchifyMap.put("perluasanAsuransi", ratePerluasanAsuransiRepository.findById(id));
                crunchifyMap.put("code", "1");
            } catch (Exception e) {
                logger.error("ERROR");
                response.setStatus(400);
                crunchifyMap.put("code", "0");
                crunchifyMap.put("message", "Gagal membuka PerluasanAsuransi!");
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
    public HashMap<String, String> insertPerluasanAsuransi(@RequestBody PerluasanAsuransi PerluasanAsuransi,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        PerluasanAsuransi.trace(user.getId());
        ratePerluasanAsuransiRepository.save(PerluasanAsuransi);

        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input PerluasanAsuransi Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/inputAndSubmit", consumes = "application/json")
    public HashMap<String, String> insertAndSubmitPerluasanAsuransi(@RequestBody PerluasanAsuransi PerluasanAsuransi,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        System.out.println("hey : " +PerluasanAsuransi.toString());
        PerluasanAsuransi.submit(user.getId());
        ratePerluasanAsuransiRepository.save(PerluasanAsuransi);
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit PerluasanAsuransi Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/approveData", consumes = "application/json")
    public HashMap<String, String> approveDataPerluasanAsuransi(@RequestBody PerluasanAsuransi modelPerluasanAsuransi,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        Optional<PerluasanAsuransi> optionalPerluasanAsuransi = ratePerluasanAsuransiRepository.findById(modelPerluasanAsuransi.getId());
        PerluasanAsuransi approvalModel = optionalPerluasanAsuransi.get();
        approvalModel.approve(user.getId());
        ratePerluasanAsuransiRepository.save(approvalModel);
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit Tipe Konsumen Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/declineData", consumes = "application/json")
    public HashMap<String, String> declineDataPerluasanAsuransi(@RequestBody PerluasanAsuransi modelPerluasanAsuransi,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        Optional<PerluasanAsuransi> optionalPerluasanAsuransi = ratePerluasanAsuransiRepository.findById(modelPerluasanAsuransi.getId());
        PerluasanAsuransi approvalModel = optionalPerluasanAsuransi.get();
        approvalModel.decline(user.getId());
        ratePerluasanAsuransiRepository.save(approvalModel);
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit Tipe Konsumen Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/approve", consumes = "application/json")
    public HashMap<String, String> approvePerluasanAsuransi(@RequestBody Map<String, Object> data,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));
        for(String id : idList) {
            System.out.println("Mengakses ID : "+id);
            Optional<PerluasanAsuransi> optionalPerluasanAsuransi = ratePerluasanAsuransiRepository.findById(Integer.parseInt(id));
            PerluasanAsuransi PerluasanAsuransi = optionalPerluasanAsuransi.get();
            PerluasanAsuransi.approve(user.getId());
            ratePerluasanAsuransiRepository.save(PerluasanAsuransi);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit PerluasanAsuransi Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/decline", consumes = "application/json")
    public HashMap<String, String> declinePerluasanAsuransi(@RequestBody Map<String, Object> data,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));
        for(String id : idList) {
            Optional<PerluasanAsuransi> optionalPerluasanAsuransi = ratePerluasanAsuransiRepository.findById(Integer.parseInt(id));
            PerluasanAsuransi PerluasanAsuransi = optionalPerluasanAsuransi.get();
            PerluasanAsuransi.decline(user.getId());
            ratePerluasanAsuransiRepository.save(PerluasanAsuransi);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit PerluasanAsuransi Berhasil !");
        return crunchifyMap;
    }


    @PostMapping(path = "/delete", consumes = "application/json")
    public HashMap<String, String> deletePerluasanAsuransi(@RequestBody Map<String, Object> data,Principal principal) {
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));

        for(String id : idList) {
            Optional<PerluasanAsuransi> optionalPerluasanAsuransi = ratePerluasanAsuransiRepository.findById(Integer.parseInt(id));
            PerluasanAsuransi PerluasanAsuransi = optionalPerluasanAsuransi.get();
            ratePerluasanAsuransiRepository.delete(PerluasanAsuransi);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Delete PerluasanAsuransi Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/submit", consumes = "application/json")
    public HashMap<String, String> submitPerluasanAsuransi(@RequestBody Map<String, Object> data,Principal principal) {
        
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));
        User user = userRepository.findBynip(principal.getName());

        for(String id : idList) {
            Optional<PerluasanAsuransi> optionalPerluasanAsuransi = ratePerluasanAsuransiRepository.findById(Integer.parseInt(id));
            PerluasanAsuransi PerluasanAsuransi = optionalPerluasanAsuransi.get();
            PerluasanAsuransi.submit(user.getId());
            ratePerluasanAsuransiRepository.save(PerluasanAsuransi);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Edit Dan Submit PerluasanAsuransi Berhasil !");
        return crunchifyMap;
    }
}