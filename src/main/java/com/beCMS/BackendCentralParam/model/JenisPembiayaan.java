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
@Table(name="sp_jenispembiayaan")
public class JenisPembiayaan implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "jenis_pembiayaan")
    private String jenis_pembiayaan;
    
    @Column(name = "produk")
    private Integer produk;

    @Column(name = "is_refinancing")
    private Integer is_refinancing;

    @Column(name = "start_date")
    private Date start_date;

    @Column(name = "end_date")
    private Date end_date;

    @Column(name = "is_approved")
    private Integer is_approved;

    @Column(name = "is_rejected")
    private Integer is_rejected;
    
    @Column(name = "createdby")
    private Long createdby;

    @Column(name = "createddate")
    private Date createddate;

    @Column(name = "updatedby")
    private Long updatedby;

    @Column(name = "updateddate")
    private Date updateddate;

    @Column(name = "remarks")
    private String remarks;

    @Column(name = "statusapproval")
    private Integer statusApproval;


    public JenisPembiayaan() {
    }

    public JenisPembiayaan(Integer id, String jenis_pembiayaan, Integer produk, Integer is_refinancing, Date start_date, Date end_date, Integer is_approved, Integer is_rejected, Long createdby, Date createddate, Long updatedby, Date updateddate, String remarks, Integer statusApproval) {
        this.id = id;
        this.jenis_pembiayaan = jenis_pembiayaan;
        this.produk = produk;
        this.is_refinancing = is_refinancing;
        this.start_date = start_date;
        this.end_date = end_date;
        this.is_approved = is_approved;
        this.is_rejected = is_rejected;
        this.createdby = createdby;
        this.createddate = createddate;
        this.updatedby = updatedby;
        this.updateddate = updateddate;
        this.remarks = remarks;
        this.statusApproval = statusApproval;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJenis_pembiayaan() {
        return this.jenis_pembiayaan;
    }

    public void setJenis_pembiayaan(String jenis_pembiayaan) {
        this.jenis_pembiayaan = jenis_pembiayaan;
    }

    public Integer getProduk() {
        return this.produk;
    }

    public void setProduk(Integer produk) {
        this.produk = produk;
    }

    public Integer getIs_refinancing() {
        return this.is_refinancing;
    }

    public void setIs_refinancing(Integer is_refinancing) {
        this.is_refinancing = is_refinancing;
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

    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getStatusApproval() {
        return this.statusApproval;
    }

    public void setStatusApproval(Integer statusApproval) {
        this.statusApproval = statusApproval;
    }

    public JenisPembiayaan id(Integer id) {
        setId(id);
        return this;
    }

    public JenisPembiayaan jenis_pembiayaan(String jenis_pembiayaan) {
        setJenis_pembiayaan(jenis_pembiayaan);
        return this;
    }

    public JenisPembiayaan produk(Integer produk) {
        setProduk(produk);
        return this;
    }

    public JenisPembiayaan is_refinancing(Integer is_refinancing) {
        setIs_refinancing(is_refinancing);
        return this;
    }

    public JenisPembiayaan start_date(Date start_date) {
        setStart_date(start_date);
        return this;
    }

    public JenisPembiayaan end_date(Date end_date) {
        setEnd_date(end_date);
        return this;
    }

    public JenisPembiayaan is_approved(Integer is_approved) {
        setIs_approved(is_approved);
        return this;
    }

    public JenisPembiayaan is_rejected(Integer is_rejected) {
        setIs_rejected(is_rejected);
        return this;
    }

    public JenisPembiayaan createdby(Long createdby) {
        setCreatedby(createdby);
        return this;
    }

    public JenisPembiayaan createddate(Date createddate) {
        setCreateddate(createddate);
        return this;
    }

    public JenisPembiayaan updatedby(Long updatedby) {
        setUpdatedby(updatedby);
        return this;
    }

    public JenisPembiayaan updateddate(Date updateddate) {
        setUpdateddate(updateddate);
        return this;
    }

    public JenisPembiayaan remarks(String remarks) {
        setRemarks(remarks);
        return this;
    }

    public JenisPembiayaan statusApproval(Integer statusApproval) {
        setStatusApproval(statusApproval);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", jenis_pembiayaan='" + getJenis_pembiayaan() + "'" +
            ", produk='" + getProduk() + "'" +
            ", is_refinancing='" + getIs_refinancing() + "'" +
            ", start_date='" + getStart_date() + "'" +
            ", end_date='" + getEnd_date() + "'" +
            ", is_approved='" + getIs_approved() + "'" +
            ", is_rejected='" + getIs_rejected() + "'" +
            ", createdby='" + getCreatedby() + "'" +
            ", createddate='" + getCreateddate() + "'" +
            ", updatedby='" + getUpdatedby() + "'" +
            ", updateddate='" + getUpdateddate() + "'" +
            ", remarks='" + getRemarks() + "'" +
            ", statusApproval='" + getStatusApproval() + "'" +
            "}";
    }


    public JenisPembiayaan submit(Long user) {
        if(this.statusApproval == null || this.statusApproval == 0){
            setIs_approved(0);
            setIs_rejected(0);
            setStatusApproval(1);
            
            trace(user);
        }
        return this;
    }

    public JenisPembiayaan approve(Long user) {
        if(this.statusApproval == 1) {
            setIs_approved(1);
            setIs_rejected(0);
            setStatusApproval(2);

            trace(user);
        }

        return this;
    }

    public JenisPembiayaan decline(Long user) {
        if(this.statusApproval == 1) {
            setIs_approved(0);
            setIs_rejected(1);
            setStatusApproval(2);

            trace(user);
        }

        return this;
    }

    public JenisPembiayaan trace(Long user) {
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
