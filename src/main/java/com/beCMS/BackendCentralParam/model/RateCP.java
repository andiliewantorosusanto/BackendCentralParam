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

    @Column(name = "tenor1")
    private Float tenor1;

    @Column(name = "startberlaku")
    private Date startBerlaku;

    @Column(name = "endberlaku")
    private Date endBerlaku;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updateddate")
    private Date updateddate;

    @Column(name = "jenis_kendaraan")
    private Integer jenis_kendaraan;

    @Column(name = "produk")
    private Integer produk;

    @Column(name = "loan_type")
    private Integer loan_type;

    @Column(name = "kondisi_kendaraan")
    private Integer kondisi_kendaraan;

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

    @Column(name = "Remarks")
    private String Remarks;
    
    @Column(name = "is_rejected")
    private Integer is_rejected;

    @Column(name = "is_approved")
    private Integer is_approved;

    @Column(name = "statusapproved")
    private String statusApproved;

    @Column(name = "tipe_konsumen")
    private Integer tipeKonsumen;

    @Column(name = "updatedby")
    private Long updatedby;

    @Column(name = "createdby")
    private Long createdby;


    public RateCP() {
    }

    public RateCP(Integer id, String namaSkema, Float tenor1, Date startBerlaku, Date endBerlaku, Date createdAt, Date updateddate, Integer jenis_kendaraan, Integer produk, Integer loan_type, Integer kondisi_kendaraan, Float tenor2, Float tenor3, Float tenor4, Float tenor5, Float tenor6, Float tenor7, Float tenor8, Float tenor9, Float tenor10, String Remarks, Integer is_rejected, Integer is_approved, String statusApproved, Integer tipeKonsumen, Long updatedby, Long createdby) {
        this.id = id;
        this.namaSkema = namaSkema;
        this.tenor1 = tenor1;
        this.startBerlaku = startBerlaku;
        this.endBerlaku = endBerlaku;
        this.createdAt = createdAt;
        this.updateddate = updateddate;
        this.jenis_kendaraan = jenis_kendaraan;
        this.produk = produk;
        this.loan_type = loan_type;
        this.kondisi_kendaraan = kondisi_kendaraan;
        this.tenor2 = tenor2;
        this.tenor3 = tenor3;
        this.tenor4 = tenor4;
        this.tenor5 = tenor5;
        this.tenor6 = tenor6;
        this.tenor7 = tenor7;
        this.tenor8 = tenor8;
        this.tenor9 = tenor9;
        this.tenor10 = tenor10;
        this.Remarks = Remarks;
        this.is_rejected = is_rejected;
        this.is_approved = is_approved;
        this.statusApproved = statusApproved;
        this.tipeKonsumen = tipeKonsumen;
        this.updatedby = updatedby;
        this.createdby = createdby;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNamaSkema() {
        return this.namaSkema;
    }

    public void setNamaSkema(String namaSkema) {
        this.namaSkema = namaSkema;
    }

    public Float getTenor1() {
        return this.tenor1;
    }

    public void setTenor1(Float tenor1) {
        this.tenor1 = tenor1;
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

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdateddate() {
        return this.updateddate;
    }

    public void setUpdateddate(Date updateddate) {
        this.updateddate = updateddate;
    }

    public Integer getJenis_kendaraan() {
        return this.jenis_kendaraan;
    }

    public void setJenis_kendaraan(Integer jenis_kendaraan) {
        this.jenis_kendaraan = jenis_kendaraan;
    }

    public Integer getProduk() {
        return this.produk;
    }

    public void setProduk(Integer produk) {
        this.produk = produk;
    }

    public Integer getLoan_type() {
        return this.loan_type;
    }

    public void setLoan_type(Integer loan_type) {
        this.loan_type = loan_type;
    }

    public Integer getKondisi_kendaraan() {
        return this.kondisi_kendaraan;
    }

    public void setKondisi_kendaraan(Integer kondisi_kendaraan) {
        this.kondisi_kendaraan = kondisi_kendaraan;
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

    public String getRemarks() {
        return this.Remarks;
    }

    public void setRemarks(String Remarks) {
        this.Remarks = Remarks;
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

    public String getStatusApproved() {
        return this.statusApproved;
    }

    public void setStatusApproved(String statusApproved) {
        this.statusApproved = statusApproved;
    }

    public Integer getTipeKonsumen() {
        return this.tipeKonsumen;
    }

    public void setTipeKonsumen(Integer tipeKonsumen) {
        this.tipeKonsumen = tipeKonsumen;
    }

    public Long getUpdatedby() {
        return this.updatedby;
    }

    public void setUpdatedby(Long updatedby) {
        this.updatedby = updatedby;
    }

    public Long getCreatedby() {
        return this.createdby;
    }

    public void setCreatedby(Long createdby) {
        this.createdby = createdby;
    }

    public RateCP id(Integer id) {
        setId(id);
        return this;
    }

    public RateCP namaSkema(String namaSkema) {
        setNamaSkema(namaSkema);
        return this;
    }

    public RateCP tenor1(Float tenor1) {
        setTenor1(tenor1);
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

    public RateCP createdAt(Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    public RateCP updateddate(Date updateddate) {
        setUpdateddate(updateddate);
        return this;
    }

    public RateCP jenis_kendaraan(Integer jenis_kendaraan) {
        setJenis_kendaraan(jenis_kendaraan);
        return this;
    }

    public RateCP produk(Integer produk) {
        setProduk(produk);
        return this;
    }

    public RateCP loan_type(Integer loan_type) {
        setLoan_type(loan_type);
        return this;
    }

    public RateCP kondisi_kendaraan(Integer kondisi_kendaraan) {
        setKondisi_kendaraan(kondisi_kendaraan);
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

    public RateCP Remarks(String Remarks) {
        setRemarks(Remarks);
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

    public RateCP statusApproved(String statusApproved) {
        setStatusApproved(statusApproved);
        return this;
    }

    public RateCP tipeKonsumen(Integer tipeKonsumen) {
        setTipeKonsumen(tipeKonsumen);
        return this;
    }

    public RateCP updatedby(Long updatedby) {
        setUpdatedby(updatedby);
        return this;
    }

    public RateCP createdby(Long createdby) {
        setCreatedby(createdby);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", namaSkema='" + getNamaSkema() + "'" +
            ", tenor1='" + getTenor1() + "'" +
            ", startBerlaku='" + getStartBerlaku() + "'" +
            ", endBerlaku='" + getEndBerlaku() + "'" +
            ", createdAt='" + getCreatedAt() + "'" +
            ", updateddate='" + getUpdateddate() + "'" +
            ", jenis_kendaraan='" + getJenis_kendaraan() + "'" +
            ", produk='" + getProduk() + "'" +
            ", loan_type='" + getLoan_type() + "'" +
            ", kondisi_kendaraan='" + getKondisi_kendaraan() + "'" +
            ", tenor2='" + getTenor2() + "'" +
            ", tenor3='" + getTenor3() + "'" +
            ", tenor4='" + getTenor4() + "'" +
            ", tenor5='" + getTenor5() + "'" +
            ", tenor6='" + getTenor6() + "'" +
            ", tenor7='" + getTenor7() + "'" +
            ", tenor8='" + getTenor8() + "'" +
            ", tenor9='" + getTenor9() + "'" +
            ", tenor10='" + getTenor10() + "'" +
            ", Remarks='" + getRemarks() + "'" +
            ", is_rejected='" + getIs_rejected() + "'" +
            ", is_approved='" + getIs_approved() + "'" +
            ", statusApproved='" + getStatusApproved() + "'" +
            ", tipeKonsumen='" + getTipeKonsumen() + "'" +
            ", updatedby='" + getUpdatedby() + "'" +
            ", createdby='" + getCreatedby() + "'" +
            "}";
    }

    public TipeKonsumen submit(Long user) {
        if(this.statusApproval == null || this.statusApproval == 0){
            setIs_approved(0);
            setIs_rejected(0);
            setStatusApproval(1);
            
            trace(user);
        }
        return this;
    }

    public TipeKonsumen approve(Long user) {
        if(this.statusApproval == 1) {
            setIs_approved(1);
            setIs_rejected(0);
            setStatusApproval(2);

            trace(user);
        }

        return this;
    }

    public TipeKonsumen decline(Long user) {
        if(this.statusApproval == 1) {
            setIs_approved(0);
            setIs_rejected(1);
            setStatusApproval(2);

            trace(user);
        }

        return this;
    }

    public RateCP trace(Long user) {
        if(this.createdAt == null) {
            setCreatedby(user);
            setCreatedAt(new Date());
        } else {
            setUpdatedby(user);
            setUpdateddate(new Date());
        }
        return this;
    }
}
