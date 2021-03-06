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
@Table(name = "sp_program")
public class Program implements Serializable {
  
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "program")
    private String program;

    @Column(name = "produk")
    private Integer produk;

    @Column(name = "deskripsi")
    private String deskripsi;

    @Column(name = "start_date")
    private Date startBerlaku;

    @Column(name = "end_date")
    private Date endBerlaku;

    @Column(name = "statusapproval")
    private Integer statusApproval;

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
    
    @Column(name = "branchid")
    private String branch;

    @Column(name = "id_biayaadmin")
    private Integer biayaAdmin;

    @Column(name = "id_rateasuransi")
    private Integer rateAsuransi;

    @Column(name = "id_ratebunga")
    private Integer rateBunga;

    @Column(name = "id_ratecp")
    private Integer rateCp;

    @Column(name = "id_minimaldp")
    private Integer minimalDp;

    @Column(name = "id_komponenph")
    private Integer komponenPh;

    @Column(name = "id_rateperluasan")
    private Integer perluasanAsuransi;

    @Column(name = "id_biayaprovisi")
    private Integer biayaProvisi;

    @Column(name = "id_biayafidusia")
    private Integer biayaFidusia;

    @Column(name = "id_usiakendaraanlunas")
    private Integer usiaKendaraanLunas;


    public Program() {
    }

    public Program(Integer id, String program, Integer produk, String deskripsi, Date startBerlaku, Date endBerlaku, Integer statusApproval, Integer isApproved, Integer isRejected, String remarks, Long createdBy, Date createdDate, Long updatedBy, Date updatedDate, String branch, Integer biayaAdmin, Integer rateAsuransi, Integer rateBunga, Integer rateCp, Integer minimalDp, Integer komponenPh, Integer perluasanAsuransi, Integer biayaProvisi, Integer biayaFidusia, Integer usiaKendaraanLunas) {
        this.id = id;
        this.program = program;
        this.produk = produk;
        this.deskripsi = deskripsi;
        this.startBerlaku = startBerlaku;
        this.endBerlaku = endBerlaku;
        this.statusApproval = statusApproval;
        this.isApproved = isApproved;
        this.isRejected = isRejected;
        this.remarks = remarks;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.updatedBy = updatedBy;
        this.updatedDate = updatedDate;
        this.branch = branch;
        this.biayaAdmin = biayaAdmin;
        this.rateAsuransi = rateAsuransi;
        this.rateBunga = rateBunga;
        this.rateCp = rateCp;
        this.minimalDp = minimalDp;
        this.komponenPh = komponenPh;
        this.perluasanAsuransi = perluasanAsuransi;
        this.biayaProvisi = biayaProvisi;
        this.biayaFidusia = biayaFidusia;
        this.usiaKendaraanLunas = usiaKendaraanLunas;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProgram() {
        return this.program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public Integer getProduk() {
        return this.produk;
    }

    public void setProduk(Integer produk) {
        this.produk = produk;
    }

    public String getDeskripsi() {
        return this.deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
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

    public Integer getStatusApproval() {
        return this.statusApproval;
    }

    public void setStatusApproval(Integer statusApproval) {
        this.statusApproval = statusApproval;
    }

    public Integer getIsApproved() {
        return this.isApproved;
    }

    public void setIsApproved(Integer isApproved) {
        this.isApproved = isApproved;
    }

    public Integer getIsRejected() {
        return this.isRejected;
    }

    public void setIsRejected(Integer isRejected) {
        this.isRejected = isRejected;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Long getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
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

    public String getBranch() {
        return this.branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public Integer getBiayaAdmin() {
        return this.biayaAdmin;
    }

    public void setBiayaAdmin(Integer biayaAdmin) {
        this.biayaAdmin = biayaAdmin;
    }

    public Integer getRateAsuransi() {
        return this.rateAsuransi;
    }

    public void setRateAsuransi(Integer rateAsuransi) {
        this.rateAsuransi = rateAsuransi;
    }

    public Integer getRateBunga() {
        return this.rateBunga;
    }

    public void setRateBunga(Integer rateBunga) {
        this.rateBunga = rateBunga;
    }

    public Integer getRateCp() {
        return this.rateCp;
    }

    public void setRateCp(Integer rateCp) {
        this.rateCp = rateCp;
    }

    public Integer getMinimalDp() {
        return this.minimalDp;
    }

    public void setMinimalDp(Integer minimalDp) {
        this.minimalDp = minimalDp;
    }

    public Integer getKomponenPh() {
        return this.komponenPh;
    }

    public void setKomponenPh(Integer komponenPh) {
        this.komponenPh = komponenPh;
    }

    public Integer getPerluasanAsuransi() {
        return this.perluasanAsuransi;
    }

    public void setPerluasanAsuransi(Integer perluasanAsuransi) {
        this.perluasanAsuransi = perluasanAsuransi;
    }

    public Integer getBiayaProvisi() {
        return this.biayaProvisi;
    }

    public void setBiayaProvisi(Integer biayaProvisi) {
        this.biayaProvisi = biayaProvisi;
    }

    public Integer getBiayaFidusia() {
        return this.biayaFidusia;
    }

    public void setBiayaFidusia(Integer biayaFidusia) {
        this.biayaFidusia = biayaFidusia;
    }

    public Integer getUsiaKendaraanLunas() {
        return this.usiaKendaraanLunas;
    }

    public void setUsiaKendaraanLunas(Integer usiaKendaraanLunas) {
        this.usiaKendaraanLunas = usiaKendaraanLunas;
    }

    public Program id(Integer id) {
        setId(id);
        return this;
    }

    public Program program(String program) {
        setProgram(program);
        return this;
    }

    public Program produk(Integer produk) {
        setProduk(produk);
        return this;
    }

    public Program deskripsi(String deskripsi) {
        setDeskripsi(deskripsi);
        return this;
    }

    public Program startBerlaku(Date startBerlaku) {
        setStartBerlaku(startBerlaku);
        return this;
    }

    public Program endBerlaku(Date endBerlaku) {
        setEndBerlaku(endBerlaku);
        return this;
    }

    public Program statusApproval(Integer statusApproval) {
        setStatusApproval(statusApproval);
        return this;
    }

    public Program isApproved(Integer isApproved) {
        setIsApproved(isApproved);
        return this;
    }

    public Program isRejected(Integer isRejected) {
        setIsRejected(isRejected);
        return this;
    }

    public Program remarks(String remarks) {
        setRemarks(remarks);
        return this;
    }

    public Program createdBy(Long createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    public Program createdDate(Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    public Program updatedBy(Long updatedBy) {
        setUpdatedBy(updatedBy);
        return this;
    }

    public Program updatedDate(Date updatedDate) {
        setUpdatedDate(updatedDate);
        return this;
    }

    public Program branch(String branch) {
        setBranch(branch);
        return this;
    }

    public Program biayaAdmin(Integer biayaAdmin) {
        setBiayaAdmin(biayaAdmin);
        return this;
    }

    public Program rateAsuransi(Integer rateAsuransi) {
        setRateAsuransi(rateAsuransi);
        return this;
    }

    public Program rateBunga(Integer rateBunga) {
        setRateBunga(rateBunga);
        return this;
    }

    public Program rateCp(Integer rateCp) {
        setRateCp(rateCp);
        return this;
    }

    public Program minimalDp(Integer minimalDp) {
        setMinimalDp(minimalDp);
        return this;
    }

    public Program komponenPh(Integer komponenPh) {
        setKomponenPh(komponenPh);
        return this;
    }

    public Program perluasanAsuransi(Integer perluasanAsuransi) {
        setPerluasanAsuransi(perluasanAsuransi);
        return this;
    }

    public Program biayaProvisi(Integer biayaProvisi) {
        setBiayaProvisi(biayaProvisi);
        return this;
    }

    public Program biayaFidusia(Integer biayaFidusia) {
        setBiayaFidusia(biayaFidusia);
        return this;
    }

    public Program usiaKendaraanLunas(Integer usiaKendaraanLunas) {
        setUsiaKendaraanLunas(usiaKendaraanLunas);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", program='" + getProgram() + "'" +
            ", produk='" + getProduk() + "'" +
            ", deskripsi='" + getDeskripsi() + "'" +
            ", startBerlaku='" + getStartBerlaku() + "'" +
            ", endBerlaku='" + getEndBerlaku() + "'" +
            ", statusApproval='" + getStatusApproval() + "'" +
            ", isApproved='" + getIsApproved() + "'" +
            ", isRejected='" + getIsRejected() + "'" +
            ", remarks='" + getRemarks() + "'" +
            ", createdBy='" + getCreatedBy() + "'" +
            ", createdDate='" + getCreatedDate() + "'" +
            ", updatedBy='" + getUpdatedBy() + "'" +
            ", updatedDate='" + getUpdatedDate() + "'" +
            ", branch='" + getBranch() + "'" +
            ", biayaAdmin='" + getBiayaAdmin() + "'" +
            ", rateAsuransi='" + getRateAsuransi() + "'" +
            ", rateBunga='" + getRateBunga() + "'" +
            ", rateCp='" + getRateCp() + "'" +
            ", minimalDp='" + getMinimalDp() + "'" +
            ", komponenPh='" + getKomponenPh() + "'" +
            ", perluasanAsuransi='" + getPerluasanAsuransi() + "'" +
            ", biayaProvisi='" + getBiayaProvisi() + "'" +
            ", biayaFidusia='" + getBiayaFidusia() + "'" +
            ", usiaKendaraanLunas='" + getUsiaKendaraanLunas() + "'" +
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
