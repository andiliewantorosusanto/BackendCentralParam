package com.beCMS.BackendCentralParam.repository;

import java.util.List;

import com.beCMS.BackendCentralParam.model.JenisPerluasan;
import com.beCMS.BackendCentralParam.view.vwDataJenisPerluasan;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@DynamicUpdate
public interface JenisPerluasanRepository extends JpaRepository<JenisPerluasan, Integer> {
    @Query(
        "SELECT new com.beCMS.BackendCentralParam.view.vwDataJenisPerluasan"
        + "(a.id,a.nama,a.deskripsi"
        + ",a.produk,p.produk"
        + ",a.startBerlaku,a.endBerlaku,a.statusApproval,a.remarks,a.isRejected,a.isApproved)"
        + "FROM JenisPerluasan a "
        + "left join Produk p on a.produk = p.id" 
        )
    List<vwDataJenisPerluasan> getListDataJenisPerluasan();
}