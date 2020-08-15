package com.ymktb.conferencedemo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity(name = "news")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class News extends Event{

    private String haberLinki;

    public News(){

    }

    public String getHaberLinki() {
        return haberLinki;
    }

    public void setHaberLinki(String haberLinki) {
        this.haberLinki = haberLinki;
    }

}
