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
@Table(name="sp_biayafiducia_kkbsk")
public class BiayaFidusia implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    
    @Column(name = "nama_skema")
    private String namaSkema;

    @Column(name = "startph")
    private Integer startPH;

    @Column(name = "endph")
    private Integer endPH;

    @Column(name = "biaya")
    private Integer biaya;

    @Column(name = "startberlaku")
    private Date startBerlaku;

    @Column(name = "endberlaku")
    private Date endBerlaku;

    @Column(name = "created_at")
    private Date created_at;

    @Column(name = "operatorawal")
    private String operatorAwal;

    @Column(name = "operatorakhir")
    private String operatorAkhir;

    @Column(name = "is_rejected")
    private Integer is_rejected;

    @Column(name = "is_approved")
    private Integer is_approved;

    @Column(name = "remarks")
    private String remarks;

    @Column(name = "statusapproved")
    private String statusApproved;

    @Column(name = "program")
    private Integer program;

    @Column(name = "produk")
    private Integer produk;

    @Column(name = "createddate")
    private Date createddate;

    @Column(name = "createdby")
    private Long createdby;

    @Column(name = "updateddate")
    private Date updateddate;

    @Column(name = "updatedby")
    private Long updatedby;

    @Column(name = "is_login")
    private Integer is_login;

    public BiayaFidusia() {
    }

    public BiayaFidusia(Integer id, String namaSkema, Integer startPH, Integer endPH, Integer biaya, Date startBerlaku, Date endBerlaku, Date created_at, String operatorAwal, String operatorAkhir, Integer is_rejected, Integer is_approved, String remarks, String statusApproved, Integer program, Integer produk, Date createddate, Long createdby, Date updateddate, Long updatedby, Integer is_login) {
        this.id = id;
        this.namaSkema = namaSkema;
        this.startPH = startPH;
        this.endPH = endPH;
        this.biaya = biaya;
        this.startBerlaku = startBerlaku;
        this.endBerlaku = endBerlaku;
        this.created_at = created_at;
        this.operatorAwal = operatorAwal;
        this.operatorAkhir = operatorAkhir;
        this.is_rejected = is_rejected;
        this.is_approved = is_approved;
        this.remarks = remarks;
        this.statusApproved = statusApproved;
        this.program = program;
        this.produk = produk;
        this.createddate = createddate;
        this.createdby = createdby;
        this.updateddate = updateddate;
        this.updatedby = updatedby;
        this.is_login = is_login;
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

    public Integer getStartPH() {
        return this.startPH;
    }

    public void setStartPH(Integer startPH) {
        this.startPH = startPH;
    }

    public Integer getEndPH() {
        return this.endPH;
    }

    public void setEndPH(Integer endPH) {
        this.endPH = endPH;
    }

    public Integer getBiaya() {
        return this.biaya;
    }

    public void setBiaya(Integer biaya) {
        this.biaya = biaya;
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

    public Date getCreated_at() {
        return this.created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public String getOperatorAwal() {
        return this.operatorAwal;
    }

    public void setOperatorAwal(String operatorAwal) {
        this.operatorAwal = operatorAwal;
    }

    public String getOperatorAkhir() {
        return this.operatorAkhir;
    }

    public void setOperatorAkhir(String operatorAkhir) {
        this.operatorAkhir = operatorAkhir;
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

    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getStatusApproved() {
        return this.statusApproved;
    }

    public void setStatusApproved(String statusApproved) {
        this.statusApproved = statusApproved;
    }

    public Integer getProgram() {
        return this.program;
    }

    public void setProgram(Integer program) {
        this.program = program;
    }

    public Integer getProduk() {
        return this.produk;
    }

    public void setProduk(Integer produk) {
        this.produk = produk;
    }

    public Date getCreateddate() {
        return this.createddate;
    }

    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

    public Long getCreatedby() {
        return this.createdby;
    }

    public void setCreatedby(Long createdby) {
        this.createdby = createdby;
    }

    public Date getUpdateddate() {
        return this.updateddate;
    }

    public void setUpdateddate(Date updateddate) {
        this.updateddate = updateddate;
    }

    public Long getUpdatedby() {
        return this.updatedby;
    }

    public void setUpdatedby(Long updatedby) {
        this.updatedby = updatedby;
    }

    public Integer getIs_login() {
        return this.is_login;
    }

    public void setIs_login(Integer is_login) {
        this.is_login = is_login;
    }

    public BiayaFidusia id(Integer id) {
        setId(id);
        return this;
    }

    public BiayaFidusia namaSkema(String namaSkema) {
        setNamaSkema(namaSkema);
        return this;
    }

    public BiayaFidusia startPH(Integer startPH) {
        setStartPH(startPH);
        return this;
    }

    public BiayaFidusia endPH(Integer endPH) {
        setEndPH(endPH);
        return this;
    }

    public BiayaFidusia biaya(Integer biaya) {
        setBiaya(biaya);
        return this;
    }

    public BiayaFidusia startBerlaku(Date startBerlaku) {
        setStartBerlaku(startBerlaku);
        return this;
    }

    public BiayaFidusia endBerlaku(Date endBerlaku) {
        setEndBerlaku(endBerlaku);
        return this;
    }

    public BiayaFidusia created_at(Date created_at) {
        setCreated_at(created_at);
        return this;
    }

    public BiayaFidusia operatorAwal(String operatorAwal) {
        setOperatorAwal(operatorAwal);
        return this;
    }

    public BiayaFidusia operatorAkhir(String operatorAkhir) {
        setOperatorAkhir(operatorAkhir);
        return this;
    }

    public BiayaFidusia is_rejected(Integer is_rejected) {
        setIs_rejected(is_rejected);
        return this;
    }

    public BiayaFidusia is_approved(Integer is_approved) {
        setIs_approved(is_approved);
        return this;
    }

    public BiayaFidusia remarks(String remarks) {
        setRemarks(remarks);
        return this;
    }

    public BiayaFidusia statusApproved(String statusApproved) {
        setStatusApproved(statusApproved);
        return this;
    }

    public BiayaFidusia program(Integer program) {
        setProgram(program);
        return this;
    }

    public BiayaFidusia produk(Integer produk) {
        setProduk(produk);
        return this;
    }

    public BiayaFidusia createddate(Date createddate) {
        setCreateddate(createddate);
        return this;
    }

    public BiayaFidusia createdby(Long createdby) {
        setCreatedby(createdby);
        return this;
    }

    public BiayaFidusia updateddate(Date updateddate) {
        setUpdateddate(updateddate);
        return this;
    }

    public BiayaFidusia updatedby(Long updatedby) {
        setUpdatedby(updatedby);
        return this;
    }

    public BiayaFidusia is_login(Integer is_login) {
        setIs_login(is_login);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", namaSkema='" + getNamaSkema() + "'" +
            ", startPH='" + getStartPH() + "'" +
            ", endPH='" + getEndPH() + "'" +
            ", biaya='" + getBiaya() + "'" +
            ", startBerlaku='" + getStartBerlaku() + "'" +
            ", endBerlaku='" + getEndBerlaku() + "'" +
            ", created_at='" + getCreated_at() + "'" +
            ", operatorAwal='" + getOperatorAwal() + "'" +
            ", operatorAkhir='" + getOperatorAkhir() + "'" +
            ", is_rejected='" + getIs_rejected() + "'" +
            ", is_approved='" + getIs_approved() + "'" +
            ", remarks='" + getRemarks() + "'" +
            ", statusApproved='" + getStatusApproved() + "'" +
            ", program='" + getProgram() + "'" +
            ", produk='" + getProduk() + "'" +
            ", createddate='" + getCreateddate() + "'" +
            ", createdby='" + getCreatedby() + "'" +
            ", updateddate='" + getUpdateddate() + "'" +
            ", updatedby='" + getUpdatedby() + "'" +
            ", is_login='" + getIs_login() + "'" +
            "}";
    }

    public BiayaFidusia submit(Long user) {
        if(this.is_approved == null && this.is_rejected == null){
            setIs_approved(0);
            setIs_rejected(0);
    
            trace(user);
        }
        return this;
    }

    public BiayaFidusia approve(Long user) {
        if(this.is_approved != null && this.is_rejected != null && this.is_approved == 0 && this.is_rejected == 0) {
            setIs_approved(1);
            trace(user);
        }

        return this;
    }

    public BiayaFidusia decline(Long user) {
        if(this.is_approved != null && this.is_rejected != null && this.is_approved == 0 && this.is_rejected == 0) {
            setIs_rejected(1);
            trace(user);
        }

        return this;
    }

    public BiayaFidusia trace(Long user) {
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
