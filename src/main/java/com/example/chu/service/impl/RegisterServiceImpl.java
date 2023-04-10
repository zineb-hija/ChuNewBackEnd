package com.example.chu.service.impl;

import com.example.chu.bean.Register;
import com.example.chu.dao.RegisterDao;
import com.example.chu.service.facade.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegisterServiceImpl implements RegisterService {
@Autowired
    private RegisterDao registerDao;

    @Override
    public Register findByCin(String cin) {
        return registerDao.findByCin(cin);
    }

    @Override
    public Register findByCode(String code) {
        return registerDao.findByCode(code);
    }

    @Override
    public int deleteByCin(String cin) {
        return registerDao.deleteByCin(cin);
    }

    @Override
    public int deleteByCode(String code) {
        return registerDao.deleteByCode(code);
    }





    @Override
    public List<Register> findAll() {
        return registerDao.findAll();
    }

    public Register save(Register register){
        Register res=null;

        if (findByCin(register.getCin())== null){
            res = registerDao.save(register);
        }
        return res;

    }


}
