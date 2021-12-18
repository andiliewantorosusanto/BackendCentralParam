package com.beCMS.BackendCentralParam.view;
import java.util.Date;

public class vwDataRateCP {

    private Integer id;
    private String namaSkema;

    private String tipeKonsumenName;
    private Integer tipeKonsumen;

    private Float tenor1;
    private Float tenor2;
    private Float tenor3;
    private Float tenor4;
    private Float tenor5;
    private Float tenor6;
    private Float tenor7;
    private Float tenor8;
    private Float tenor9;
    private Float tenor10;

    private Date startBerlaku;
    private Date endBerlaku;

    private Date createdDate;
    private Integer statusApproval;
    private String remarks;
    private Integer isRejected;
    private Integer isApproved;
    private Long createdBy;
    private Long updatedBy;
    private Date updatedDate;
    public vwDataRateCP(Integer id, String namaSkema, String tipeKonsumenName, Integer tipeKonsumen, Float tenor1,
            Float tenor2, Float tenor3, Float tenor4, Float tenor5, Float tenor6, Float tenor7, Float tenor8,
            Float tenor9, Float tenor10, Date startBerlaku, Date endBerlaku, Date createdDate, Integer statusApproval,
            String remarks, Integer isRejected, Integer isApproved, Long createdBy, Long updatedBy, Date updatedDate) {
        this.id = id;
        this.namaSkema = namaSkema;
        this.tipeKonsumenName = tipeKonsumenName;
        this.tipeKonsumen = tipeKonsumen;
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
        this.createdDate = createdDate;
        this.statusApproval = statusApproval;
        this.remarks = remarks;
        this.isRejected = isRejected;
        this.isApproved = isApproved;
        this.createdBy = createdBy;
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
    public String getTipeKonsumenName() {
        return tipeKonsumenName;
    }
    public void setTipeKonsumenName(String tipeKonsumenName) {
        this.tipeKonsumenName = tipeKonsumenName;
    }
    public Integer getTipeKonsumen() {
        return tipeKonsumen;
    }
    public void setTipeKonsumen(Integer tipeKonsumen) {
        this.tipeKonsumen = tipeKonsumen;
    }
    public Float getTenor1() {
        return tenor1;
    }
    public void setTenor1(Float tenor1) {
        this.tenor1 = tenor1;
    }
    public Float getTenor2() {
        return tenor2;
    }
    public void setTenor2(Float tenor2) {
        this.tenor2 = tenor2;
    }
    public Float getTenor3() {
        return tenor3;
    }
    public void setTenor3(Float tenor3) {
        this.tenor3 = tenor3;
    }
    public Float getTenor4() {
        return tenor4;
    }
    public void setTenor4(Float tenor4) {
        this.tenor4 = tenor4;
    }
    public Float getTenor5() {
        return tenor5;
    }
    public void setTenor5(Float tenor5) {
        this.tenor5 = tenor5;
    }
    public Float getTenor6() {
        return tenor6;
    }
    public void setTenor6(Float tenor6) {
        this.tenor6 = tenor6;
    }
    public Float getTenor7() {
        return tenor7;
    }
    public void setTenor7(Float tenor7) {
        this.tenor7 = tenor7;
    }
    public Float getTenor8() {
        return tenor8;
    }
    public void setTenor8(Float tenor8) {
        this.tenor8 = tenor8;
    }
    public Float getTenor9() {
        return tenor9;
    }
    public void setTenor9(Float tenor9) {
        this.tenor9 = tenor9;
    }
    public Float getTenor10() {
        return tenor10;
    }
    public void setTenor10(Float tenor10) {
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
    public Date getCreatedDate() {
        return createdDate;
    }
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
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

}