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
@Table(name="sp_biayafiducia_kkbsk")
public class BiayaFidusia implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nama_skema")
    private String namaSkema;

    @Column(name = "startph")
    private Integer startPh;
    @Column(name = "endph")
    private Integer endPh;
    @Column(name = "biaya")
    private Integer biaya;

    @Column(name = "startberlaku")
    private Date startBerlaku;
    @Column(name = "endberlaku")
    private Date endBerlaku;

    @Column(name = "statusapproved")
    private Integer statusApproval;
    @Column(name = "remarks")
    private String remarks;
    @Column(name = "is_rejected")
    private Integer isRejected;
    @Column(name = "is_approved")
    private Integer isApproved;

    @Column(name = "createdby")
    private Long createdBy;
    @Column(name = "createddate")
    private Date createdDate;
    @Column(name = "updatedby")
    private Long updatedBy;
    @Column(name = "updateddate")
    private Date updatedDate;


    public BiayaFidusia() {
    }

    public BiayaFidusia id(Integer id) {
        setId(id);
        return this;
    }

    public BiayaFidusia namaSkema(String namaSkema) {
        setNamaSkema(namaSkema);
        return this;
    }

    public BiayaFidusia startPh(Integer startPh) {
        setStartPh(startPh);
        return this;
    }

    public BiayaFidusia endPh(Integer endPh) {
        setEndPh(endPh);
        return this;
    }

    public BiayaFidusia biaya(Integer biaya) {
        setBiaya(biaya);
        return this;
    }

    public BiayaFidusia startBerlaku(Date startBerlaku) {
        setStartBerlaku(startBerlaku);
        return this;
    }

    public BiayaFidusia endBerlaku(Date endBerlaku) {
        setEndBerlaku(endBerlaku);
        return this;
    }

    public BiayaFidusia statusApproval(Integer statusApproval) {
        setStatusApproval(statusApproval);
        return this;
    }

    public BiayaFidusia remarks(String remarks) {
        setRemarks(remarks);
        return this;
    }

    public BiayaFidusia isRejected(Integer isRejected) {
        setIsRejected(isRejected);
        return this;
    }

    public BiayaFidusia isApproved(Integer isApproved) {
        setIsApproved(isApproved);
        return this;
    }

    public BiayaFidusia createdBy(Long createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    public BiayaFidusia createdDate(Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    public BiayaFidusia updatedBy(Long updatedBy) {
        setUpdatedBy(updatedBy);
        return this;
    }

    public BiayaFidusia updatedDate(Date updatedDate) {
        setUpdatedDate(updatedDate);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", namaSkema='" + getNamaSkema() + "'" +
            ", startPh='" + getStartPh() + "'" +
            ", endPh='" + getEndPh() + "'" +
            ", biaya='" + getBiaya() + "'" +
            ", startBerlaku='" + getStartBerlaku() + "'" +
            ", endBerlaku='" + getEndBerlaku() + "'" +
            ", statusApproval='" + getStatusApproval() + "'" +
            ", remarks='" + getRemarks() + "'" +
            ", isRejected='" + getIsRejected() + "'" +
            ", isApproved='" + getIsApproved() + "'" +
            ", createdBy='" + getCreatedBy() + "'" +
            ", createdDate='" + getCreatedDate() + "'" +
            ", updatedBy='" + getUpdatedBy() + "'" +
            ", updatedDate='" + getUpdatedDate() + "'" +
            "}";
    }
    

    public BiayaFidusia(Integer id, String namaSkema, Integer startPh, Integer endPh, Integer biaya, Date startBerlaku,
            Date endBerlaku, Integer statusApproval, String remarks, Integer isRejected, Integer isApproved,
            Long createdBy, Date createdDate, Long updatedBy, Date updatedDate) {
        this.id = id;
        this.namaSkema = namaSkema;
        this.startPh = startPh;
        this.endPh = endPh;
        this.biaya = biaya;
        this.startBerlaku = startBerlaku;
        this.endBerlaku = endBerlaku;
        this.statusApproval = statusApproval;
        this.remarks = remarks;
        this.isRejected = isRejected;
        this.isApproved = isApproved;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.updatedBy = updatedBy;
        this.updatedDate = updatedDate;
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



    public Integer getStartPh() {
        return startPh;
    }



    public void setStartPh(Integer startPh) {
        this.startPh = startPh;
    }



    public Integer getEndPh() {
        return endPh;
    }



    public void setEndPh(Integer endPh) {
        this.endPh = endPh;
    }



    public Integer getBiaya() {
        return biaya;
    }



    public void setBiaya(Integer biaya) {
        this.biaya = biaya;
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



    public Integer getStatusApproval() {
        return statusApproval;
    }



    public void setStatusApproval(Integer statusApproval) {
        this.statusApproval = statusApproval;
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
