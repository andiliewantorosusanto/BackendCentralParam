package com.beCMS.BackendCentralParam.repository;

import java.util.List;

import com.beCMS.BackendCentralParam.model.RateCP;
import com.beCMS.BackendCentralParam.view.vwDataRateCP;
import com.beCMS.BackendCentralParam.view.vwSkemaList;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@DynamicUpdate
public interface RateCPRepository extends JpaRepository<RateCP, Integer> {

    @Query(
        "SELECT new com.beCMS.BackendCentralParam.view.vwDataRateCP"
        + "(a.id,a.namaSkema"
        + ",a.tipeKonsumen,CASE WHEN a.tipeKonsumen = 0 THEN 'All' ELSE tk.nama END"
        + ",a.tenor1,a.tenor2,a.tenor3,a.tenor4,a.tenor5,a.tenor6,a.tenor7,a.tenor8,a.tenor9,a.tenor10"
        + ",a.startBerlaku,a.endBerlaku,a.statusApproval,a.remarks,a.isRejected,a.isApproved)"
        + "FROM RateCP a "
        + "LEFT JOIN TipeKonsumen tk on a.tipeKonsumen = tk.id "
        )
    List<vwDataRateCP> getListDataRateCP();

    @Query("SELECT new com.beCMS.BackendCentralParam.view.vwSkemaList(id,namaSkema) from RateCP")
    List<vwSkemaList> getListDataSkemaRateCP();
}