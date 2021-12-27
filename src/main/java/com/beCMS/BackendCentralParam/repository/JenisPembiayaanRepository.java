package com.beCMS.BackendCentralParam.repository;


import java.util.List;

import com.beCMS.BackendCentralParam.model.JenisPembiayaan;
import com.beCMS.BackendCentralParam.view.vwDataJenisPembiayaan;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@DynamicUpdate
public interface JenisPembiayaanRepository extends JpaRepository<JenisPembiayaan, Integer> {
    @Query(
        "SELECT new com.beCMS.BackendCentralParam.view.vwDataJenisPembiayaan"
        + "(a.id,a.jenisPembiayaan,a.isRefinancing"
        + ",a.produk,p.produk"
        + ",a.startBerlaku,a.endBerlaku,a.statusApproval,a.remarks,a.isRejected,a.isApproved)"
        + "FROM JenisPembiayaan a "
        + "left join Produk p on a.produk = p.id" 
        )
    List<vwDataJenisPembiayaan> getListDataJenisPembiayaan();
}