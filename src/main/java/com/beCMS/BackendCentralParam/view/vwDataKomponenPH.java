package com.beCMS.BackendCentralParam.view;

import java.util.Date;

public class vwDataKomponenPH {

    private Integer id;

    private String namaSkema;

    private Integer idKompPh;

    private String jenis;

    private Integer addm;
    private Integer addb;

    private Date createdDate;

    private Date startBerlaku;
    private Date endBerlaku;

    private String remarks;

    private Integer isRejected;

    private Integer isApproved;

    private String group_id;

    private String kondisiKendaraanName;
    private Integer kondisiKendaraan;

    private String produkName;
    private Integer produk;

    private String tipeKonsumenName;
    private Integer tipeKonsumen;

    private String jenisPembiayaanName;
    private Integer jenisPembiayaan;

    private String jenisKendaraanName;
    private Integer jenisKendaraan;

    private String programName;
    private Integer program;

    private String clusterName;
    private Integer cluster;
    
    private Long createdBy;

    private Long updatedBy;

    private Date updatedDate;

    private Integer statusApproval;

    public vwDataKomponenPH(Integer id, String namaSkema, Integer idKompPh, String jenis, Integer addm, Integer addb,
            Date createdDate, Date startBerlaku, Date endBerlaku, String remarks, Integer isRejected,
            Integer isApproved, String group_id, String kondisiKendaraanName, Integer kondisiKendaraan,
            String produkName, Integer produk, String tipeKonsumenName, Integer tipeKonsumen,
            String jenisPembiayaanName, Integer jenisPembiayaan, String jenisKendaraanName, Integer jenisKendaraan,
            String programName, Integer program, String clusterName, Integer cluster, Long createdBy, Long updatedBy,
            Date updatedDate, Integer statusApproval) {
        this.id = id;
        this.namaSkema = namaSkema;
        this.idKompPh = idKompPh;
        this.jenis = jenis;
        this.addm = addm;
        this.addb = addb;
        this.createdDate = createdDate;
        this.startBerlaku = startBerlaku;
        this.endBerlaku = endBerlaku;
        this.remarks = remarks;
        this.isRejected = isRejected;
        this.isApproved = isApproved;
        this.group_id = group_id;
        this.kondisiKendaraanName = kondisiKendaraanName;
        this.kondisiKendaraan = kondisiKendaraan;
        this.produkName = produkName;
        this.produk = produk;
        this.tipeKonsumenName = tipeKonsumenName;
        this.tipeKonsumen = tipeKonsumen;
        this.jenisPembiayaanName = jenisPembiayaanName;
        this.jenisPembiayaan = jenisPembiayaan;
        this.jenisKendaraanName = jenisKendaraanName;
        this.jenisKendaraan = jenisKendaraan;
        this.programName = programName;
        this.program = program;
        this.clusterName = clusterName;
        this.cluster = cluster;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.updatedDate = updatedDate;
        this.statusApproval = statusApproval;
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

    public Integer getIdKompPh() {
        return idKompPh;
    }

    public void setIdKompPh(Integer idKompPh) {
        this.idKompPh = idKompPh;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public Integer getAddm() {
        return addm;
    }

    public void setAddm(Integer addm) {
        this.addm = addm;
    }

    public Integer getAddb() {
        return addb;
    }

    public void setAddb(Integer addb) {
        this.addb = addb;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
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

    public String getGroup_id() {
        return group_id;
    }

    public void setGroup_id(String group_id) {
        this.group_id = group_id;
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

    public Integer getStatusApproval() {
        return statusApproval;
    }

    public void setStatusApproval(Integer statusApproval) {
        this.statusApproval = statusApproval;
    }

    
}