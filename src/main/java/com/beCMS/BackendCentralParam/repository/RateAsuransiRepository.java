package com.beCMS.BackendCentralParam.repository;

import java.util.List;
import com.beCMS.BackendCentralParam.model.RateAsuransi;
import com.beCMS.BackendCentralParam.view.vwDataRateAsuransi;
import com.beCMS.BackendCentralParam.view.vwSkemaList;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@DynamicUpdate
public interface RateAsuransiRepository extends JpaRepository<RateAsuransi, Integer> {

    @Query(
        "SELECT new com.beCMS.BackendCentralParam.view.vwDataRateAsuransi"
        + "(a.id,a.namaSkema"
        + ",a.wilayah,CASE WHEN a.wilayah = 0 THEN 'All' ELSE w.namaWilayah END"
        + ",a.jenisPembiayaan,jp.jenisPembiayaan"
        + ",a.jenisKendaraan,CASE WHEN a.jenisKendaraan = 0 THEN 'All' ELSE jk.jenisKendaraan END "
        + ",a.tipeAsuransi,CASE WHEN a.tipeAsuransi = 0 THEN 'All' ELSE ta.namaAsuransi END"
        + ",a.startOtr,a.endOtr,a.startYear,a.endYear"
        + ",a.tenor1,a.tenor2,a.tenor3,a.tenor4,a.tenor5,a.tenor6,a.tenor7,a.tenor8,a.tenor9,a.tenor10"
        + ",a.startBerlaku,a.endBerlaku,a.statusApproval,a.remarks,a.isRejected,a.isApproved)"
        + "FROM RateAsuransi a "
        + "LEFT JOIN Wilayah w on a.wilayah = w.id " 
        + "LEFT JOIN JenisKendaraan jk on a.jenisKendaraan = jk.id " 
        + "LEFT JOIN JenisPembiayaan jp on a.jenisPembiayaan = jp.id " 
        + "LEFT JOIN TipeAsuransi ta ON a.tipeAsuransi = ta.id "
        )
    List<vwDataRateAsuransi> getListDataRateAsuransi();

    @Query("SELECT new com.beCMS.BackendCentralParam.view.vwSkemaList(id,namaSkema) from RateAsuransi")
    List<vwSkemaList> getListDataSkemaRateAsuransi();
}