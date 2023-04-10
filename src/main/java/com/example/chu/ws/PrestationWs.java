package com.example.chu.ws;

import com.example.chu.bean.Prestation;
import com.example.chu.service.facade.PrestationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/prestation")
public class PrestationWs {
    @Autowired
    private PrestationService prestationService;

    @GetMapping("/idd/{idd}")

    public Prestation findByIdd(@PathVariable Long idd) {
        return prestationService.findByIdd(idd);
    }

    @Transactional
    @DeleteMapping("/idd/{idd}")
    public int deleteByIdd(@PathVariable Long idd) {
        return prestationService.deleteByIdd(idd);
    }

    @PostMapping("/")

    public Prestation save(@RequestBody Prestation prestation) {

        return prestationService.save(prestation);
    }
@GetMapping("/")
    public List<Prestation> findAll() {
        return prestationService.findAll();
    }
}





