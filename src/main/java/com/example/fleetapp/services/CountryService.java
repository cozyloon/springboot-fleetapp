package com.example.fleetapp.services;

import com.example.fleetapp.models.Country;
import com.example.fleetapp.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {
    @Autowired
    private CountryRepository countryRepository;

    //return list of countries
    public List<Country> getCountries() {
        return countryRepository.findAll();
    }

    //save new country
    public void saveCountry(Country country) {
        countryRepository.save(country);
    }

    //get by id
    public Optional<Country> findCountry(int id) {
        return countryRepository.findById(id);
    }


    public void delete(Integer id) {
        countryRepository.deleteById(id);
    }
}
