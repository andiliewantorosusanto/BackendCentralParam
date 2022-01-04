package com.beCMS.BackendCentralParam.api;

import java.security.Principal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.beCMS.BackendCentralParam.model.Program;
import com.beCMS.BackendCentralParam.model.userlogin.User;
import com.beCMS.BackendCentralParam.repository.BiayaAdminRepository;
import com.beCMS.BackendCentralParam.repository.BiayaFidusiaRepository;
import com.beCMS.BackendCentralParam.repository.BiayaProvisiRepository;
import com.beCMS.BackendCentralParam.repository.KomponenPHRepository;
import com.beCMS.BackendCentralParam.repository.MinimalDPRepository;
import com.beCMS.BackendCentralParam.repository.PerluasanAsuransiRepository;
import com.beCMS.BackendCentralParam.repository.ProgramRepository;
import com.beCMS.BackendCentralParam.repository.RateAsuransiRepository;
import com.beCMS.BackendCentralParam.repository.RateBungaRepository;
import com.beCMS.BackendCentralParam.repository.RateCPRepository;
import com.beCMS.BackendCentralParam.repository.UserRepository;
import com.beCMS.BackendCentralParam.repository.UsiaKendaraanLunasRepository;

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
@RequestMapping("/api/program")
@CrossOrigin(origins = "*")
public class ProgramRestController {

