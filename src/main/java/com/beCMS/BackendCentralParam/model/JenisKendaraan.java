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
@Table(name="sp_jeniskendaraan")
public class JenisKendaraan implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "jenis_kendaraan")
    private String jenis_kendaraan;
    
    @Column(name = "deskripsi")
    private String deskripsi;

    @Column(name = "startberlaku")
    private Date startBerlaku;

    @Column(name = "endberlaku")
    private Date endBerlaku;

    @Column(name = "created_at")
    private Date created_at;

    @Column(name = "status")
    private String status;

    @Column(name = "remarks")
    private String remarks;

    @Column(name = "is_rejected")
    private Integer is_rejected;

    @Column(name = "is_approved")
    private Integer is_approved;

    @Column(name = "createdby")
    private Long createdby;

    @Column(name = "updatedby")
    private Long updatedby;

    @Column(name = "updateddate")
    private Date updateddate;

    @Column(name = "statusapproval")
    private Integer statusApproval;


    public JenisKendaraan() {
    }

    public JenisKendaraan(Integer id, String jenis_kendaraan, String deskripsi, Date startBerlaku, Date endBerlaku, Date created_at, String status, String remarks, Integer is_rejected, Integer is_approved, Long createdby, Long updatedby, Date updateddate, Integer statusApproval) {
        this.id = id;
        this.jenis_kendaraan = jenis_kendaraan;
        this.deskripsi = deskripsi;
        this.startBerlaku = startBerlaku;
        this.endBerlaku = endBerlaku;
        this.created_at = created_at;
        this.status = status;
        this.remarks = remarks;
        this.is_rejected = is_rejected;
        this.is_approved = is_approved;
        this.createdby = createdby;
        this.updatedby = updatedby;
        this.updateddate = updateddate;
        this.statusApproval = statusApproval;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJenis_kendaraan() {
        return this.jenis_kendaraan;
    }

    public void setJenis_kendaraan(String jenis_kendaraan) {
        this.jenis_kendaraan = jenis_kendaraan;
    }

    public String getDeskripsi() {
        return this.deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public Date getStartBerlaku() {
        return this.startBerlaku;
    }

    public void setStartBerlaku(Date startBerlaku) {
        this.startBerlaku = startBerlaku;
    }

    public Date getEndBerlaku() {
        return this.endBerlaku;
    }

    public void setEndBerlaku(Date endBerlaku) {
        this.endBerlaku = endBerlaku;
    }

    public Date getCreated_at() {
        return this.created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getIs_rejected() {
        return this.is_rejected;
    }

    public void setIs_rejected(Integer is_rejected) {
        this.is_rejected = is_rejected;
    }

    public Integer getIs_approved() {
        return this.is_approved;
    }

    public void setIs_approved(Integer is_approved) {
        this.is_approved = is_approved;
    }

    public Long getCreatedby() {
        return this.createdby;
    }

    public void setCreatedby(Long createdby) {
        this.createdby = createdby;
    }

    public Long getUpdatedby() {
        return this.updatedby;
    }

    public void setUpdatedby(Long updatedby) {
        this.updatedby = updatedby;
    }

    public Date getUpdateddate() {
        return this.updateddate;
    }

    public void setUpdateddate(Date updateddate) {
        this.updateddate = updateddate;
    }

    public Integer getStatusApproval() {
        return this.statusApproval;
    }

    public void setStatusApproval(Integer statusApproval) {
        this.statusApproval = statusApproval;
    }

    public JenisKendaraan id(Integer id) {
        setId(id);
        return this;
    }

    public JenisKendaraan jenis_kendaraan(String jenis_kendaraan) {
        setJenis_kendaraan(jenis_kendaraan);
        return this;
    }

    public JenisKendaraan deskripsi(String deskripsi) {
        setDeskripsi(deskripsi);
        return this;
    }

    public JenisKendaraan startBerlaku(Date startBerlaku) {
        setStartBerlaku(startBerlaku);
        return this;
    }

    public JenisKendaraan endBerlaku(Date endBerlaku) {
        setEndBerlaku(endBerlaku);
        return this;
    }

    public JenisKendaraan created_at(Date created_at) {
        setCreated_at(created_at);
        return this;
    }

    public JenisKendaraan status(String status) {
        setStatus(status);
        return this;
    }

    public JenisKendaraan remarks(String remarks) {
        setRemarks(remarks);
        return this;
    }

    public JenisKendaraan is_rejected(Integer is_rejected) {
        setIs_rejected(is_rejected);
        return this;
    }

    public JenisKendaraan is_approved(Integer is_approved) {
        setIs_approved(is_approved);
        return this;
    }

    public JenisKendaraan createdby(Long createdby) {
        setCreatedby(createdby);
        return this;
    }

    public JenisKendaraan updatedby(Long updatedby) {
        setUpdatedby(updatedby);
        return this;
    }

    public JenisKendaraan updateddate(Date updateddate) {
        setUpdateddate(updateddate);
        return this;
    }

    public JenisKendaraan statusApproval(Integer statusApproval) {
        setStatusApproval(statusApproval);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", jenis_kendaraan='" + getJenis_kendaraan() + "'" +
            ", deskripsi='" + getDeskripsi() + "'" +
            ", startBerlaku='" + getStartBerlaku() + "'" +
            ", endBerlaku='" + getEndBerlaku() + "'" +
            ", created_at='" + getCreated_at() + "'" +
            ", status='" + getStatus() + "'" +
            ", remarks='" + getRemarks() + "'" +
            ", is_rejected='" + getIs_rejected() + "'" +
            ", is_approved='" + getIs_approved() + "'" +
            ", createdby='" + getCreatedby() + "'" +
            ", updatedby='" + getUpdatedby() + "'" +
            ", updateddate='" + getUpdateddate() + "'" +
            ", statusApproval='" + getStatusApproval() + "'" +
            "}";
    }

    public JenisKendaraan submit(Long user) {
        if(this.statusApproval == null || this.statusApproval == 0){
            setIs_approved(0);
            setIs_rejected(0);
            setStatusApproval(1);
            
            trace(user);
        }
        return this;
    }

    public JenisKendaraan approve(Long user) {
        if(this.statusApproval != null && this.statusApproval == 1) {
            setIs_approved(1);
            setIs_rejected(0);
            setStatusApproval(2);

            trace(user);
        }

        return this;
    }

    public JenisKendaraan decline(Long user) {
        if(this.statusApproval != null && this.statusApproval == 1) {
            setIs_approved(0);
            setIs_rejected(1);
            setStatusApproval(2);

            trace(user);
        }

        return this;
    }

    public JenisKendaraan trace(Long user) {
        if(this.created_at == null) {
            setCreatedby(user);
            setCreated_at(new Date());
        } else {
            setUpdatedby(user);
            setUpdateddate(new Date());
        }
        return this;
    }
}
