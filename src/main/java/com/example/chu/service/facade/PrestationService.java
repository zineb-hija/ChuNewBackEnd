package com.example.chu.service.facade;

import com.example.chu.bean.Prestation;

import java.util.List;

public interface PrestationService {
    Prestation findByIdd (Long idd);
    int deleteByIdd (Long idd);
    Prestation save(Prestation prestation);
    List<Prestation> findAll();

}
