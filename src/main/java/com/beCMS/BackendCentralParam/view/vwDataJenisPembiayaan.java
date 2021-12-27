package com.beCMS.BackendCentralParam.view;

import java.util.Date;

public class vwDataJenisPembiayaan {
    
    private Integer id;
    private String jenisPembiayaan;
    private Integer isRefinancing;

    private Integer produk;
    private String produkName;

    private Date startBerlaku;
    private Date endBerlaku;

    private Integer statusApproval;
    private String remarks;
    private Integer isRejected;
    private Integer isApproved;
    

    public vwDataJenisPembiayaan() {
    }

    public vwDataJenisPembiayaan(Integer id, String jenisPembiayaan, Integer isRefinancing, Integer produk, String produkName, Date startBerlaku, Date endBerlaku, Integer statusApproval, String remarks, Integer isRejected, Integer isApproved) {
        this.id = id;
        this.jenisPembiayaan = jenisPembiayaan;
        this.isRefinancing = isRefinancing;
        this.produk = produk;
        this.produkName = produkName;
        this.startBerlaku = startBerlaku;
        this.endBerlaku = endBerlaku;
        this.statusApproval = statusApproval;
        this.remarks = remarks;
        this.isRejected = isRejected;
        this.isApproved = isApproved;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJenisPembiayaan() {
        return this.jenisPembiayaan;
    }

    public void setJenisPembiayaan(String jenisPembiayaan) {
        this.jenisPembiayaan = jenisPembiayaan;
    }

    public Integer getIsRefinancing() {
        return this.isRefinancing;
    }

    public void setIsRefinancing(Integer isRefinancing) {
        this.isRefinancing = isRefinancing;
    }

    public Integer getProduk() {
        return this.produk;
    }

    public void setProduk(Integer produk) {
        this.produk = produk;
    }

    public String getProdukName() {
        return this.produkName;
    }

    public void setProdukName(String produkName) {
        this.produkName = produkName;
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

    public vwDataJenisPembiayaan id(Integer id) {
        setId(id);
        return this;
    }

    public vwDataJenisPembiayaan jenisPembiayaan(String jenisPembiayaan) {
        setJenisPembiayaan(jenisPembiayaan);
        return this;
    }

    public vwDataJenisPembiayaan isRefinancing(Integer isRefinancing) {
        setIsRefinancing(isRefinancing);
        return this;
    }

    public vwDataJenisPembiayaan produk(Integer produk) {
        setProduk(produk);
        return this;
    }

    public vwDataJenisPembiayaan produkName(String produkName) {
        setProdukName(produkName);
        return this;
    }

    public vwDataJenisPembiayaan startBerlaku(Date startBerlaku) {
        setStartBerlaku(startBerlaku);
        return this;
    }

    public vwDataJenisPembiayaan endBerlaku(Date endBerlaku) {
        setEndBerlaku(endBerlaku);
        return this;
    }

    public vwDataJenisPembiayaan statusApproval(Integer statusApproval) {
        setStatusApproval(statusApproval);
        return this;
    }

    public vwDataJenisPembiayaan remarks(String remarks) {
        setRemarks(remarks);
        return this;
    }

    public vwDataJenisPembiayaan isRejected(Integer isRejected) {
        setIsRejected(isRejected);
        return this;
    }

    public vwDataJenisPembiayaan isApproved(Integer isApproved) {
        setIsApproved(isApproved);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", jenisPembiayaan='" + getJenisPembiayaan() + "'" +
            ", isRefinancing='" + getIsRefinancing() + "'" +
            ", produk='" + getProduk() + "'" +
            ", produkName='" + getProdukName() + "'" +
            ", startBerlaku='" + getStartBerlaku() + "'" +
            ", endBerlaku='" + getEndBerlaku() + "'" +
            ", statusApproval='" + getStatusApproval() + "'" +
            ", remarks='" + getRemarks() + "'" +
            ", isRejected='" + getIsRejected() + "'" +
            ", isApproved='" + getIsApproved() + "'" +
            "}";
    }
    

    

}