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
@Table(name="sp_biayaadmin_kkbsk")
public class BiayaAdmin implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "nama_skema")
    private String namaSkema;

    @Column(name = "loantype")
    private Integer loanType;

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

    @Column(name = "diskon_npwp")
    private Integer diskon_npwp;


    @Column(name = "tenor1")
    private Integer tenor1;
    @Column(name = "tenor2")
    private Integer tenor2;
    @Column(name = "tenor3")
    private Integer tenor3;
    @Column(name = "tenor4")
    private Integer tenor4;
    @Column(name = "tenor5")
    private Integer tenor5;
    @Column(name = "tenor6")
    private Integer tenor6;
    @Column(name = "tenor7")
    private Integer tenor7;
    @Column(name = "tenor8")
    private Integer tenor8;
    @Column(name = "tenor9")
    private Integer tenor9;
    @Column(name = "tenor10")
    private Integer tenor10;


    @Column(name = "startberlaku")
    private Date startBerlaku;
    @Column(name = "endberlaku")
    private Date endBerlaku;


    @Column(name = "statusapproval")
    private Integer statusApproval;
    @Column(name = "remarks")
    private String remarks;
    @Column(name = "is_rejected")
    private Integer is_rejected;
    @Column(name = "is_approved")
    private Integer is_approved;

    @Column(name = "createdby")
    private Long createdby;
    @Column(name = "createddate")
    private Date createddate;
    @Column(name = "updatedby")
    private Long updatedby;
    @Column(name = "updateddate")
    private Date updateddate;


    public BiayaAdmin() {
    }

    public BiayaAdmin(Integer id, String namaSkema, Integer loanType, TipeKonsumen tipe_konsumenObject, Integer tipe_konsumen, JenisKendaraan jenis_kendaraanObject, Integer jenis_kendaraan, JenisPembiayaan jenis_pembiayaanObject, Integer jenis_pembiayaan, Cluster clusterObject, Integer cluster, Integer diskon_npwp, Integer tenor1, Integer tenor2, Integer tenor3, Integer tenor4, Integer tenor5, Integer tenor6, Integer tenor7, Integer tenor8, Integer tenor9, Integer tenor10, Date startBerlaku, Date endBerlaku, Integer statusApproval, String remarks, Integer is_rejected, Integer is_approved, Long createdby, Date createddate, Long updatedby, Date updateddate) {
        this.id = id;
        this.namaSkema = namaSkema;
        this.loanType = loanType;
        this.tipe_konsumenObject = tipe_konsumenObject;
        this.tipe_konsumen = tipe_konsumen;
        this.jenis_kendaraanObject = jenis_kendaraanObject;
        this.jenis_kendaraan = jenis_kendaraan;
        this.jenis_pembiayaanObject = jenis_pembiayaanObject;
        this.jenis_pembiayaan = jenis_pembiayaan;
        this.clusterObject = clusterObject;
        this.cluster = cluster;
        this.diskon_npwp = diskon_npwp;
        this.tenor1 = tenor1;
        this.tenor2 = tenor2;
        this.tenor3 = tenor3;
        this.tenor4 = tenor4;
        this.tenor5 = tenor5;
        this.tenor6 = tenor6;
        this.tenor7 = tenor7;
        this.tenor8 = tenor8;
        this.tenor9 = tenor9;
        this.tenor10 = tenor10;
        this.startBerlaku = startBerlaku;
        this.endBerlaku = endBerlaku;
        this.statusApproval = statusApproval;
        this.remarks = remarks;
        this.is_rejected = is_rejected;
        this.is_approved = is_approved;
        this.createdby = createdby;
        this.createddate = createddate;
        this.updatedby = updatedby;
        this.updateddate = updateddate;
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

    public Integer getLoanType() {
        return this.loanType;
    }

    public void setLoanType(Integer loanType) {
        this.loanType = loanType;
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

    public Integer getDiskon_npwp() {
        return this.diskon_npwp;
    }

    public void setDiskon_npwp(Integer diskon_npwp) {
        this.diskon_npwp = diskon_npwp;
    }

    public Integer getTenor1() {
        return this.tenor1;
    }

    public void setTenor1(Integer tenor1) {
        this.tenor1 = tenor1;
    }

    public Integer getTenor2() {
        return this.tenor2;
    }

    public void setTenor2(Integer tenor2) {
        this.tenor2 = tenor2;
    }

    public Integer getTenor3() {
        return this.tenor3;
    }

    public void setTenor3(Integer tenor3) {
        this.tenor3 = tenor3;
    }

    public Integer getTenor4() {
        return this.tenor4;
    }

    public void setTenor4(Integer tenor4) {
        this.tenor4 = tenor4;
    }

    public Integer getTenor5() {
        return this.tenor5;
    }

    public void setTenor5(Integer tenor5) {
        this.tenor5 = tenor5;
    }

    public Integer getTenor6() {
        return this.tenor6;
    }

    public void setTenor6(Integer tenor6) {
        this.tenor6 = tenor6;
    }

    public Integer getTenor7() {
        return this.tenor7;
    }

    public void setTenor7(Integer tenor7) {
        this.tenor7 = tenor7;
    }

    public Integer getTenor8() {
        return this.tenor8;
    }

    public void setTenor8(Integer tenor8) {
        this.tenor8 = tenor8;
    }

    public Integer getTenor9() {
        return this.tenor9;
    }

    public void setTenor9(Integer tenor9) {
        this.tenor9 = tenor9;
    }

    public Integer getTenor10() {
        return this.tenor10;
    }

    public void setTenor10(Integer tenor10) {
        this.tenor10 = tenor10;
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

    public Long getCreatedby() {
        return this.createdby;
    }

    public void setCreatedby(Long createdby) {
        this.createdby = createdby;
    }

    public Date getCreateddate() {
        return this.createddate;
    }

    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
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

    public BiayaAdmin id(Integer id) {
        setId(id);
        return this;
    }

    public BiayaAdmin namaSkema(String namaSkema) {
        setNamaSkema(namaSkema);
        return this;
    }

    public BiayaAdmin loanType(Integer loanType) {
        setLoanType(loanType);
        return this;
    }

    public BiayaAdmin tipe_konsumenObject(TipeKonsumen tipe_konsumenObject) {
        setTipe_konsumenObject(tipe_konsumenObject);
        return this;
    }

    public BiayaAdmin tipe_konsumen(Integer tipe_konsumen) {
        setTipe_konsumen(tipe_konsumen);
        return this;
    }

    public BiayaAdmin jenis_kendaraanObject(JenisKendaraan jenis_kendaraanObject) {
        setJenis_kendaraanObject(jenis_kendaraanObject);
        return this;
    }

    public BiayaAdmin jenis_kendaraan(Integer jenis_kendaraan) {
        setJenis_kendaraan(jenis_kendaraan);
        return this;
    }

    public BiayaAdmin jenis_pembiayaanObject(JenisPembiayaan jenis_pembiayaanObject) {
        setJenis_pembiayaanObject(jenis_pembiayaanObject);
        return this;
    }

    public BiayaAdmin jenis_pembiayaan(Integer jenis_pembiayaan) {
        setJenis_pembiayaan(jenis_pembiayaan);
        return this;
    }

    public BiayaAdmin clusterObject(Cluster clusterObject) {
        setClusterObject(clusterObject);
        return this;
    }

    public BiayaAdmin cluster(Integer cluster) {
        setCluster(cluster);
        return this;
    }

    public BiayaAdmin diskon_npwp(Integer diskon_npwp) {
        setDiskon_npwp(diskon_npwp);
        return this;
    }

    public BiayaAdmin tenor1(Integer tenor1) {
        setTenor1(tenor1);
        return this;
    }

    public BiayaAdmin tenor2(Integer tenor2) {
        setTenor2(tenor2);
        return this;
    }

    public BiayaAdmin tenor3(Integer tenor3) {
        setTenor3(tenor3);
        return this;
    }

    public BiayaAdmin tenor4(Integer tenor4) {
        setTenor4(tenor4);
        return this;
    }

    public BiayaAdmin tenor5(Integer tenor5) {
        setTenor5(tenor5);
        return this;
    }

    public BiayaAdmin tenor6(Integer tenor6) {
        setTenor6(tenor6);
        return this;
    }

    public BiayaAdmin tenor7(Integer tenor7) {
        setTenor7(tenor7);
        return this;
    }

    public BiayaAdmin tenor8(Integer tenor8) {
        setTenor8(tenor8);
        return this;
    }

    public BiayaAdmin tenor9(Integer tenor9) {
        setTenor9(tenor9);
        return this;
    }

    public BiayaAdmin tenor10(Integer tenor10) {
        setTenor10(tenor10);
        return this;
    }

    public BiayaAdmin startBerlaku(Date startBerlaku) {
        setStartBerlaku(startBerlaku);
        return this;
    }

    public BiayaAdmin endBerlaku(Date endBerlaku) {
        setEndBerlaku(endBerlaku);
        return this;
    }

    public BiayaAdmin statusApproval(Integer statusApproval) {
        setStatusApproval(statusApproval);
        return this;
    }

    public BiayaAdmin remarks(String remarks) {
        setRemarks(remarks);
        return this;
    }

    public BiayaAdmin is_rejected(Integer is_rejected) {
        setIs_rejected(is_rejected);
        return this;
    }

    public BiayaAdmin is_approved(Integer is_approved) {
        setIs_approved(is_approved);
        return this;
    }

    public BiayaAdmin createdby(Long createdby) {
        setCreatedby(createdby);
        return this;
    }

    public BiayaAdmin createddate(Date createddate) {
        setCreateddate(createddate);
        return this;
    }

    public BiayaAdmin updatedby(Long updatedby) {
        setUpdatedby(updatedby);
        return this;
    }

    public BiayaAdmin updateddate(Date updateddate) {
        setUpdateddate(updateddate);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", namaSkema='" + getNamaSkema() + "'" +
            ", loanType='" + getLoanType() + "'" +
            ", tipe_konsumenObject='" + getTipe_konsumenObject() + "'" +
            ", tipe_konsumen='" + getTipe_konsumen() + "'" +
            ", jenis_kendaraanObject='" + getJenis_kendaraanObject() + "'" +
            ", jenis_kendaraan='" + getJenis_kendaraan() + "'" +
            ", jenis_pembiayaanObject='" + getJenis_pembiayaanObject() + "'" +
            ", jenis_pembiayaan='" + getJenis_pembiayaan() + "'" +
            ", clusterObject='" + getClusterObject() + "'" +
            ", cluster='" + getCluster() + "'" +
            ", diskon_npwp='" + getDiskon_npwp() + "'" +
            ", tenor1='" + getTenor1() + "'" +
            ", tenor2='" + getTenor2() + "'" +
            ", tenor3='" + getTenor3() + "'" +
            ", tenor4='" + getTenor4() + "'" +
            ", tenor5='" + getTenor5() + "'" +
            ", tenor6='" + getTenor6() + "'" +
            ", tenor7='" + getTenor7() + "'" +
            ", tenor8='" + getTenor8() + "'" +
            ", tenor9='" + getTenor9() + "'" +
            ", tenor10='" + getTenor10() + "'" +
            ", startBerlaku='" + getStartBerlaku() + "'" +
            ", endBerlaku='" + getEndBerlaku() + "'" +
            ", statusApproval='" + getStatusApproval() + "'" +
            ", remarks='" + getRemarks() + "'" +
            ", is_rejected='" + getIs_rejected() + "'" +
            ", is_approved='" + getIs_approved() + "'" +
            ", createdby='" + getCreatedby() + "'" +
            ", createddate='" + getCreateddate() + "'" +
            ", updatedby='" + getUpdatedby() + "'" +
            ", updateddate='" + getUpdateddate() + "'" +
            "}";
    }


    public BiayaAdmin submit(Long user) {
        if(this.statusApproval == null || this.statusApproval == 0){
            setIs_approved(0);
            setIs_rejected(0);
            setStatusApproval(1);
            
            trace(user);
        }
        return this;
    }

    public BiayaAdmin approve(Long user) {
        if(this.statusApproval != null && this.statusApproval == 1) {
            setIs_approved(1);
            setIs_rejected(0);
            setStatusApproval(2);

            trace(user);
        }

        return this;
    }

    public BiayaAdmin decline(Long user) {
        if(this.statusApproval != null && this.statusApproval == 1) {
            setIs_approved(0);
            setIs_rejected(1);
            setStatusApproval(2);

            trace(user);
        }

        return this;
    }

    public BiayaAdmin trace(Long user) {
        if(this.createddate == null) {
            setCreatedby(user);
            setCreateddate(new Date());
        } else {
            setUpdatedby(user);
            setUpdateddate(new Date());
        }
        return this;
    }
}
