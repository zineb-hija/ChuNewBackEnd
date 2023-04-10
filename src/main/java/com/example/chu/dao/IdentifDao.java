package com.example.chu.dao;

import com.example.chu.bean.Identif;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdentifDao extends JpaRepository<Identif,Long> {
    Identif findByIid (Long iid);
    int deleteByIid (Long iid);
    boolean existsByIid(Long iid);
}
