package com.beCMS.BackendCentralParam.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
    private String nama_skema;

    @OneToOne()
    @JoinColumn(name = "tipe_konsumen",referencedColumnName = "id",insertable = false,updatable = false)
    private TipeKonsumen tipe_konsumenObject;
    @Column(name = "tipe_konsumen")
    private Integer tipe_konsumen;

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
    private Date created_at;
    @Column(name = "statusapproved")
    private Integer statusApproved;
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


    public RateCP() {
    }

    public RateCP(Integer id, String nama_skema, TipeKonsumen tipe_konsumenObject, Integer tipe_konsumen, Float tenor1, Float tenor2, Float tenor3, Float tenor4, Float tenor5, Float tenor6, Float tenor7, Float tenor8, Float tenor9, Float tenor10, Date startBerlaku, Date endBerlaku, Date created_at, Integer statusApproved, String remarks, Integer is_rejected, Integer is_approved, Long createdby, Long updatedby, Date updateddate) {
        this.id = id;
        this.nama_skema = nama_skema;
        this.tipe_konsumenObject = tipe_konsumenObject;
        this.tipe_konsumen = tipe_konsumen;
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
        this.created_at = created_at;
        this.statusApproved = statusApproved;
        this.remarks = remarks;
        this.is_rejected = is_rejected;
        this.is_approved = is_approved;
        this.createdby = createdby;
        this.updatedby = updatedby;
        this.updateddate = updateddate;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama_skema() {
        return this.nama_skema;
    }

    public void setNama_skema(String nama_skema) {
        this.nama_skema = nama_skema;
    }

    public TipeKonsumen getTipe_konsumenObject() {
        return this.tipe_konsumenObject;
    }

    public void setTipe_konsumenObject(TipeKonsumen tipe_konsumenObject) {
        this.tipe_konsumenObject = tipe_konsumenObject;
    }

    public Integer getTipe_konsumen() {
        return this.tipe_konsumen;
    }

    public void setTipe_konsumen(Integer tipe_konsumen) {
        this.tipe_konsumen = tipe_konsumen;
    }

    public Float getTenor1() {
        return this.tenor1;
    }

    public void setTenor1(Float tenor1) {
        this.tenor1 = tenor1;
    }

    public Float getTenor2() {
        return this.tenor2;
    }

    public void setTenor2(Float tenor2) {
        this.tenor2 = tenor2;
    }

    public Float getTenor3() {
        return this.tenor3;
    }

    public void setTenor3(Float tenor3) {
        this.tenor3 = tenor3;
    }

    public Float getTenor4() {
        return this.tenor4;
    }

    public void setTenor4(Float tenor4) {
        this.tenor4 = tenor4;
    }

    public Float getTenor5() {
        return this.tenor5;
    }

    public void setTenor5(Float tenor5) {
        this.tenor5 = tenor5;
    }

    public Float getTenor6() {
        return this.tenor6;
    }

    public void setTenor6(Float tenor6) {
        this.tenor6 = tenor6;
    }

    public Float getTenor7() {
        return this.tenor7;
    }

    public void setTenor7(Float tenor7) {
        this.tenor7 = tenor7;
    }

    public Float getTenor8() {
        return this.tenor8;
    }

    public void setTenor8(Float tenor8) {
        this.tenor8 = tenor8;
    }

    public Float getTenor9() {
        return this.tenor9;
    }

    public void setTenor9(Float tenor9) {
        this.tenor9 = tenor9;
    }

    public Float getTenor10() {
        return this.tenor10;
    }

    public void setTenor10(Float tenor10) {
        this.tenor10 = tenor10;
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

    public Integer getStatusApproved() {
        return this.statusApproved;
    }

    public void setStatusApproved(Integer statusApproved) {
        this.statusApproved = statusApproved;
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

    public RateCP id(Integer id) {
        setId(id);
        return this;
    }

    public RateCP nama_skema(String nama_skema) {
        setNama_skema(nama_skema);
        return this;
    }

    public RateCP tipe_konsumenObject(TipeKonsumen tipe_konsumenObject) {
        setTipe_konsumenObject(tipe_konsumenObject);
        return this;
    }

    public RateCP tipe_konsumen(Integer tipe_konsumen) {
        setTipe_konsumen(tipe_konsumen);
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

    public RateCP created_at(Date created_at) {
        setCreated_at(created_at);
        return this;
    }

    public RateCP statusApproved(Integer statusApproved) {
        setStatusApproved(statusApproved);
        return this;
    }

    public RateCP remarks(String remarks) {
        setRemarks(remarks);
        return this;
    }

    public RateCP is_rejected(Integer is_rejected) {
        setIs_rejected(is_rejected);
        return this;
    }

    public RateCP is_approved(Integer is_approved) {
        setIs_approved(is_approved);
        return this;
    }

    public RateCP createdby(Long createdby) {
        setCreatedby(createdby);
        return this;
    }

    public RateCP updatedby(Long updatedby) {
        setUpdatedby(updatedby);
        return this;
    }

    public RateCP updateddate(Date updateddate) {
        setUpdateddate(updateddate);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nama_skema='" + getNama_skema() + "'" +
            ", tipe_konsumenObject='" + getTipe_konsumenObject() + "'" +
            ", tipe_konsumen='" + getTipe_konsumen() + "'" +
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
            ", created_at='" + getCreated_at() + "'" +
            ", statusApproved='" + getStatusApproved() + "'" +
            ", remarks='" + getRemarks() + "'" +
            ", is_rejected='" + getIs_rejected() + "'" +
            ", is_approved='" + getIs_approved() + "'" +
            ", createdby='" + getCreatedby() + "'" +
            ", updatedby='" + getUpdatedby() + "'" +
            ", updateddate='" + getUpdateddate() + "'" +
            "}";
    }


    public RateCP submit(Long user) {
        if(this.statusApproved == null || this.statusApproved == 0){
            setIs_approved(0);
            setIs_rejected(0);
            setStatusApproved(1);
            
            trace(user);
        }
        return this;
    }

    public RateCP approve(Long user) {
        if(this.statusApproved == 1) {
            setIs_approved(1);
            setIs_rejected(0);
            setStatusApproved(2);

            trace(user);
        }

        return this;
    }

    public RateCP decline(Long user) {
        if(this.statusApproved == 1) {
            setIs_approved(0);
            setIs_rejected(1);
            setStatusApproved(2);

            trace(user);
        }

        return this;
    }

    public RateCP trace(Long user) {
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
