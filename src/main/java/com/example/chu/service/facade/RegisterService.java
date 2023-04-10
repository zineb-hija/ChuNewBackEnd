package com.example.chu.service.facade;

import com.example.chu.bean.Register;

import java.util.List;

public interface RegisterService {
    List<Register> findAll();
    Register findByCin(String cin);
    int deleteByCin(String cin);
    Register findByCode(String code);
    int deleteByCode(String code);
    Register save(Register register);



}
