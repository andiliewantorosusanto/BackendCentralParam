package com.beCMS.BackendCentralParam.view;

import java.util.Date;

public class vwDataRateBunga {

    private Integer id;
    private String namaSkema;
    private Integer loanType;

    private String produkName;
    private Integer produk;

    private String jenisKendaraanName;
    private Integer jenisKendaraan;

    private String kondisiKendaraanName;
    private Integer kondisiKendaraan;

    private String startTahunKendaraanName;
    private Integer startTahunKendaraan;

    private Integer endTahun;

    private Date startBerlaku;

    private Date endBerlaku;

    private Float tenor1;
    private Float tenor2;
    private Float tenor3;
    private Float tenor4;
    private Integer tenor5Periode1;
    private Integer tenor5Periode2;
    private Float tenor5Rate1;
    private Float tenor5Rate2;
    private Integer tenor6Periode1;
    private Integer tenor6Periode2;
    private Float tenor6Rate1;
    private Float tenor6Rate2;
    private Integer tenor7Periode1;
    private Integer tenor7Periode2;
    private Float tenor7Rate1;
    private Float tenor7Rate2;
    private Integer tenor8Periode1;
    private Integer tenor8Periode2;
    private Float tenor8Rate1;
    private Float tenor8Rate2;
    private Integer tenor9Periode1;
    private Integer tenor9Periode2;
    private Float tenor9Rate1;
    private Float tenor9Rate2;
    private Integer tenor10Periode1;
    private Integer tenor10Periode2;
    private Float tenor10Rate1;
    private Float tenor10Rate2;

    private String operatorAwal;
    private String operatorAkhir;

    private Integer statusApproval;

    private String remarks;
    private Integer isRejected;
    private Integer isApproved;

    private String jenisPembiayaanName;
    private Integer jenisPembiayaan;

    private String tujuanPenggunaanName;
    private Integer tujuanPenggunaan;

    private String clusterName;
    private Integer cluster;

    private String programName;
    private Integer program;
    

    private Date createdDate;
    private Date updatedDate;
    private Long updatedBy;
    private Long createdBy;

    private String tipeKonsumenName;
    private Integer tipeKonsumen;
    
