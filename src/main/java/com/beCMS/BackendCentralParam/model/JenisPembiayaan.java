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
@Table(name="sp_jenispembiayaan")
public class JenisPembiayaan implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "jenis_pembiayaan")
    private String jenisPembiayaan;
    @Column(name = "produk")
    private Integer produk;
    @Column(name = "is_refinancing")
    private Integer isRefinancing;
    @Column(name = "start_date")
    private Date startBerlaku;
    @Column(name = "end_date")
    private Date endBerlaku;
    @Column(name = "is_approved")
    private Integer isApproved;
    @Column(name = "is_rejected")
    private Integer isRejected;
    @Column(name = "createdby")
    private Long createdBy;
    @Column(name = "createddate")
    private Date createdDate;
    @Column(name = "updatedby")
    private Long updatedBy;
    @Column(name = "updateddate")
    private Date updatedDate;
    @Column(name = "remarks")
    private String remarks;
    @Column(name = "statusapproval")
    private Integer statusApproval;

    public JenisPembiayaan() {
    }

    public JenisPembiayaan id(Integer id) {
        setId(id);
        return this;
    }

    public JenisPembiayaan jenisPembiayaan(String jenisPembiayaan) {
        setJenisPembiayaan(jenisPembiayaan);
        return this;
    }

    public JenisPembiayaan produk(Integer produk) {
        setProduk(produk);
        return this;
    }

    public JenisPembiayaan isRefinancing(Integer isRefinancing) {
        setIsRefinancing(isRefinancing);
        return this;
    }

    public JenisPembiayaan startBerlaku(Date startBerlaku) {
        setStartBerlaku(startBerlaku);
        return this;
    }

    public JenisPembiayaan endBerlaku(Date endBerlaku) {
        setEndBerlaku(endBerlaku);
        return this;
    }

    public JenisPembiayaan isApproved(Integer isApproved) {
        setIsApproved(isApproved);
        return this;
    }

    public JenisPembiayaan isRejected(Integer isRejected) {
        setIsRejected(isRejected);
        return this;
    }

    public JenisPembiayaan createdBy(Long createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    public JenisPembiayaan createdDate(Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    public JenisPembiayaan updatedBy(Long updatedBy) {
        setUpdatedBy(updatedBy);
        return this;
    }

    public JenisPembiayaan updatedDate(Date updatedDate) {
        setUpdatedDate(updatedDate);
        return this;
    }

    public JenisPembiayaan remarks(String remarks) {
        setRemarks(remarks);
        return this;
    }

    public JenisPembiayaan statusApproval(Integer statusApproval) {
        setStatusApproval(statusApproval);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", jenisPembiayaan='" + getJenisPembiayaan() + "'" +
            ", produk='" + getProduk() + "'" +
            ", isRefinancing='" + getIsRefinancing() + "'" +
            ", startBerlaku='" + getStartBerlaku() + "'" +
            ", endBerlaku='" + getEndBerlaku() + "'" +
            ", isApproved='" + getIsApproved() + "'" +
            ", isRejected='" + getIsRejected() + "'" +
            ", createdBy='" + getCreatedBy() + "'" +
            ", createdDate='" + getCreatedDate() + "'" +
            ", updatedBy='" + getUpdatedBy() + "'" +
            ", updatedDate='" + getUpdatedDate() + "'" +
            ", remarks='" + getRemarks() + "'" +
            ", statusApproval='" + getStatusApproval() + "'" +
            "}";
    }


    public JenisPembiayaan(Integer id, String jenisPembiayaan, Integer produk, Integer isRefinancing, Date startBerlaku,
            Date endBerlaku, Integer isApproved, Integer isRejected, Long createdBy, Date createdDate, Long updatedBy,
            Date updatedDate, String remarks, Integer statusApproval) {
        this.id = id;
        this.jenisPembiayaan = jenisPembiayaan;
        this.produk = produk;
        this.isRefinancing = isRefinancing;
        this.startBerlaku = startBerlaku;
        this.endBerlaku = endBerlaku;
        this.isApproved = isApproved;
        this.isRejected = isRejected;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.updatedBy = updatedBy;
        this.updatedDate = updatedDate;
        this.remarks = remarks;
        this.statusApproval = statusApproval;
    }

    public Integer getId() {
        return id;
    }



    public void setId(Integer id) {
        this.id = id;
    }



    public String getJenisPembiayaan() {
        return jenisPembiayaan;
    }



    public void setJenisPembiayaan(String jenisPembiayaan) {
        this.jenisPembiayaan = jenisPembiayaan;
    }



    public Integer getProduk() {
        return produk;
    }



    public void setProduk(Integer produk) {
        this.produk = produk;
    }



    public Integer getIsRefinancing() {
        return isRefinancing;
    }



    public void setIsRefinancing(Integer isRefinancing) {
        this.isRefinancing = isRefinancing;
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



    public String getRemarks() {
        return remarks;
    }



    public void setRemarks(String remarks) {
        this.remarks = remarks;
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
