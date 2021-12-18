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
@Table(name="sp_tipekonsumen_kkbsk")
public class TipeKonsumen  implements Serializable {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "Nama")
    private String nama;
    
    @Column(name = "produk")
    private Integer produk;

    @Column(name = "Deskripsi")
    private String deskripsi;

    @Column(name = "Start_date")
    private Date startBerlaku;

    @Column(name = "End_date")
    private Date endBerlaku;

    @Column(name = "is_approved")
    private Integer isApproved;
        
    @Column(name = "is_rejected")
    private Integer isRejected;

    @Column(name = "remarks")
    private String remarks;
        
    @Column(name = "createdby")
    private Long createdBy;
        
    @Column(name = "createddate")
    private Date createdDate;
        
    @Column(name = "updatedby")
    private Long updatedBy;
        
    @Column(name = "updateddate")
    private Date updatedDate;

    @Column(name = "statusapproval")
    private Integer statusApproval;

    public TipeKonsumen() {

    }

    public TipeKonsumen(Integer id, String nama, Integer produk, String deskripsi, Date startBerlaku, Date endBerlaku,
            Integer isApproved, Integer isRejected, String remarks, Long createdBy, Date createdDate, Long updatedBy,
            Date updatedDate, Integer statusApproval) {
        this.id = id;
        this.nama = nama;
        this.produk = produk;
        this.deskripsi = deskripsi;
        this.startBerlaku = startBerlaku;
        this.endBerlaku = endBerlaku;
        this.isApproved = isApproved;
        this.isRejected = isRejected;
        this.remarks = remarks;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
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



    public String getNama() {
        return nama;
    }



    public void setNama(String nama) {
        this.nama = nama;
    }



    public Integer getProduk() {
        return produk;
    }



    public void setProduk(Integer produk) {
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



    public Date getCreatedDate() {
        return createdDate;
    }



    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
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