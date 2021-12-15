package com.beCMS.BackendCentralParam.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
    private String nama_skema;
    
    @Column(name = "loantype")
    private Integer loanType;

    @Column(name = "minimaldp")
    private Float minimalDp;

    @OneToOne()
    @JoinColumn(name = "productid",referencedColumnName = "id",insertable = false,updatable = false)
    private Produk produkObject;
    @Column(name = "productid")
    private Integer produk;

    @OneToOne()
    @JoinColumn(name = "tujuan_penggunaan",referencedColumnName = "id",insertable = false,updatable = false)
    private TujuanPenggunaan tujuan_penggunaanObject;
    @Column(name = "tujuan_penggunaan")
    private Integer tujuan_penggunaan;

    @OneToOne()
    @JoinColumn(name = "tipe_konsumen",referencedColumnName = "id",insertable = false,updatable = false)
    private TipeKonsumen tipe_konsumenObject;
    @Column(name = "tipe_konsumen")
    private Integer tipe_konsumen;

    @OneToOne()
    @JoinColumn(name = "jeniskendaraanid",referencedColumnName = "id",insertable = false,updatable = false)
    private JenisKendaraan jenis_kendaraanObject;
    @Column(name = "jeniskendaraanid")
    private Integer jenis_kendaraan;

    @OneToOne()
    @JoinColumn(name = "jenis_pembiayaan",referencedColumnName = "id",insertable = false,updatable = false)
    private JenisPembiayaan jenis_pembiayaanObject;
    @Column(name = "jenis_pembiayaan")
    private Integer jenis_pembiayaan;

    @OneToOne()
    @JoinColumn(name = "cluster",referencedColumnName = "id",insertable = false,updatable = false)
    private Cluster clusterObject;
    @Column(name = "cluster")
    private Integer cluster;

    @Column(name = "created_at")
    private Date created_at;

    @Column(name = "remarks")
    private String remarks;

    @Column(name = "is_rejected")
    private Integer is_rejected;

    @Column(name = "is_login")
    private Integer is_login;

    @Column(name = "statusapproved")
    private Integer statusApproved;
    
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

    public MinimalDP(Integer id, String nama_skema, Integer loanType, Float minimalDp, Produk produkObject, Integer produk, TujuanPenggunaan tujuan_penggunaanObject, Integer tujuan_penggunaan, TipeKonsumen tipe_konsumenObject, Integer tipe_konsumen, JenisKendaraan jenis_kendaraanObject, Integer jenis_kendaraan, JenisPembiayaan jenis_pembiayaanObject, Integer jenis_pembiayaan, Cluster clusterObject, Integer cluster, Date created_at, String remarks, Integer is_rejected, Integer is_login, Integer statusApproved, Long createdby, Long updatedby, Date updateddate, Integer is_approved) {
        this.id = id;
        this.nama_skema = nama_skema;
        this.loanType = loanType;
        this.minimalDp = minimalDp;
        this.produkObject = produkObject;
        this.produk = produk;
        this.tujuan_penggunaanObject = tujuan_penggunaanObject;
        this.tujuan_penggunaan = tujuan_penggunaan;
        this.tipe_konsumenObject = tipe_konsumenObject;
        this.tipe_konsumen = tipe_konsumen;
        this.jenis_kendaraanObject = jenis_kendaraanObject;
        this.jenis_kendaraan = jenis_kendaraan;
        this.jenis_pembiayaanObject = jenis_pembiayaanObject;
        this.jenis_pembiayaan = jenis_pembiayaan;
        this.clusterObject = clusterObject;
        this.cluster = cluster;
        this.created_at = created_at;
        this.remarks = remarks;
        this.is_rejected = is_rejected;
        this.is_login = is_login;
        this.statusApproved = statusApproved;
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

    public String getNama_skema() {
        return this.nama_skema;
    }

    public void setNama_skema(String nama_skema) {
        this.nama_skema = nama_skema;
    }

    public Integer getLoanType() {
        return this.loanType;
    }

    public void setLoanType(Integer loanType) {
        this.loanType = loanType;
    }

    public Float getMinimalDp() {
        return this.minimalDp;
    }

    public void setMinimalDp(Float minimalDp) {
        this.minimalDp = minimalDp;
    }

    public Produk getProdukObject() {
        return this.produkObject;
    }

    public void setProdukObject(Produk produkObject) {
        this.produkObject = produkObject;
    }

    public Integer getProduk() {
        return this.produk;
    }

    public void setProduk(Integer produk) {
        this.produk = produk;
    }

    public TujuanPenggunaan getTujuan_penggunaanObject() {
        return this.tujuan_penggunaanObject;
    }

    public void setTujuan_penggunaanObject(TujuanPenggunaan tujuan_penggunaanObject) {
        this.tujuan_penggunaanObject = tujuan_penggunaanObject;
    }

    public Integer getTujuan_penggunaan() {
        return this.tujuan_penggunaan;
    }

    public void setTujuan_penggunaan(Integer tujuan_penggunaan) {
        this.tujuan_penggunaan = tujuan_penggunaan;
    }

    public TipeKonsumen getTipe_konsumenObject() {
        return this.tipe_konsumenObject;
    }

    public void setTipe_konsumenObject(TipeKonsumen tipe_konsumenObject) {
        this.tipe_konsumenObject = tipe_konsumenObject;
    }

    public Integer getTipe_konsumen() {
        return this.tipe_konsumen;
    }

    public void setTipe_konsumen(Integer tipe_konsumen) {
        this.tipe_konsumen = tipe_konsumen;
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

    public JenisPembiayaan getJenis_pembiayaanObject() {
        return this.jenis_pembiayaanObject;
    }

    public void setJenis_pembiayaanObject(JenisPembiayaan jenis_pembiayaanObject) {
        this.jenis_pembiayaanObject = jenis_pembiayaanObject;
    }

    public Integer getJenis_pembiayaan() {
        return this.jenis_pembiayaan;
    }

    public void setJenis_pembiayaan(Integer jenis_pembiayaan) {
        this.jenis_pembiayaan = jenis_pembiayaan;
    }

    public Cluster getClusterObject() {
        return this.clusterObject;
    }

    public void setClusterObject(Cluster clusterObject) {
        this.clusterObject = clusterObject;
    }

    public Integer getCluster() {
        return this.cluster;
    }

    public void setCluster(Integer cluster) {
        this.cluster = cluster;
    }

    public Date getCreated_at() {
        return this.created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
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

    public Integer getIs_login() {
        return this.is_login;
    }

    public void setIs_login(Integer is_login) {
        this.is_login = is_login;
    }

    public Integer getStatusApproved() {
        return this.statusApproved;
    }

    public void setStatusApproved(Integer statusApproved) {
        this.statusApproved = statusApproved;
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

    public MinimalDP nama_skema(String nama_skema) {
        setNama_skema(nama_skema);
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

    public MinimalDP produkObject(Produk produkObject) {
        setProdukObject(produkObject);
        return this;
    }

    public MinimalDP produk(Integer produk) {
        setProduk(produk);
        return this;
    }

    public MinimalDP tujuan_penggunaanObject(TujuanPenggunaan tujuan_penggunaanObject) {
        setTujuan_penggunaanObject(tujuan_penggunaanObject);
        return this;
    }

    public MinimalDP tujuan_penggunaan(Integer tujuan_penggunaan) {
        setTujuan_penggunaan(tujuan_penggunaan);
        return this;
    }

    public MinimalDP tipe_konsumenObject(TipeKonsumen tipe_konsumenObject) {
        setTipe_konsumenObject(tipe_konsumenObject);
        return this;
    }

    public MinimalDP tipe_konsumen(Integer tipe_konsumen) {
        setTipe_konsumen(tipe_konsumen);
        return this;
    }

    public MinimalDP jenis_kendaraanObject(JenisKendaraan jenis_kendaraanObject) {
        setJenis_kendaraanObject(jenis_kendaraanObject);
        return this;
    }

    public MinimalDP jenis_kendaraan(Integer jenis_kendaraan) {
        setJenis_kendaraan(jenis_kendaraan);
        return this;
    }

    public MinimalDP jenis_pembiayaanObject(JenisPembiayaan jenis_pembiayaanObject) {
        setJenis_pembiayaanObject(jenis_pembiayaanObject);
        return this;
    }

    public MinimalDP jenis_pembiayaan(Integer jenis_pembiayaan) {
        setJenis_pembiayaan(jenis_pembiayaan);
        return this;
    }

    public MinimalDP clusterObject(Cluster clusterObject) {
        setClusterObject(clusterObject);
        return this;
    }

    public MinimalDP cluster(Integer cluster) {
        setCluster(cluster);
        return this;
    }

    public MinimalDP created_at(Date created_at) {
        setCreated_at(created_at);
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

    public MinimalDP is_login(Integer is_login) {
        setIs_login(is_login);
        return this;
    }

    public MinimalDP statusApproved(Integer statusApproved) {
        setStatusApproved(statusApproved);
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
            ", nama_skema='" + getNama_skema() + "'" +
            ", loanType='" + getLoanType() + "'" +
            ", minimalDp='" + getMinimalDp() + "'" +
            ", produkObject='" + getProdukObject() + "'" +
            ", produk='" + getProduk() + "'" +
            ", tujuan_penggunaanObject='" + getTujuan_penggunaanObject() + "'" +
            ", tujuan_penggunaan='" + getTujuan_penggunaan() + "'" +
            ", tipe_konsumenObject='" + getTipe_konsumenObject() + "'" +
            ", tipe_konsumen='" + getTipe_konsumen() + "'" +
            ", jenis_kendaraanObject='" + getJenis_kendaraanObject() + "'" +
            ", jenis_kendaraan='" + getJenis_kendaraan() + "'" +
            ", jenis_pembiayaanObject='" + getJenis_pembiayaanObject() + "'" +
            ", jenis_pembiayaan='" + getJenis_pembiayaan() + "'" +
            ", clusterObject='" + getClusterObject() + "'" +
            ", cluster='" + getCluster() + "'" +
            ", created_at='" + getCreated_at() + "'" +
            ", remarks='" + getRemarks() + "'" +
            ", is_rejected='" + getIs_rejected() + "'" +
            ", is_login='" + getIs_login() + "'" +
            ", statusApproved='" + getStatusApproved() + "'" +
            ", createdby='" + getCreatedby() + "'" +
            ", updatedby='" + getUpdatedby() + "'" +
            ", updateddate='" + getUpdateddate() + "'" +
            ", is_approved='" + getIs_approved() + "'" +
            "}";
    }


    public MinimalDP submit(Long user) {
        if(this.statusApproved == null || this.statusApproved == 0){
            setIs_approved(0);
            setIs_rejected(0);
            setStatusApproved(1);
            
            trace(user);
        }
        return this;
    }

    public MinimalDP approve(Long user) {
        if(this.statusApproved == 1) {
            setIs_approved(1);
            setIs_rejected(0);
            setStatusApproved(2);

            trace(user);
        }

        return this;
    }

    public MinimalDP decline(Long user) {
        if(this.statusApproved == 1) {
            setIs_approved(0);
            setIs_rejected(1);
            setStatusApproved(2);

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
