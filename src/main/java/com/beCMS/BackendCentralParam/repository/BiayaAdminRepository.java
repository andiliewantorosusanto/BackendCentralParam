package com.beCMS.BackendCentralParam.repository;

import java.util.List;

import com.beCMS.BackendCentralParam.model.BiayaAdmin;
import com.beCMS.BackendCentralParam.view.vwDataBiayaAdmin;
import com.beCMS.BackendCentralParam.view.vwSkemaList;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@DynamicUpdate
public interface BiayaAdminRepository extends JpaRepository<BiayaAdmin, Integer> {

    @Query(
        "SELECT new com.beCMS.BackendCentralParam.view.vwDataBiayaAdmin"
        + "(a.id,a.namaSkema,a.loanType"
        + ",a.tipeKonsumen,CASE WHEN a.tipeKonsumen = 0 THEN 'All' ELSE tk.nama END"
        + ",a.jenisKendaraan,CASE WHEN a.jenisKendaraan = 0 THEN 'All' ELSE jk.jenisKendaraan END "
        + ",a.jenisPembiayaan,jp.jenisPembiayaan"
        + ",a.cluster,c.cluster"    
        + ",a.diskonNpwp,CASE WHEN a.diskonNpwp = 0 THEN 'All' WHEN a.diskonNpwp = 1 THEN 'Yes' ELSE 'No' END "
        + ",a.tenor1,a.tenor2,a.tenor3,a.tenor4,a.tenor5,a.tenor6,a.tenor7,a.tenor8,a.tenor9,a.tenor10"
        + ",a.startBerlaku,a.endBerlaku,a.statusApproval,a.remarks,a.isRejected,a.isApproved)"
        + "FROM BiayaAdmin a "
        + "left join JenisKendaraan jk on a.jenisKendaraan = jk.id " 
        + "left join JenisPembiayaan jp on a.jenisPembiayaan = jp.id " 
        + "LEFT JOIN TipeKonsumen tk ON a.tipeKonsumen = tk.id " 
        + "LEFT JOIN Cluster c ON a.cluster = c.id"
        )
    List<vwDataBiayaAdmin> getListDataBiayaAdmin();

    @Query("SELECT new com.beCMS.BackendCentralParam.view.vwSkemaList(id,namaSkema) from BiayaAdmin")
    List<vwSkemaList> getListDataSkemaBiayaAdmin();
}