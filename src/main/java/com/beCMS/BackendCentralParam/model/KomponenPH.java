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
    private Integer idKompPh;

    @Column(name = "jenis")
    private String jenis;

    @Column(name = "addm")
    private Integer addm;
    @Column(name = "addb")
    private Integer addb;

    @Column(name = "created_at")
    private Date createdDate;

    @Column(name = "startberlaku")
    private Date startBerlaku;
    @Column(name = "endberlaku")
    private Date endBerlaku;

    @Column(name = "Remarks")
    private String remarks;

    @Column(name = "is_rejected")
    private Integer isRejected;

    @Column(name = "is_approved")
    private Integer isApproved;

    @Column(name = "group_id")
    private String group_id;

    @Column(name = "kondisi_kendaraan")
    private Integer kondisiKendaraan;

    @Column(name = "produk")
    private Integer produk;

    @Column(name = "tipe_konsumen")
    private Integer tipeKonsumen;

    @Column(name = "jenis_pembiayaan")
    private Integer jenisPembiayaan;

    @Column(name = "jenis_kendaraan")
    private Integer jenisKendaraan;

    @Column(name = "program")
    private Integer program;

    @Column(name = "cluster")
    private Integer cluster;
    
    @Column(name = "createdby")
    private Long createdBy;

    @Column(name = "updatedby")
    private Long updatedBy;

    @Column(name = "updateddate")
    private Date updatedDate;

    @Column(name = "statusapproval")
    private Integer statusApproval;


    public KomponenPH() {
    }

    public KomponenPH id(Integer id) {
        setId(id);
        return this;
    }

    public KomponenPH namaSkema(String namaSkema) {
        setNamaSkema(namaSkema);
        return this;
    }

    public KomponenPH idKompPh(Integer idKompPh) {
        setIdKompPh(idKompPh);
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

    public KomponenPH createdDate(Date createdDate) {
        setCreatedDate(createdDate);
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

    public KomponenPH remarks(String remarks) {
        setRemarks(remarks);
        return this;
    }

    public KomponenPH isRejected(Integer isRejected) {
        setIsRejected(isRejected);
        return this;
    }

    public KomponenPH isApproved(Integer isApproved) {
        setIsApproved(isApproved);
        return this;
    }

    public KomponenPH group_id(String group_id) {
        setGroup_id(group_id);
        return this;
    }

    public KomponenPH kondisiKendaraan(Integer kondisiKendaraan) {
        setKondisiKendaraan(kondisiKendaraan);
        return this;
    }

    public KomponenPH produk(Integer produk) {
        setProduk(produk);
        return this;
    }

    public KomponenPH tipeKonsumen(Integer tipeKonsumen) {
        setTipeKonsumen(tipeKonsumen);
        return this;
    }

    public KomponenPH jenisPembiayaan(Integer jenisPembiayaan) {
        setJenisPembiayaan(jenisPembiayaan);
        return this;
    }

    public KomponenPH jenisKendaraan(Integer jenisKendaraan) {
        setJenisKendaraan(jenisKendaraan);
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

    public KomponenPH createdBy(Long createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    public KomponenPH updatedBy(Long updatedBy) {
        setUpdatedBy(updatedBy);
        return this;
    }

    public KomponenPH updatedDate(Date updatedDate) {
        setUpdatedDate(updatedDate);
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
            ", idKompPh='" + getIdKompPh() + "'" +
            ", jenis='" + getJenis() + "'" +
            ", addm='" + getAddm() + "'" +
            ", addb='" + getAddb() + "'" +
            ", createdDate='" + getCreatedDate() + "'" +
            ", startBerlaku='" + getStartBerlaku() + "'" +
            ", endBerlaku='" + getEndBerlaku() + "'" +
            ", remarks='" + getRemarks() + "'" +
            ", isRejected='" + getIsRejected() + "'" +
            ", isApproved='" + getIsApproved() + "'" +
            ", group_id='" + getGroup_id() + "'" +
            ", kondisiKendaraan='" + getKondisiKendaraan() + "'" +
            ", produk='" + getProduk() + "'" +
            ", tipeKonsumen='" + getTipeKonsumen() + "'" +
            ", jenisPembiayaan='" + getJenisPembiayaan() + "'" +
            ", jenisKendaraan='" + getJenisKendaraan() + "'" +
            ", program='" + getProgram() + "'" +
            ", cluster='" + getCluster() + "'" +
            ", createdBy='" + getCreatedBy() + "'" +
            ", updatedBy='" + getUpdatedBy() + "'" +
            ", updatedDate='" + getUpdatedDate() + "'" +
            ", statusApproval='" + getStatusApproval() + "'" +
            "}";
    }


    public KomponenPH(Integer id, String namaSkema, Integer idKompPh, String jenis, Integer addm, Integer addb,
            Date createdDate, Date startBerlaku, Date endBerlaku, String remarks, Integer isRejected,
            Integer isApproved, String group_id, Integer kondisiKendaraan, Integer produk, Integer tipeKonsumen,
            Integer jenisPembiayaan, Integer jenisKendaraan, Integer program, Integer cluster, Long createdBy,
            Long updatedBy, Date updatedDate, Integer statusApproval) {
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
        this.kondisiKendaraan = kondisiKendaraan;
        this.produk = produk;
        this.tipeKonsumen = tipeKonsumen;
        this.jenisPembiayaan = jenisPembiayaan;
        this.jenisKendaraan = jenisKendaraan;
        this.program = program;
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



    public Integer getKondisiKendaraan() {
        return kondisiKendaraan;
    }



    public void setKondisiKendaraan(Integer kondisiKendaraan) {
        this.kondisiKendaraan = kondisiKendaraan;
    }



    public Integer getProduk() {
        return produk;
    }



    public void setProduk(Integer produk) {
        this.produk = produk;
    }



    public Integer getTipeKonsumen() {
        return tipeKonsumen;
    }



    public void setTipeKonsumen(Integer tipeKonsumen) {
        this.tipeKonsumen = tipeKonsumen;
    }



    public Integer getJenisPembiayaan() {
        return jenisPembiayaan;
    }



    public void setJenisPembiayaan(Integer jenisPembiayaan) {
        this.jenisPembiayaan = jenisPembiayaan;
    }



    public Integer getJenisKendaraan() {
        return jenisKendaraan;
    }



    public void setJenisKendaraan(Integer jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }



    public Integer getProgram() {
        return program;
    }



    public void setProgram(Integer program) {
        this.program = program;
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