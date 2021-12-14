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
@Table(name="sp_komponenph_kkbsk")
public class KomponenPH implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "nama_skema")
    private String namaSkema;

    @Column(name = "idkompph")
    private Integer idKompPH;

    @Column(name = "jenis")
    private String jenis;

    @Column(name = "addm")
    private Integer addm;

    @Column(name = "addb")
    private Integer addb;

    @Column(name = "created_at")
    private Date created_at;

    @Column(name = "startberlaku")
    private Date startBerlaku;

    @Column(name = "endberlaku")
    private Date endBerlaku;

    @Column(name = "Remarks")
    private String Remarks;

    @Column(name = "is_rejected")
    private Integer is_rejected;

    @Column(name = "is_approved")
    private Integer is_approved;

    @Column(name = "group_id")
    private String group_id;

    @Column(name = "kondisi_kendaraan")
    private String kondisi_kendaraan;

    @Column(name = "produk")
    private String produk;

    @Column(name = "status")
    private String status;

    @Column(name = "tipe_konsumen")
    private Integer tipe_konsumen;

    @Column(name = "jenis_pembiayaan")
    private Integer jenis_pembiayaan;

    @Column(name = "jenis_kendaraan")
    private Integer jenis_kendaraan;

    @Column(name = "program")
    private Integer program;

    @Column(name = "cluster")
    private Integer cluster;

    @Column(name = "is_login")
    private Integer is_login;
    
    @Column(name = "createdby")
    private Long createdby;

    @Column(name = "updatedby")
    private Long updatedby;

    @Column(name = "updateddate")
    private Date updateddate;

    @Column(name = "statusapproval")
    private Integer statusApproval;


    public KomponenPH() {
    }

    public KomponenPH(Integer id, String namaSkema, Integer idKompPH, String jenis, Integer addm, Integer addb, Date created_at, Date startBerlaku, Date endBerlaku, String Remarks, Integer is_rejected, Integer is_approved, String group_id, String kondisi_kendaraan, String produk, String status, Integer tipe_konsumen, Integer jenis_pembiayaan, Integer jenis_kendaraan, Integer program, Integer cluster, Integer is_login, Long createdby, Long updatedby, Date updateddate, Integer statusApproval) {
        this.id = id;
        this.namaSkema = namaSkema;
        this.idKompPH = idKompPH;
        this.jenis = jenis;
        this.addm = addm;
        this.addb = addb;
        this.created_at = created_at;
        this.startBerlaku = startBerlaku;
        this.endBerlaku = endBerlaku;
        this.Remarks = Remarks;
        this.is_rejected = is_rejected;
        this.is_approved = is_approved;
        this.group_id = group_id;
        this.kondisi_kendaraan = kondisi_kendaraan;
        this.produk = produk;
        this.status = status;
        this.tipe_konsumen = tipe_konsumen;
        this.jenis_pembiayaan = jenis_pembiayaan;
        this.jenis_kendaraan = jenis_kendaraan;
        this.program = program;
        this.cluster = cluster;
        this.is_login = is_login;
        this.createdby = createdby;
        this.updatedby = updatedby;
        this.updateddate = updateddate;
        this.statusApproval = statusApproval;
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

    public Integer getIdKompPH() {
        return this.idKompPH;
    }

    public void setIdKompPH(Integer idKompPH) {
        this.idKompPH = idKompPH;
    }

    public String getJenis() {
        return this.jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public Integer getAddm() {
        return this.addm;
    }

    public void setAddm(Integer addm) {
        this.addm = addm;
    }

    public Integer getAddb() {
        return this.addb;
    }

    public void setAddb(Integer addb) {
        this.addb = addb;
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

    public String getRemarks() {
        return this.Remarks;
    }

    public void setRemarks(String Remarks) {
        this.Remarks = Remarks;
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

    public String getGroup_id() {
        return this.group_id;
    }

    public void setGroup_id(String group_id) {
        this.group_id = group_id;
    }

    public String getKondisi_kendaraan() {
        return this.kondisi_kendaraan;
    }

    public void setKondisi_kendaraan(String kondisi_kendaraan) {
        this.kondisi_kendaraan = kondisi_kendaraan;
    }

    public String getProduk() {
        return this.produk;
    }

    public void setProduk(String produk) {
        this.produk = produk;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getTipe_konsumen() {
        return this.tipe_konsumen;
    }

    public void setTipe_konsumen(Integer tipe_konsumen) {
        this.tipe_konsumen = tipe_konsumen;
    }

    public Integer getJenis_pembiayaan() {
        return this.jenis_pembiayaan;
    }

    public void setJenis_pembiayaan(Integer jenis_pembiayaan) {
        this.jenis_pembiayaan = jenis_pembiayaan;
    }

    public Integer getJenis_kendaraan() {
        return this.jenis_kendaraan;
    }

    public void setJenis_kendaraan(Integer jenis_kendaraan) {
        this.jenis_kendaraan = jenis_kendaraan;
    }

    public Integer getProgram() {
        return this.program;
    }

    public void setProgram(Integer program) {
        this.program = program;
    }

    public Integer getCluster() {
        return this.cluster;
    }

    public void setCluster(Integer cluster) {
        this.cluster = cluster;
    }

    public Integer getIs_login() {
        return this.is_login;
    }

    public void setIs_login(Integer is_login) {
        this.is_login = is_login;
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

    public Integer getStatusApproval() {
        return this.statusApproval;
    }

    public void setStatusApproval(Integer statusApproval) {
        this.statusApproval = statusApproval;
    }

    public KomponenPH id(Integer id) {
        setId(id);
        return this;
    }

    public KomponenPH namaSkema(String namaSkema) {
        setNamaSkema(namaSkema);
        return this;
    }

    public KomponenPH idKompPH(Integer idKompPH) {
        setIdKompPH(idKompPH);
        return this;
    }

    public KomponenPH jenis(String jenis) {
        setJenis(jenis);
        return this;
    }

    public KomponenPH addm(Integer addm) {
        setAddm(addm);
        return this;
    }

    public KomponenPH addb(Integer addb) {
        setAddb(addb);
        return this;
    }

    public KomponenPH created_at(Date created_at) {
        setCreated_at(created_at);
        return this;
    }

    public KomponenPH startBerlaku(Date startBerlaku) {
        setStartBerlaku(startBerlaku);
        return this;
    }

    public KomponenPH endBerlaku(Date endBerlaku) {
        setEndBerlaku(endBerlaku);
        return this;
    }

    public KomponenPH Remarks(String Remarks) {
        setRemarks(Remarks);
        return this;
    }

    public KomponenPH is_rejected(Integer is_rejected) {
        setIs_rejected(is_rejected);
        return this;
    }

    public KomponenPH is_approved(Integer is_approved) {
        setIs_approved(is_approved);
        return this;
    }

    public KomponenPH group_id(String group_id) {
        setGroup_id(group_id);
        return this;
    }

    public KomponenPH kondisi_kendaraan(String kondisi_kendaraan) {
        setKondisi_kendaraan(kondisi_kendaraan);
        return this;
    }

    public KomponenPH produk(String produk) {
        setProduk(produk);
        return this;
    }

    public KomponenPH status(String status) {
        setStatus(status);
        return this;
    }

    public KomponenPH tipe_konsumen(Integer tipe_konsumen) {
        setTipe_konsumen(tipe_konsumen);
        return this;
    }

    public KomponenPH jenis_pembiayaan(Integer jenis_pembiayaan) {
        setJenis_pembiayaan(jenis_pembiayaan);
        return this;
    }

    public KomponenPH jenis_kendaraan(Integer jenis_kendaraan) {
        setJenis_kendaraan(jenis_kendaraan);
        return this;
    }

    public KomponenPH program(Integer program) {
        setProgram(program);
        return this;
    }

    public KomponenPH cluster(Integer cluster) {
        setCluster(cluster);
        return this;
    }

    public KomponenPH is_login(Integer is_login) {
        setIs_login(is_login);
        return this;
    }

    public KomponenPH createdby(Long createdby) {
        setCreatedby(createdby);
        return this;
    }

    public KomponenPH updatedby(Long updatedby) {
        setUpdatedby(updatedby);
        return this;
    }

    public KomponenPH updateddate(Date updateddate) {
        setUpdateddate(updateddate);
        return this;
    }

    public KomponenPH statusApproval(Integer statusApproval) {
        setStatusApproval(statusApproval);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", namaSkema='" + getNamaSkema() + "'" +
            ", idKompPH='" + getIdKompPH() + "'" +
            ", jenis='" + getJenis() + "'" +
            ", addm='" + getAddm() + "'" +
            ", addb='" + getAddb() + "'" +
            ", created_at='" + getCreated_at() + "'" +
            ", startBerlaku='" + getStartBerlaku() + "'" +
            ", endBerlaku='" + getEndBerlaku() + "'" +
            ", Remarks='" + getRemarks() + "'" +
            ", is_rejected='" + getIs_rejected() + "'" +
            ", is_approved='" + getIs_approved() + "'" +
            ", group_id='" + getGroup_id() + "'" +
            ", kondisi_kendaraan='" + getKondisi_kendaraan() + "'" +
            ", produk='" + getProduk() + "'" +
            ", status='" + getStatus() + "'" +
            ", tipe_konsumen='" + getTipe_konsumen() + "'" +
            ", jenis_pembiayaan='" + getJenis_pembiayaan() + "'" +
            ", jenis_kendaraan='" + getJenis_kendaraan() + "'" +
            ", program='" + getProgram() + "'" +
            ", cluster='" + getCluster() + "'" +
            ", is_login='" + getIs_login() + "'" +
            ", createdby='" + getCreatedby() + "'" +
            ", updatedby='" + getUpdatedby() + "'" +
            ", updateddate='" + getUpdateddate() + "'" +
            ", statusApproval='" + getStatusApproval() + "'" +
            "}";
    }


    public KomponenPH submit(Long user) {
        if(this.statusApproval == null || this.statusApproval == 0){
            setIs_approved(0);
            setIs_rejected(0);
            setStatusApproval(1);
            
            trace(user);
        }
        return this;
    }

    public KomponenPH approve(Long user) {
        if(this.statusApproval == 1) {
            setIs_approved(1);
            setIs_rejected(0);
            setStatusApproval(2);

            trace(user);
        }

        return this;
    }

    public KomponenPH decline(Long user) {
        if(this.statusApproval == 1) {
            setIs_approved(0);
            setIs_rejected(1);
            setStatusApproval(2);

            trace(user);
        }

        return this;
    }

    public KomponenPH trace(Long user) {
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