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
@Table(name="sp_tipeasuransi")
public class TipeAsuransi implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "namaasuransi")
    private String namaAsuransi;

    @Column(name = "startberlaku")
    private Date startBerlaku;

    @Column(name = "endberlaku")
    private Date endBerlaku;

    @Column(name = "created_at")
    private Date createdDate;

    @Column(name = "deskripsi")
    private String deskripsi;

    @Column(name = "is_approved")
    private Integer isApproved;

    @Column(name = "is_rejected")
    private Integer isRejected;

    @Column(name = "remarks")
    private String remarks;

    @Column(name = "createdby")
    private Long createdBy;

    @Column(name = "updatedby")
    private Long updatedBy;

    @Column(name = "updateddate")
    private Date updatedDate;
    
    @Column(name = "statusapproval")
    private Integer statusApproval;
    
    public TipeAsuransi(Integer id, String namaAsuransi, Date startBerlaku, Date endBerlaku, Date createdDate,
            String deskripsi, Integer isApproved, Integer isRejected, String remarks, Long createdBy, Long updatedBy,
            Date updatedDate, Integer statusApproval) {
        this.id = id;
        this.namaAsuransi = namaAsuransi;
        this.startBerlaku = startBerlaku;
        this.endBerlaku = endBerlaku;
        this.createdDate = createdDate;
        this.deskripsi = deskripsi;
        this.isApproved = isApproved;
        this.isRejected = isRejected;
        this.remarks = remarks;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.updatedDate = updatedDate;
        this.statusApproval = statusApproval;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNamaAsuransi() {
        return namaAsuransi;
    }

    public void setNamaAsuransi(String namaAsuransi) {
        this.namaAsuransi = namaAsuransi;
    }

    public Date getStartBerlaku() {
        return startBerlaku;
    }

    public void setStartBerlaku(Date startBerlaku) {
        this.startBerlaku = startBerlaku;
    }

    public Date getEndBerlaku() {
        return endBerlaku;
    }

    public void setEndBerlaku(Date endBerlaku) {
        this.endBerlaku = endBerlaku;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
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

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Long getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public Integer getStatusApproval() {
        return statusApproval;
    }

    public void setStatusApproval(Integer statusApproval) {
        this.statusApproval = statusApproval;
    }

    public TipeAsuransi() {
    }

    public TipeAsuransi id(Integer id) {
        setId(id);
        return this;
    }

    public TipeAsuransi namaAsuransi(String namaAsuransi) {
        setNamaAsuransi(namaAsuransi);
        return this;
    }

    public TipeAsuransi startBerlaku(Date startBerlaku) {
        setStartBerlaku(startBerlaku);
        return this;
    }

    public TipeAsuransi endBerlaku(Date endBerlaku) {
        setEndBerlaku(endBerlaku);
        return this;
    }

    public TipeAsuransi createdDate(Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    public TipeAsuransi deskripsi(String deskripsi) {
        setDeskripsi(deskripsi);
        return this;
    }

    public TipeAsuransi isApproved(Integer isApproved) {
        setIsApproved(isApproved);
        return this;
    }

    public TipeAsuransi isRejected(Integer isRejected) {
        setIsRejected(isRejected);
        return this;
    }

    public TipeAsuransi remarks(String remarks) {
        setRemarks(remarks);
        return this;
    }

    public TipeAsuransi createdBy(Long createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    public TipeAsuransi updatedBy(Long updatedBy) {
        setUpdatedBy(updatedBy);
        return this;
    }

    public TipeAsuransi updatedDate(Date updatedDate) {
        setUpdatedDate(updatedDate);
        return this;
    }

    public TipeAsuransi statusApproval(Integer statusApproval) {
        setStatusApproval(statusApproval);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", namaAsuransi='" + getNamaAsuransi() + "'" +
            ", startBerlaku='" + getStartBerlaku() + "'" +
            ", endBerlaku='" + getEndBerlaku() + "'" +
            ", createdDate='" + getCreatedDate() + "'" +
            ", deskripsi='" + getDeskripsi() + "'" +
            ", isApproved='" + getIsApproved() + "'" +
            ", isRejected='" + getIsRejected() + "'" +
            ", remarks='" + getRemarks() + "'" +
            ", createdBy='" + getCreatedBy() + "'" +
            ", updatedBy='" + getUpdatedBy() + "'" +
            ", updatedDate='" + getUpdatedDate() + "'" +
            ", statusApproval='" + getStatusApproval() + "'" +
            "}";
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
