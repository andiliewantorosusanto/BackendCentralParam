package com.beCMS.BackendCentralParam.api;

import java.security.Principal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.beCMS.BackendCentralParam.model.TipeAsuransi;
import com.beCMS.BackendCentralParam.model.userlogin.User;
import com.beCMS.BackendCentralParam.repository.TipeAsuransiRepository;
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
@RequestMapping("/api/tipeasuransi")
@CrossOrigin(origins = "*")
public class TipeAsuransiRestController {

    Logger logger = LoggerFactory.getLogger(TipeAsuransiRestController.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TipeAsuransiRepository tipeAsuransiRepository;

    @PostMapping("/getalldata")
    public Map<String, Object> getAllDataTipeAsuransi(Principal principal, Pageable pageable,
            HttpServletResponse response) {
        Map<String, Object> crunchifyMap = new HashMap<String, Object>();
        String id = principal.getName();

        String role = userRepository.cekRoles(id);
        logger.info("NIP : " + id);
        logger.info("ROLE : " + role);
        if (role.contains("USER")) {
            try {
                logger.info("Berhasil GET ALL DATA TipeAsuransi");
                crunchifyMap.put("dataTipeAsuransi", tipeAsuransiRepository.findAll());
                crunchifyMap.put("code", "1");
            } catch (Exception e) {
                logger.error("ERROR");
                response.setStatus(400);
                crunchifyMap.put("code", "0");
                crunchifyMap.put("message", "Gagal membuka TipeAsuransi!");
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
    public Map<String, Object> getTipeAsuransi(Principal principal,@PathVariable Integer id,
            HttpServletResponse response) {
        Map<String, Object> crunchifyMap = new HashMap<String, Object>();
        String userId = principal.getName();

        String role = userRepository.cekRoles(userId);
        if (role.contains("USER")) {
            try {
                logger.info("Berhasil TipeAsuransi");
                crunchifyMap.put("tipeAsuransi", tipeAsuransiRepository.findById(id));
                crunchifyMap.put("code", "1");
            } catch (Exception e) {
                logger.error("ERROR");
                response.setStatus(400);
                crunchifyMap.put("code", "0");
                crunchifyMap.put("message", "Gagal membuka TipeAsuransi!");
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
    public HashMap<String, String> insertTipeAsuransi(@RequestBody TipeAsuransi modelTipeAsuransi,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        System.out.println("hey : " +modelTipeAsuransi.toString());
        modelTipeAsuransi.trace(user.getId());
        tipeAsuransiRepository.save(modelTipeAsuransi);

        HashMap<String, String> crunchifyMap = new HashMap<String,String>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input TipeAsuransi Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/inputAndSubmit", consumes = "application/json")
    public HashMap<String, String> insertAndSubmitTipeAsuransi(@RequestBody TipeAsuransi modelTipeAsuransi,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        System.out.println("hey : " +modelTipeAsuransi.toString());
        modelTipeAsuransi.submit(user.getId());
        tipeAsuransiRepository.save(modelTipeAsuransi);
        
        HashMap<String, String> crunchifyMap = new HashMap<String,String>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit TipeAsuransi Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/approveData", consumes = "application/json")
    public HashMap<String, String> approveDataTipeAsuransi(@RequestBody TipeAsuransi modelTipeAsuransi,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        Optional<TipeAsuransi> optionalTipeAsuransi = tipeAsuransiRepository.findById(modelTipeAsuransi.getId());
        TipeAsuransi approvalModel = optionalTipeAsuransi.get();
        approvalModel.approve(user.getId());
        tipeAsuransiRepository.save(approvalModel);
        
        HashMap<String, String> crunchifyMap = new HashMap<String,String>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit Tipe Konsumen Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/declineData", consumes = "application/json")
    public HashMap<String, String> declineDataTipeAsuransi(@RequestBody TipeAsuransi modelTipeAsuransi,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        Optional<TipeAsuransi> optionalTipeAsuransi = tipeAsuransiRepository.findById(modelTipeAsuransi.getId());
        TipeAsuransi approvalModel = optionalTipeAsuransi.get();
        approvalModel.decline(user.getId());
        tipeAsuransiRepository.save(approvalModel);
        
        HashMap<String, String> crunchifyMap = new HashMap<String,String>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit Tipe Konsumen Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/approve", consumes = "application/json")
    public HashMap<String, String> approveTipeAsuransi(@RequestBody Map<String, Object> data,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));
        for(String id : idList) {
            System.out.println("Mengakses ID : "+id);
            Optional<TipeAsuransi> optionalTipeAsuransi = tipeAsuransiRepository.findById(Integer.parseInt(id));
            TipeAsuransi modelTipeAsuransi = optionalTipeAsuransi.get();
            modelTipeAsuransi.approve(user.getId());
            tipeAsuransiRepository.save(modelTipeAsuransi);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<String,String>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit TipeAsuransi Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/decline", consumes = "application/json")
    public HashMap<String, String> declineTipeAsuransi(@RequestBody Map<String, Object> data,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));
        for(String id : idList) {
            Optional<TipeAsuransi> optionalTipeAsuransi = tipeAsuransiRepository.findById(Integer.parseInt(id));
            TipeAsuransi modelTipeAsuransi = optionalTipeAsuransi.get();
            modelTipeAsuransi.decline(user.getId());
            tipeAsuransiRepository.save(modelTipeAsuransi);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<String,String>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit TipeAsuransi Berhasil !");
        return crunchifyMap;
    }


    @PostMapping(path = "/delete", consumes = "application/json")
    public HashMap<String, String> deleteTipeAsuransi(@RequestBody Map<String, Object> data,Principal principal) {
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));

        for(String id : idList) {
            Optional<TipeAsuransi> optionalTipeAsuransi = tipeAsuransiRepository.findById(Integer.parseInt(id));
            TipeAsuransi modelTipeAsuransi = optionalTipeAsuransi.get();
            tipeAsuransiRepository.delete(modelTipeAsuransi);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<String,String>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Delete TipeAsuransi Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/submit", consumes = "application/json")
    public HashMap<String, String> submitTipeAsuransi(@RequestBody Map<String, Object> data,Principal principal) {
        
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));
        User user = userRepository.findBynip(principal.getName());

        for(String id : idList) {
            Optional<TipeAsuransi> optionalTipeAsuransi = tipeAsuransiRepository.findById(Integer.parseInt(id));
            TipeAsuransi modelTipeAsuransi = optionalTipeAsuransi.get();
            modelTipeAsuransi.submit(user.getId());
            tipeAsuransiRepository.save(modelTipeAsuransi);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<String,String>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Edit Dan Submit TipeAsuransi Berhasil !");
        return crunchifyMap;
    }
}