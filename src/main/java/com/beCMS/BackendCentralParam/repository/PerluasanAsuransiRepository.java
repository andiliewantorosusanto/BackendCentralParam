package com.beCMS.BackendCentralParam.repository;

import java.util.List;

import com.beCMS.BackendCentralParam.model.PerluasanAsuransi;
import com.beCMS.BackendCentralParam.view.vwDataPerluasanAsuransi;
import com.beCMS.BackendCentralParam.view.vwSkemaList;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@DynamicUpdate
public interface PerluasanAsuransiRepository extends JpaRepository<PerluasanAsuransi, Integer> {

    @Query(
        "SELECT new com.beCMS.BackendCentralParam.view.vwDataPerluasanAsuransi"
        + "(a.id,a.namaSkema"
        + ",a.jenisKendaraan,CASE WHEN a.jenisKendaraan = 0 THEN 'All' ELSE jk.jenisKendaraan END "
        + ",a.wilayah,CASE WHEN a.wilayah = 0 THEN 'All' ELSE w.namaWilayah END"
        + ",a.tipeAsuransi,CASE WHEN a.tipeAsuransi = 0 THEN 'All' ELSE ta.namaAsuransi END"
        + ",a.jenisPerluasan,jp.nama"
        + ",a.startOtr,a.endOtr,a.startYear,a.endYear"
        + ",a.tenor1,a.tenor2,a.tenor3,a.tenor4,a.tenor5,a.tenor6,a.tenor7,a.tenor8,a.tenor9,a.tenor10"
        + ",a.startBerlaku,a.endBerlaku,a.statusApproval,a.remarks,a.isRejected,a.isApproved)"
        + "FROM PerluasanAsuransi a "
        + "LEFT JOIN Wilayah w on a.wilayah = w.id " 
        + "LEFT JOIN JenisKendaraan jk on a.jenisKendaraan = jk.id " 
        + "LEFT JOIN JenisPerluasan jp on a.jenisPerluasan = jp.id " 
        + "LEFT JOIN TipeAsuransi ta ON a.tipeAsuransi = ta.id "
        )
    List<vwDataPerluasanAsuransi> getListDataPerluasanAsuransi();

    @Query("SELECT new com.beCMS.BackendCentralParam.view.vwSkemaList(id,namaSkema) from PerluasanAsuransi")
    List<vwSkemaList> getListDataSkemaPerluasanAsuransi();

}