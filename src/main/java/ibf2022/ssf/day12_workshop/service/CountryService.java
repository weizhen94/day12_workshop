package ibf2022.ssf.day12_workshop.service;

import java.util.List;

import ibf2022.ssf.day12_workshop.model.Country;
import ibf2022.ssf.day12_workshop.repository.CountryRepo;

public class CountryService {

    CountryRepo ctyRepo; 

    public CountryService(){
        ctyRepo = new CountryRepo(); 
    }

    public List<Country> getAllCountries(){
        return ctyRepo.getAllCountries(); 
    }

    public Boolean createCountry(Country cty){
        Boolean result = ctyRepo.createCountry(cty); 
        return result; 
    }
    
}
