package com.beCMS.BackendCentralParam.api;

import java.security.Principal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.beCMS.BackendCentralParam.model.KomponenPH;
import com.beCMS.BackendCentralParam.model.userlogin.User;
import com.beCMS.BackendCentralParam.repository.KomponenPHRepository;
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
@RequestMapping("/api/komponenph")
@CrossOrigin(origins = "*")
public class KomponenPHRestController {

    Logger logger = LoggerFactory.getLogger(KomponenPHRestController.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private KomponenPHRepository komponenPHRepository;

    @PostMapping("/getalldata")
    public Map<String, Object> getAllDataRateKomponenPH(Principal principal, Pageable pageable,
            HttpServletResponse response) {
        Map<String, Object> crunchifyMap = new HashMap<String, Object>();
        String id = principal.getName();

        String role = userRepository.cekRoles(id);
        logger.info("NIP : " + id);
        logger.info("ROLE : " + role);
        if (role.contains("USER")) {
            try {
                logger.info("Berhasil GET ALL DATA RateKomponenPH");
                crunchifyMap.put("dataKomponenPH", komponenPHRepository.getListDataKomponenPH());
                crunchifyMap.put("code", "1");
            } catch (Exception e) {
                logger.error("ERROR");
                response.setStatus(400);
                crunchifyMap.put("code", "0");
                crunchifyMap.put("message", "Gagal membuka RateKomponenPH!");
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
    public Map<String, Object> getAllSkemaKomponenPH(Principal principal, Pageable pageable,
            HttpServletResponse response) {
        Map<String, Object> crunchifyMap = new HashMap<String, Object>();
        String id = principal.getName();

        String role = userRepository.cekRoles(id);
        logger.info("NIP : " + id);
        logger.info("ROLE : " + role);
        if (role.contains("USER")) {
            try {
                logger.info("Berhasil GET ALL Skema KomponenPH");
                crunchifyMap.put("dataSkema", komponenPHRepository.getListDataSkemaKomponenPH());
                crunchifyMap.put("code", "1");
            } catch (Exception e) {
                logger.error("ERROR");
                response.setStatus(400);
                crunchifyMap.put("code", "0");
                crunchifyMap.put("message", "Gagal membuka KomponenPH!");
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
    public Map<String, Object> getRateKomponenPH(Principal principal,@PathVariable Integer id,
            HttpServletResponse response) {
        Map<String, Object> crunchifyMap = new HashMap<String, Object>();
        String userId = principal.getName();

        String role = userRepository.cekRoles(userId);
        if (role.contains("USER")) {
            try {
                logger.info("Berhasil RateKomponenPH");
                crunchifyMap.put("komponenPH", komponenPHRepository.findById(id));
                crunchifyMap.put("code", "1");
            } catch (Exception e) {
                logger.error("ERROR");
                response.setStatus(400);
                crunchifyMap.put("code", "0");
                crunchifyMap.put("message", "Gagal membuka RateKomponenPH!");
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
    public HashMap<String, String> insertRateKomponenPH(@RequestBody KomponenPH KomponenPH,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        System.out.println("hey : " +KomponenPH.toString());
        KomponenPH.trace(user.getId());
        komponenPHRepository.save(KomponenPH);

        HashMap<String, String> crunchifyMap = new HashMap<String,String>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input RateKomponenPH Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/inputAndSubmit", consumes = "application/json")
    public HashMap<String, String> insertAndSubmitRateKomponenPH(@RequestBody KomponenPH KomponenPH,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        System.out.println("hey : " +KomponenPH.toString());
        KomponenPH.submit(user.getId());
        komponenPHRepository.save(KomponenPH);
        
        HashMap<String, String> crunchifyMap = new HashMap<String,String>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit RateKomponenPH Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/approveData", consumes = "application/json")
    public HashMap<String, String> approveDataKomponenPH(@RequestBody KomponenPH modelKomponenPH,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        Optional<KomponenPH> optionalKomponenPH = komponenPHRepository.findById(modelKomponenPH.getId());
        KomponenPH approvalModel = optionalKomponenPH.get();
        approvalModel.approve(user.getId());
        komponenPHRepository.save(approvalModel);
        
        HashMap<String, String> crunchifyMap = new HashMap<String,String>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit Tipe Konsumen Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/declineData", consumes = "application/json")
    public HashMap<String, String> declineDataKomponenPH(@RequestBody KomponenPH modelKomponenPH,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        Optional<KomponenPH> optionalKomponenPH = komponenPHRepository.findById(modelKomponenPH.getId());
        KomponenPH approvalModel = optionalKomponenPH.get();
        approvalModel.decline(user.getId());
        komponenPHRepository.save(approvalModel);
        
        HashMap<String, String> crunchifyMap = new HashMap<String,String>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit Tipe Konsumen Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/approve", consumes = "application/json")
    public HashMap<String, String> approveRateKomponenPH(@RequestBody Map<String, Object> data,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));
        for(String id : idList) {
            System.out.println("Mengakses ID : "+id);
            Optional<KomponenPH> optionalRateKomponenPH = komponenPHRepository.findById(Integer.parseInt(id));
            KomponenPH KomponenPH = optionalRateKomponenPH.get();
            KomponenPH.approve(user.getId());
            komponenPHRepository.save(KomponenPH);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<String,String>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit RateKomponenPH Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/decline", consumes = "application/json")
    public HashMap<String, String> declineRateKomponenPH(@RequestBody Map<String, Object> data,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));
        for(String id : idList) {
            Optional<KomponenPH> optionalRateKomponenPH = komponenPHRepository.findById(Integer.parseInt(id));
            KomponenPH KomponenPH = optionalRateKomponenPH.get();
            KomponenPH.decline(user.getId());
            komponenPHRepository.save(KomponenPH);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<String,String>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit RateKomponenPH Berhasil !");
        return crunchifyMap;
    }


    @PostMapping(path = "/delete", consumes = "application/json")
    public HashMap<String, String> deleteRateKomponenPH(@RequestBody Map<String, Object> data,Principal principal) {
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));

        for(String id : idList) {
            Optional<KomponenPH> optionalRateKomponenPH = komponenPHRepository.findById(Integer.parseInt(id));
            KomponenPH KomponenPH = optionalRateKomponenPH.get();
            komponenPHRepository.delete(KomponenPH);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<String,String>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Delete RateKomponenPH Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/submit", consumes = "application/json")
    public HashMap<String, String> submitRateKomponenPH(@RequestBody Map<String, Object> data,Principal principal) {
        
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));
        User user = userRepository.findBynip(principal.getName());

        for(String id : idList) {
            Optional<KomponenPH> optionalRateKomponenPH = komponenPHRepository.findById(Integer.parseInt(id));
            KomponenPH KomponenPH = optionalRateKomponenPH.get();
            KomponenPH.submit(user.getId());
            komponenPHRepository.save(KomponenPH);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<String,String>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Edit Dan Submit RateKomponenPH Berhasil !");
        return crunchifyMap;
    }
}