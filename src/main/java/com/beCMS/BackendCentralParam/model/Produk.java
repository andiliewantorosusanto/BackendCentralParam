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
@Table(name = "sp_produk")
public class Produk implements Serializable {
  
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "produk")
    private String produk;

    @Column(name = "deskripsi")
    private String deskripsi;

    @Column(name = "startberlaku")
    private Date startBerlaku;

    @Column(name = "endberlaku")
    private Date endBerlaku;

    @Column(name = "created_at")
    private Date createdDate;

    @Column(name = "status")
    private Integer status;

    @Column(name = "remarks")
    private String remarks;

    @Column(name = "is_rejected")
    private Integer isRejected;

    @Column(name = "createdby")
    private Long createdBy;

    @Column(name = "updatedby")
    private Long updatedBy;

    @Column(name = "updateddate")
    private Date updatedDate;

    @Column(name = "is_approved")
    private Integer isApproved;
    
    @Column(name = "statusapproval")
    private Integer statusApproval;


    public Produk() {
    }

    public Produk id(Integer id) {
        setId(id);
        return this;
    }

    public Produk produk(String produk) {
        setProduk(produk);
        return this;
    }

    public Produk deskripsi(String deskripsi) {
        setDeskripsi(deskripsi);
        return this;
    }

    public Produk startBerlaku(Date startBerlaku) {
        setStartBerlaku(startBerlaku);
        return this;
    }

    public Produk endBerlaku(Date endBerlaku) {
        setEndBerlaku(endBerlaku);
        return this;
    }

    public Produk createdDate(Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    public Produk status(Integer status) {
        setStatus(status);
        return this;
    }

    public Produk remarks(String remarks) {
        setRemarks(remarks);
        return this;
    }

    public Produk isRejected(Integer isRejected) {
        setIsRejected(isRejected);
        return this;
    }

    public Produk createdBy(Long createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    public Produk updatedBy(Long updatedBy) {
        setUpdatedBy(updatedBy);
        return this;
    }

    public Produk updatedDate(Date updatedDate) {
        setUpdatedDate(updatedDate);
        return this;
    }

    public Produk isApproved(Integer isApproved) {
        setIsApproved(isApproved);
        return this;
    }

    public Produk statusApproval(Integer statusApproval) {
        setStatusApproval(statusApproval);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", produk='" + getProduk() + "'" +
            ", deskripsi='" + getDeskripsi() + "'" +
            ", startBerlaku='" + getStartBerlaku() + "'" +
            ", endBerlaku='" + getEndBerlaku() + "'" +
            ", createdDate='" + getCreatedDate() + "'" +
            ", status='" + getStatus() + "'" +
            ", remarks='" + getRemarks() + "'" +
            ", isRejected='" + getIsRejected() + "'" +
            ", createdBy='" + getCreatedBy() + "'" +
            ", updatedBy='" + getUpdatedBy() + "'" +
            ", updatedDate='" + getUpdatedDate() + "'" +
            ", isApproved='" + getIsApproved() + "'" +
            ", statusApproval='" + getStatusApproval() + "'" +
            "}";
    }


    public Produk(Integer id, String produk, String deskripsi, Date startBerlaku, Date endBerlaku, Date createdDate,
            Integer status, String remarks, Integer isRejected, Long createdBy, Long updatedBy, Date updatedDate,
            Integer isApproved, Integer statusApproval) {
        this.id = id;
        this.produk = produk;
        this.deskripsi = deskripsi;
        this.startBerlaku = startBerlaku;
        this.endBerlaku = endBerlaku;
        this.createdDate = createdDate;
        this.status = status;
        this.remarks = remarks;
        this.isRejected = isRejected;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.updatedDate = updatedDate;
        this.isApproved = isApproved;
        this.statusApproval = statusApproval;
    }


    
    public Integer getId() {
        return id;
    }



    public void setId(Integer id) {
        this.id = id;
    }



    public String getProduk() {
        return produk;
    }



    public void setProduk(String produk) {
        this.produk = produk;
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



    public Integer getStatus() {
        return status;
    }



    public void setStatus(Integer status) {
        this.status = status;
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



    public Integer getIsApproved() {
        return isApproved;
    }



    public void setIsApproved(Integer isApproved) {
        this.isApproved = isApproved;
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