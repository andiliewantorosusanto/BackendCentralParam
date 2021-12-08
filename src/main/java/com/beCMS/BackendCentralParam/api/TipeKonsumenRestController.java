package com.beCMS.BackendCentralParam.api;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.beCMS.BackendCentralParam.model.modelTipeKonsumen;
import com.beCMS.BackendCentralParam.model.userlogin.User;
import com.beCMS.BackendCentralParam.repository.TipeKonsumenRepository;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tipekonsumen")
@CrossOrigin(origins = "*")
public class TipeKonsumenRestController {

    Logger logger = LoggerFactory.getLogger(TipeKonsumenRestController.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TipeKonsumenRepository tipeKonsumenRepository;

    @PostMapping("/getalldata")
    public Map<String, Object> getAllDataTipeKonsumen(Principal principal, Pageable pageable,
            HttpServletResponse response) {
        Map<String, Object> crunchifyMap = new HashMap<String, Object>();
        String id = principal.getName();

        String role = userRepository.cekRoles(id);
        logger.info("NIP : " + id);
        logger.info("ROLE : " + role);
        if (role.contains("USER")) {
            try {
                logger.info("Berhasil GET ALL DATA Tipe Konsumen");
                crunchifyMap.put("dataTipeKonsumen", tipeKonsumenRepository.findAll());
                crunchifyMap.put("code", "1");
            } catch (Exception e) {
                logger.error("ERROR");
                response.setStatus(400);
                crunchifyMap.put("code", "0");
                crunchifyMap.put("message", "Gagal membuka Tipe Konsumen!");
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
    public Map<String, Object> getTipeKonsumen(Principal principal,@PathVariable Integer id,
            HttpServletResponse response) {
        Map<String, Object> crunchifyMap = new HashMap<String, Object>();
        String userId = principal.getName();

        String role = userRepository.cekRoles(userId);
        if (role.contains("USER")) {
            try {
                logger.info("Berhasil Tipe Konsumen");
                crunchifyMap.put("tipeKonsumen", tipeKonsumenRepository.findById(id));
                crunchifyMap.put("code", "1");
            } catch (Exception e) {
                logger.error("ERROR");
                response.setStatus(400);
                crunchifyMap.put("code", "0");
                crunchifyMap.put("message", "Gagal membuka Tipe Konsumen!");
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
    public HashMap<String, String> insertTipeKonsumen(@RequestBody modelTipeKonsumen modelTipeKonsumen,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        modelTipeKonsumen.trace(user.getId());
        tipeKonsumenRepository.save(modelTipeKonsumen);

        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Tipe Konsumen Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/inputAndSubmit", consumes = "application/json")
    public HashMap<String, String> insertAndSubmitTipeKonsumen(@RequestBody modelTipeKonsumen modelTipeKonsumen,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        modelTipeKonsumen.submit(user.getId());
        tipeKonsumenRepository.save(modelTipeKonsumen);
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit Tipe Konsumen Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/delete", consumes = "application/json")
    public HashMap<String, String> deleteTipeKonsumen(@RequestParam("id[]") List<Integer> ids,Principal principal) {
        for(Integer id : ids) {
            Optional<modelTipeKonsumen> opTionalModelTipeKonsumen = tipeKonsumenRepository.findById(id);
            modelTipeKonsumen modelTipeKonsumen = opTionalModelTipeKonsumen.get();
            tipeKonsumenRepository.delete(modelTipeKonsumen);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Delete Tipe Konsumen Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/submit", consumes = "application/json")
    public HashMap<String, String> submitTipeKonsumen(@RequestParam("id[]") List<Integer> ids,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());

        for(Integer id : ids) {
            Optional<modelTipeKonsumen> opTionalModelTipeKonsumen = tipeKonsumenRepository.findById(id);
            modelTipeKonsumen modelTipeKonsumen = opTionalModelTipeKonsumen.get();
            modelTipeKonsumen.submit(user.getId());
            tipeKonsumenRepository.save(modelTipeKonsumen);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Edit Dan Submit Tipe Konsumen Berhasil !");
        return crunchifyMap;
    }
}