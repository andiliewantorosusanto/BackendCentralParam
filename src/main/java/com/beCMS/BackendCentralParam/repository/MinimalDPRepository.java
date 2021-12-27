package com.beCMS.BackendCentralParam.repository;

import java.util.List;

import com.beCMS.BackendCentralParam.model.MinimalDP;
import com.beCMS.BackendCentralParam.view.vwDataMinimalDP;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@DynamicUpdate
public interface MinimalDPRepository extends JpaRepository<MinimalDP, Integer> {

    @Query(
        "SELECT new com.beCMS.BackendCentralParam.view.vwDataMinimalDP"
        + "(a.id,a.namaSkema"
        + ",a.loanType,CASE WHEN a.loanType = 0 THEN 'All' WHEN a.loanType = 1 THEN 'ADDM' ELSE 'ADDB' END"
        + ",a.produk,p.produk"
        + ",a.tujuanPenggunaan,CASE WHEN a.tujuanPenggunaan = 0 THEN 'All' ELSE tp.nama END"
        + ",a.tipeKonsumen,CASE WHEN a.tipeKonsumen = 0 THEN 'All' ELSE tk.nama END"
        + ",a.jenisKendaraan,CASE WHEN a.jenisKendaraan = 0 THEN 'All' ELSE jk.jenisKendaraan END "
        + ",a.jenisPembiayaan,jp.jenisPembiayaan"
        + ",a.cluster,c.cluster"    
        + ",a.minimalDp"
        + ",a.statusApproval,a.remarks,a.isRejected,a.isApproved)"
        + "FROM MinimalDP a "
        + "left join JenisKendaraan jk on a.jenisKendaraan = jk.id " 
        + "left join TujuanPenggunaan tp on a.tujuanPenggunaan = tp.id " 
        + "left join JenisPembiayaan jp on a.jenisPembiayaan = jp.id " 
        + "LEFT JOIN TipeKonsumen tk ON a.tipeKonsumen = tk.id " 
        + "LEFT JOIN Cluster c ON a.cluster = c.id "
        + "LEFT JOIN Produk p ON a.produk = p.id"
        )
    List<vwDataMinimalDP> getListDataMinimalDP();

}