package com.bilgeadam.odevsehirapp.repository;

import com.bilgeadam.odevsehirapp.entity.Sehir;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SehirRepository extends JpaRepository<Sehir, Long> {

    Sehir findByAd(String ad);


}
