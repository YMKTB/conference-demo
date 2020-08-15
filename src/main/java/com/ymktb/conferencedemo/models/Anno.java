package com.ymktb.conferencedemo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Type;

import javax.persistence.*;


@Entity(name = "anno")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Anno extends Event{


    @Lob
    @Type(type="org.hibernate.type.BinaryType")
    private byte[] photo;

    public Anno(){

    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }
}
