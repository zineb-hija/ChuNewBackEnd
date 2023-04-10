package com.example.chu.ws;

import com.example.chu.bean.Register;
import com.example.chu.service.facade.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/register")
public class RegisterWs {
    @Autowired
    private RegisterService registerService;
@GetMapping("/")
    public List<Register> findAll() {
        return registerService.findAll();
    }
@GetMapping("/cin/{cin}")
    public Register findByCin(@PathVariable String cin) {
        return registerService.findByCin(cin);
    }
@Transactional
@DeleteMapping("/cin/{cin}")
    public int deleteByCin(@PathVariable String cin) {
        return registerService.deleteByCin(cin);
    }
@GetMapping("/code/{code}")
    public Register findByCode(@PathVariable String code) {
        return registerService.findByCode(code);
    }
 @Transactional
 @DeleteMapping("/code/{code}")
    public int deleteByCode(@PathVariable String code) {
        return registerService.deleteByCode(code);
    }
@PostMapping("/")
    public Register save(@RequestBody Register register) {
        return registerService.save(register);
    }
}
