package com.example.chu.dao;

import com.example.chu.bean.Prestation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PrestationDao extends JpaRepository<Prestation,Long> {
   Prestation findByIdd (Long idd);
   int deleteByIdd (Long idd);

}
