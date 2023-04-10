package com.example.chu.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Prestation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idd;
    private String nature;
    private String service;
    private String hopital;

    public Long getIdd() {
        return idd;
    }

    public void setIdd(Long idd) {
        this.idd = idd;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getHopital() {
        return hopital;
    }

    public void setHopital(String hopital) {
        this.hopital = hopital;
    }
}
