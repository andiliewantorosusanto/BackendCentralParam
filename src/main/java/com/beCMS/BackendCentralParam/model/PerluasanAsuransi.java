package com.beCMS.BackendCentralParam.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
    private String nama_skema;

    @OneToOne()
    @JoinColumn(name = "wilayah",referencedColumnName = "id",insertable = false,updatable = false)
    private Wilayah wilayahObject;
    @Column(name = "wilayah")
    private Integer wilayah;

    @OneToOne()
    @JoinColumn(name = "jenis_kendaraan",referencedColumnName = "id",insertable = false,updatable = false)
    private JenisKendaraan jenis_kendaraanObject;
    @Column(name = "jenis_kendaraan")
    private Integer jenis_kendaraan;

    @OneToOne()
    @JoinColumn(name = "tipe_asuransi",referencedColumnName = "id",insertable = false,updatable = false)
    private TipeAsuransi tipe_asuransiObject;
    @Column(name = "tipe_asuransi")
    private Integer tipe_asuransi;

    @OneToOne(optional = true)
    @JoinColumn(name = "jenis_perluasan",referencedColumnName = "id",insertable = false,updatable = false,nullable = true)
    private JenisPerluasan jenis_perluasanObject;
    @Column(name = "jenis_perluasan")
    private Integer jenis_perluasan;

    @Column(name = "startOTR")
    private Integer startOTR;
    @Column(name = "endOTR")
    private Integer endOTR;

    @Column(name = "startyear")
    private Integer startYear;
    @Column(name = "endyear")
    private Integer endYear;

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

    @Column(name = "createddate")
    private Date createddate;
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


    public PerluasanAsuransi() {
    }

    public PerluasanAsuransi(Integer id, String nama_skema, Wilayah wilayahObject, Integer wilayah, JenisKendaraan jenis_kendaraanObject, Integer jenis_kendaraan, TipeAsuransi tipe_asuransiObject, Integer tipe_asuransi, JenisPerluasan jenis_perluasanObject, Integer jenis_perluasan, Integer startOTR, Integer endOTR, Integer startYear, Integer endYear, Float tenor1, Float tenor2, Float tenor3, Float tenor4, Float tenor5, Float tenor6, Float tenor7, Float tenor8, Float tenor9, Float tenor10, Date startBerlaku, Date endBerlaku, Date createddate, Integer statusApproved, String remarks, Integer is_rejected, Integer is_approved, Long createdby, Long updatedby, Date updateddate) {
        this.id = id;
        this.nama_skema = nama_skema;
        this.wilayahObject = wilayahObject;
        this.wilayah = wilayah;
        this.jenis_kendaraanObject = jenis_kendaraanObject;
        this.jenis_kendaraan = jenis_kendaraan;
        this.tipe_asuransiObject = tipe_asuransiObject;
        this.tipe_asuransi = tipe_asuransi;
        this.jenis_perluasanObject = jenis_perluasanObject;
        this.jenis_perluasan = jenis_perluasan;
        this.startOTR = startOTR;
        this.endOTR = endOTR;
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
        this.createddate = createddate;
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

    public Wilayah getWilayahObject() {
        return this.wilayahObject;
    }

    public void setWilayahObject(Wilayah wilayahObject) {
        this.wilayahObject = wilayahObject;
    }

    public Integer getWilayah() {
        return this.wilayah;
    }

    public void setWilayah(Integer wilayah) {
        this.wilayah = wilayah;
    }

    public JenisKendaraan getJenis_kendaraanObject() {
        return this.jenis_kendaraanObject;
    }

    public void setJenis_kendaraanObject(JenisKendaraan jenis_kendaraanObject) {
        this.jenis_kendaraanObject = jenis_kendaraanObject;
    }

    public Integer getJenis_kendaraan() {
        return this.jenis_kendaraan;
    }

    public void setJenis_kendaraan(Integer jenis_kendaraan) {
        this.jenis_kendaraan = jenis_kendaraan;
    }

    public TipeAsuransi getTipe_asuransiObject() {
        return this.tipe_asuransiObject;
    }

    public void setTipe_asuransiObject(TipeAsuransi tipe_asuransiObject) {
        this.tipe_asuransiObject = tipe_asuransiObject;
    }

    public Integer getTipe_asuransi() {
        return this.tipe_asuransi;
    }

    public void setTipe_asuransi(Integer tipe_asuransi) {
        this.tipe_asuransi = tipe_asuransi;
    }

    public JenisPerluasan getJenis_perluasanObject() {
        return this.jenis_perluasanObject;
    }

    public void setJenis_perluasanObject(JenisPerluasan jenis_perluasanObject) {
        this.jenis_perluasanObject = jenis_perluasanObject;
    }

    public Integer getJenis_perluasan() {
        return this.jenis_perluasan;
    }

    public void setJenis_perluasan(Integer jenis_perluasan) {
        this.jenis_perluasan = jenis_perluasan;
    }

    public Integer getStartOTR() {
        return this.startOTR;
    }

    public void setStartOTR(Integer startOTR) {
        this.startOTR = startOTR;
    }

    public Integer getEndOTR() {
        return this.endOTR;
    }

    public void setEndOTR(Integer endOTR) {
        this.endOTR = endOTR;
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

    public Date getCreateddate() {
        return this.createddate;
    }

    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
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

    public PerluasanAsuransi id(Integer id) {
        setId(id);
        return this;
    }

    public PerluasanAsuransi nama_skema(String nama_skema) {
        setNama_skema(nama_skema);
        return this;
    }

    public PerluasanAsuransi wilayahObject(Wilayah wilayahObject) {
        setWilayahObject(wilayahObject);
        return this;
    }

    public PerluasanAsuransi wilayah(Integer wilayah) {
        setWilayah(wilayah);
        return this;
    }

    public PerluasanAsuransi jenis_kendaraanObject(JenisKendaraan jenis_kendaraanObject) {
        setJenis_kendaraanObject(jenis_kendaraanObject);
        return this;
    }

    public PerluasanAsuransi jenis_kendaraan(Integer jenis_kendaraan) {
        setJenis_kendaraan(jenis_kendaraan);
        return this;
    }

    public PerluasanAsuransi tipe_asuransiObject(TipeAsuransi tipe_asuransiObject) {
        setTipe_asuransiObject(tipe_asuransiObject);
        return this;
    }

    public PerluasanAsuransi tipe_asuransi(Integer tipe_asuransi) {
        setTipe_asuransi(tipe_asuransi);
        return this;
    }

    public PerluasanAsuransi jenis_perluasanObject(JenisPerluasan jenis_perluasanObject) {
        setJenis_perluasanObject(jenis_perluasanObject);
        return this;
    }

    public PerluasanAsuransi jenis_perluasan(Integer jenis_perluasan) {
        setJenis_perluasan(jenis_perluasan);
        return this;
    }

    public PerluasanAsuransi startOTR(Integer startOTR) {
        setStartOTR(startOTR);
        return this;
    }

    public PerluasanAsuransi endOTR(Integer endOTR) {
        setEndOTR(endOTR);
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

    public PerluasanAsuransi tenor1(Float tenor1) {
        setTenor1(tenor1);
        return this;
    }

    public PerluasanAsuransi tenor2(Float tenor2) {
        setTenor2(tenor2);
        return this;
    }

    public PerluasanAsuransi tenor3(Float tenor3) {
        setTenor3(tenor3);
        return this;
    }

    public PerluasanAsuransi tenor4(Float tenor4) {
        setTenor4(tenor4);
        return this;
    }

    public PerluasanAsuransi tenor5(Float tenor5) {
        setTenor5(tenor5);
        return this;
    }

    public PerluasanAsuransi tenor6(Float tenor6) {
        setTenor6(tenor6);
        return this;
    }

    public PerluasanAsuransi tenor7(Float tenor7) {
        setTenor7(tenor7);
        return this;
    }

    public PerluasanAsuransi tenor8(Float tenor8) {
        setTenor8(tenor8);
        return this;
    }

    public PerluasanAsuransi tenor9(Float tenor9) {
        setTenor9(tenor9);
        return this;
    }

    public PerluasanAsuransi tenor10(Float tenor10) {
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

    public PerluasanAsuransi createddate(Date createddate) {
        setCreateddate(createddate);
        return this;
    }

    public PerluasanAsuransi statusApproved(Integer statusApproved) {
        setStatusApproved(statusApproved);
        return this;
    }

    public PerluasanAsuransi remarks(String remarks) {
        setRemarks(remarks);
        return this;
    }

    public PerluasanAsuransi is_rejected(Integer is_rejected) {
        setIs_rejected(is_rejected);
        return this;
    }

    public PerluasanAsuransi is_approved(Integer is_approved) {
        setIs_approved(is_approved);
        return this;
    }

    public PerluasanAsuransi createdby(Long createdby) {
        setCreatedby(createdby);
        return this;
    }

    public PerluasanAsuransi updatedby(Long updatedby) {
        setUpdatedby(updatedby);
        return this;
    }

    public PerluasanAsuransi updateddate(Date updateddate) {
        setUpdateddate(updateddate);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nama_skema='" + getNama_skema() + "'" +
            ", wilayahObject='" + getWilayahObject() + "'" +
            ", wilayah='" + getWilayah() + "'" +
            ", jenis_kendaraanObject='" + getJenis_kendaraanObject() + "'" +
            ", jenis_kendaraan='" + getJenis_kendaraan() + "'" +
            ", tipe_asuransiObject='" + getTipe_asuransiObject() + "'" +
            ", tipe_asuransi='" + getTipe_asuransi() + "'" +
            ", jenis_perluasanObject='" + getJenis_perluasanObject() + "'" +
            ", jenis_perluasan='" + getJenis_perluasan() + "'" +
            ", startOTR='" + getStartOTR() + "'" +
            ", endOTR='" + getEndOTR() + "'" +
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
            ", createddate='" + getCreateddate() + "'" +
            ", statusApproved='" + getStatusApproved() + "'" +
            ", remarks='" + getRemarks() + "'" +
            ", is_rejected='" + getIs_rejected() + "'" +
            ", is_approved='" + getIs_approved() + "'" +
            ", createdby='" + getCreatedby() + "'" +
            ", updatedby='" + getUpdatedby() + "'" +
            ", updateddate='" + getUpdateddate() + "'" +
            "}";
    }


    public PerluasanAsuransi submit(Long user) {
        if(this.statusApproved == null || this.statusApproved == 0){
            setIs_approved(0);
            setIs_rejected(0);
            setStatusApproved(1);
            
            trace(user);
        }
        return this;
    }

    public PerluasanAsuransi approve(Long user) {
        if(this.statusApproved == 1) {
            setIs_approved(1);
            setIs_rejected(0);
            setStatusApproved(2);

            trace(user);
        }

        return this;
    }

    public PerluasanAsuransi decline(Long user) {
        if(this.statusApproved == 1) {
            setIs_approved(0);
            setIs_rejected(1);
            setStatusApproved(2);

            trace(user);
        }

        return this;
    }

    public PerluasanAsuransi trace(Long user) {
        if(this.createddate == null) {
            setCreatedby(user);
            setCreateddate(new Date());
        } else {
            setUpdatedby(user);
            setUpdateddate(new Date());
        }
        return this;
    }
}
