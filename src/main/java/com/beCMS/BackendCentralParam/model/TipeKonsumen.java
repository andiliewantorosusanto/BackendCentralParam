package com.beCMS.BackendCentralParam.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
    private String nama;
    
    @OneToOne(optional = true)
    @JoinColumn(name = "produk",referencedColumnName = "id",insertable = false,updatable = false,nullable = true)
    private Produk produkObject;

    @Column(name = "produk")
    private Integer produk;

    @Column(name = "Deskripsi")
    private String deskripsi;

    @Column(name = "Start_date")
    private Date start_date;

    @Column(name = "End_date")
    private Date end_date;

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

    @Column(name = "statusapproval")
    private Integer statusApproval;


    public TipeKonsumen() {
    }

    public TipeKonsumen(Integer id, String nama, Produk produkObject, Integer produk, String deskripsi, Date start_date, Date end_date, Integer is_approved, Integer is_rejected, String remarks, Long createdby, Date createddate, Long updatedby, Date updateddate, Integer statusApproval) {
        this.id = id;
        this.nama = nama;
        this.produkObject = produkObject;
        this.produk = produk;
        this.deskripsi = deskripsi;
        this.start_date = start_date;
        this.end_date = end_date;
        this.is_approved = is_approved;
        this.is_rejected = is_rejected;
        this.remarks = remarks;
        this.createdby = createdby;
        this.createddate = createddate;
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
        return this.produk;
    }

    public void setProduk(Integer produk) {
        this.produk = produk;
    }

    public String getDeskripsi() {
        return this.deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public Date getStart_date() {
        return this.start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return this.end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
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

    public Integer getStatusApproval() {
        return this.statusApproval;
    }

    public void setStatusApproval(Integer statusApproval) {
        this.statusApproval = statusApproval;
    }

    public TipeKonsumen id(Integer id) {
        setId(id);
        return this;
    }

    public TipeKonsumen nama(String nama) {
        setNama(nama);
        return this;
    }

    public TipeKonsumen produkObject(Produk produkObject) {
        setProdukObject(produkObject);
        return this;
    }

    public TipeKonsumen produk(Integer produk) {
        setProduk(produk);
        return this;
    }

    public TipeKonsumen deskripsi(String deskripsi) {
        setDeskripsi(deskripsi);
        return this;
    }

    public TipeKonsumen start_date(Date start_date) {
        setStart_date(start_date);
        return this;
    }

    public TipeKonsumen end_date(Date end_date) {
        setEnd_date(end_date);
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

    public TipeKonsumen statusApproval(Integer statusApproval) {
        setStatusApproval(statusApproval);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nama='" + getNama() + "'" +
            ", produkObject='" + getProdukObject() + "'" +
            ", produk='" + getProduk() + "'" +
            ", deskripsi='" + getDeskripsi() + "'" +
            ", start_date='" + getStart_date() + "'" +
            ", end_date='" + getEnd_date() + "'" +
            ", is_approved='" + getIs_approved() + "'" +
            ", is_rejected='" + getIs_rejected() + "'" +
            ", remarks='" + getRemarks() + "'" +
            ", createdby='" + getCreatedby() + "'" +
            ", createddate='" + getCreateddate() + "'" +
            ", updatedby='" + getUpdatedby() + "'" +
            ", updateddate='" + getUpdateddate() + "'" +
            ", statusApproval='" + getStatusApproval() + "'" +
            "}";
    }


    public TipeKonsumen submit(Long user) {
        if(this.statusApproval == null || this.statusApproval == 0){
            setIs_approved(0);
            setIs_rejected(0);
            setStatusApproval(1);
            
            trace(user);
        }
        return this;
    }

    public TipeKonsumen approve(Long user) {
        if(this.statusApproval != null && this.statusApproval != null && this.statusApproval == 1) {
            setIs_approved(1);
            setIs_rejected(0);
            setStatusApproval(2);

            trace(user);
        }

        return this;
    }

    public TipeKonsumen decline(Long user) {
        if(this.statusApproval != null && this.statusApproval != null && this.statusApproval == 1) {
            setIs_approved(0);
            setIs_rejected(1);
            setStatusApproval(2);

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

}