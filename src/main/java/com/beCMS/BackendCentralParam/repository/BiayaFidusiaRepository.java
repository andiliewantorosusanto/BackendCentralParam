package com.beCMS.BackendCentralParam.repository;

import com.beCMS.BackendCentralParam.model.BiayaFidusia;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.repository.JpaRepository;

@DynamicUpdate
public interface BiayaFidusiaRepository extends JpaRepository<BiayaFidusia, Integer> {

}