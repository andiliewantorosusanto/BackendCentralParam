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
@Table(name = "sp_tujuanpenggunaan")
public class TujuanPenggunaan implements Serializable {
  
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "Nama")
    private String Nama;

    @Column(name = "Produk")
    private Integer Produk;

    @Column(name = "Deskripsi")
    private String Deskripsi;
    
    @Column(name = "Start_date")
    private Date Start_date;

    @Column(name = "End_date")
    private Date End_date;

    @Column(name = "is_approved")
    private Integer is_approved;

    @Column(name = "is_rejected")
    private Integer is_rejected;

    @Column(name = "remarks")
    private String remarks;

    @Column(name = "createddate")
    private Date createddate;

    @Column(name = "createdby")
    private Long createdby;

    @Column(name = "updateddate")
    private Date updateddate;

    @Column(name = "updatedby")
    private Long updatedby;
    

    public TujuanPenggunaan() {
    }

    public TujuanPenggunaan(Integer id, String Nama, Integer Produk, String Deskripsi, Date Start_date, Date End_date, Integer is_approved, Integer is_rejected, String remarks, Date createddate, Long createdby, Date updateddate, Long updatedby) {
        this.id = id;
        this.Nama = Nama;
        this.Produk = Produk;
        this.Deskripsi = Deskripsi;
        this.Start_date = Start_date;
        this.End_date = End_date;
        this.is_approved = is_approved;
        this.is_rejected = is_rejected;
        this.remarks = remarks;
        this.createddate = createddate;
        this.createdby = createdby;
        this.updateddate = updateddate;
        this.updatedby = updatedby;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama() {
        return this.Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public Integer getProduk() {
        return this.Produk;
    }

    public void setProduk(Integer Produk) {
        this.Produk = Produk;
    }

    public String getDeskripsi() {
        return this.Deskripsi;
    }

    public void setDeskripsi(String Deskripsi) {
        this.Deskripsi = Deskripsi;
    }

    public Date getStart_date() {
        return this.Start_date;
    }

    public void setStart_date(Date Start_date) {
        this.Start_date = Start_date;
    }

    public Date getEnd_date() {
        return this.End_date;
    }

    public void setEnd_date(Date End_date) {
        this.End_date = End_date;
    }

    public Integer getIs_approved() {
        return this.is_approved;
    }

    public void setIs_approved(Integer is_approved) {
        this.is_approved = is_approved;
    }

    public Integer getIs_rejected() {
        return this.is_rejected;
    }

    public void setIs_rejected(Integer is_rejected) {
        this.is_rejected = is_rejected;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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

    public TujuanPenggunaan id(Integer id) {
        setId(id);
        return this;
    }

    public TujuanPenggunaan Nama(String Nama) {
        setNama(Nama);
        return this;
    }

    public TujuanPenggunaan Produk(Integer Produk) {
        setProduk(Produk);
        return this;
    }

    public TujuanPenggunaan Deskripsi(String Deskripsi) {
        setDeskripsi(Deskripsi);
        return this;
    }

    public TujuanPenggunaan Start_date(Date Start_date) {
        setStart_date(Start_date);
        return this;
    }

    public TujuanPenggunaan End_date(Date End_date) {
        setEnd_date(End_date);
        return this;
    }

    public TujuanPenggunaan is_approved(Integer is_approved) {
        setIs_approved(is_approved);
        return this;
    }

    public TujuanPenggunaan is_rejected(Integer is_rejected) {
        setIs_rejected(is_rejected);
        return this;
    }

    public TujuanPenggunaan remarks(String remarks) {
        setRemarks(remarks);
        return this;
    }

    public TujuanPenggunaan createddate(Date createddate) {
        setCreateddate(createddate);
        return this;
    }

    public TujuanPenggunaan createdby(Long createdby) {
        setCreatedby(createdby);
        return this;
    }

    public TujuanPenggunaan updateddate(Date updateddate) {
        setUpdateddate(updateddate);
        return this;
    }

    public TujuanPenggunaan updatedby(Long updatedby) {
        setUpdatedby(updatedby);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", Nama='" + getNama() + "'" +
            ", Produk='" + getProduk() + "'" +
            ", Deskripsi='" + getDeskripsi() + "'" +
            ", Start_date='" + getStart_date() + "'" +
            ", End_date='" + getEnd_date() + "'" +
            ", is_approved='" + getIs_approved() + "'" +
            ", is_rejected='" + getIs_rejected() + "'" +
            ", remarks='" + getRemarks() + "'" +
            ", createddate='" + getCreateddate() + "'" +
            ", createdby='" + getCreatedby() + "'" +
            ", updateddate='" + getUpdateddate() + "'" +
            ", updatedby='" + getUpdatedby() + "'" +
            "}";
    }

    public TujuanPenggunaan submit(Long user) {
        if(this.is_approved == null && this.is_rejected == null){
            setIs_approved(0);
            setIs_rejected(0);
    
            trace(user);
        }
        return this;
    }

    public TujuanPenggunaan approve(Long user) {
        if(this.is_approved != null && this.is_rejected != null && this.is_approved == 0 && this.is_rejected == 0) {
            setIs_approved(1);
            trace(user);
        }

        return this;
    }

    public TujuanPenggunaan decline(Long user) {
        if(this.is_approved != null && this.is_rejected != null && this.is_approved == 0 && this.is_rejected == 0) {
            setIs_rejected(1);
            trace(user);
        }

        return this;
    }

    public TujuanPenggunaan trace(Long user) {
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