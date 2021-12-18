package com.beCMS.BackendCentralParam.view;

import java.util.Date;

public class vwDataProgram {

    private Integer id;

    private String program;

    private String produkName;
    private Integer produk;

    private String deskripsi;

    private Date startBerlaku;
    private Date endBerlaku;

    private Integer statusApproval;
    private Integer isApproved;
    private Integer isRejected;
    private String remarks;
    private Long createdBy;
    private Date createdDate;
    private Long updatedBy;
    private Date updatedDate;
    
    private String branch;

    private String BiayaAdminName;
    private Integer biayaAdmin;

    private String rateAsuransiName;
    private Integer rateAsuransi;

    private String rateBungaName;
    private Integer rateBunga;

    private String rateCpName;
    private Integer rateCp;

    private String minimalDpName;
    private Integer minmalDp;

    private String komponenPhName;
    private Integer komponenPh;

    private String ratePerluasanName;
    private Integer ratePerluasan;

    private String biayaProvisiName;
    private Integer biayaProvisi;

    private String biayaFidusiaName;
    private Integer biayaFidusia;

    private String usiaKendaraanLunasName;
    private Integer usiaKendaraanLunas;
    
    public vwDataProgram(Integer id, String program, String produkName, Integer produk, String deskripsi,
            Date startBerlaku, Date endBerlaku, Integer statusApproval, Integer isApproved, Integer isRejected,
            String remarks, Long createdBy, Date createdDate, Long updatedBy, Date updatedDate, String branch,
            String biayaAdminName, Integer biayaAdmin, String rateAsuransiName, Integer rateAsuransi,
            String rateBungaName, Integer rateBunga, String rateCpName, Integer rateCp, String minimalDpName,
            Integer minmalDp, String komponenPhName, Integer komponenPh, String ratePerluasanName,
            Integer ratePerluasan, String biayaProvisiName, Integer biayaProvisi, String biayaFidusiaName,
            Integer biayaFidusia, String usiaKendaraanLunasName, Integer usiaKendaraanLunas) {
        this.id = id;
        this.program = program;
        this.produkName = produkName;
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
        BiayaAdminName = biayaAdminName;
        this.biayaAdmin = biayaAdmin;
        this.rateAsuransiName = rateAsuransiName;
        this.rateAsuransi = rateAsuransi;
        this.rateBungaName = rateBungaName;
        this.rateBunga = rateBunga;
        this.rateCpName = rateCpName;
        this.rateCp = rateCp;
        this.minimalDpName = minimalDpName;
        this.minmalDp = minmalDp;
        this.komponenPhName = komponenPhName;
        this.komponenPh = komponenPh;
        this.ratePerluasanName = ratePerluasanName;
        this.ratePerluasan = ratePerluasan;
        this.biayaProvisiName = biayaProvisiName;
        this.biayaProvisi = biayaProvisi;
        this.biayaFidusiaName = biayaFidusiaName;
        this.biayaFidusia = biayaFidusia;
        this.usiaKendaraanLunasName = usiaKendaraanLunasName;
        this.usiaKendaraanLunas = usiaKendaraanLunas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getProdukName() {
        return produkName;
    }

    public void setProdukName(String produkName) {
        this.produkName = produkName;
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

    public Integer getStatusApproval() {
        return statusApproval;
    }

    public void setStatusApproval(Integer statusApproval) {
        this.statusApproval = statusApproval;
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

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getBiayaAdminName() {
        return BiayaAdminName;
    }

    public void setBiayaAdminName(String biayaAdminName) {
        BiayaAdminName = biayaAdminName;
    }

    public Integer getBiayaAdmin() {
        return biayaAdmin;
    }

    public void setBiayaAdmin(Integer biayaAdmin) {
        this.biayaAdmin = biayaAdmin;
    }

    public String getRateAsuransiName() {
        return rateAsuransiName;
    }

    public void setRateAsuransiName(String rateAsuransiName) {
        this.rateAsuransiName = rateAsuransiName;
    }

    public Integer getRateAsuransi() {
        return rateAsuransi;
    }

    public void setRateAsuransi(Integer rateAsuransi) {
        this.rateAsuransi = rateAsuransi;
    }

    public String getRateBungaName() {
        return rateBungaName;
    }

    public void setRateBungaName(String rateBungaName) {
        this.rateBungaName = rateBungaName;
    }

    public Integer getRateBunga() {
        return rateBunga;
    }

    public void setRateBunga(Integer rateBunga) {
        this.rateBunga = rateBunga;
    }

    public String getRateCpName() {
        return rateCpName;
    }

    public void setRateCpName(String rateCpName) {
        this.rateCpName = rateCpName;
    }

    public Integer getRateCp() {
        return rateCp;
    }

    public void setRateCp(Integer rateCp) {
        this.rateCp = rateCp;
    }

    public String getMinimalDpName() {
        return minimalDpName;
    }

    public void setMinimalDpName(String minimalDpName) {
        this.minimalDpName = minimalDpName;
    }

    public Integer getMinmalDp() {
        return minmalDp;
    }

    public void setMinmalDp(Integer minmalDp) {
        this.minmalDp = minmalDp;
    }

    public String getKomponenPhName() {
        return komponenPhName;
    }

    public void setKomponenPhName(String komponenPhName) {
        this.komponenPhName = komponenPhName;
    }

    public Integer getKomponenPh() {
        return komponenPh;
    }

    public void setKomponenPh(Integer komponenPh) {
        this.komponenPh = komponenPh;
    }

    public String getRatePerluasanName() {
        return ratePerluasanName;
    }

    public void setRatePerluasanName(String ratePerluasanName) {
        this.ratePerluasanName = ratePerluasanName;
    }

    public Integer getRatePerluasan() {
        return ratePerluasan;
    }

    public void setRatePerluasan(Integer ratePerluasan) {
        this.ratePerluasan = ratePerluasan;
    }

    public String getBiayaProvisiName() {
        return biayaProvisiName;
    }

    public void setBiayaProvisiName(String biayaProvisiName) {
        this.biayaProvisiName = biayaProvisiName;
    }

    public Integer getBiayaProvisi() {
        return biayaProvisi;
    }

    public void setBiayaProvisi(Integer biayaProvisi) {
        this.biayaProvisi = biayaProvisi;
    }

    public String getBiayaFidusiaName() {
        return biayaFidusiaName;
    }

    public void setBiayaFidusiaName(String biayaFidusiaName) {
        this.biayaFidusiaName = biayaFidusiaName;
    }

    public Integer getBiayaFidusia() {
        return biayaFidusia;
    }

    public void setBiayaFidusia(Integer biayaFidusia) {
        this.biayaFidusia = biayaFidusia;
    }

    public String getUsiaKendaraanLunasName() {
        return usiaKendaraanLunasName;
    }

    public void setUsiaKendaraanLunasName(String usiaKendaraanLunasName) {
        this.usiaKendaraanLunasName = usiaKendaraanLunasName;
    }

    public Integer getUsiaKendaraanLunas() {
        return usiaKendaraanLunas;
    }

    public void setUsiaKendaraanLunas(Integer usiaKendaraanLunas) {
        this.usiaKendaraanLunas = usiaKendaraanLunas;
    }
    
    


}