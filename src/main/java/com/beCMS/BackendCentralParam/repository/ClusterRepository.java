package com.beCMS.BackendCentralParam.repository;

import com.beCMS.BackendCentralParam.model.Cluster;


import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.repository.JpaRepository;

@DynamicUpdate
public interface ClusterRepository extends JpaRepository<Cluster, Integer> {

}