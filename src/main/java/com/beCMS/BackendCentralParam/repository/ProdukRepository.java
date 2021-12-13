package com.beCMS.BackendCentralParam.repository;

import com.beCMS.BackendCentralParam.model.Produk;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.repository.JpaRepository;

@DynamicUpdate
public interface ProdukRepository extends JpaRepository<Produk, Integer> {


}