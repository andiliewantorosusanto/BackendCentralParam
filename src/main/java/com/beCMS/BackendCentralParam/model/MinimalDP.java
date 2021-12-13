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

    @Column(name = "minimaldp")
    private Float minimalDP;

    @Column(name = "created_at")
    private Date created_at;

    @Column(name = "startberlaku")
    private Date startBerlaku;

    @Column(name = "endberlaku")
    private Date endBerlaku;

    @Column(name = "loantype")
    private Integer loanType;

    @Column(name = "productid")
    private Integer productid;

    @Column(name = "jeniskendaraanid")
    private Integer jeniskendaraanid;

    @Column(name = "kondisikendaraanid")
    private Integer kondisikendaraanid;

    @Column(name = "status")
    private String status;

    @Column(name = "remarks")
    private String remarks;

    @Column(name = "is_rejected")
    private Integer is_rejected;

    @Column(name = "cluster")
    private Integer cluster;

    @Column(name = "tujuan_penggunaan")
    private Integer tujuan_penggunaan;

    @Column(name = "jenis_pembiayaan")
    private Integer jenis_pembiayaan;

    @Column(name = "tahun_kendaraan")
    private Integer tahun_kendaraan;

    @Column(name = "is_login")
    private Integer is_login;

    @Column(name = "statusapproved")
    private String statusApproved;

    @Column(name = "tipe_konsumen")
    private Integer tipe_konsumen;
    
    @Column(name = "createdby")
    private Long createdby;

    @Column(name = "updatedby")
    private Long updatedby;

    @Column(name = "updateddate")
    private Date updateddate;

    @Column(name = "is_approved")
    private Integer is_approved;


    public MinimalDP() {
    }

    public MinimalDP(Integer id, String namaSkema, Float minimalDP, Date created_at, Date startBerlaku, Date endBerlaku, Integer loanType, Integer productid, Integer jeniskendaraanid, Integer kondisikendaraanid, String status, String remarks, Integer is_rejected, Integer cluster, Integer tujuan_penggunaan, Integer jenis_pembiayaan, Integer tahun_kendaraan, Integer is_login, String statusApproved, Integer tipe_konsumen, Long createdby, Long updatedby, Date updateddate, Integer is_approved) {
        this.id = id;
        this.namaSkema = namaSkema;
        this.minimalDP = minimalDP;
        this.created_at = created_at;
        this.startBerlaku = startBerlaku;
        this.endBerlaku = endBerlaku;
        this.loanType = loanType;
        this.productid = productid;
        this.jeniskendaraanid = jeniskendaraanid;
        this.kondisikendaraanid = kondisikendaraanid;
        this.status = status;
        this.remarks = remarks;
        this.is_rejected = is_rejected;
        this.cluster = cluster;
        this.tujuan_penggunaan = tujuan_penggunaan;
        this.jenis_pembiayaan = jenis_pembiayaan;
        this.tahun_kendaraan = tahun_kendaraan;
        this.is_login = is_login;
        this.statusApproved = statusApproved;
        this.tipe_konsumen = tipe_konsumen;
        this.createdby = createdby;
        this.updatedby = updatedby;
        this.updateddate = updateddate;
        this.is_approved = is_approved;
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

    public Float getMinimalDP() {
        return this.minimalDP;
    }

    public void setMinimalDP(Float minimalDP) {
        this.minimalDP = minimalDP;
    }

    public Date getCreated_at() {
        return this.created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
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

    public Integer getLoanType() {
        return this.loanType;
    }

    public void setLoanType(Integer loanType) {
        this.loanType = loanType;
    }

    public Integer getProductid() {
        return this.productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Integer getJeniskendaraanid() {
        return this.jeniskendaraanid;
    }

    public void setJeniskendaraanid(Integer jeniskendaraanid) {
        this.jeniskendaraanid = jeniskendaraanid;
    }

    public Integer getKondisikendaraanid() {
        return this.kondisikendaraanid;
    }

    public void setKondisikendaraanid(Integer kondisikendaraanid) {
        this.kondisikendaraanid = kondisikendaraanid;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public Integer getCluster() {
        return this.cluster;
    }

    public void setCluster(Integer cluster) {
        this.cluster = cluster;
    }

    public Integer getTujuan_penggunaan() {
        return this.tujuan_penggunaan;
    }

    public void setTujuan_penggunaan(Integer tujuan_penggunaan) {
        this.tujuan_penggunaan = tujuan_penggunaan;
    }

    public Integer getJenis_pembiayaan() {
        return this.jenis_pembiayaan;
    }

    public void setJenis_pembiayaan(Integer jenis_pembiayaan) {
        this.jenis_pembiayaan = jenis_pembiayaan;
    }

    public Integer getTahun_kendaraan() {
        return this.tahun_kendaraan;
    }

    public void setTahun_kendaraan(Integer tahun_kendaraan) {
        this.tahun_kendaraan = tahun_kendaraan;
    }

    public Integer getIs_login() {
        return this.is_login;
    }

    public void setIs_login(Integer is_login) {
        this.is_login = is_login;
    }

    public String getStatusApproved() {
        return this.statusApproved;
    }

    public void setStatusApproved(String statusApproved) {
        this.statusApproved = statusApproved;
    }

    public Integer getTipe_konsumen() {
        return this.tipe_konsumen;
    }

    public void setTipe_konsumen(Integer tipe_konsumen) {
        this.tipe_konsumen = tipe_konsumen;
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

    public Integer getIs_approved() {
        return this.is_approved;
    }

    public void setIs_approved(Integer is_approved) {
        this.is_approved = is_approved;
    }

    public MinimalDP id(Integer id) {
        setId(id);
        return this;
    }

    public MinimalDP namaSkema(String namaSkema) {
        setNamaSkema(namaSkema);
        return this;
    }

    public MinimalDP minimalDP(Float minimalDP) {
        setMinimalDP(minimalDP);
        return this;
    }

    public MinimalDP created_at(Date created_at) {
        setCreated_at(created_at);
        return this;
    }

    public MinimalDP startBerlaku(Date startBerlaku) {
        setStartBerlaku(startBerlaku);
        return this;
    }

    public MinimalDP endBerlaku(Date endBerlaku) {
        setEndBerlaku(endBerlaku);
        return this;
    }

    public MinimalDP loanType(Integer loanType) {
        setLoanType(loanType);
        return this;
    }

    public MinimalDP productid(Integer productid) {
        setProductid(productid);
        return this;
    }

    public MinimalDP jeniskendaraanid(Integer jeniskendaraanid) {
        setJeniskendaraanid(jeniskendaraanid);
        return this;
    }

    public MinimalDP kondisikendaraanid(Integer kondisikendaraanid) {
        setKondisikendaraanid(kondisikendaraanid);
        return this;
    }

    public MinimalDP status(String status) {
        setStatus(status);
        return this;
    }

    public MinimalDP remarks(String remarks) {
        setRemarks(remarks);
        return this;
    }

    public MinimalDP is_rejected(Integer is_rejected) {
        setIs_rejected(is_rejected);
        return this;
    }

    public MinimalDP cluster(Integer cluster) {
        setCluster(cluster);
        return this;
    }

    public MinimalDP tujuan_penggunaan(Integer tujuan_penggunaan) {
        setTujuan_penggunaan(tujuan_penggunaan);
        return this;
    }

    public MinimalDP jenis_pembiayaan(Integer jenis_pembiayaan) {
        setJenis_pembiayaan(jenis_pembiayaan);
        return this;
    }

    public MinimalDP tahun_kendaraan(Integer tahun_kendaraan) {
        setTahun_kendaraan(tahun_kendaraan);
        return this;
    }

    public MinimalDP is_login(Integer is_login) {
        setIs_login(is_login);
        return this;
    }

    public MinimalDP statusApproved(String statusApproved) {
        setStatusApproved(statusApproved);
        return this;
    }

    public MinimalDP tipe_konsumen(Integer tipe_konsumen) {
        setTipe_konsumen(tipe_konsumen);
        return this;
    }

    public MinimalDP createdby(Long createdby) {
        setCreatedby(createdby);
        return this;
    }

    public MinimalDP updatedby(Long updatedby) {
        setUpdatedby(updatedby);
        return this;
    }

    public MinimalDP updateddate(Date updateddate) {
        setUpdateddate(updateddate);
        return this;
    }

    public MinimalDP is_approved(Integer is_approved) {
        setIs_approved(is_approved);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", namaSkema='" + getNamaSkema() + "'" +
            ", minimalDP='" + getMinimalDP() + "'" +
            ", created_at='" + getCreated_at() + "'" +
            ", startBerlaku='" + getStartBerlaku() + "'" +
            ", endBerlaku='" + getEndBerlaku() + "'" +
            ", loanType='" + getLoanType() + "'" +
            ", productid='" + getProductid() + "'" +
            ", jeniskendaraanid='" + getJeniskendaraanid() + "'" +
            ", kondisikendaraanid='" + getKondisikendaraanid() + "'" +
            ", status='" + getStatus() + "'" +
            ", remarks='" + getRemarks() + "'" +
            ", is_rejected='" + getIs_rejected() + "'" +
            ", cluster='" + getCluster() + "'" +
            ", tujuan_penggunaan='" + getTujuan_penggunaan() + "'" +
            ", jenis_pembiayaan='" + getJenis_pembiayaan() + "'" +
            ", tahun_kendaraan='" + getTahun_kendaraan() + "'" +
            ", is_login='" + getIs_login() + "'" +
            ", statusApproved='" + getStatusApproved() + "'" +
            ", tipe_konsumen='" + getTipe_konsumen() + "'" +
            ", createdby='" + getCreatedby() + "'" +
            ", updatedby='" + getUpdatedby() + "'" +
            ", updateddate='" + getUpdateddate() + "'" +
            ", is_approved='" + getIs_approved() + "'" +
            "}";
    }

    public MinimalDP submit(Long user) {
        if(this.is_approved == null && this.is_rejected == null){
            setIs_approved(0);
            setIs_rejected(0);
    
            trace(user);
        }
        return this;
    }

    public MinimalDP approve(Long user) {
        if(this.is_approved != null && this.is_rejected != null && this.is_approved == 0 && this.is_rejected == 0) {
            setIs_approved(1);
            trace(user);
        }

        return this;
    }

    public MinimalDP decline(Long user) {
        if(this.is_approved != null && this.is_rejected != null && this.is_approved == 0 && this.is_rejected == 0) {
            setIs_rejected(1);
            trace(user);
        }

        return this;
    }

    public MinimalDP trace(Long user) {
        if(this.created_at == null) {
            setCreatedby(user);
            setCreated_at(new Date());
        } else {
            setUpdatedby(user);
            setUpdateddate(new Date());
        }
        return this;
    }
}
