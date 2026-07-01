package com.cognizant.ormlearn.service;

import com.cognizant.ormlearn.entity.Country;
import com.cognizant.ormlearn.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

    @Autowired
    private CountryRepository repository;

    public void addCountry(Country country) {
        repository.save(country);
    }

    public Country getCountry(String code) {
        return repository.findById(code).orElse(null);
    }
  public void updateCountry(String code, String newName) {

    Country country = repository.findById(code).orElse(null);

    if (country != null) {
        country.setName(newName);
        repository.save(country);
    }
}

}
