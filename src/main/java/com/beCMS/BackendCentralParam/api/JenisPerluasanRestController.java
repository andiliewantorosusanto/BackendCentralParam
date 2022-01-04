package com.beCMS.BackendCentralParam.api;

import java.security.Principal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.beCMS.BackendCentralParam.model.JenisPerluasan;
import com.beCMS.BackendCentralParam.model.userlogin.User;
import com.beCMS.BackendCentralParam.repository.JenisPerluasanRepository;
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
@RequestMapping("/api/jenisperluasan")
@CrossOrigin(origins = "*")
public class JenisPerluasanRestController {

    Logger logger = LoggerFactory.getLogger(JenisPerluasanRestController.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private JenisPerluasanRepository jenisPerluasanRepository;

    @PostMapping("/getalldata")
    public Map<String, Object> getAllDataJenisPerluasan(Principal principal, Pageable pageable,
            HttpServletResponse response) {
        Map<String, Object> crunchifyMap = new HashMap<String, Object>();
        String id = principal.getName();

        String role = userRepository.cekRoles(id);
        logger.info("NIP : " + id);
        logger.info("ROLE : " + role);
        if (role.contains("USER")) {
            try {
                logger.info("Berhasil GET ALL DATA JenisPerluasan");
                crunchifyMap.put("dataJenisPerluasan", jenisPerluasanRepository.getListDataJenisPerluasan());
                crunchifyMap.put("code", "1");
            } catch (Exception e) {
                logger.error("ERROR");
                response.setStatus(400);
                crunchifyMap.put("code", "0");
                crunchifyMap.put("message", "Gagal membuka JenisPerluasan!");
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
    public Map<String, Object> getJenisPerluasan(Principal principal,@PathVariable Integer id,
            HttpServletResponse response) {
        Map<String, Object> crunchifyMap = new HashMap<String, Object>();
        String userId = principal.getName();

        String role = userRepository.cekRoles(userId);
        if (role.contains("USER")) {
            try {
                logger.info("Berhasil JenisPerluasan");
                crunchifyMap.put("jenisPerluasan", jenisPerluasanRepository.findById(id));
                crunchifyMap.put("code", "1");
            } catch (Exception e) {
                logger.error("ERROR");
                response.setStatus(400);
                crunchifyMap.put("code", "0");
                crunchifyMap.put("message", "Gagal membuka JenisPerluasan!");
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
    public HashMap<String, String> insertJenisPerluasan(@RequestBody JenisPerluasan modelJenisPerluasan,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        System.out.println("hey : " +modelJenisPerluasan.toString());
        modelJenisPerluasan.trace(user.getId());
        jenisPerluasanRepository.save(modelJenisPerluasan);

        HashMap<String, String> crunchifyMap = new HashMap<String,String>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input JenisPerluasan Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/inputAndSubmit", consumes = "application/json")
    public HashMap<String, String> insertAndSubmitJenisPerluasan(@RequestBody JenisPerluasan modelJenisPerluasan,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        System.out.println("hey : " +modelJenisPerluasan.toString());
        modelJenisPerluasan.submit(user.getId());
        jenisPerluasanRepository.save(modelJenisPerluasan);
        
        HashMap<String, String> crunchifyMap = new HashMap<String,String>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit JenisPerluasan Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/approveData", consumes = "application/json")
    public HashMap<String, String> approveDataJenisPerluasan(@RequestBody JenisPerluasan modelJenisPerluasan,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        Optional<JenisPerluasan> optionalJenisPerluasan = jenisPerluasanRepository.findById(modelJenisPerluasan.getId());
        JenisPerluasan approvalModel = optionalJenisPerluasan.get();
        approvalModel.approve(user.getId());
        jenisPerluasanRepository.save(approvalModel);
        
        HashMap<String, String> crunchifyMap = new HashMap<String,String>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit Tipe Konsumen Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/declineData", consumes = "application/json")
    public HashMap<String, String> declineDataJenisPerluasan(@RequestBody JenisPerluasan modelJenisPerluasan,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        Optional<JenisPerluasan> optionalJenisPerluasan = jenisPerluasanRepository.findById(modelJenisPerluasan.getId());
        JenisPerluasan approvalModel = optionalJenisPerluasan.get();
        approvalModel.decline(user.getId());
        jenisPerluasanRepository.save(approvalModel);
        
        HashMap<String, String> crunchifyMap = new HashMap<String,String>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit Tipe Konsumen Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/approve", consumes = "application/json")
    public HashMap<String, String> approveJenisPerluasan(@RequestBody Map<String, Object> data,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));
        for(String id : idList) {
            System.out.println("Mengakses ID : "+id);
            Optional<JenisPerluasan> optionalJenisPerluasan = jenisPerluasanRepository.findById(Integer.parseInt(id));
            JenisPerluasan modelJenisPerluasan = optionalJenisPerluasan.get();
            modelJenisPerluasan.approve(user.getId());
            jenisPerluasanRepository.save(modelJenisPerluasan);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<String,String>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit JenisPerluasan Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/decline", consumes = "application/json")
    public HashMap<String, String> declineJenisPerluasan(@RequestBody Map<String, Object> data,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));
        for(String id : idList) {
            Optional<JenisPerluasan> optionalJenisPerluasan = jenisPerluasanRepository.findById(Integer.parseInt(id));
            JenisPerluasan modelJenisPerluasan = optionalJenisPerluasan.get();
            modelJenisPerluasan.decline(user.getId());
            jenisPerluasanRepository.save(modelJenisPerluasan);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<String,String>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit JenisPerluasan Berhasil !");
        return crunchifyMap;
    }


    @PostMapping(path = "/delete", consumes = "application/json")
    public HashMap<String, String> deleteJenisPerluasan(@RequestBody Map<String, Object> data,Principal principal) {
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));

        for(String id : idList) {
            Optional<JenisPerluasan> optionalJenisPerluasan = jenisPerluasanRepository.findById(Integer.parseInt(id));
            JenisPerluasan modelJenisPerluasan = optionalJenisPerluasan.get();
            jenisPerluasanRepository.delete(modelJenisPerluasan);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<String,String>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Delete JenisPerluasan Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/submit", consumes = "application/json")
    public HashMap<String, String> submitJenisPerluasan(@RequestBody Map<String, Object> data,Principal principal) {
        
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));
        User user = userRepository.findBynip(principal.getName());

        for(String id : idList) {
            Optional<JenisPerluasan> optionalJenisPerluasan = jenisPerluasanRepository.findById(Integer.parseInt(id));
            JenisPerluasan modelJenisPerluasan = optionalJenisPerluasan.get();
            modelJenisPerluasan.submit(user.getId());
            jenisPerluasanRepository.save(modelJenisPerluasan);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<String,String>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Edit Dan Submit JenisPerluasan Berhasil !");
        return crunchifyMap;
    }
}