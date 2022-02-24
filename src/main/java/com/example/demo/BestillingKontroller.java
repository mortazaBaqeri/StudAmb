package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController

public class BestillingKontroller {
    @Autowired
    BestillingRepository repo;

    @PostMapping("/lagre")
    public void lagreBestilling(Bestilling enBestilling){
        repo.lagreBesilling(enBestilling);
    }

    @GetMapping("/hent")
    public List<Bestilling> hentAlle(){
        return repo.hentAlle();
    }

    @DeleteMapping("/slett")
    public void slettAlle(){
        repo.slettAlle();
    }

}
