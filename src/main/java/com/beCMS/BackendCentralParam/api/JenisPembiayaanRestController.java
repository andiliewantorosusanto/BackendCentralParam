package com.beCMS.BackendCentralParam.api;

import java.security.Principal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.beCMS.BackendCentralParam.model.JenisPembiayaan;
import com.beCMS.BackendCentralParam.model.userlogin.User;
import com.beCMS.BackendCentralParam.repository.JenisPembiayaanRepository;
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
@RequestMapping("/api/jenispembiayaan")
@CrossOrigin(origins = "*")
public class JenisPembiayaanRestController {

    Logger logger = LoggerFactory.getLogger(JenisPembiayaanRestController.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private JenisPembiayaanRepository jenisPembiayaanRepository;

    @PostMapping("/getalldata")
    public Map<String, Object> getAllDataJenisPembiayaan(Principal principal, Pageable pageable,
            HttpServletResponse response) {
        Map<String, Object> crunchifyMap = new HashMap<String, Object>();
        String id = principal.getName();

        String role = userRepository.cekRoles(id);
        logger.info("NIP : " + id);
        logger.info("ROLE : " + role);
        if (role.contains("USER")) {
            try {
                logger.info("Berhasil GET ALL DATA JenisPembiayaan");
                crunchifyMap.put("dataJenisPembiayaan", jenisPembiayaanRepository.getListDataJenisPembiayaan());
                crunchifyMap.put("code", "1");
            } catch (Exception e) {
                logger.error("ERROR");
                response.setStatus(400);
                crunchifyMap.put("code", "0");
                crunchifyMap.put("message", "Gagal membuka JenisPembiayaan!");
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
    public Map<String, Object> getJenisPembiayaan(Principal principal,@PathVariable Integer id,
            HttpServletResponse response) {
        Map<String, Object> crunchifyMap = new HashMap<String, Object>();
        String userId = principal.getName();

        String role = userRepository.cekRoles(userId);
        if (role.contains("USER")) {
            try {
                logger.info("Berhasil JenisPembiayaan");
                crunchifyMap.put("jenisPembiayaan", jenisPembiayaanRepository.findById(id));
                crunchifyMap.put("code", "1");
            } catch (Exception e) {
                logger.error("ERROR");
                response.setStatus(400);
                crunchifyMap.put("code", "0");
                crunchifyMap.put("message", "Gagal membuka JenisPembiayaan!");
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
    public HashMap<String, String> insertJenisPembiayaan(@RequestBody JenisPembiayaan jenisPembiayaan,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        System.out.println("hey : " +jenisPembiayaan.toString());
        jenisPembiayaan.trace(user.getId());
        jenisPembiayaanRepository.save(jenisPembiayaan);

        HashMap<String, String> crunchifyMap = new HashMap<String,String>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input JenisPembiayaan Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/inputAndSubmit", consumes = "application/json")
    public HashMap<String, String> insertAndSubmitJenisPembiayaan(@RequestBody JenisPembiayaan jenisPembiayaan,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        System.out.println("hey : " +jenisPembiayaan.toString());
        jenisPembiayaan.submit(user.getId());
        jenisPembiayaanRepository.save(jenisPembiayaan);
        
        HashMap<String, String> crunchifyMap = new HashMap<String,String>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit JenisPembiayaan Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/approveData", consumes = "application/json")
    public HashMap<String, String> approveDataJenisPembiayaan(@RequestBody JenisPembiayaan modelJenisPembiayaan,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        Optional<JenisPembiayaan> optionalJenisPembiayaan = jenisPembiayaanRepository.findById(modelJenisPembiayaan.getId());
        JenisPembiayaan approvalModel = optionalJenisPembiayaan.get();
        approvalModel.approve(user.getId());
        jenisPembiayaanRepository.save(approvalModel);
        
        HashMap<String, String> crunchifyMap = new HashMap<String,String>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit Tipe Konsumen Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/declineData", consumes = "application/json")
    public HashMap<String, String> declineDataJenisPembiayaan(@RequestBody JenisPembiayaan modelJenisPembiayaan,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        Optional<JenisPembiayaan> optionalJenisPembiayaan = jenisPembiayaanRepository.findById(modelJenisPembiayaan.getId());
        JenisPembiayaan approvalModel = optionalJenisPembiayaan.get();
        approvalModel.decline(user.getId());
        jenisPembiayaanRepository.save(approvalModel);
        
        HashMap<String, String> crunchifyMap = new HashMap<String,String>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit Tipe Konsumen Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/approve", consumes = "application/json")
    public HashMap<String, String> approveJenisPembiayaan(@RequestBody Map<String, Object> data,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));
        for(String id : idList) {
            System.out.println("Mengakses ID : "+id);
            Optional<JenisPembiayaan> optionalJenisPembiayaan = jenisPembiayaanRepository.findById(Integer.parseInt(id));
            JenisPembiayaan jenisPembiayaan = optionalJenisPembiayaan.get();
            jenisPembiayaan.approve(user.getId());
            jenisPembiayaanRepository.save(jenisPembiayaan);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<String,String>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit JenisPembiayaan Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/decline", consumes = "application/json")
    public HashMap<String, String> declineJenisPembiayaan(@RequestBody Map<String, Object> data,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));
        for(String id : idList) {
            Optional<JenisPembiayaan> optionalJenisPembiayaan = jenisPembiayaanRepository.findById(Integer.parseInt(id));
            JenisPembiayaan jenisPembiayaan = optionalJenisPembiayaan.get();
            jenisPembiayaan.decline(user.getId());
            jenisPembiayaanRepository.save(jenisPembiayaan);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<String,String>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit JenisPembiayaan Berhasil !");
        return crunchifyMap;
    }


    @PostMapping(path = "/delete", consumes = "application/json")
    public HashMap<String, String> deleteJenisPembiayaan(@RequestBody Map<String, Object> data,Principal principal) {
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));

        for(String id : idList) {
            Optional<JenisPembiayaan> optionalJenisPembiayaan = jenisPembiayaanRepository.findById(Integer.parseInt(id));
            JenisPembiayaan jenisPembiayaan = optionalJenisPembiayaan.get();
            jenisPembiayaanRepository.delete(jenisPembiayaan);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<String,String>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Delete JenisPembiayaan Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/submit", consumes = "application/json")
    public HashMap<String, String> submitJenisPembiayaan(@RequestBody Map<String, Object> data,Principal principal) {
        
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));
        User user = userRepository.findBynip(principal.getName());

        for(String id : idList) {
            Optional<JenisPembiayaan> optionalJenisPembiayaan = jenisPembiayaanRepository.findById(Integer.parseInt(id));
            JenisPembiayaan jenisPembiayaan = optionalJenisPembiayaan.get();
            jenisPembiayaan.submit(user.getId());
            jenisPembiayaanRepository.save(jenisPembiayaan);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<String,String>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Edit Dan Submit JenisPembiayaan Berhasil !");
        return crunchifyMap;
    }
}