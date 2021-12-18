
package com.beCMS.BackendCentralParam.view;

import java.util.Date;

public class vwDataMinimalDP {

    private Integer id;

    private String namaSkema;
    private Integer loanType;

    private Float minimalDp;

    private String produkName;
    private Integer produk;

    private String tujuanpenggunaanName;
    private Integer tujuanPenggunaan;

    private String tipeKonsumenName;
    private Integer tipeKonsumen;

    private String jenisKendaraanName;
    private Integer jenisKendaraan;

    private String jenisPembiayaanName;
    private Integer jenisPembiayaan;

    private String clusterName;
    private Integer cluster;

    private Date createdDate;

    private String remarks;

    private Integer isRejected;

    private Integer statusApproval;
    
    private Long createdBy;

    private Long updatedBy;

    private Date updatedDate;

    private Integer isApproved;

    public vwDataMinimalDP(Integer id, String namaSkema, Integer loanType, Float minimalDp, String produkName,
            Integer produk, String tujuanpenggunaanName, Integer tujuanPenggunaan, String tipeKonsumenName,
            Integer tipeKonsumen, String jenisKendaraanName, Integer jenisKendaraan, String jenisPembiayaanName,
            Integer jenisPembiayaan, String clusterName, Integer cluster, Date createdDate, String remarks,
            Integer isRejected, Integer statusApproval, Long createdBy, Long updatedBy, Date updatedDate,
            Integer isApproved) {
        this.id = id;
        this.namaSkema = namaSkema;
        this.loanType = loanType;
        this.minimalDp = minimalDp;
        this.produkName = produkName;
        this.produk = produk;
        this.tujuanpenggunaanName = tujuanpenggunaanName;
        this.tujuanPenggunaan = tujuanPenggunaan;
        this.tipeKonsumenName = tipeKonsumenName;
        this.tipeKonsumen = tipeKonsumen;
        this.jenisKendaraanName = jenisKendaraanName;
        this.jenisKendaraan = jenisKendaraan;
        this.jenisPembiayaanName = jenisPembiayaanName;
        this.jenisPembiayaan = jenisPembiayaan;
        this.clusterName = clusterName;
        this.cluster = cluster;
        this.createdDate = createdDate;
        this.remarks = remarks;
        this.isRejected = isRejected;
        this.statusApproval = statusApproval;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.updatedDate = updatedDate;
        this.isApproved = isApproved;
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

    public Integer getLoanType() {
        return loanType;
    }

    public void setLoanType(Integer loanType) {
        this.loanType = loanType;
    }

    public Float getMinimalDp() {
        return minimalDp;
    }

    public void setMinimalDp(Float minimalDp) {
        this.minimalDp = minimalDp;
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

    public String getTujuanpenggunaanName() {
        return tujuanpenggunaanName;
    }

    public void setTujuanpenggunaanName(String tujuanpenggunaanName) {
        this.tujuanpenggunaanName = tujuanpenggunaanName;
    }

    public Integer getTujuanPenggunaan() {
        return tujuanPenggunaan;
    }

    public void setTujuanPenggunaan(Integer tujuanPenggunaan) {
        this.tujuanPenggunaan = tujuanPenggunaan;
    }

    public String getTipeKonsumenName() {
        return tipeKonsumenName;
    }

    public void setTipeKonsumenName(String tipeKonsumenName) {
        this.tipeKonsumenName = tipeKonsumenName;
    }

    public Integer getTipeKonsumen() {
        return tipeKonsumen;
    }

    public void setTipeKonsumen(Integer tipeKonsumen) {
        this.tipeKonsumen = tipeKonsumen;
    }

    public String getJenisKendaraanName() {
        return jenisKendaraanName;
    }

    public void setJenisKendaraanName(String jenisKendaraanName) {
        this.jenisKendaraanName = jenisKendaraanName;
    }

    public Integer getJenisKendaraan() {
        return jenisKendaraan;
    }

    public void setJenisKendaraan(Integer jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }

    public String getJenisPembiayaanName() {
        return jenisPembiayaanName;
    }

    public void setJenisPembiayaanName(String jenisPembiayaanName) {
        this.jenisPembiayaanName = jenisPembiayaanName;
    }

    public Integer getJenisPembiayaan() {
        return jenisPembiayaan;
    }

    public void setJenisPembiayaan(Integer jenisPembiayaan) {
        this.jenisPembiayaan = jenisPembiayaan;
    }

    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public Integer getCluster() {
        return cluster;
    }

    public void setCluster(Integer cluster) {
        this.cluster = cluster;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
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

    public Integer getStatusApproval() {
        return statusApproval;
    }

    public void setStatusApproval(Integer statusApproval) {
        this.statusApproval = statusApproval;
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

    public Integer getIsApproved() {
        return isApproved;
    }

    public void setIsApproved(Integer isApproved) {
        this.isApproved = isApproved;
    }
    
    

}