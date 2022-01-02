package com.beCMS.BackendCentralParam.repository;

import java.util.List;

import com.beCMS.BackendCentralParam.view.vwDataRateBunga;
import com.beCMS.BackendCentralParam.view.vwSkemaList;
import com.beCMS.BackendCentralParam.model.RateBunga;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@DynamicUpdate
public interface RateBungaRepository extends JpaRepository<RateBunga, Integer> {
    @Query(
        "SELECT new com.beCMS.BackendCentralParam.view.vwDataRateBunga"
        + "(a.id,a.namaSkema"
        + ",a.loanType,CASE WHEN a.loanType = 0 THEN 'All' WHEN a.loanType = 1 THEN 'ADDM' ELSE 'ADDB' END"
        + ",a.jenisKendaraan,CASE WHEN a.jenisKendaraan = 0 THEN 'All' ELSE jk.jenisKendaraan END "
        + ",a.jenisPembiayaan,jp.jenisPembiayaan"
        + ",a.cluster,c.cluster"    
        + ",a.startTahunKendaraan,a.endTahun"
        + ",a.tenor1,a.tenor2,a.tenor3,a.tenor4"
        + ",a.tenor5Periode1,a.tenor5Periode2,a.tenor5Rate1,a.tenor5Rate2"
        + ",a.tenor6Periode1,a.tenor6Periode2,a.tenor6Rate1,a.tenor6Rate2"
        + ",a.tenor7Periode1,a.tenor7Periode2,a.tenor7Rate1,a.tenor7Rate2"
        + ",a.tenor8Periode1,a.tenor8Periode2,a.tenor8Rate1,a.tenor8Rate2"
        + ",a.tenor9Periode1,a.tenor9Periode2,a.tenor9Rate1,a.tenor9Rate2"
        + ",a.tenor10Periode1,a.tenor10Periode2,a.tenor10Rate1,a.tenor10Rate2"
        + ",a.startBerlaku,a.endBerlaku,a.statusApproval,a.remarks,a.isRejected,a.isApproved)"
        + "FROM RateBunga a "
        + "left join JenisKendaraan jk on a.jenisKendaraan = jk.id " 
        + "left join JenisPembiayaan jp on a.jenisPembiayaan = jp.id " 
        + "LEFT JOIN TipeKonsumen tk ON a.tipeKonsumen = tk.id " 
        + "LEFT JOIN Cluster c ON a.cluster = c.id"
        )
    List<vwDataRateBunga> getListDataRateBunga();

    @Query("SELECT new com.beCMS.BackendCentralParam.view.vwSkemaList(id,namaSkema) from RateBunga")
    List<vwSkemaList> getListDataSkemaRateBunga();
}