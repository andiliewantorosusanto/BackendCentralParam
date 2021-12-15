package com.beCMS.BackendCentralParam.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
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
@Table(name="sp_jenisperluasan_kkbsk")
public class JenisPerluasan implements Serializable {
	
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "nama")
    private String nama;
    
    @OneToOne()
    @JoinColumn(name = "produk",referencedColumnName = "id",insertable = false,updatable = false)
    private Produk produkObject;
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

    @Column(name = "multiple_select")
    private Integer multiple_select;
    
    @Column(name = "statusapproval")
    private Integer statusApproval;


    public JenisPerluasan() {
    }

    public JenisPerluasan(Integer id, String nama, Produk produkObject, Integer Produk, String Deskripsi, Date Start_date, Date End_date, Integer is_approved, Integer is_rejected, String remarks, Long createdby, Date createddate, Long updatedby, Date updateddate, Integer multiple_select, Integer statusApproval) {
        this.id = id;
        this.nama = nama;
        this.produkObject = produkObject;
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
        this.multiple_select = multiple_select;
        this.statusApproval = statusApproval;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Produk getProdukObject() {
        return this.produkObject;
    }

    public void setProdukObject(Produk produkObject) {
        this.produkObject = produkObject;
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

    public Integer getMultiple_select() {
        return this.multiple_select;
    }

    public void setMultiple_select(Integer multiple_select) {
        this.multiple_select = multiple_select;
    }

    public Integer getStatusApproval() {
        return this.statusApproval;
    }

    public void setStatusApproval(Integer statusApproval) {
        this.statusApproval = statusApproval;
    }

    public JenisPerluasan id(Integer id) {
        setId(id);
        return this;
    }

    public JenisPerluasan nama(String nama) {
        setNama(nama);
        return this;
    }

    public JenisPerluasan produkObject(Produk produkObject) {
        setProdukObject(produkObject);
        return this;
    }

    public JenisPerluasan Produk(Integer Produk) {
        setProduk(Produk);
        return this;
    }

    public JenisPerluasan Deskripsi(String Deskripsi) {
        setDeskripsi(Deskripsi);
        return this;
    }

    public JenisPerluasan Start_date(Date Start_date) {
        setStart_date(Start_date);
        return this;
    }

    public JenisPerluasan End_date(Date End_date) {
        setEnd_date(End_date);
        return this;
    }

    public JenisPerluasan is_approved(Integer is_approved) {
        setIs_approved(is_approved);
        return this;
    }

    public JenisPerluasan is_rejected(Integer is_rejected) {
        setIs_rejected(is_rejected);
        return this;
    }

    public JenisPerluasan remarks(String remarks) {
        setRemarks(remarks);
        return this;
    }

    public JenisPerluasan createdby(Long createdby) {
        setCreatedby(createdby);
        return this;
    }

    public JenisPerluasan createddate(Date createddate) {
        setCreateddate(createddate);
        return this;
    }

    public JenisPerluasan updatedby(Long updatedby) {
        setUpdatedby(updatedby);
        return this;
    }

    public JenisPerluasan updateddate(Date updateddate) {
        setUpdateddate(updateddate);
        return this;
    }

    public JenisPerluasan multiple_select(Integer multiple_select) {
        setMultiple_select(multiple_select);
        return this;
    }

    public JenisPerluasan statusApproval(Integer statusApproval) {
        setStatusApproval(statusApproval);
        return this;
    }
    
    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nama='" + getNama() + "'" +
            ", produkObject='" + getProdukObject() + "'" +
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
            ", multiple_select='" + getMultiple_select() + "'" +
            ", statusApproval='" + getStatusApproval() + "'" +
            "}";
    }


    public JenisPerluasan submit(Long user) {
        if(this.statusApproval == null || this.statusApproval == 0){
            setIs_approved(0);
            setIs_rejected(0);
            setStatusApproval(1);
            
            trace(user);
        }
        return this;
    }

    public JenisPerluasan approve(Long user) {
        if(this.statusApproval != null && this.statusApproval == 1) {
            setIs_approved(1);
            setIs_rejected(0);
            setStatusApproval(2);

            trace(user);
        }

        return this;
    }

    public JenisPerluasan decline(Long user) {
        if(this.statusApproval != null && this.statusApproval == 1) {
            setIs_approved(0);
            setIs_rejected(1);
            setStatusApproval(2);

            trace(user);
        }

        return this;
    }
    public JenisPerluasan trace(Long user) {
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
