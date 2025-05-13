package com.prospring.mvc.repos;

import com.prospring.mvc.entities.Singer;

import java.time.LocalDate;
import java.time.ZoneId;

public class SingerService {
    SingerRepo repo;

    public Iterable<Singer> searchByBirthDate(LocalDate date){
         return this.repo.findByBirthDate(date.atStartOfDay(ZoneId.systemDefault()));
    }
}
