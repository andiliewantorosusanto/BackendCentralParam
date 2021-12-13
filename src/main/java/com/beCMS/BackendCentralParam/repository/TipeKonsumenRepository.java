package com.beCMS.BackendCentralParam.repository;

import com.beCMS.BackendCentralParam.model.TipeKonsumen;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.repository.JpaRepository;

@DynamicUpdate
public interface TipeKonsumenRepository extends JpaRepository<TipeKonsumen, Integer> {
}