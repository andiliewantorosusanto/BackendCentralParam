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
@Table(name="sp_ratecp")
public class RateCP implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "nama_skema")
    private String namaSkema;

    @Column(name = "tipe_konsumen")
    private Integer tipeKonsumen;

    @Column(name = "tenor1")
    private Float tenor1;
    @Column(name = "tenor2")
    private Float tenor2;
    @Column(name = "tenor3")
    private Float tenor3;
    @Column(name = "tenor4")
    private Float tenor4;
    @Column(name = "tenor5")
    private Float tenor5;
    @Column(name = "tenor6")
    private Float tenor6;
    @Column(name = "tenor7")
    private Float tenor7;
    @Column(name = "tenor8")
    private Float tenor8;
    @Column(name = "tenor9")
    private Float tenor9;
    @Column(name = "tenor10")
    private Float tenor10;

    @Column(name = "startberlaku")
    private Date startBerlaku;
    @Column(name = "endberlaku")
    private Date endBerlaku;

    @Column(name = "created_at")
    private Date createdDate;
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
    @Column(name = "updatedby")
    private Long updatedBy;
    @Column(name = "updateddate")
    private Date updatedDate;


    public RateCP() {
    }

    public RateCP id(Integer id) {
        setId(id);
        return this;
    }

    public RateCP namaSkema(String namaSkema) {
        setNamaSkema(namaSkema);
        return this;
    }

    public RateCP tipeKonsumen(Integer tipeKonsumen) {
        setTipeKonsumen(tipeKonsumen);
        return this;
    }

    public RateCP tenor1(Float tenor1) {
        setTenor1(tenor1);
        return this;
    }

    public RateCP tenor2(Float tenor2) {
        setTenor2(tenor2);
        return this;
    }

    public RateCP tenor3(Float tenor3) {
        setTenor3(tenor3);
        return this;
    }

    public RateCP tenor4(Float tenor4) {
        setTenor4(tenor4);
        return this;
    }

    public RateCP tenor5(Float tenor5) {
        setTenor5(tenor5);
        return this;
    }

    public RateCP tenor6(Float tenor6) {
        setTenor6(tenor6);
        return this;
    }

    public RateCP tenor7(Float tenor7) {
        setTenor7(tenor7);
        return this;
    }

    public RateCP tenor8(Float tenor8) {
        setTenor8(tenor8);
        return this;
    }

    public RateCP tenor9(Float tenor9) {
        setTenor9(tenor9);
        return this;
    }

    public RateCP tenor10(Float tenor10) {
        setTenor10(tenor10);
        return this;
    }

    public RateCP startBerlaku(Date startBerlaku) {
        setStartBerlaku(startBerlaku);
        return this;
    }

    public RateCP endBerlaku(Date endBerlaku) {
        setEndBerlaku(endBerlaku);
        return this;
    }

    public RateCP createdDate(Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    public RateCP statusApproval(Integer statusApproval) {
        setStatusApproval(statusApproval);
        return this;
    }

    public RateCP remarks(String remarks) {
        setRemarks(remarks);
        return this;
    }

    public RateCP isRejected(Integer isRejected) {
        setIsRejected(isRejected);
        return this;
    }

    public RateCP isApproved(Integer isApproved) {
        setIsApproved(isApproved);
        return this;
    }

    public RateCP createdBy(Long createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    public RateCP updatedBy(Long updatedBy) {
        setUpdatedBy(updatedBy);
        return this;
    }

    public RateCP updatedDate(Date updatedDate) {
        setUpdatedDate(updatedDate);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", namaSkema='" + getNamaSkema() + "'" +
            ", tipeKonsumen='" + getTipeKonsumen() + "'" +
            ", tenor1='" + getTenor1() + "'" +
            ", tenor2='" + getTenor2() + "'" +
            ", tenor3='" + getTenor3() + "'" +
            ", tenor4='" + getTenor4() + "'" +
            ", tenor5='" + getTenor5() + "'" +
            ", tenor6='" + getTenor6() + "'" +
            ", tenor7='" + getTenor7() + "'" +
            ", tenor8='" + getTenor8() + "'" +
            ", tenor9='" + getTenor9() + "'" +
            ", tenor10='" + getTenor10() + "'" +
            ", startBerlaku='" + getStartBerlaku() + "'" +
            ", endBerlaku='" + getEndBerlaku() + "'" +
            ", createdDate='" + getCreatedDate() + "'" +
            ", statusApproval='" + getStatusApproval() + "'" +
            ", remarks='" + getRemarks() + "'" +
            ", isRejected='" + getIsRejected() + "'" +
            ", isApproved='" + getIsApproved() + "'" +
            ", createdBy='" + getCreatedBy() + "'" +
            ", updatedBy='" + getUpdatedBy() + "'" +
            ", updatedDate='" + getUpdatedDate() + "'" +
            "}";
    }


    public RateCP(Integer id, String namaSkema, Integer tipeKonsumen, Float tenor1, Float tenor2, Float tenor3,
            Float tenor4, Float tenor5, Float tenor6, Float tenor7, Float tenor8, Float tenor9, Float tenor10,
            Date startBerlaku, Date endBerlaku, Date createdDate, Integer statusApproval, String remarks,
            Integer isRejected, Integer isApproved, Long createdBy, Long updatedBy, Date updatedDate) {
        this.id = id;
        this.namaSkema = namaSkema;
        this.tipeKonsumen = tipeKonsumen;
        this.tenor1 = tenor1;
        this.tenor2 = tenor2;
        this.tenor3 = tenor3;
        this.tenor4 = tenor4;
        this.tenor5 = tenor5;
        this.tenor6 = tenor6;
        this.tenor7 = tenor7;
        this.tenor8 = tenor8;
        this.tenor9 = tenor9;
        this.tenor10 = tenor10;
        this.startBerlaku = startBerlaku;
        this.endBerlaku = endBerlaku;
        this.createdDate = createdDate;
        this.statusApproval = statusApproval;
        this.remarks = remarks;
        this.isRejected = isRejected;
        this.isApproved = isApproved;
        this.createdBy = createdBy;
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


    public Integer getTipeKonsumen() {
        return tipeKonsumen;
    }


    public void setTipeKonsumen(Integer tipeKonsumen) {
        this.tipeKonsumen = tipeKonsumen;
    }


    public Float getTenor1() {
        return tenor1;
    }


    public void setTenor1(Float tenor1) {
        this.tenor1 = tenor1;
    }


    public Float getTenor2() {
        return tenor2;
    }


    public void setTenor2(Float tenor2) {
        this.tenor2 = tenor2;
    }


    public Float getTenor3() {
        return tenor3;
    }


    public void setTenor3(Float tenor3) {
        this.tenor3 = tenor3;
    }


    public Float getTenor4() {
        return tenor4;
    }


    public void setTenor4(Float tenor4) {
        this.tenor4 = tenor4;
    }


    public Float getTenor5() {
        return tenor5;
    }


    public void setTenor5(Float tenor5) {
        this.tenor5 = tenor5;
    }


    public Float getTenor6() {
        return tenor6;
    }


    public void setTenor6(Float tenor6) {
        this.tenor6 = tenor6;
    }


    public Float getTenor7() {
        return tenor7;
    }


    public void setTenor7(Float tenor7) {
        this.tenor7 = tenor7;
    }


    public Float getTenor8() {
        return tenor8;
    }


    public void setTenor8(Float tenor8) {
        this.tenor8 = tenor8;
    }


    public Float getTenor9() {
        return tenor9;
    }


    public void setTenor9(Float tenor9) {
        this.tenor9 = tenor9;
    }


    public Float getTenor10() {
        return tenor10;
    }


    public void setTenor10(Float tenor10) {
        this.tenor10 = tenor10;
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
