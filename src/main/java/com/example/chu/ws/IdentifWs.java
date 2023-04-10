package com.example.chu.ws;

import com.example.chu.bean.Identif;
import com.example.chu.service.facade.IdentifService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/identif")
public class IdentifWs {
    @Autowired
    private IdentifService identifService;
@GetMapping("/iid/{iid}")
    public Identif findByIid(@PathVariable Long iid) {
        return identifService.findByIid(iid);
    }
@Transactional
@DeleteMapping("/iid/{iid}")
    public int deleteByIid(@PathVariable Long iid) {
        return identifService.deleteByIid(iid);
    }
@PostMapping("/")
    public Identif save(@RequestBody Identif identif) {
        return identifService.save(identif);
    }
@GetMapping("/")
    public List<Identif> findAll() {
        return identifService.findAll();
    }
}
