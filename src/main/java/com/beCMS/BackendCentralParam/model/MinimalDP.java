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
@Table(name="sp_minimaldp_kkbsk")
public class MinimalDP implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nama_skema")
    private String namaSkema;
    
    @Column(name = "loantype")
    private Integer loanType;

    @Column(name = "minimaldp")
    private Float minimalDp;

    @Column(name = "productid")
    private Integer produk;

    @Column(name = "tujuan_penggunaan")
    private Integer tujuanPenggunaan;

    @Column(name = "tipe_konsumen")
    private Integer tipeKonsumen;

    @Column(name = "jeniskendaraanid")
    private Integer jenisKendaraan;

    @Column(name = "jenis_pembiayaan")
    private Integer jenisPembiayaan;

    @Column(name = "cluster")
    private Integer cluster;

    @Column(name = "created_at")
    private Date createdDate;

    @Column(name = "remarks")
    private String remarks;

    @Column(name = "is_rejected")
    private Integer isRejected;

    @Column(name = "statusapproved")
    private Integer statusApproval;
    
    @Column(name = "createdby")
    private Long createdBy;

    @Column(name = "updatedby")
    private Long updatedBy;

    @Column(name = "updateddate")
    private Date updatedDate;

    @Column(name = "is_approved")
    private Integer isApproved;


    public MinimalDP() {
    }

    public MinimalDP id(Integer id) {
        setId(id);
        return this;
    }

    public MinimalDP namaSkema(String namaSkema) {
        setNamaSkema(namaSkema);
        return this;
    }

    public MinimalDP loanType(Integer loanType) {
        setLoanType(loanType);
        return this;
    }

    public MinimalDP minimalDp(Float minimalDp) {
        setMinimalDp(minimalDp);
        return this;
    }

    public MinimalDP produk(Integer produk) {
        setProduk(produk);
        return this;
    }

    public MinimalDP tujuanPenggunaan(Integer tujuanPenggunaan) {
        setTujuanPenggunaan(tujuanPenggunaan);
        return this;
    }

    public MinimalDP tipeKonsumen(Integer tipeKonsumen) {
        setTipeKonsumen(tipeKonsumen);
        return this;
    }

    public MinimalDP jenisKendaraan(Integer jenisKendaraan) {
        setJenisKendaraan(jenisKendaraan);
        return this;
    }

    public MinimalDP jenisPembiayaan(Integer jenisPembiayaan) {
        setJenisPembiayaan(jenisPembiayaan);
        return this;
    }

    public MinimalDP cluster(Integer cluster) {
        setCluster(cluster);
        return this;
    }

    public MinimalDP createdDate(Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    public MinimalDP remarks(String remarks) {
        setRemarks(remarks);
        return this;
    }

    public MinimalDP isRejected(Integer isRejected) {
        setIsRejected(isRejected);
        return this;
    }

    public MinimalDP statusApproval(Integer statusApproval) {
        setStatusApproval(statusApproval);
        return this;
    }

    public MinimalDP createdBy(Long createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    public MinimalDP updatedBy(Long updatedBy) {
        setUpdatedBy(updatedBy);
        return this;
    }

    public MinimalDP updatedDate(Date updatedDate) {
        setUpdatedDate(updatedDate);
        return this;
    }

    public MinimalDP isApproved(Integer isApproved) {
        setIsApproved(isApproved);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", namaSkema='" + getNamaSkema() + "'" +
            ", loanType='" + getLoanType() + "'" +
            ", minimalDp='" + getMinimalDp() + "'" +
            ", produk='" + getProduk() + "'" +
            ", tujuanPenggunaan='" + getTujuanPenggunaan() + "'" +
            ", tipeKonsumen='" + getTipeKonsumen() + "'" +
            ", jenisKendaraan='" + getJenisKendaraan() + "'" +
            ", jenisPembiayaan='" + getJenisPembiayaan() + "'" +
            ", cluster='" + getCluster() + "'" +
            ", createdDate='" + getCreatedDate() + "'" +
            ", remarks='" + getRemarks() + "'" +
            ", isRejected='" + getIsRejected() + "'" +
            ", statusApproval='" + getStatusApproval() + "'" +
            ", createdBy='" + getCreatedBy() + "'" +
            ", updatedBy='" + getUpdatedBy() + "'" +
            ", updatedDate='" + getUpdatedDate() + "'" +
            ", isApproved='" + getIsApproved() + "'" +
            "}";
    }
    

    public MinimalDP(Integer id, String namaSkema, Integer loanType, Float minimalDp, Integer produk,
            Integer tujuanPenggunaan, Integer tipeKonsumen, Integer jenisKendaraan, Integer jenisPembiayaan,
            Integer cluster, Date createdDate, String remarks, Integer isRejected, Integer statusApproval,
            Long createdBy, Long updatedBy, Date updatedDate, Integer isApproved) {
        this.id = id;
        this.namaSkema = namaSkema;
        this.loanType = loanType;
        this.minimalDp = minimalDp;
        this.produk = produk;
        this.tujuanPenggunaan = tujuanPenggunaan;
        this.tipeKonsumen = tipeKonsumen;
        this.jenisKendaraan = jenisKendaraan;
        this.jenisPembiayaan = jenisPembiayaan;
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



    public Integer getProduk() {
        return produk;
    }



    public void setProduk(Integer produk) {
        this.produk = produk;
    }



    public Integer getTujuanPenggunaan() {
        return tujuanPenggunaan;
    }



    public void setTujuanPenggunaan(Integer tujuanPenggunaan) {
        this.tujuanPenggunaan = tujuanPenggunaan;
    }



    public Integer getTipeKonsumen() {
        return tipeKonsumen;
    }



    public void setTipeKonsumen(Integer tipeKonsumen) {
        this.tipeKonsumen = tipeKonsumen;
    }



    public Integer getJenisKendaraan() {
        return jenisKendaraan;
    }



    public void setJenisKendaraan(Integer jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }



    public Integer getJenisPembiayaan() {
        return jenisPembiayaan;
    }



    public void setJenisPembiayaan(Integer jenisPembiayaan) {
        this.jenisPembiayaan = jenisPembiayaan;
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
