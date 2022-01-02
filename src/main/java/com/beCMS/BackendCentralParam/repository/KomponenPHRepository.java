package com.beCMS.BackendCentralParam.repository;

import java.util.List;

import com.beCMS.BackendCentralParam.model.KomponenPH;
import com.beCMS.BackendCentralParam.view.vwDataKomponenPH;
import com.beCMS.BackendCentralParam.view.vwSkemaList;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@DynamicUpdate
public interface KomponenPHRepository extends JpaRepository<KomponenPH, Integer> {

    @Query(
        "SELECT new com.beCMS.BackendCentralParam.view.vwDataKomponenPH"
        + "(a.id,a.namaSkema"
        + ",a.tipeKonsumen,CASE WHEN a.tipeKonsumen = 0 THEN 'All' ELSE tk.nama END"
        + ",a.jenisPembiayaan,jp.jenisPembiayaan"
        + ",a.jenis "    
        + ",CASE WHEN a.addm = 0 THEN 'Prepaid' WHEN a.addm = 1 THEN 'Onloan' ELSE 'Not Included' END "
        + ",CASE WHEN a.addb = 0 THEN 'Prepaid' WHEN a.addb = 1 THEN 'Onloan' ELSE 'Not Included' END "
        + ",a.statusApproval,a.remarks,a.isRejected,a.isApproved) "
        + "FROM KomponenPH a "
        + "left join JenisPembiayaan jp on a.jenisPembiayaan = jp.id " 
        + "LEFT JOIN TipeKonsumen tk ON a.tipeKonsumen = tk.id " 
        )
    List<vwDataKomponenPH> getListDataKomponenPH();

    @Query("SELECT new com.beCMS.BackendCentralParam.view.vwSkemaList(id,namaSkema) from KomponenPH")
    List<vwSkemaList> getListDataSkemaKomponenPH();

}