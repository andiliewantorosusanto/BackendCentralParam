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
@Table(name="sp_rateperluasan")
public class PerluasanAsuransi implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "nama_skema")
    private String namaSkema;

    @Column(name = "wilayah")
    private Integer wilayah;

    @Column(name = "jenis_kendaraan")
    private Integer jenisKendaraan;

    @Column(name = "tipe_asuransi")
    private Integer tipeAsuransi;

    @Column(name = "jenis_perluasan")
    private Integer jenisPerluasan;

    @Column(name = "startOTR")
    private Integer startOtr;
    @Column(name = "endOTR")
    private Integer endOtr;

    @Column(name = "startyear")
    private Integer startYear;
    @Column(name = "endyear")
    private Integer endYear;

    @Column(name = "tenor1")
    private Integer tenor1;
    @Column(name = "tenor2")
    private Integer tenor2;
    @Column(name = "tenor3")
    private Integer tenor3;
    @Column(name = "tenor4")
    private Integer tenor4;
    @Column(name = "tenor5")
    private Integer tenor5;
    @Column(name = "tenor6")
    private Integer tenor6;
    @Column(name = "tenor7")
    private Integer tenor7;
    @Column(name = "tenor8")
    private Integer tenor8;
    @Column(name = "tenor9")
    private Integer tenor9;
    @Column(name = "tenor10")
    private Integer tenor10;

    @Column(name = "startberlaku")
    private Date startBerlaku;
    @Column(name = "endberlaku")
    private Date endBerlaku;

    @Column(name = "createddate")
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


    public PerluasanAsuransi() {
    }

    public PerluasanAsuransi(Integer id, String namaSkema, Integer wilayah, Integer jenisKendaraan, Integer tipeAsuransi, Integer jenisPerluasan, Integer startOtr, Integer endOtr, Integer startYear, Integer endYear, Integer tenor1, Integer tenor2, Integer tenor3, Integer tenor4, Integer tenor5, Integer tenor6, Integer tenor7, Integer tenor8, Integer tenor9, Integer tenor10, Date startBerlaku, Date endBerlaku, Date createdDate, Integer statusApproval, String remarks, Integer isRejected, Integer isApproved, Long createdBy, Long updatedBy, Date updatedDate) {
        this.id = id;
        this.namaSkema = namaSkema;
        this.wilayah = wilayah;
        this.jenisKendaraan = jenisKendaraan;
        this.tipeAsuransi = tipeAsuransi;
        this.jenisPerluasan = jenisPerluasan;
        this.startOtr = startOtr;
        this.endOtr = endOtr;
        this.startYear = startYear;
        this.endYear = endYear;
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

    public Integer getWilayah() {
        return this.wilayah;
    }

    public void setWilayah(Integer wilayah) {
        this.wilayah = wilayah;
    }

    public Integer getJenisKendaraan() {
        return this.jenisKendaraan;
    }

    public void setJenisKendaraan(Integer jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }

    public Integer getTipeAsuransi() {
        return this.tipeAsuransi;
    }

    public void setTipeAsuransi(Integer tipeAsuransi) {
        this.tipeAsuransi = tipeAsuransi;
    }

    public Integer getJenisPerluasan() {
        return this.jenisPerluasan;
    }

    public void setJenisPerluasan(Integer jenisPerluasan) {
        this.jenisPerluasan = jenisPerluasan;
    }

    public Integer getStartOtr() {
        return this.startOtr;
    }

    public void setStartOtr(Integer startOtr) {
        this.startOtr = startOtr;
    }

    public Integer getEndOtr() {
        return this.endOtr;
    }

    public void setEndOtr(Integer endOtr) {
        this.endOtr = endOtr;
    }

    public Integer getStartYear() {
        return this.startYear;
    }

    public void setStartYear(Integer startYear) {
        this.startYear = startYear;
    }

    public Integer getEndYear() {
        return this.endYear;
    }

    public void setEndYear(Integer endYear) {
        this.endYear = endYear;
    }

    public Integer getTenor1() {
        return this.tenor1;
    }

    public void setTenor1(Integer tenor1) {
        this.tenor1 = tenor1;
    }

    public Integer getTenor2() {
        return this.tenor2;
    }

    public void setTenor2(Integer tenor2) {
        this.tenor2 = tenor2;
    }

    public Integer getTenor3() {
        return this.tenor3;
    }

    public void setTenor3(Integer tenor3) {
        this.tenor3 = tenor3;
    }

    public Integer getTenor4() {
        return this.tenor4;
    }

    public void setTenor4(Integer tenor4) {
        this.tenor4 = tenor4;
    }

    public Integer getTenor5() {
        return this.tenor5;
    }

    public void setTenor5(Integer tenor5) {
        this.tenor5 = tenor5;
    }

    public Integer getTenor6() {
        return this.tenor6;
    }

    public void setTenor6(Integer tenor6) {
        this.tenor6 = tenor6;
    }

    public Integer getTenor7() {
        return this.tenor7;
    }

    public void setTenor7(Integer tenor7) {
        this.tenor7 = tenor7;
    }

    public Integer getTenor8() {
        return this.tenor8;
    }

    public void setTenor8(Integer tenor8) {
        this.tenor8 = tenor8;
    }

    public Integer getTenor9() {
        return this.tenor9;
    }

    public void setTenor9(Integer tenor9) {
        this.tenor9 = tenor9;
    }

    public Integer getTenor10() {
        return this.tenor10;
    }

    public void setTenor10(Integer tenor10) {
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

    public Date getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getStatusApproval() {
        return this.statusApproval;
    }

    public void setStatusApproval(Integer statusApproval) {
        this.statusApproval = statusApproval;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getIsRejected() {
        return this.isRejected;
    }

    public void setIsRejected(Integer isRejected) {
        this.isRejected = isRejected;
    }

    public Integer getIsApproved() {
        return this.isApproved;
    }

    public void setIsApproved(Integer isApproved) {
        this.isApproved = isApproved;
    }

    public Long getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Long getUpdatedBy() {
        return this.updatedBy;
    }

    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdatedDate() {
        return this.updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public PerluasanAsuransi id(Integer id) {
        setId(id);
        return this;
    }

    public PerluasanAsuransi namaSkema(String namaSkema) {
        setNamaSkema(namaSkema);
        return this;
    }

    public PerluasanAsuransi wilayah(Integer wilayah) {
        setWilayah(wilayah);
        return this;
    }

    public PerluasanAsuransi jenisKendaraan(Integer jenisKendaraan) {
        setJenisKendaraan(jenisKendaraan);
        return this;
    }

    public PerluasanAsuransi tipeAsuransi(Integer tipeAsuransi) {
        setTipeAsuransi(tipeAsuransi);
        return this;
    }

    public PerluasanAsuransi jenisPerluasan(Integer jenisPerluasan) {
        setJenisPerluasan(jenisPerluasan);
        return this;
    }

    public PerluasanAsuransi startOtr(Integer startOtr) {
        setStartOtr(startOtr);
        return this;
    }

    public PerluasanAsuransi endOtr(Integer endOtr) {
        setEndOtr(endOtr);
        return this;
    }

    public PerluasanAsuransi startYear(Integer startYear) {
        setStartYear(startYear);
        return this;
    }

    public PerluasanAsuransi endYear(Integer endYear) {
        setEndYear(endYear);
        return this;
    }

    public PerluasanAsuransi tenor1(Integer tenor1) {
        setTenor1(tenor1);
        return this;
    }

    public PerluasanAsuransi tenor2(Integer tenor2) {
        setTenor2(tenor2);
        return this;
    }

    public PerluasanAsuransi tenor3(Integer tenor3) {
        setTenor3(tenor3);
        return this;
    }

    public PerluasanAsuransi tenor4(Integer tenor4) {
        setTenor4(tenor4);
        return this;
    }

    public PerluasanAsuransi tenor5(Integer tenor5) {
        setTenor5(tenor5);
        return this;
    }

    public PerluasanAsuransi tenor6(Integer tenor6) {
        setTenor6(tenor6);
        return this;
    }

    public PerluasanAsuransi tenor7(Integer tenor7) {
        setTenor7(tenor7);
        return this;
    }

    public PerluasanAsuransi tenor8(Integer tenor8) {
        setTenor8(tenor8);
        return this;
    }

    public PerluasanAsuransi tenor9(Integer tenor9) {
        setTenor9(tenor9);
        return this;
    }

    public PerluasanAsuransi tenor10(Integer tenor10) {
        setTenor10(tenor10);
        return this;
    }

    public PerluasanAsuransi startBerlaku(Date startBerlaku) {
        setStartBerlaku(startBerlaku);
        return this;
    }

    public PerluasanAsuransi endBerlaku(Date endBerlaku) {
        setEndBerlaku(endBerlaku);
        return this;
    }

    public PerluasanAsuransi createdDate(Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    public PerluasanAsuransi statusApproval(Integer statusApproval) {
        setStatusApproval(statusApproval);
        return this;
    }

    public PerluasanAsuransi remarks(String remarks) {
        setRemarks(remarks);
        return this;
    }

    public PerluasanAsuransi isRejected(Integer isRejected) {
        setIsRejected(isRejected);
        return this;
    }

    public PerluasanAsuransi isApproved(Integer isApproved) {
        setIsApproved(isApproved);
        return this;
    }

    public PerluasanAsuransi createdBy(Long createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    public PerluasanAsuransi updatedBy(Long updatedBy) {
        setUpdatedBy(updatedBy);
        return this;
    }

    public PerluasanAsuransi updatedDate(Date updatedDate) {
        setUpdatedDate(updatedDate);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", namaSkema='" + getNamaSkema() + "'" +
            ", wilayah='" + getWilayah() + "'" +
            ", jenisKendaraan='" + getJenisKendaraan() + "'" +
            ", tipeAsuransi='" + getTipeAsuransi() + "'" +
            ", jenisPerluasan='" + getJenisPerluasan() + "'" +
            ", startOtr='" + getStartOtr() + "'" +
            ", endOtr='" + getEndOtr() + "'" +
            ", startYear='" + getStartYear() + "'" +
            ", endYear='" + getEndYear() + "'" +
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
