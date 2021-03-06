package com.bilgeadam.odevsehirapp.controller;

import com.bilgeadam.odevsehirapp.entity.Sehir;
import com.bilgeadam.odevsehirapp.exception.SehirNotFoundException;
import com.bilgeadam.odevsehirapp.repository.SehirRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class SehirController {

    @Autowired
    private SehirRepository sehirRepository;

    @GetMapping("/sehir/{id}")
    public Sehir getSehir(@PathVariable("id") long id)
    {
        Sehir sehir = null;
        Optional<Sehir> sehirDB = sehirRepository.findById(id);
        if(sehirDB.isPresent())
        {
            sehir = sehirDB.get();
            return sehir;
        }
        else
        {
            throw new SehirNotFoundException(id + "nolu sehir bulunamad─▒");
        }
    }
    @GetMapping("/sehir")
    public List<Sehir> getTumSehirler()
    {
       return sehirRepository.findAll();
    }
    @GetMapping("/sehir/ara/ad/{ad}")
    public Sehir findSehirByAd(@PathVariable("ad") String ad)
    {
        Sehir sehir = sehirRepository.findByAd(ad);
        return sehir;
    }
    @GetMapping("/sehirad/{id}")
    public String getSehirAd(@PathVariable("id") long id)
    {
        Sehir sehir = getSehir(id);

        return sehir.getAd();
    }
}
