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
    private Integer is_approved;

    @Column(name = "is_rejected")
    private Integer is_rejected;

    @Column(name = "remarks")
    private String remarks;

    @Column(name = "createddate")
    private Date createddate;

    @Column(name = "createdby")
    private Long createdby;

    @Column(name = "updateddate")
    private Date updateddate;

    @Column(name = "updatedby")
    private Long updatedby;


    public UsiaKendaraanLunas() {
    }

    public UsiaKendaraanLunas(Integer id, String namaSkema, String maksimalUsiaKendaraan, Integer is_approved, Integer is_rejected, String remarks, Date createddate, Long createdby, Date updateddate, Long updatedby) {
        this.id = id;
        this.namaSkema = namaSkema;
        this.maksimalUsiaKendaraan = maksimalUsiaKendaraan;
        this.is_approved = is_approved;
        this.is_rejected = is_rejected;
        this.remarks = remarks;
        this.createddate = createddate;
        this.createdby = createdby;
        this.updateddate = updateddate;
        this.updatedby = updatedby;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNamaSkema() {
        return this.namaSkema;
    }

    public void setNamaSkema(String namaSkema) {
        this.namaSkema = namaSkema;
    }

    public String getMaksimalUsiaKendaraan() {
        return this.maksimalUsiaKendaraan;
    }

    public void setMaksimalUsiaKendaraan(String maksimalUsiaKendaraan) {
        this.maksimalUsiaKendaraan = maksimalUsiaKendaraan;
    }

    public Integer getIs_approved() {
        return this.is_approved;
    }

    public void setIs_approved(Integer is_approved) {
        this.is_approved = is_approved;
    }

    public Integer getIs_rejected() {
        return this.is_rejected;
    }

    public void setIs_rejected(Integer is_rejected) {
        this.is_rejected = is_rejected;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Date getCreateddate() {
        return this.createddate;
    }

    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

    public Long getCreatedby() {
        return this.createdby;
    }

    public void setCreatedby(Long createdby) {
        this.createdby = createdby;
    }

    public Date getUpdateddate() {
        return this.updateddate;
    }

    public void setUpdateddate(Date updateddate) {
        this.updateddate = updateddate;
    }

    public Long getUpdatedby() {
        return this.updatedby;
    }

    public void setUpdatedby(Long updatedby) {
        this.updatedby = updatedby;
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

    public UsiaKendaraanLunas is_approved(Integer is_approved) {
        setIs_approved(is_approved);
        return this;
    }

    public UsiaKendaraanLunas is_rejected(Integer is_rejected) {
        setIs_rejected(is_rejected);
        return this;
    }

    public UsiaKendaraanLunas remarks(String remarks) {
        setRemarks(remarks);
        return this;
    }

    public UsiaKendaraanLunas createddate(Date createddate) {
        setCreateddate(createddate);
        return this;
    }

    public UsiaKendaraanLunas createdby(Long createdby) {
        setCreatedby(createdby);
        return this;
    }

    public UsiaKendaraanLunas updateddate(Date updateddate) {
        setUpdateddate(updateddate);
        return this;
    }

    public UsiaKendaraanLunas updatedby(Long updatedby) {
        setUpdatedby(updatedby);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", namaSkema='" + getNamaSkema() + "'" +
            ", maksimalUsiaKendaraan='" + getMaksimalUsiaKendaraan() + "'" +
            ", is_approved='" + getIs_approved() + "'" +
            ", is_rejected='" + getIs_rejected() + "'" +
            ", remarks='" + getRemarks() + "'" +
            ", createddate='" + getCreateddate() + "'" +
            ", createdby='" + getCreatedby() + "'" +
            ", updateddate='" + getUpdateddate() + "'" +
            ", updatedby='" + getUpdatedby() + "'" +
            "}";
    }

    public UsiaKendaraanLunas submit(Long user) {
        if(this.is_approved == null && this.is_rejected == null){
            setIs_approved(0);
            setIs_rejected(0);
    
            trace(user);
        }
        return this;
    }

    public UsiaKendaraanLunas approve(Long user) {
        if(this.is_approved != null && this.is_rejected != null && this.is_approved == 0 && this.is_rejected == 0) {
            setIs_approved(1);
            trace(user);
        }

        return this;
    }

    public UsiaKendaraanLunas decline(Long user) {
        if(this.is_approved != null && this.is_rejected != null && this.is_approved == 0 && this.is_rejected == 0) {
            setIs_rejected(1);
            trace(user);
        }

        return this;
    }

    public UsiaKendaraanLunas trace(Long user) {
        if(this.createddate == null) {
            setCreatedby(user);
            setCreateddate(new Date());
        } else {
            setUpdatedby(user);
            setUpdateddate(new Date());
        }
        return this;
    }
}