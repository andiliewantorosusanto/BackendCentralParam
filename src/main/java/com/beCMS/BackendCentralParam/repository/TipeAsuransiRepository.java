package com.beCMS.BackendCentralParam.repository;

import com.beCMS.BackendCentralParam.model.TipeAsuransi;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.repository.JpaRepository;

@DynamicUpdate
public interface TipeAsuransiRepository extends JpaRepository<TipeAsuransi, Integer> {
}