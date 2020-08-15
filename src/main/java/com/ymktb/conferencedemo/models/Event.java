package com.ymktb.conferencedemo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.*;

@Entity(name = "event")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String konu;
    private String icerik;
    private Integer gecerlilikTarihi;

    public Event(){
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKonu() {
        return konu;
    }

    public void setKonu(String konu) {
        this.konu = konu;
    }

    public String getIcerik() {
        return icerik;
    }

    public void setIcerik(String icerik) {
        this.icerik = icerik;
    }

    public Integer getGecerlilikTarihi() {
        return gecerlilikTarihi;
    }

    public void setGecerlilikTarihi(Integer gecerlilikTarihi) {
        this.gecerlilikTarihi = gecerlilikTarihi;
    }
}