    public vwDataRateBunga(Integer id, String namaSkema, Integer loanType, String produkName, Integer produk,
            String jenisKendaraanName, Integer jenisKendaraan, String kondisiKendaraanName, Integer kondisiKendaraan,
            String startTahunKendaraanName, Integer startTahunKendaraan, Integer endTahun, Date startBerlaku,
            Date endBerlaku, Float tenor1, Float tenor2, Float tenor3, Float tenor4, Integer tenor5Periode1,
            Integer tenor5Periode2, Float tenor5Rate1, Float tenor5Rate2, Integer tenor6Periode1,
            Integer tenor6Periode2, Float tenor6Rate1, Float tenor6Rate2, Integer tenor7Periode1,
            Integer tenor7Periode2, Float tenor7Rate1, Float tenor7Rate2, Integer tenor8Periode1,
            Integer tenor8Periode2, Float tenor8Rate1, Float tenor8Rate2, Integer tenor9Periode1,
            Integer tenor9Periode2, Float tenor9Rate1, Float tenor9Rate2, Integer tenor10Periode1,
            Integer tenor10Periode2, Float tenor10Rate1, Float tenor10Rate2, String operatorAwal, String operatorAkhir,
            Integer statusApproval, String remarks, Integer isRejected, Integer isApproved, String jenisPembiayaanName,
            Integer jenisPembiayaan, String tujuanPenggunaanName, Integer tujuanPenggunaan, String clusterName,
            Integer cluster, String programName, Integer program, Date createdDate, Date updatedDate, Long updatedBy,
            Long createdBy, String tipeKonsumenName, Integer tipeKonsumen) {
        this.id = id;
        this.namaSkema = namaSkema;
        this.loanType = loanType;
        this.produkName = produkName;
        this.produk = produk;
        this.jenisKendaraanName = jenisKendaraanName;
        this.jenisKendaraan = jenisKendaraan;
        this.kondisiKendaraanName = kondisiKendaraanName;
        this.kondisiKendaraan = kondisiKendaraan;
        this.startTahunKendaraanName = startTahunKendaraanName;
        this.startTahunKendaraan = startTahunKendaraan;
        this.endTahun = endTahun;
        this.startBerlaku = startBerlaku;
        this.endBerlaku = endBerlaku;
        this.tenor1 = tenor1;
        this.tenor2 = tenor2;
        this.tenor3 = tenor3;
        this.tenor4 = tenor4;
        this.tenor5Periode1 = tenor5Periode1;
        this.tenor5Periode2 = tenor5Periode2;
        this.tenor5Rate1 = tenor5Rate1;
        this.tenor5Rate2 = tenor5Rate2;
        this.tenor6Periode1 = tenor6Periode1;
        this.tenor6Periode2 = tenor6Periode2;
        this.tenor6Rate1 = tenor6Rate1;
        this.tenor6Rate2 = tenor6Rate2;
        this.tenor7Periode1 = tenor7Periode1;
        this.tenor7Periode2 = tenor7Periode2;
        this.tenor7Rate1 = tenor7Rate1;
        this.tenor7Rate2 = tenor7Rate2;
        this.tenor8Periode1 = tenor8Periode1;
        this.tenor8Periode2 = tenor8Periode2;
        this.tenor8Rate1 = tenor8Rate1;
        this.tenor8Rate2 = tenor8Rate2;
        this.tenor9Periode1 = tenor9Periode1;
        this.tenor9Periode2 = tenor9Periode2;
        this.tenor9Rate1 = tenor9Rate1;
        this.tenor9Rate2 = tenor9Rate2;
        this.tenor10Periode1 = tenor10Periode1;
        this.tenor10Periode2 = tenor10Periode2;
        this.tenor10Rate1 = tenor10Rate1;
        this.tenor10Rate2 = tenor10Rate2;
        this.operatorAwal = operatorAwal;
        this.operatorAkhir = operatorAkhir;
        this.statusApproval = statusApproval;
        this.remarks = remarks;
        this.isRejected = isRejected;
        this.isApproved = isApproved;
        this.jenisPembiayaanName = jenisPembiayaanName;
        this.jenisPembiayaan = jenisPembiayaan;
        this.tujuanPenggunaanName = tujuanPenggunaanName;
        this.tujuanPenggunaan = tujuanPenggunaan;
        this.clusterName = clusterName;
        this.cluster = cluster;
        this.programName = programName;
        this.program = program;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
        this.updatedBy = updatedBy;
        this.createdBy = createdBy;
        this.tipeKonsumenName = tipeKonsumenName;
        this.tipeKonsumen = tipeKonsumen;
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

    public String getKondisiKendaraanName() {
        return kondisiKendaraanName;
    }

    public void setKondisiKendaraanName(String kondisiKendaraanName) {
        this.kondisiKendaraanName = kondisiKendaraanName;
    }

    public Integer getKondisiKendaraan() {
        return kondisiKendaraan;
    }

    public void setKondisiKendaraan(Integer kondisiKendaraan) {
        this.kondisiKendaraan = kondisiKendaraan;
    }

    public String getStartTahunKendaraanName() {
        return startTahunKendaraanName;
    }

    public void setStartTahunKendaraanName(String startTahunKendaraanName) {
        this.startTahunKendaraanName = startTahunKendaraanName;
    }

    public Integer getStartTahunKendaraan() {
        return startTahunKendaraan;
    }

    public void setStartTahunKendaraan(Integer startTahunKendaraan) {
        this.startTahunKendaraan = startTahunKendaraan;
    }

    public Integer getEndTahun() {
        return endTahun;
    }

    public void setEndTahun(Integer endTahun) {
        this.endTahun = endTahun;
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

    public Integer getTenor5Periode1() {
        return tenor5Periode1;
    }

    public void setTenor5Periode1(Integer tenor5Periode1) {
        this.tenor5Periode1 = tenor5Periode1;
    }

    public Integer getTenor5Periode2() {
        return tenor5Periode2;
    }

    public void setTenor5Periode2(Integer tenor5Periode2) {
        this.tenor5Periode2 = tenor5Periode2;
    }

    public Float getTenor5Rate1() {
        return tenor5Rate1;
    }

    public void setTenor5Rate1(Float tenor5Rate1) {
        this.tenor5Rate1 = tenor5Rate1;
    }

    public Float getTenor5Rate2() {
        return tenor5Rate2;
    }

    public void setTenor5Rate2(Float tenor5Rate2) {
        this.tenor5Rate2 = tenor5Rate2;
    }

    public Integer getTenor6Periode1() {
        return tenor6Periode1;
    }

    public void setTenor6Periode1(Integer tenor6Periode1) {
        this.tenor6Periode1 = tenor6Periode1;
    }

    public Integer getTenor6Periode2() {
        return tenor6Periode2;
    }

    public void setTenor6Periode2(Integer tenor6Periode2) {
        this.tenor6Periode2 = tenor6Periode2;
    }

    public Float getTenor6Rate1() {
        return tenor6Rate1;
    }

    public void setTenor6Rate1(Float tenor6Rate1) {
        this.tenor6Rate1 = tenor6Rate1;
    }

    public Float getTenor6Rate2() {
        return tenor6Rate2;
    }

    public void setTenor6Rate2(Float tenor6Rate2) {
        this.tenor6Rate2 = tenor6Rate2;
    }

    public Integer getTenor7Periode1() {
        return tenor7Periode1;
    }

    public void setTenor7Periode1(Integer tenor7Periode1) {
        this.tenor7Periode1 = tenor7Periode1;
    }

    public Integer getTenor7Periode2() {
        return tenor7Periode2;
    }

    public void setTenor7Periode2(Integer tenor7Periode2) {
        this.tenor7Periode2 = tenor7Periode2;
    }

    public Float getTenor7Rate1() {
        return tenor7Rate1;
    }

    public void setTenor7Rate1(Float tenor7Rate1) {
        this.tenor7Rate1 = tenor7Rate1;
    }

    public Float getTenor7Rate2() {
        return tenor7Rate2;
    }

    public void setTenor7Rate2(Float tenor7Rate2) {
        this.tenor7Rate2 = tenor7Rate2;
    }

    public Integer getTenor8Periode1() {
        return tenor8Periode1;
    }

    public void setTenor8Periode1(Integer tenor8Periode1) {
        this.tenor8Periode1 = tenor8Periode1;
    }

    public Integer getTenor8Periode2() {
        return tenor8Periode2;
    }

    public void setTenor8Periode2(Integer tenor8Periode2) {
        this.tenor8Periode2 = tenor8Periode2;
    }

    public Float getTenor8Rate1() {
        return tenor8Rate1;
    }

    public void setTenor8Rate1(Float tenor8Rate1) {
        this.tenor8Rate1 = tenor8Rate1;
    }

    public Float getTenor8Rate2() {
        return tenor8Rate2;
    }

    public void setTenor8Rate2(Float tenor8Rate2) {
        this.tenor8Rate2 = tenor8Rate2;
    }

    public Integer getTenor9Periode1() {
        return tenor9Periode1;
    }

    public void setTenor9Periode1(Integer tenor9Periode1) {
        this.tenor9Periode1 = tenor9Periode1;
    }

    public Integer getTenor9Periode2() {
        return tenor9Periode2;
    }

    public void setTenor9Periode2(Integer tenor9Periode2) {
        this.tenor9Periode2 = tenor9Periode2;
    }

    public Float getTenor9Rate1() {
        return tenor9Rate1;
    }

    public void setTenor9Rate1(Float tenor9Rate1) {
        this.tenor9Rate1 = tenor9Rate1;
    }

    public Float getTenor9Rate2() {
        return tenor9Rate2;
    }

    public void setTenor9Rate2(Float tenor9Rate2) {
        this.tenor9Rate2 = tenor9Rate2;
    }

    public Integer getTenor10Periode1() {
        return tenor10Periode1;
    }

    public void setTenor10Periode1(Integer tenor10Periode1) {
        this.tenor10Periode1 = tenor10Periode1;
    }

    public Integer getTenor10Periode2() {
        return tenor10Periode2;
    }

    public void setTenor10Periode2(Integer tenor10Periode2) {
        this.tenor10Periode2 = tenor10Periode2;
    }

    public Float getTenor10Rate1() {
        return tenor10Rate1;
    }

    public void setTenor10Rate1(Float tenor10Rate1) {
        this.tenor10Rate1 = tenor10Rate1;
    }

    public Float getTenor10Rate2() {
        return tenor10Rate2;
    }

    public void setTenor10Rate2(Float tenor10Rate2) {
        this.tenor10Rate2 = tenor10Rate2;
    }

    public String getOperatorAwal() {
        return operatorAwal;
    }

    public void setOperatorAwal(String operatorAwal) {
        this.operatorAwal = operatorAwal;
    }

    public String getOperatorAkhir() {
        return operatorAkhir;
    }

    public void setOperatorAkhir(String operatorAkhir) {
        this.operatorAkhir = operatorAkhir;
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

    public String getTujuanPenggunaanName() {
        return tujuanPenggunaanName;
    }

    public void setTujuanPenggunaanName(String tujuanPenggunaanName) {
        this.tujuanPenggunaanName = tujuanPenggunaanName;
    }

    public Integer getTujuanPenggunaan() {
        return tujuanPenggunaan;
    }

    public void setTujuanPenggunaan(Integer tujuanPenggunaan) {
        this.tujuanPenggunaan = tujuanPenggunaan;
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

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public Integer getProgram() {
        return program;
    }

    public void setProgram(Integer program) {
        this.program = program;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public Long getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
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

    
    

}