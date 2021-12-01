package com.beCMS.BackendCentralParam.api;

import java.security.Principal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.jar.JarException;

import javax.servlet.http.HttpServletResponse;

import com.beCMS.BackendCentralParam.model.modelTipeKonsumen;
import com.beCMS.BackendCentralParam.repository.TipeKonsumenRepository;
import com.beCMS.BackendCentralParam.repository.UserRepository;

import org.json.JSONException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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

    // NOTE Untuk liat list history penggunaan oleh Showroom REJECTED
    @PostMapping("/getalldata")
    public Map<String, Object> getAllDataTipeKonsumen(Principal principal, Pageable pageable,
            HttpServletResponse response) {
        Map crunchifyMap = new HashMap<String, Object>();

        // NOTE ambil dari token siapa yang sedang akses
        System.out.println(principal.getName());
        String id = principal.getName();

        // NOTE cek diquery rolenya dia sebagai apa
        String role = userRepository.cekRoles(id);
        logger.info("NIP : " + id);
        logger.info("ROLE : " + role);
        // NOTE kondisi dimana dia memiliki akses maka akan dilanjut
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

    @PostMapping(path = "/input", consumes = "application/json")
    public HashMap<String, String> insertTipeKonmodelTipeKonsumen(@RequestBody modelTipeKonsumen modelTipeKonsumen, Principal principal,
            HttpServletResponse response) throws JarException, JSONException, ParseException {

        tipeKonsumenRepository.save(modelTipeKonsumen);

        HashMap<String, String> crunchifyMap = new HashMap<>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Tipe Konsumen Berhasil !");
        return crunchifyMap;
    }
}