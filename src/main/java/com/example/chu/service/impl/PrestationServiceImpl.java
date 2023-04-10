package com.example.chu.service.impl;


import com.example.chu.bean.Prestation;
import com.example.chu.dao.PrestationDao;
import com.example.chu.service.facade.PrestationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PrestationServiceImpl implements PrestationService {
@Autowired
    private PrestationDao prestationDao;

    @Override
    public Prestation findByIdd(Long idd) {
        return prestationDao.findByIdd(idd);
    }

    @Override
    @Transactional
    public int deleteByIdd(Long idd) {
        return prestationDao.deleteByIdd(idd);
    }

    public Prestation save(Prestation prestation){
        Prestation pre=null;
        if (findByIdd(prestation.getIdd())== null){
            pre = prestationDao.save(prestation);
        }
        return pre;

    }

    @Override
    public List<Prestation> findAll() {
        return prestationDao.findAll();
    }
}
