package com.beCMS.BackendCentralParam.repository;

import java.util.List;

import com.beCMS.BackendCentralParam.model.PerluasanAsuransi;
import com.beCMS.BackendCentralParam.view.vwDataPerluasanAsuransi;

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

    // @Query("SELECT new com.beCMS.BackendCentralParam.view.vwDataRatePerluasanAsuransi(  a.wilayah, g.namaWilayah,a.startOTR, a.endOTR, a.startyear, a.endyear, a.tipeAsuransi,f.namaAsuransi, a.startBerlaku, a.endBerlaku, a.loan_type, a.produk, a.jenis_kendaraan,b.jenis_kendaraan_id, a.jenis_pembiayaan, d.jenis_pembiayaan_id,a.remarks ,a.statusApproved,a.namaSkema,a.jenis_perluasan,h.jenis_perluasan_id) from modelPerluasanAsuransi a left join modelJenisKendaraan b on a.jenis_kendaraan = b.id left join modelJenisPembiayaan d on a.jenis_pembiayaan = d.id left join modelLoanType e on a.loan_type = e.id_komp left join modelTipeAsuransi f on a.tipeAsuransi = f.id left join modelWilayah g on a.wilayah = g.id left join modelJenisPerluasan h on a.jenis_perluasan = h.id where a.statusApproved = 0 OR a.statusApproved IS NULL")
    // List<vwDataRatePerluasanAsuransi>getListBucketApprovalRatePerluasanAsuransi(Pageable pageable);

    // @Query("SELECT new com.beCMS.BackendCentralParam.view.vwSkemaPerluasanAsuransi(id,namaSkema) from modelPerluasanAsuransi")
    // List<vwSkemaPerluasanAsuransi> getAllDatavwSkemaPerluasanAsuransi();

}