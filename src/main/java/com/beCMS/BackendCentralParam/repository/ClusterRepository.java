package com.beCMS.BackendCentralParam.repository;

import java.util.List;

import com.beCMS.BackendCentralParam.model.Cluster;
import com.beCMS.BackendCentralParam.view.vwDataCluster;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@DynamicUpdate
public interface ClusterRepository extends JpaRepository<Cluster, Integer> {
    @Query(
        "SELECT new com.beCMS.BackendCentralParam.view.vwDataCluster"
        + "(a.id,a.cluster,a.deskripsi"
        + ",a.produk,p.produk"
        + ",a.startBerlaku,a.endBerlaku,a.statusApproval,a.remarks,a.isRejected,a.isApproved)"
        + "FROM Cluster a "
        + "left join Produk p on a.produk = p.id" 
        )
    List<vwDataCluster> getListDataCluster();
}