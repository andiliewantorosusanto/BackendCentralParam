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
@Table(name="sp_masterkompph")
public class LoanType implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "id_komp")
    private Integer id_komp;
    
    @Column(name = "deskripsi")
    private String deskripsi;

    @Column(name = "created_at")
    private Date created_at;

    @Column(name = "createdby")
    private Long createdby;

    @Column(name = "updatedby")
    private Long updatedby;

    @Column(name = "updateddate")
    private Date updateddate;

    @Column(name = "is_rejected")
    private Integer is_rejected;

    @Column(name = "is_approved")
    private Integer is_approved;

    @Column(name = "statusapproval")
    private Integer statusApproval;


    public LoanType() {
    }

    public LoanType(Integer id, Integer id_komp, String deskripsi, Date created_at, Long createdby, Long updatedby, Date updateddate, Integer is_rejected, Integer is_approved, Integer statusApproval) {
        this.id = id;
        this.id_komp = id_komp;
        this.deskripsi = deskripsi;
        this.created_at = created_at;
        this.createdby = createdby;
        this.updatedby = updatedby;
        this.updateddate = updateddate;
        this.is_rejected = is_rejected;
        this.is_approved = is_approved;
        this.statusApproval = statusApproval;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId_komp() {
        return this.id_komp;
    }

    public void setId_komp(Integer id_komp) {
        this.id_komp = id_komp;
    }

    public String getDeskripsi() {
        return this.deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public Date getCreated_at() {
        return this.created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
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

    public Integer getStatusApproval() {
        return this.statusApproval;
    }

    public void setStatusApproval(Integer statusApproval) {
        this.statusApproval = statusApproval;
    }

    public LoanType id(Integer id) {
        setId(id);
        return this;
    }

    public LoanType id_komp(Integer id_komp) {
        setId_komp(id_komp);
        return this;
    }

    public LoanType deskripsi(String deskripsi) {
        setDeskripsi(deskripsi);
        return this;
    }

    public LoanType created_at(Date created_at) {
        setCreated_at(created_at);
        return this;
    }

    public LoanType createdby(Long createdby) {
        setCreatedby(createdby);
        return this;
    }

    public LoanType updatedby(Long updatedby) {
        setUpdatedby(updatedby);
        return this;
    }

    public LoanType updateddate(Date updateddate) {
        setUpdateddate(updateddate);
        return this;
    }

    public LoanType is_rejected(Integer is_rejected) {
        setIs_rejected(is_rejected);
        return this;
    }

    public LoanType is_approved(Integer is_approved) {
        setIs_approved(is_approved);
        return this;
    }

    public LoanType statusApproval(Integer statusApproval) {
        setStatusApproval(statusApproval);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", id_komp='" + getId_komp() + "'" +
            ", deskripsi='" + getDeskripsi() + "'" +
            ", created_at='" + getCreated_at() + "'" +
            ", createdby='" + getCreatedby() + "'" +
            ", updatedby='" + getUpdatedby() + "'" +
            ", updateddate='" + getUpdateddate() + "'" +
            ", is_rejected='" + getIs_rejected() + "'" +
            ", is_approved='" + getIs_approved() + "'" +
            ", statusApproval='" + getStatusApproval() + "'" +
            "}";
    }

    
    public LoanType submit(Long user) {
        if(this.statusApproval == null || this.statusApproval == 0){
            setIs_approved(0);
            setIs_rejected(0);
            setStatusApproval(1);
            
            trace(user);
        }
        return this;
    }

    public LoanType approve(Long user) {
        if(this.statusApproval != null && this.statusApproval == 1) {
            setIs_approved(1);
            setIs_rejected(0);
            setStatusApproval(2);

            trace(user);
        }

        return this;
    }

    public LoanType decline(Long user) {
        if(this.statusApproval != null && this.statusApproval == 1) {
            setIs_approved(0);
            setIs_rejected(1);
            setStatusApproval(2);

            trace(user);
        }

        return this;
    }

    public LoanType trace(Long user) {
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
