package com.beCMS.BackendCentralParam.repository;

import com.beCMS.BackendCentralParam.model.UsiaKendaraanLunas;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.repository.JpaRepository;

@DynamicUpdate
public interface UsiaKendaraanLunasRepository extends JpaRepository<UsiaKendaraanLunas, Integer> {

}