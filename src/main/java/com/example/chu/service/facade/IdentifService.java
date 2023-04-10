package com.example.chu.service.facade;

import com.example.chu.bean.Identif;
import com.example.chu.bean.Register;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IdentifService {
    Identif findByIid (Long iid);
    int deleteByIid (Long iid);
    Identif save(Identif identif);
    List<Identif> findAll();


}
