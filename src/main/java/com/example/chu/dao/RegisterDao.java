package com.example.chu.dao;

import com.example.chu.bean.Register;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegisterDao extends JpaRepository<Register,Long> {
    Register findByCin (String cin);
    Register findByCode (String code);
    int deleteByCin (String cin);
    int deleteByCode (String code);
    List<Register> findAllByCin (String cin);
}
