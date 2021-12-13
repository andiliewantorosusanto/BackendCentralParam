package com.beCMS.BackendCentralParam.repository;

import com.beCMS.BackendCentralParam.model.Wilayah;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.repository.JpaRepository;

@DynamicUpdate
public interface WilayahRepository extends JpaRepository<Wilayah, Integer> {

}