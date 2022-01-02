package com.beCMS.BackendCentralParam.view;

public class vwSkemaList {
    
    private Integer id;
    private String namaSkema;


    public vwSkemaList() {
    }

    public vwSkemaList(Integer id, String namaSkema) {
        this.id = id;
        this.namaSkema = namaSkema;
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

    public vwSkemaList id(Integer id) {
        setId(id);
        return this;
    }

    public vwSkemaList namaSkema(String namaSkema) {
        setNamaSkema(namaSkema);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", namaSkema='" + getNamaSkema() + "'" +
            "}";
    }


}