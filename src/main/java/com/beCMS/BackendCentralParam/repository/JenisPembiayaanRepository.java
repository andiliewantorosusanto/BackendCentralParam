package com.beCMS.BackendCentralParam.repository;


import com.beCMS.BackendCentralParam.model.JenisPembiayaan;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.repository.JpaRepository;

@DynamicUpdate
public interface JenisPembiayaanRepository extends JpaRepository<JenisPembiayaan, Integer> {
}