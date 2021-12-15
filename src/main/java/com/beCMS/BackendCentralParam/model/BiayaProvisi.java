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
@Table(name="sp_biayaprovisi_kkbsk")
public class BiayaProvisi implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    
    @Column(name = "nama_skema")
    private String nama_skema;

    @Column(name = "startberlaku")
    private Date startBerlaku;
    
    @Column(name = "endberlaku")
    private Date endBerlaku;
        
    @Column(name = "loantype")
    private Integer loanType;

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


    @Column(name = "tenor1")
    private Float tenor1;
    @Column(name = "tenor2")
    private Float tenor2;
    @Column(name = "tenor3")
    private Float tenor3;
    @Column(name = "tenor4")
    private Float tenor4;
    @Column(name = "tenor5")
    private Float tenor5;
    @Column(name = "tenor6")
    private Float tenor6;
    @Column(name = "tenor7")
    private Float tenor7;
    @Column(name = "tenor8")
    private Float tenor8;
    @Column(name = "tenor9")
    private Float tenor9;
    @Column(name = "tenor10")
    private Float tenor10;

    @Column(name = "remarks")
    private String remarks;
    @Column(name = "status")
    private String status;

    @Column(name = "tenor1_persen")
    private Float tenor1_persen;
    @Column(name = "tenor2_persen")
    private Float tenor2_persen;
    @Column(name = "tenor3_persen")
    private Float tenor3_persen;
    @Column(name = "tenor4_persen")
    private Float tenor4_persen;
    @Column(name = "tenor5_persen")
    private Float tenor5_persen;
    @Column(name = "tenor6_persen")
    private Float tenor6_persen;
    @Column(name = "tenor7_persen")
    private Float tenor7_persen;
    @Column(name = "tenor8_persen")
    private Float tenor8_persen;
    @Column(name = "tenor9_persen")
    private Float tenor9_persen;
    @Column(name = "tenor10_persen")
    private Float tenor10_persen;
    


    @Column(name = "updateddate")
    private Date updateddate;
    @Column(name = "createddate")
    private Date createddate;
    @Column(name = "createdby")
    private Long createdby;
    @Column(name = "updatedby")
    private Long updatedby;

    @Column(name = "is_login")
    private Integer is_login;
    @Column(name = "statusapproved")
    private Integer statusApproved;
    @Column(name = "is_rejected")
    private Integer is_rejected;
    @Column(name = "is_approved")
    private Integer is_approved;


    public BiayaProvisi() {
    }

    public BiayaProvisi(Integer id, String nama_skema, Date startBerlaku, Date endBerlaku, Integer loanType, JenisKendaraan jenis_kendaraanObject, Integer jenis_kendaraan, JenisPembiayaan jenis_pembiayaanObject, Integer jenis_pembiayaan, Float tenor1, Float tenor2, Float tenor3, Float tenor4, Float tenor5, Float tenor6, Float tenor7, Float tenor8, Float tenor9, Float tenor10, String remarks, String status, Float tenor1_persen, Float tenor2_persen, Float tenor3_persen, Float tenor4_persen, Float tenor5_persen, Float tenor6_persen, Float tenor7_persen, Float tenor8_persen, Float tenor9_persen, Float tenor10_persen, Date updateddate, Date createddate, Long createdby, Long updatedby, Integer is_login, Integer statusApproved, Integer is_rejected, Integer is_approved) {
        this.id = id;
        this.nama_skema = nama_skema;
        this.startBerlaku = startBerlaku;
        this.endBerlaku = endBerlaku;
        this.loanType = loanType;
        this.jenis_kendaraanObject = jenis_kendaraanObject;
        this.jenis_kendaraan = jenis_kendaraan;
        this.jenis_pembiayaanObject = jenis_pembiayaanObject;
        this.jenis_pembiayaan = jenis_pembiayaan;
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
        this.remarks = remarks;
        this.status = status;
        this.tenor1_persen = tenor1_persen;
        this.tenor2_persen = tenor2_persen;
        this.tenor3_persen = tenor3_persen;
        this.tenor4_persen = tenor4_persen;
        this.tenor5_persen = tenor5_persen;
        this.tenor6_persen = tenor6_persen;
        this.tenor7_persen = tenor7_persen;
        this.tenor8_persen = tenor8_persen;
        this.tenor9_persen = tenor9_persen;
        this.tenor10_persen = tenor10_persen;
        this.updateddate = updateddate;
        this.createddate = createddate;
        this.createdby = createdby;
        this.updatedby = updatedby;
        this.is_login = is_login;
        this.statusApproved = statusApproved;
        this.is_rejected = is_rejected;
        this.is_approved = is_approved;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama_skema() {
        return this.nama_skema;
    }

    public void setNama_skema(String nama_skema) {
        this.nama_skema = nama_skema;
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

    public Integer getLoanType() {
        return this.loanType;
    }

    public void setLoanType(Integer loanType) {
        this.loanType = loanType;
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

    public Float getTenor1() {
        return this.tenor1;
    }

    public void setTenor1(Float tenor1) {
        this.tenor1 = tenor1;
    }

    public Float getTenor2() {
        return this.tenor2;
    }

    public void setTenor2(Float tenor2) {
        this.tenor2 = tenor2;
    }

    public Float getTenor3() {
        return this.tenor3;
    }

    public void setTenor3(Float tenor3) {
        this.tenor3 = tenor3;
    }

    public Float getTenor4() {
        return this.tenor4;
    }

    public void setTenor4(Float tenor4) {
        this.tenor4 = tenor4;
    }

    public Float getTenor5() {
        return this.tenor5;
    }

    public void setTenor5(Float tenor5) {
        this.tenor5 = tenor5;
    }

    public Float getTenor6() {
        return this.tenor6;
    }

    public void setTenor6(Float tenor6) {
        this.tenor6 = tenor6;
    }

    public Float getTenor7() {
        return this.tenor7;
    }

    public void setTenor7(Float tenor7) {
        this.tenor7 = tenor7;
    }

    public Float getTenor8() {
        return this.tenor8;
    }

    public void setTenor8(Float tenor8) {
        this.tenor8 = tenor8;
    }

    public Float getTenor9() {
        return this.tenor9;
    }

    public void setTenor9(Float tenor9) {
        this.tenor9 = tenor9;
    }

    public Float getTenor10() {
        return this.tenor10;
    }

    public void setTenor10(Float tenor10) {
        this.tenor10 = tenor10;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Float getTenor1_persen() {
        return this.tenor1_persen;
    }

    public void setTenor1_persen(Float tenor1_persen) {
        this.tenor1_persen = tenor1_persen;
    }

    public Float getTenor2_persen() {
        return this.tenor2_persen;
    }

    public void setTenor2_persen(Float tenor2_persen) {
        this.tenor2_persen = tenor2_persen;
    }

    public Float getTenor3_persen() {
        return this.tenor3_persen;
    }

    public void setTenor3_persen(Float tenor3_persen) {
        this.tenor3_persen = tenor3_persen;
    }

    public Float getTenor4_persen() {
        return this.tenor4_persen;
    }

    public void setTenor4_persen(Float tenor4_persen) {
        this.tenor4_persen = tenor4_persen;
    }

    public Float getTenor5_persen() {
        return this.tenor5_persen;
    }

    public void setTenor5_persen(Float tenor5_persen) {
        this.tenor5_persen = tenor5_persen;
    }

    public Float getTenor6_persen() {
        return this.tenor6_persen;
    }

    public void setTenor6_persen(Float tenor6_persen) {
        this.tenor6_persen = tenor6_persen;
    }

    public Float getTenor7_persen() {
        return this.tenor7_persen;
    }

    public void setTenor7_persen(Float tenor7_persen) {
        this.tenor7_persen = tenor7_persen;
    }

    public Float getTenor8_persen() {
        return this.tenor8_persen;
    }

    public void setTenor8_persen(Float tenor8_persen) {
        this.tenor8_persen = tenor8_persen;
    }

    public Float getTenor9_persen() {
        return this.tenor9_persen;
    }

    public void setTenor9_persen(Float tenor9_persen) {
        this.tenor9_persen = tenor9_persen;
    }

    public Float getTenor10_persen() {
        return this.tenor10_persen;
    }

    public void setTenor10_persen(Float tenor10_persen) {
        this.tenor10_persen = tenor10_persen;
    }

    public Date getUpdateddate() {
        return this.updateddate;
    }

    public void setUpdateddate(Date updateddate) {
        this.updateddate = updateddate;
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

    public Integer getStatusApproved() {
        return this.statusApproved;
    }

    public void setStatusApproved(Integer statusApproved) {
        this.statusApproved = statusApproved;
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

    public BiayaProvisi id(Integer id) {
        setId(id);
        return this;
    }

    public BiayaProvisi nama_skema(String nama_skema) {
        setNama_skema(nama_skema);
        return this;
    }

    public BiayaProvisi startBerlaku(Date startBerlaku) {
        setStartBerlaku(startBerlaku);
        return this;
    }

    public BiayaProvisi endBerlaku(Date endBerlaku) {
        setEndBerlaku(endBerlaku);
        return this;
    }

    public BiayaProvisi loanType(Integer loanType) {
        setLoanType(loanType);
        return this;
    }

    public BiayaProvisi jenis_kendaraanObject(JenisKendaraan jenis_kendaraanObject) {
        setJenis_kendaraanObject(jenis_kendaraanObject);
        return this;
    }

    public BiayaProvisi jenis_kendaraan(Integer jenis_kendaraan) {
        setJenis_kendaraan(jenis_kendaraan);
        return this;
    }

    public BiayaProvisi jenis_pembiayaanObject(JenisPembiayaan jenis_pembiayaanObject) {
        setJenis_pembiayaanObject(jenis_pembiayaanObject);
        return this;
    }

    public BiayaProvisi jenis_pembiayaan(Integer jenis_pembiayaan) {
        setJenis_pembiayaan(jenis_pembiayaan);
        return this;
    }

    public BiayaProvisi tenor1(Float tenor1) {
        setTenor1(tenor1);
        return this;
    }

    public BiayaProvisi tenor2(Float tenor2) {
        setTenor2(tenor2);
        return this;
    }

    public BiayaProvisi tenor3(Float tenor3) {
        setTenor3(tenor3);
        return this;
    }

    public BiayaProvisi tenor4(Float tenor4) {
        setTenor4(tenor4);
        return this;
    }

    public BiayaProvisi tenor5(Float tenor5) {
        setTenor5(tenor5);
        return this;
    }

    public BiayaProvisi tenor6(Float tenor6) {
        setTenor6(tenor6);
        return this;
    }

    public BiayaProvisi tenor7(Float tenor7) {
        setTenor7(tenor7);
        return this;
    }

    public BiayaProvisi tenor8(Float tenor8) {
        setTenor8(tenor8);
        return this;
    }

    public BiayaProvisi tenor9(Float tenor9) {
        setTenor9(tenor9);
        return this;
    }

    public BiayaProvisi tenor10(Float tenor10) {
        setTenor10(tenor10);
        return this;
    }

    public BiayaProvisi remarks(String remarks) {
        setRemarks(remarks);
        return this;
    }

    public BiayaProvisi status(String status) {
        setStatus(status);
        return this;
    }

    public BiayaProvisi tenor1_persen(Float tenor1_persen) {
        setTenor1_persen(tenor1_persen);
        return this;
    }

    public BiayaProvisi tenor2_persen(Float tenor2_persen) {
        setTenor2_persen(tenor2_persen);
        return this;
    }

    public BiayaProvisi tenor3_persen(Float tenor3_persen) {
        setTenor3_persen(tenor3_persen);
        return this;
    }

    public BiayaProvisi tenor4_persen(Float tenor4_persen) {
        setTenor4_persen(tenor4_persen);
        return this;
    }

    public BiayaProvisi tenor5_persen(Float tenor5_persen) {
        setTenor5_persen(tenor5_persen);
        return this;
    }

    public BiayaProvisi tenor6_persen(Float tenor6_persen) {
        setTenor6_persen(tenor6_persen);
        return this;
    }

    public BiayaProvisi tenor7_persen(Float tenor7_persen) {
        setTenor7_persen(tenor7_persen);
        return this;
    }

    public BiayaProvisi tenor8_persen(Float tenor8_persen) {
        setTenor8_persen(tenor8_persen);
        return this;
    }

    public BiayaProvisi tenor9_persen(Float tenor9_persen) {
        setTenor9_persen(tenor9_persen);
        return this;
    }

    public BiayaProvisi tenor10_persen(Float tenor10_persen) {
        setTenor10_persen(tenor10_persen);
        return this;
    }

    public BiayaProvisi updateddate(Date updateddate) {
        setUpdateddate(updateddate);
        return this;
    }

    public BiayaProvisi createddate(Date createddate) {
        setCreateddate(createddate);
        return this;
    }

    public BiayaProvisi createdby(Long createdby) {
        setCreatedby(createdby);
        return this;
    }

    public BiayaProvisi updatedby(Long updatedby) {
        setUpdatedby(updatedby);
        return this;
    }

    public BiayaProvisi is_login(Integer is_login) {
        setIs_login(is_login);
        return this;
    }

    public BiayaProvisi statusApproved(Integer statusApproved) {
        setStatusApproved(statusApproved);
        return this;
    }

    public BiayaProvisi is_rejected(Integer is_rejected) {
        setIs_rejected(is_rejected);
        return this;
    }

    public BiayaProvisi is_approved(Integer is_approved) {
        setIs_approved(is_approved);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nama_skema='" + getNama_skema() + "'" +
            ", startBerlaku='" + getStartBerlaku() + "'" +
            ", endBerlaku='" + getEndBerlaku() + "'" +
            ", loanType='" + getLoanType() + "'" +
            ", jenis_kendaraanObject='" + getJenis_kendaraanObject() + "'" +
            ", jenis_kendaraan='" + getJenis_kendaraan() + "'" +
            ", jenis_pembiayaanObject='" + getJenis_pembiayaanObject() + "'" +
            ", jenis_pembiayaan='" + getJenis_pembiayaan() + "'" +
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
            ", remarks='" + getRemarks() + "'" +
            ", status='" + getStatus() + "'" +
            ", tenor1_persen='" + getTenor1_persen() + "'" +
            ", tenor2_persen='" + getTenor2_persen() + "'" +
            ", tenor3_persen='" + getTenor3_persen() + "'" +
            ", tenor4_persen='" + getTenor4_persen() + "'" +
            ", tenor5_persen='" + getTenor5_persen() + "'" +
            ", tenor6_persen='" + getTenor6_persen() + "'" +
            ", tenor7_persen='" + getTenor7_persen() + "'" +
            ", tenor8_persen='" + getTenor8_persen() + "'" +
            ", tenor9_persen='" + getTenor9_persen() + "'" +
            ", tenor10_persen='" + getTenor10_persen() + "'" +
            ", updateddate='" + getUpdateddate() + "'" +
            ", createddate='" + getCreateddate() + "'" +
            ", createdby='" + getCreatedby() + "'" +
            ", updatedby='" + getUpdatedby() + "'" +
            ", is_login='" + getIs_login() + "'" +
            ", statusApproved='" + getStatusApproved() + "'" +
            ", is_rejected='" + getIs_rejected() + "'" +
            ", is_approved='" + getIs_approved() + "'" +
            "}";
    }

    public BiayaProvisi submit(Long user) {
        if(this.statusApproved == null || this.statusApproved == 0){
            setIs_approved(0);
            setIs_rejected(0);
            setStatusApproved(1);
            
            trace(user);
        }
        return this;
    }

    public BiayaProvisi approve(Long user) {
        if(this.statusApproved == 1) {
            setIs_approved(1);
            setIs_rejected(0);
            setStatusApproved(2);

            trace(user);
        }

        return this;
    }

    public BiayaProvisi decline(Long user) {
        if(this.statusApproved == 1) {
            setIs_approved(0);
            setIs_rejected(1);
            setStatusApproved(2);

            trace(user);
        }

        return this;
    }

    public BiayaProvisi trace(Long user) {
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
