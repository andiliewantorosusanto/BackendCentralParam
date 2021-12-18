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
@Table(name = "SP_Wilayah")
public class Wilayah implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "namawilayah")
    private String namaWilayah;

    @Column(name = "deskripsi")
    private String deskripsi;

    @Column(name = "startberlaku")
    private Date startBerlaku;

    @Column(name = "endberlaku")
    private Date endBerlaku;

    @Column(name = "created_at")
    private Date createdDate;

    @Column(name = "remarks")
    private String remarks;

    @Column(name = "is_rejected")
    private Integer isRejected;

    @Column(name = "is_approved")
    private Integer isApproved;

    @Column(name = "createdby")
    private Long createdBy;

    @Column(name = "updateddate")
    private Date updatedDate;

    @Column(name = "updatedby")
    private Long updatedBy;

    @Column(name = "statusapproval")
    private Integer statusApproval;

    public Wilayah(Integer id, String namaWilayah, String deskripsi, Date startBerlaku, Date endBerlaku,
            Date createdDate, String remarks, Integer isRejected, Integer isApproved, Long createdBy, Date updatedDate,
            Long updatedBy, Integer statusApproval) {
        this.id = id;
        this.namaWilayah = namaWilayah;
        this.deskripsi = deskripsi;
        this.startBerlaku = startBerlaku;
        this.endBerlaku = endBerlaku;
        this.createdDate = createdDate;
        this.remarks = remarks;
        this.isRejected = isRejected;
        this.isApproved = isApproved;
        this.createdBy = createdBy;
        this.updatedDate = updatedDate;
        this.updatedBy = updatedBy;
        this.statusApproval = statusApproval;
    }

    public Integer getId() {
        return id;
    }


    public Wilayah() {
    }

    public Wilayah id(Integer id) {
        setId(id);
        return this;
    }

    public Wilayah namaWilayah(String namaWilayah) {
        setNamaWilayah(namaWilayah);
        return this;
    }

    public Wilayah deskripsi(String deskripsi) {
        setDeskripsi(deskripsi);
        return this;
    }

    public Wilayah startBerlaku(Date startBerlaku) {
        setStartBerlaku(startBerlaku);
        return this;
    }

    public Wilayah endBerlaku(Date endBerlaku) {
        setEndBerlaku(endBerlaku);
        return this;
    }

    public Wilayah createdDate(Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    public Wilayah remarks(String remarks) {
        setRemarks(remarks);
        return this;
    }

    public Wilayah isRejected(Integer isRejected) {
        setIsRejected(isRejected);
        return this;
    }

    public Wilayah isApproved(Integer isApproved) {
        setIsApproved(isApproved);
        return this;
    }

    public Wilayah createdBy(Long createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    public Wilayah updatedDate(Date updatedDate) {
        setUpdatedDate(updatedDate);
        return this;
    }

    public Wilayah updatedBy(Long updatedBy) {
        setUpdatedBy(updatedBy);
        return this;
    }

    public Wilayah statusApproval(Integer statusApproval) {
        setStatusApproval(statusApproval);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", namaWilayah='" + getNamaWilayah() + "'" +
            ", deskripsi='" + getDeskripsi() + "'" +
            ", startBerlaku='" + getStartBerlaku() + "'" +
            ", endBerlaku='" + getEndBerlaku() + "'" +
            ", createdDate='" + getCreatedDate() + "'" +
            ", remarks='" + getRemarks() + "'" +
            ", isRejected='" + getIsRejected() + "'" +
            ", isApproved='" + getIsApproved() + "'" +
            ", createdBy='" + getCreatedBy() + "'" +
            ", updatedDate='" + getUpdatedDate() + "'" +
            ", updatedBy='" + getUpdatedBy() + "'" +
            ", statusApproval='" + getStatusApproval() + "'" +
            "}";
    }


    public void setId(Integer id) {
        this.id = id;
    }



    public String getNamaWilayah() {
        return namaWilayah;
    }



    public void setNamaWilayah(String namaWilayah) {
        this.namaWilayah = namaWilayah;
    }



    public String getDeskripsi() {
        return deskripsi;
    }



    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
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



    public String getRemarks() {
        return remarks;
    }



    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }



    public Integer getIsRejected() {
        return isRejected;
    }



    public void setIsRejected(Integer isRejected) {
        this.isRejected = isRejected;
    }



    public Integer getIsApproved() {
        return isApproved;
    }



    public void setIsApproved(Integer isApproved) {
        this.isApproved = isApproved;
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