package com.beCMS.BackendCentralParam.repository;

import com.beCMS.BackendCentralParam.model.TujuanPenggunaan;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.repository.JpaRepository;

@DynamicUpdate
public interface TujuanPenggunaanRepository extends JpaRepository<TujuanPenggunaan, Integer> {
}