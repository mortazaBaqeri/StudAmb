package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository     //definerer dette classen som en repostory
public class BestillingRepository {

    @Autowired
    private JdbcTemplate db;

    public void lagreBesilling(Bestilling enBestilling){
        String sql = "INSERT INTO kunde_tbl (film, antall, fornavn, etternavn, telefonnr, email) VALUES(?,?,?,?,?,?)";
        db.update(sql, enBestilling.getFilm(), enBestilling.getAntall(), enBestilling.getFornavn(),
                       enBestilling.getEtternavn(), enBestilling.getTelefonNr(), enBestilling.getEmail());
    }

    public List<Bestilling> hentAlle(){
        String sql = "SELECT * FROM kunde_tbl ORDER BY etternavn";
        List<Bestilling> alleBestillinger = db.query(sql, new BeanPropertyRowMapper(Bestilling.class));
        return alleBestillinger;
    }

    public void slettAlle(){
        String sql = "DELETE FROM kunde_tbl";
        db.update(sql);

    }

}
