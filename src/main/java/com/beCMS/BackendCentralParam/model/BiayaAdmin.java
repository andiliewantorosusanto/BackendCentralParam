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
@Table(name="sp_biayaadmin_kkbsk")
public class BiayaAdmin implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "nama_skema")
    private String namaSkema;

    @Column(name = "loantype")
    private Integer loanType;

    @Column(name = "tipe_konsumen")
    private Integer tipeKonsumen;

    @Column(name = "jeniskendaraanid")
    private Integer jenisKendaraan;

    @Column(name = "jenis_pembiayaan")
    private Integer jenisPembiayaan;

    @Column(name = "cluster")
    private Integer cluster;

    @Column(name = "diskon_npwp")
    private Integer diskonNpwp;


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
    private Integer isRejected;
    @Column(name = "is_approved")
    private Integer isApproved;

    @Column(name = "createdby")
    private Long createdBy;
    @Column(name = "createddate")
    private Date createdDate;
    @Column(name = "updatedby")
    private Long updatedBy;
    @Column(name = "updateddate")
    private Date updatedDate;

    public BiayaAdmin() {
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

    public BiayaAdmin tipeKonsumen(Integer tipeKonsumen) {
        setTipeKonsumen(tipeKonsumen);
        return this;
    }

    public BiayaAdmin jenisKendaraan(Integer jenisKendaraan) {
        setJenisKendaraan(jenisKendaraan);
        return this;
    }

    public BiayaAdmin jenisPembiayaan(Integer jenisPembiayaan) {
        setJenisPembiayaan(jenisPembiayaan);
        return this;
    }

    public BiayaAdmin cluster(Integer cluster) {
        setCluster(cluster);
        return this;
    }

    public BiayaAdmin diskonNpwp(Integer diskonNpwp) {
        setDiskonNpwp(diskonNpwp);
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

    public BiayaAdmin isRejected(Integer isRejected) {
        setIsRejected(isRejected);
        return this;
    }

    public BiayaAdmin isApproved(Integer isApproved) {
        setIsApproved(isApproved);
        return this;
    }

    public BiayaAdmin createdBy(Long createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    public BiayaAdmin createdDate(Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    public BiayaAdmin updatedBy(Long updatedBy) {
        setUpdatedBy(updatedBy);
        return this;
    }

    public BiayaAdmin updatedDate(Date updatedDate) {
        setUpdatedDate(updatedDate);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", namaSkema='" + getNamaSkema() + "'" +
            ", loanType='" + getLoanType() + "'" +
            ", tipeKonsumen='" + getTipeKonsumen() + "'" +
            ", jenisKendaraan='" + getJenisKendaraan() + "'" +
            ", jenisPembiayaan='" + getJenisPembiayaan() + "'" +
            ", cluster='" + getCluster() + "'" +
            ", diskonNpwp='" + getDiskonNpwp() + "'" +
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
            ", isRejected='" + getIsRejected() + "'" +
            ", isApproved='" + getIsApproved() + "'" +
            ", createdBy='" + getCreatedBy() + "'" +
            ", createdDate='" + getCreatedDate() + "'" +
            ", updatedBy='" + getUpdatedBy() + "'" +
            ", updatedDate='" + getUpdatedDate() + "'" +
            "}";
    }

    public BiayaAdmin(Integer id, String namaSkema, Integer loanType, Integer tipeKonsumen, Integer jenisKendaraan,
            Integer jenisPembiayaan, Integer cluster, Integer diskonNpwp, Integer tenor1, Integer tenor2,
            Integer tenor3, Integer tenor4, Integer tenor5, Integer tenor6, Integer tenor7, Integer tenor8,
            Integer tenor9, Integer tenor10, Date startBerlaku, Date endBerlaku, Integer statusApproval, String remarks,
            Integer isRejected, Integer isApproved, Long createdBy, Date createdDate, Long updatedBy,
            Date updatedDate) {
        this.id = id;
        this.namaSkema = namaSkema;
        this.loanType = loanType;
        this.tipeKonsumen = tipeKonsumen;
        this.jenisKendaraan = jenisKendaraan;
        this.jenisPembiayaan = jenisPembiayaan;
        this.cluster = cluster;
        this.diskonNpwp = diskonNpwp;
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
        this.isRejected = isRejected;
        this.isApproved = isApproved;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.updatedBy = updatedBy;
        this.updatedDate = updatedDate;
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



    public Integer getDiskonNpwp() {
        return diskonNpwp;
    }



    public void setDiskonNpwp(Integer diskonNpwp) {
        this.diskonNpwp = diskonNpwp;
    }



    public Integer getTenor1() {
        return tenor1;
    }



    public void setTenor1(Integer tenor1) {
        this.tenor1 = tenor1;
    }



    public Integer getTenor2() {
        return tenor2;
    }



    public void setTenor2(Integer tenor2) {
        this.tenor2 = tenor2;
    }



    public Integer getTenor3() {
        return tenor3;
    }



    public void setTenor3(Integer tenor3) {
        this.tenor3 = tenor3;
    }



    public Integer getTenor4() {
        return tenor4;
    }



    public void setTenor4(Integer tenor4) {
        this.tenor4 = tenor4;
    }



    public Integer getTenor5() {
        return tenor5;
    }



    public void setTenor5(Integer tenor5) {
        this.tenor5 = tenor5;
    }



    public Integer getTenor6() {
        return tenor6;
    }



    public void setTenor6(Integer tenor6) {
        this.tenor6 = tenor6;
    }



    public Integer getTenor7() {
        return tenor7;
    }



    public void setTenor7(Integer tenor7) {
        this.tenor7 = tenor7;
    }



    public Integer getTenor8() {
        return tenor8;
    }



    public void setTenor8(Integer tenor8) {
        this.tenor8 = tenor8;
    }



    public Integer getTenor9() {
        return tenor9;
    }



    public void setTenor9(Integer tenor9) {
        this.tenor9 = tenor9;
    }



    public Integer getTenor10() {
        return tenor10;
    }



    public void setTenor10(Integer tenor10) {
        this.tenor10 = tenor10;
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



    public Long getCreatedBy() {
        return createdBy;
    }



    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }



    public Date getCreatedDate() {
        return createdDate;
    }



    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
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
