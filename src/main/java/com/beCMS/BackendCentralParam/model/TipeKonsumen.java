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
@Table(name="sp_tipekonsumen_kkbsk")
public class TipeKonsumen  implements Serializable {
    
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
            
        @Column(name = "createdby")
        private Long createdby;
            
        @Column(name = "createddate")
        private Date createddate;
            
        @Column(name = "updatedby")
        private Long updatedby;
            
        @Column(name = "updateddate")
        private Date updateddate;


    public TipeKonsumen() {
    }

    public TipeKonsumen(Integer id, String Nama, Integer Produk, String Deskripsi, Date Start_date, Date End_date, Integer is_approved, Integer is_rejected, String remarks, Long createdby, Date createddate, Long updatedby, Date updateddate) {
        this.id = id;
        this.Nama = Nama;
        this.Produk = Produk;
        this.Deskripsi = Deskripsi;
        this.Start_date = Start_date;
        this.End_date = End_date;
        this.is_approved = is_approved;
        this.is_rejected = is_rejected;
        this.remarks = remarks;
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

    public TipeKonsumen submit(Long user) {
        if(this.is_approved == null && this.is_rejected == null){
            setIs_approved(0);
            setIs_rejected(0);
    
            trace(user);
        }
        return this;
    }

    public TipeKonsumen approve(Long user) {
        if(this.is_approved != null && this.is_rejected != null && this.is_approved == 0 && this.is_rejected == 0) {
            setIs_approved(1);
            trace(user);
        }

        return this;
    }

    public TipeKonsumen decline(Long user) {
        if(this.is_approved != null && this.is_rejected != null && this.is_approved == 0 && this.is_rejected == 0) {
            setIs_rejected(1);
            trace(user);
        }

        return this;
    }

    public TipeKonsumen trace(Long user) {
        if(this.createddate == null) {
            setCreatedby(user);
            setCreateddate(new Date());
        } else {
            setUpdatedby(user);
            setUpdateddate(new Date());
        }
        return this;
    }

    public TipeKonsumen id(Integer id) {
        setId(id);
        return this;
    }

    public TipeKonsumen Nama(String Nama) {
        setNama(Nama);
        return this;
    }

    public TipeKonsumen Produk(Integer Produk) {
        setProduk(Produk);
        return this;
    }

    public TipeKonsumen Deskripsi(String Deskripsi) {
        setDeskripsi(Deskripsi);
        return this;
    }

    public TipeKonsumen Start_date(Date Start_date) {
        setStart_date(Start_date);
        return this;
    }

    public TipeKonsumen End_date(Date End_date) {
        setEnd_date(End_date);
        return this;
    }

    public TipeKonsumen is_approved(Integer is_approved) {
        setIs_approved(is_approved);
        return this;
    }

    public TipeKonsumen is_rejected(Integer is_rejected) {
        setIs_rejected(is_rejected);
        return this;
    }

    public TipeKonsumen remarks(String remarks) {
        setRemarks(remarks);
        return this;
    }

    public TipeKonsumen createdby(Long createdby) {
        setCreatedby(createdby);
        return this;
    }

    public TipeKonsumen createddate(Date createddate) {
        setCreateddate(createddate);
        return this;
    }

    public TipeKonsumen updatedby(Long updatedby) {
        setUpdatedby(updatedby);
        return this;
    }

    public TipeKonsumen updateddate(Date updateddate) {
        setUpdateddate(updateddate);
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
            ", createdby='" + getCreatedby() + "'" +
            ", createddate='" + getCreateddate() + "'" +
            ", updatedby='" + getUpdatedby() + "'" +
            ", updateddate='" + getUpdateddate() + "'" +
            "}";
    }

}