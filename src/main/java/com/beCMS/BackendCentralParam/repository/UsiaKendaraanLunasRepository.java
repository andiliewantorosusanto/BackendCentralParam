package com.beCMS.BackendCentralParam.repository;

import java.util.List;

import com.beCMS.BackendCentralParam.model.UsiaKendaraanLunas;
import com.beCMS.BackendCentralParam.view.vwSkemaList;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@DynamicUpdate
public interface UsiaKendaraanLunasRepository extends JpaRepository<UsiaKendaraanLunas, Integer> {
    @Query("SELECT new com.beCMS.BackendCentralParam.view.vwSkemaList(id,namaSkema) from UsiaKendaraanLunas")
    List<vwSkemaList> getListDataSkemaUsiaKendaraanLunas();
}