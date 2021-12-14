package com.beCMS.BackendCentralParam.api;

import java.security.Principal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.beCMS.BackendCentralParam.model.JenisKendaraan;
import com.beCMS.BackendCentralParam.model.userlogin.User;
import com.beCMS.BackendCentralParam.repository.JenisKendaraanRepository;
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
@RequestMapping("/api/jeniskendaraan")
@CrossOrigin(origins = "*")
public class JenisKendaraanRestController {

    Logger logger = LoggerFactory.getLogger(JenisKendaraanRestController.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private JenisKendaraanRepository jenisKendaraanRepository;

    @PostMapping("/getalldata")
    public Map<String, Object> getAllDataJenisKendaraan(Principal principal, Pageable pageable,
            HttpServletResponse response) {
        Map<String, Object> crunchifyMap = new HashMap<String, Object>();
        String id = principal.getName();

        String role = userRepository.cekRoles(id);
        logger.info("NIP : " + id);
        logger.info("ROLE : " + role);
        if (role.contains("USER")) {
            try {
                logger.info("Berhasil GET ALL DATA JenisKendaraan");
                crunchifyMap.put("dataJenisKendaraan", jenisKendaraanRepository.findAll());
                System.out.println(jenisKendaraanRepository.findAll().get(1).toString());
                crunchifyMap.put("code", "1");
            } catch (Exception e) {
                logger.error("ERROR");
                response.setStatus(400);
                crunchifyMap.put("code", "0");
                crunchifyMap.put("message", "Gagal membuka JenisKendaraan!");
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
    public Map<String, Object> getJenisKendaraan(Principal principal,@PathVariable Integer id,
            HttpServletResponse response) {
        Map<String, Object> crunchifyMap = new HashMap<String, Object>();
        String userId = principal.getName();

        String role = userRepository.cekRoles(userId);
        if (role.contains("USER")) {
            try {
                logger.info("Berhasil JenisKendaraan");
                crunchifyMap.put("jenisKendaraan", jenisKendaraanRepository.findById(id));
                crunchifyMap.put("code", "1");
            } catch (Exception e) {
                logger.error("ERROR");
                response.setStatus(400);
                crunchifyMap.put("code", "0");
                crunchifyMap.put("message", "Gagal membuka JenisKendaraan!");
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
    public HashMap<String, String> insertJenisKendaraan(@RequestBody JenisKendaraan jenisKendaraan,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        System.out.println("hey : " +jenisKendaraan.toString());
        jenisKendaraan.trace(user.getId());
        jenisKendaraanRepository.save(jenisKendaraan);

        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input JenisKendaraan Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/inputAndSubmit", consumes = "application/json")
    public HashMap<String, String> insertAndSubmitJenisKendaraan(@RequestBody JenisKendaraan jenisKendaraan,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        System.out.println("hey : " +jenisKendaraan.toString());
        jenisKendaraan.submit(user.getId());
        jenisKendaraanRepository.save(jenisKendaraan);
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit JenisKendaraan Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/approveData", consumes = "application/json")
    public HashMap<String, String> approveDataJenisKendaraan(@RequestBody JenisKendaraan jenisKendaraan,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        jenisKendaraan.approve(user.getId());
        jenisKendaraanRepository.save(jenisKendaraan);
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit JenisKendaraan Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/declineData", consumes = "application/json")
    public HashMap<String, String> declineDataJenisKendaraan(@RequestBody JenisKendaraan jenisKendaraan,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        jenisKendaraan.decline(user.getId());
        jenisKendaraanRepository.save(jenisKendaraan);
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit JenisKendaraan Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/approve", consumes = "application/json")
    public HashMap<String, String> approveJenisKendaraan(@RequestBody Map<String, Object> data,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));
        for(String id : idList) {
            System.out.println("Mengakses ID : "+id);
            Optional<JenisKendaraan> optionalJenisKendaraan = jenisKendaraanRepository.findById(Integer.parseInt(id));
            JenisKendaraan jenisKendaraan = optionalJenisKendaraan.get();
            jenisKendaraan.approve(user.getId());
            jenisKendaraanRepository.save(jenisKendaraan);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit JenisKendaraan Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/decline", consumes = "application/json")
    public HashMap<String, String> declineJenisKendaraan(@RequestBody Map<String, Object> data,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));
        for(String id : idList) {
            Optional<JenisKendaraan> optionalJenisKendaraan = jenisKendaraanRepository.findById(Integer.parseInt(id));
            JenisKendaraan jenisKendaraan = optionalJenisKendaraan.get();
            jenisKendaraan.decline(user.getId());
            jenisKendaraanRepository.save(jenisKendaraan);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit JenisKendaraan Berhasil !");
        return crunchifyMap;
    }


    @PostMapping(path = "/delete", consumes = "application/json")
    public HashMap<String, String> deleteJenisKendaraan(@RequestBody Map<String, Object> data,Principal principal) {
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));

        for(String id : idList) {
            Optional<JenisKendaraan> optionalJenisKendaraan = jenisKendaraanRepository.findById(Integer.parseInt(id));
            JenisKendaraan jenisKendaraan = optionalJenisKendaraan.get();
            jenisKendaraanRepository.delete(jenisKendaraan);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Delete JenisKendaraan Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/submit", consumes = "application/json")
    public HashMap<String, String> submitJenisKendaraan(@RequestBody Map<String, Object> data,Principal principal) {
        
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));
        User user = userRepository.findBynip(principal.getName());

        for(String id : idList) {
            Optional<JenisKendaraan> optionalJenisKendaraan = jenisKendaraanRepository.findById(Integer.parseInt(id));
            JenisKendaraan jenisKendaraan = optionalJenisKendaraan.get();
            jenisKendaraan.submit(user.getId());
            jenisKendaraanRepository.save(jenisKendaraan);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Edit Dan Submit JenisKendaraan Berhasil !");
        return crunchifyMap;
    }
}