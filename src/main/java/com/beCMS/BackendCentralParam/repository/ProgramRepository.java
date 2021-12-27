package com.beCMS.BackendCentralParam.repository;

import java.util.List;
import com.beCMS.BackendCentralParam.model.Program;
import com.beCMS.BackendCentralParam.view.vwDataProgram;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@DynamicUpdate
public interface ProgramRepository extends JpaRepository<Program, Integer> {

    @Query(
        "SELECT new com.beCMS.BackendCentralParam.view.vwDataProgram"
        + "(a.id,a.program"
        + ",a.produk,p.produk"
        + ",a.branch,b.name"
        + ",a.rateAsuransi,rt.namaSkema"
        + ",a.ratePerluasan,pa.namaSkema"
        + ",a.rateCp,rc.namaSkema"
        + ",a.rateBunga,rb.namaSkema"
        + ",a.biayaAdmin,ba.namaSkema"
        + ",a.biayaProvisi,bp.namaSkema"
        + ",a.minimalDp,md.namaSkema"
        + ",a.biayaFidusia,bf.namaSkema"
        + ",a.komponenPh,kp.namaSkema"
        + ",a.usiaKendaraanLunas,ukl.namaSkema"
        + ",a.startBerlaku,a.endBerlaku,a.statusApproval,a.remarks,a.isRejected,a.isApproved)"
        + "FROM Program a "
        + "LEFT JOIN Branch b on a.branch = b.id " 
        + "LEFT JOIN Produk p on a.produk = p.id " 
        + "LEFT JOIN RateAsuransi rt on a.rateAsuransi = rt.id " 
        + "LEFT JOIN PerluasanAsuransi pa on a.ratePerluasan = pa.id " 
        + "LEFT JOIN RateCP rc on a.rateCp = rc.id " 
        + "LEFT JOIN RateBunga rb on a.rateBunga = rb.id " 
        + "LEFT JOIN BiayaAdmin ba on a.biayaAdmin = ba.id " 
        + "LEFT JOIN BiayaProvisi bp on a.biayaProvisi = bp.id " 
        + "LEFT JOIN MinimalDP md on a.minimalDp = md.id " 
        + "LEFT JOIN BiayaFidusia bf on a.biayaFidusia = bf.id " 
        + "LEFT JOIN KomponenPH kp on a.komponenPh = kp.id " 
        + "LEFT JOIN UsiaKendaraanLunas ukl on a.usiaKendaraanLunas = ukl.id " 
        )
    List<vwDataProgram> getListDataProgram();

}