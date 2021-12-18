package com.beCMS.BackendCentralParam.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "sp_usiakendaraanlunas")
public class UsiaKendaraanLunas implements Serializable {
  
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "nama_skema")
    private String namaSkema; 

    @Column(name = "maksimal_usia_kendaraan")
    private String maksimalUsiaKendaraan;

    @Column(name = "is_approved")
    private Integer isApproved;

    @Column(name = "is_rejected")
    private Integer isRejected;

    @Column(name = "remarks")
    private String remarks;

    @Column(name = "createddate")
    private Date createdDate;

    @Column(name = "createdby")
    private Long createdBy;

    @Column(name = "updateddate")
    private Date updatedDate;

    @Column(name = "updatedby")
    private Long updatedBy;

    @Column(name = "statusapproval")
    private Integer statusApproval;


    public UsiaKendaraanLunas() {
    }

    public UsiaKendaraanLunas id(Integer id) {
        setId(id);
        return this;
    }

    public UsiaKendaraanLunas namaSkema(String namaSkema) {
        setNamaSkema(namaSkema);
        return this;
    }

    public UsiaKendaraanLunas maksimalUsiaKendaraan(String maksimalUsiaKendaraan) {
        setMaksimalUsiaKendaraan(maksimalUsiaKendaraan);
        return this;
    }

    public UsiaKendaraanLunas isApproved(Integer isApproved) {
        setIsApproved(isApproved);
        return this;
    }

    public UsiaKendaraanLunas isRejected(Integer isRejected) {
        setIsRejected(isRejected);
        return this;
    }

    public UsiaKendaraanLunas remarks(String remarks) {
        setRemarks(remarks);
        return this;
    }

    public UsiaKendaraanLunas createdDate(Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    public UsiaKendaraanLunas createdBy(Long createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    public UsiaKendaraanLunas updatedDate(Date updatedDate) {
        setUpdatedDate(updatedDate);
        return this;
    }

    public UsiaKendaraanLunas updatedBy(Long updatedBy) {
        setUpdatedBy(updatedBy);
        return this;
    }

    public UsiaKendaraanLunas statusApproval(Integer statusApproval) {
        setStatusApproval(statusApproval);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", namaSkema='" + getNamaSkema() + "'" +
            ", maksimalUsiaKendaraan='" + getMaksimalUsiaKendaraan() + "'" +
            ", isApproved='" + getIsApproved() + "'" +
            ", isRejected='" + getIsRejected() + "'" +
            ", remarks='" + getRemarks() + "'" +
            ", createdDate='" + getCreatedDate() + "'" +
            ", createdBy='" + getCreatedBy() + "'" +
            ", updatedDate='" + getUpdatedDate() + "'" +
            ", updatedBy='" + getUpdatedBy() + "'" +
            ", statusApproval='" + getStatusApproval() + "'" +
            "}";
    }
    

    public UsiaKendaraanLunas(Integer id, String namaSkema, String maksimalUsiaKendaraan, Integer isApproved,
            Integer isRejected, String remarks, Date createdDate, Long createdBy, Date updatedDate, Long updatedBy,
            Integer statusApproval) {
        this.id = id;
        this.namaSkema = namaSkema;
        this.maksimalUsiaKendaraan = maksimalUsiaKendaraan;
        this.isApproved = isApproved;
        this.isRejected = isRejected;
        this.remarks = remarks;
        this.createdDate = createdDate;
        this.createdBy = createdBy;
        this.updatedDate = updatedDate;
        this.updatedBy = updatedBy;
        this.statusApproval = statusApproval;
    }

    public Integer getId() {
        return id;
    }



    public void setId(Integer id) {
        this.id = id;
    }



    public String getNamaSkema() {
        return namaSkema;
    }



    public void setNamaSkema(String namaSkema) {
        this.namaSkema = namaSkema;
    }



    public String getMaksimalUsiaKendaraan() {
        return maksimalUsiaKendaraan;
    }



    public void setMaksimalUsiaKendaraan(String maksimalUsiaKendaraan) {
        this.maksimalUsiaKendaraan = maksimalUsiaKendaraan;
    }



    public Integer getIsApproved() {
        return isApproved;
    }



    public void setIsApproved(Integer isApproved) {
        this.isApproved = isApproved;
    }



    public Integer getIsRejected() {
        return isRejected;
    }



    public void setIsRejected(Integer isRejected) {
        this.isRejected = isRejected;
    }



    public String getRemarks() {
        return remarks;
    }



    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }



    public Date getCreatedDate() {
        return createdDate;
    }



    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }



    public Long getCreatedBy() {
        return createdBy;
    }



    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }



    public Date getUpdatedDate() {
        return updatedDate;
    }



    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }



    public Long getUpdatedBy() {
        return updatedBy;
    }



    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }



    public Integer getStatusApproval() {
        return statusApproval;
    }



    public void setStatusApproval(Integer statusApproval) {
        this.statusApproval = statusApproval;
    }



    public void submit(Long user) {
        if(this.statusApproval == null || this.statusApproval == 0){
            setIsApproved(0);
            setIsRejected(0);
            setStatusApproval(1);
            
            trace(user);
        }
    }

    public void approve(Long user) {
        if(this.statusApproval != null && this.statusApproval == 1) {
            setIsApproved(1);
            setIsRejected(0);
            setStatusApproval(2);

            trace(user);
        }
    }

    public void decline(Long user) {
        if(this.statusApproval != null && this.statusApproval == 1) {
            setIsApproved(0);
            setIsRejected(1);
            setStatusApproval(2);

            trace(user);
        }
    }

    public void trace(Long user) {
        if(this.createdDate == null) {
            setCreatedBy(user);
            setCreatedDate(new Date());
        } else {
            setUpdatedBy(user);
            setUpdatedDate(new Date());
        }
    }
}