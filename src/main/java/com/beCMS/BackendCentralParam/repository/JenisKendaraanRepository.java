package com.beCMS.BackendCentralParam.repository;

import com.beCMS.BackendCentralParam.model.JenisKendaraan;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.repository.JpaRepository;

@DynamicUpdate
public interface JenisKendaraanRepository extends JpaRepository<JenisKendaraan, Integer> {
}