    Logger logger = LoggerFactory.getLogger(ProgramRestController.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProgramRepository programRepository;

    @Autowired
    private RateAsuransiRepository rateAsuransiRepository;

    @Autowired
    private PerluasanAsuransiRepository perluasanAsuransiRepository;

    @Autowired
    private RateCPRepository rateCPRepository;

    @Autowired
    private RateBungaRepository rateBungaRepository;

    @Autowired
    private BiayaAdminRepository biayaAdminRepository;

    @Autowired
    private BiayaProvisiRepository biayaProvisiRepository;

    @Autowired
    private MinimalDPRepository minimalDPRepository;

    @Autowired
    private BiayaFidusiaRepository biayaFidusiaRepository;

    @Autowired
    private KomponenPHRepository komponenPHRepository;

    @Autowired
    private UsiaKendaraanLunasRepository usiaKendaraanLunasRepository;

    @PostMapping("/getalldata")
    public Map<String, Object> getAllDataProgram(Principal principal, Pageable pageable,
            HttpServletResponse response) {
        Map<String, Object> crunchifyMap = new HashMap<String, Object>();
        String id = principal.getName();

        String role = userRepository.cekRoles(id);
        logger.info("NIP : " + id);
        logger.info("ROLE : " + role);
        if (role.contains("USER")) {
            try {
                logger.info("Berhasil GET ALL DATA Program");
                crunchifyMap.put("dataProgram", programRepository.getListDataProgram());
                crunchifyMap.put("code", "1");
            } catch (Exception e) {
                logger.error("ERROR");
                response.setStatus(400);
                crunchifyMap.put("code", "0");
                crunchifyMap.put("message", "Gagal membuka Program!");
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
    public Map<String, Object> getAllSkema(Principal principal, Pageable pageable,
            HttpServletResponse response) {
        Map<String, Object> crunchifyMap = new HashMap<String, Object>();
        String id = principal.getName();

        String role = userRepository.cekRoles(id);
        logger.info("NIP : " + id);
        logger.info("ROLE : " + role);
        if (role.contains("USER")) {
            try {
                logger.info("Berhasil GET ALL DATA Skema Program");
                crunchifyMap.put("skemaRateAsuransi", rateAsuransiRepository.getListDataSkemaRateAsuransi());
                crunchifyMap.put("skemaPerluasanAsuransi", perluasanAsuransiRepository.getListDataSkemaPerluasanAsuransi());
                crunchifyMap.put("skemaRateCP", rateCPRepository.getListDataSkemaRateCP());
                crunchifyMap.put("skemaRateBunga", rateBungaRepository.getListDataSkemaRateBunga());
                crunchifyMap.put("skemaBiayaAdmin", biayaAdminRepository.getListDataSkemaBiayaAdmin());
                crunchifyMap.put("skemaBiayaProvisi", biayaProvisiRepository.getListDataSkemaBiayaProvisi());
                crunchifyMap.put("skemaMinimalDP", minimalDPRepository.getListDataSkemaMinimalDP());
                crunchifyMap.put("skemaBiayaFidusia", biayaFidusiaRepository.getListDataSkemaBiayaFidusia());
                crunchifyMap.put("skemaKomponenPH", komponenPHRepository.getListDataSkemaKomponenPH());
                crunchifyMap.put("skemaUsiaKendaraanLunas", usiaKendaraanLunasRepository.getListDataSkemaUsiaKendaraanLunas());
                crunchifyMap.put("code", "1");
            } catch (Exception e) {
                logger.error("ERROR");
                response.setStatus(400);
                crunchifyMap.put("code", "0");
                crunchifyMap.put("message", "Gagal membuka Skema Program!");
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
    public Map<String, Object> getProgram(Principal principal,@PathVariable Integer id,
            HttpServletResponse response) {
        Map<String, Object> crunchifyMap = new HashMap<String, Object>();
        String userId = principal.getName();

        String role = userRepository.cekRoles(userId);
        if (role.contains("USER")) {
            try {
                logger.info("Berhasil Program");
                crunchifyMap.put("program", programRepository.findById(id));
                crunchifyMap.put("code", "1");
            } catch (Exception e) {
                logger.error("ERROR");
                response.setStatus(400);
                crunchifyMap.put("code", "0");
                crunchifyMap.put("message", "Gagal membuka Program!");
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
    public HashMap<String, String> insertProgram(@RequestBody Program program,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        System.out.println("hey : " +program.toString());
        program.trace(user.getId());
        programRepository.save(program);

        HashMap<String, String> crunchifyMap = new HashMap<String,String>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Program Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/inputAndSubmit", consumes = "application/json")
    public HashMap<String, String> insertAndSubmitProgram(@RequestBody Program program,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        System.out.println("hey : " +program.toString());
        program.submit(user.getId());
        programRepository.save(program);
        
        HashMap<String, String> crunchifyMap = new HashMap<String,String>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit Program Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/approveData", consumes = "application/json")
    public HashMap<String, String> approveDataProgram(@RequestBody Program modelProgram,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        Optional<Program> optionalProgram = programRepository.findById(modelProgram.getId());
        Program approvalModel = optionalProgram.get();
        approvalModel.approve(user.getId());
        programRepository.save(approvalModel);
        
        HashMap<String, String> crunchifyMap = new HashMap<String,String>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit Tipe Konsumen Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/declineData", consumes = "application/json")
    public HashMap<String, String> declineDataProgram(@RequestBody Program modelProgram,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        Optional<Program> optionalProgram = programRepository.findById(modelProgram.getId());
        Program approvalModel = optionalProgram.get();
        approvalModel.decline(user.getId());
        programRepository.save(approvalModel);
        
        HashMap<String, String> crunchifyMap = new HashMap<String,String>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit Tipe Konsumen Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/approve", consumes = "application/json")
    public HashMap<String, String> approveProgram(@RequestBody Map<String, Object> data,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));
        for(String id : idList) {
            System.out.println("Mengakses ID : "+id);
            Optional<Program> optionalProgram = programRepository.findById(Integer.parseInt(id));
            Program program = optionalProgram.get();
            program.approve(user.getId());
            programRepository.save(program);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<String,String>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit Program Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/decline", consumes = "application/json")
    public HashMap<String, String> declineProgram(@RequestBody Map<String, Object> data,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));
        for(String id : idList) {
            Optional<Program> optionalProgram = programRepository.findById(Integer.parseInt(id));
            Program program = optionalProgram.get();
            program.decline(user.getId());
            programRepository.save(program);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<String,String>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit Program Berhasil !");
        return crunchifyMap;
    }


    @PostMapping(path = "/delete", consumes = "application/json")
    public HashMap<String, String> deleteProgram(@RequestBody Map<String, Object> data,Principal principal) {
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));

        for(String id : idList) {
            Optional<Program> optionalProgram = programRepository.findById(Integer.parseInt(id));
            Program program = optionalProgram.get();
            programRepository.delete(program);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<String,String>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Delete Program Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/submit", consumes = "application/json")
    public HashMap<String, String> submitProgram(@RequestBody Map<String, Object> data,Principal principal) {
        
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));
        User user = userRepository.findBynip(principal.getName());

        for(String id : idList) {
            Optional<Program> optionalProgram = programRepository.findById(Integer.parseInt(id));
            Program program = optionalProgram.get();
            program.submit(user.getId());
            programRepository.save(program);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<String,String>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Edit Dan Submit Program Berhasil !");
        return crunchifyMap;
    }
}