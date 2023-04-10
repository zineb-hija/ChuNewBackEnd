package com.example.chu.service.impl;

import com.example.chu.bean.Identif;
import com.example.chu.bean.Register;
import com.example.chu.dao.IdentifDao;
import com.example.chu.dao.RegisterDao;
import com.example.chu.service.facade.IdentifService;
import com.example.chu.service.facade.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IdentifServiceImpl implements IdentifService {
@Autowired
    private IdentifDao identifDao;

    @Override
    public Identif findByIid(Long iid) {
        return identifDao.findByIid(iid);
    }

    @Override
    public int deleteByIid(Long iid) {
        return identifDao.deleteByIid(iid);
    }


    public List<Identif> findAll() {
        return identifDao.findAll();
    }
    public Identif save(Identif identif){
        Identif ide=null;

        if (findByIid(identif.getIid())== null){
            ide = identifDao.save(identif);
        }
        return ide;

    }

}
