package com.beCMS.BackendCentralParam.repository;

import java.util.List;

import com.beCMS.BackendCentralParam.model.TipeKonsumen;
import com.beCMS.BackendCentralParam.view.vwDataTipeKonsumen;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@DynamicUpdate
public interface TipeKonsumenRepository extends JpaRepository<TipeKonsumen, Integer> {

    @Query(
        "SELECT new com.beCMS.BackendCentralParam.view.vwDataTipeKonsumen"
        + "(a.id,a.nama,a.deskripsi"
        + ",a.produk,p.produk"
        + ",a.startBerlaku,a.endBerlaku,a.statusApproval,a.remarks,a.isRejected,a.isApproved)"
        + "FROM TipeKonsumen a "
        + "left join Produk p on a.produk = p.id" 
        )
    List<vwDataTipeKonsumen> getListDataTipeKonsumen();
    
}