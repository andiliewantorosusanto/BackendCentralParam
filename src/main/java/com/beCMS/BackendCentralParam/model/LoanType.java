package com.beCMS.BackendCentralParam.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="sp_masterkompph")
public class LoanType implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "id_komp")
    private Integer idKomp;
    
    @Column(name = "deskripsi")
    private String deskripsi;

    public LoanType(Integer id, Integer idKomp, String deskripsi) {
        this.id = id;
        this.idKomp = idKomp;
        this.deskripsi = deskripsi;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdKomp() {
        return idKomp;
    }

    public void setIdKomp(Integer idKomp) {
        this.idKomp = idKomp;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }


    public LoanType() {
    }

    public LoanType id(Integer id) {
        setId(id);
        return this;
    }

    public LoanType idKomp(Integer idKomp) {
        setIdKomp(idKomp);
        return this;
    }

    public LoanType deskripsi(String deskripsi) {
        setDeskripsi(deskripsi);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", idKomp='" + getIdKomp() + "'" +
            ", deskripsi='" + getDeskripsi() + "'" +
            "}";
    }
    
}
