package com.beCMS.BackendCentralParam.repository;

import java.util.List;

import com.beCMS.BackendCentralParam.model.BiayaProvisi;
import com.beCMS.BackendCentralParam.view.vwDataBiayaProvisi;
import com.beCMS.BackendCentralParam.view.vwSkemaList;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@DynamicUpdate
public interface BiayaProvisiRepository extends JpaRepository<BiayaProvisi, Integer> {

    
    @Query(
        "SELECT new com.beCMS.BackendCentralParam.view.vwDataBiayaProvisi"
        + "(a.id,a.namaSkema"
        + ",a.loanType,CASE WHEN a.loanType = 0 THEN 'All' WHEN a.loanType = 1 THEN 'ADDM' ELSE 'ADDB' END"
        + ",a.jenisKendaraan,CASE WHEN a.jenisKendaraan = 0 THEN 'All' ELSE jk.jenisKendaraan END "
        + ",a.jenisPembiayaan,jp.jenisPembiayaan"
        + ",a.tenor1,a.tenor2,a.tenor3,a.tenor4,a.tenor5,a.tenor6,a.tenor7,a.tenor8,a.tenor9,a.tenor10"
        + ",a.tenor1Persen,a.tenor2Persen,a.tenor3Persen,a.tenor4Persen,a.tenor5Persen,a.tenor6Persen,a.tenor7Persen,a.tenor8Persen,a.tenor9Persen,a.tenor10Persen"
        + ",a.startBerlaku,a.endBerlaku,a.statusApproval,a.remarks,a.isRejected,a.isApproved)"
        + "FROM BiayaProvisi a "
        + "left join JenisKendaraan jk on a.jenisKendaraan = jk.id " 
        + "left join JenisPembiayaan jp on a.jenisPembiayaan = jp.id "
        )
    List<vwDataBiayaProvisi> getListDataBiayaProvisi();

    @Query("SELECT new com.beCMS.BackendCentralParam.view.vwSkemaList(id,namaSkema) from BiayaProvisi")
    List<vwSkemaList> getListDataSkemaBiayaProvisi();
}