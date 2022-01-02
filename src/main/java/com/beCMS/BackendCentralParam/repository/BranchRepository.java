package com.beCMS.BackendCentralParam.repository;


import com.beCMS.BackendCentralParam.model.Branch;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.repository.JpaRepository;

@DynamicUpdate
public interface BranchRepository extends JpaRepository<Branch, String> {

}