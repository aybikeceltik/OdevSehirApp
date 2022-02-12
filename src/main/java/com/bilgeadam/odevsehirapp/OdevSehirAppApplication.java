package com.bilgeadam.odevsehirapp;

import com.bilgeadam.odevsehirapp.entity.Sehir;
import com.bilgeadam.odevsehirapp.repository.SehirRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OdevSehirAppApplication implements CommandLineRunner {

    @Autowired
    private SehirRepository sehirRepository;

    public static void main(String[] args) {
        SpringApplication.run(OdevSehirAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Sehir sehir1 = new Sehir();
        sehir1.setAd("Ankara");
        Sehir sehir2 = new Sehir();
        sehir2.setAd("Samsun");
        Sehir sehir3 = new Sehir();
        sehir3.setAd("Bursa");

        sehirRepository.save(sehir1);
        sehirRepository.save(sehir2);
        sehirRepository.save(sehir3);
    }
}
