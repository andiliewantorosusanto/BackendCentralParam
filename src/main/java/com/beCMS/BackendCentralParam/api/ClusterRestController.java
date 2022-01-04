package com.beCMS.BackendCentralParam.api;

import java.security.Principal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.beCMS.BackendCentralParam.model.Cluster;
import com.beCMS.BackendCentralParam.model.userlogin.User;
import com.beCMS.BackendCentralParam.repository.ClusterRepository;
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
@RequestMapping("/api/cluster")
@CrossOrigin(origins = "*")
public class ClusterRestController {

    Logger logger = LoggerFactory.getLogger(ClusterRestController.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ClusterRepository clusterRepository;

    @PostMapping("/getalldata")
    public Map<String, Object> getAllDataCluster(Principal principal, Pageable pageable,
            HttpServletResponse response) {
        Map<String, Object> crunchifyMap = new HashMap<String, Object>();
        String id = principal.getName();

        String role = userRepository.cekRoles(id);
        logger.info("NIP : " + id);
        logger.info("ROLE : " + role);
        if (role.contains("USER")) {
            try {
                logger.info("Berhasil GET ALL DATA Cluster");
                crunchifyMap.put("dataCluster", clusterRepository.getListDataCluster());
                crunchifyMap.put("code", "1");
            } catch (Exception e) {
                logger.error("ERROR");
                response.setStatus(400);
                crunchifyMap.put("code", "0");
                crunchifyMap.put("message", "Gagal membuka Cluster!");
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
    public Map<String, Object> getCluster(Principal principal,@PathVariable Integer id,
            HttpServletResponse response) {
        Map<String, Object> crunchifyMap = new HashMap<String, Object>();
        String userId = principal.getName();

        String role = userRepository.cekRoles(userId);
        if (role.contains("USER")) {
            try {
                logger.info("Berhasil Cluster");
                crunchifyMap.put("cluster", clusterRepository.findById(id));
                crunchifyMap.put("code", "1");
            } catch (Exception e) {
                logger.error("ERROR");
                response.setStatus(400);
                crunchifyMap.put("code", "0");
                crunchifyMap.put("message", "Gagal membuka Cluster!");
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
    public HashMap<String, String> insertCluster(@RequestBody Cluster cluster,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        System.out.println("hey : " +cluster.toString());
        cluster.trace(user.getId());
        clusterRepository.save(cluster);

        HashMap<String, String> crunchifyMap = new HashMap<String,String>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Cluster Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/inputAndSubmit", consumes = "application/json")
    public HashMap<String, String> insertAndSubmitCluster(@RequestBody Cluster cluster,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        System.out.println("hey : " +cluster.toString());
        cluster.submit(user.getId());
        clusterRepository.save(cluster);
        
        HashMap<String, String> crunchifyMap = new HashMap<String,String>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit Cluster Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/approveData", consumes = "application/json")
    public HashMap<String, String> approveDataCluster(@RequestBody Cluster modelCluster,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        Optional<Cluster> optionalCluster = clusterRepository.findById(modelCluster.getId());
        Cluster approvalModel = optionalCluster.get();
        approvalModel.approve(user.getId());
        clusterRepository.save(approvalModel);
        
        HashMap<String, String> crunchifyMap = new HashMap<String,String>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit Tipe Konsumen Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/declineData", consumes = "application/json")
    public HashMap<String, String> declineDataCluster(@RequestBody Cluster modelCluster,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        Optional<Cluster> optionalCluster = clusterRepository.findById(modelCluster.getId());
        Cluster approvalModel = optionalCluster.get();
        approvalModel.decline(user.getId());
        clusterRepository.save(approvalModel);
        
        HashMap<String, String> crunchifyMap = new HashMap<String,String>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit Tipe Konsumen Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/approve", consumes = "application/json")
    public HashMap<String, String> approveCluster(@RequestBody Map<String, Object> data,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));
        for(String id : idList) {
            System.out.println("Mengakses ID : "+id);
            Optional<Cluster> optionalCluster = clusterRepository.findById(Integer.parseInt(id));
            Cluster cluster = optionalCluster.get();
            cluster.approve(user.getId());
            clusterRepository.save(cluster);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<String,String>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit Cluster Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/decline", consumes = "application/json")
    public HashMap<String, String> declineCluster(@RequestBody Map<String, Object> data,Principal principal) {
        
        User user = userRepository.findBynip(principal.getName());
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));
        for(String id : idList) {
            Optional<Cluster> optionalCluster = clusterRepository.findById(Integer.parseInt(id));
            Cluster cluster = optionalCluster.get();
            cluster.decline(user.getId());
            clusterRepository.save(cluster);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<String,String>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Input Dan Submit Cluster Berhasil !");
        return crunchifyMap;
    }


    @PostMapping(path = "/delete", consumes = "application/json")
    public HashMap<String, String> deleteCluster(@RequestBody Map<String, Object> data,Principal principal) {
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));

        for(String id : idList) {
            Optional<Cluster> optionalCluster = clusterRepository.findById(Integer.parseInt(id));
            Cluster cluster = optionalCluster.get();
            clusterRepository.delete(cluster);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<String,String>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Delete Cluster Berhasil !");
        return crunchifyMap;
    }

    @PostMapping(path = "/submit", consumes = "application/json")
    public HashMap<String, String> submitCluster(@RequestBody Map<String, Object> data,Principal principal) {
        
        List<String> idList = Arrays.asList(((String)data.get("ids")).split(","));
        User user = userRepository.findBynip(principal.getName());

        for(String id : idList) {
            Optional<Cluster> optionalCluster = clusterRepository.findById(Integer.parseInt(id));
            Cluster cluster = optionalCluster.get();
            cluster.submit(user.getId());
            clusterRepository.save(cluster);
        }
        
        HashMap<String, String> crunchifyMap = new HashMap<String,String>();
        crunchifyMap.put("code", "1");
        crunchifyMap.put("message", "Edit Dan Submit Cluster Berhasil !");
        return crunchifyMap;
    }
}