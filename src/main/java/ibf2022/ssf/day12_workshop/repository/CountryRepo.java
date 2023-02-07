package ibf2022.ssf.day12_workshop.repository;

import java.util.*;

import ibf2022.ssf.day12_workshop.model.Country; 

public class CountryRepo {

    List<Country> countryList; 
    Country cty = new Country(); 

    public List<Country>getAllCountries(){
    countryList = new ArrayList<Country>(); 
    cty = new Country("SG", "Singapore", 600000); 
    countryList.add(cty);

    cty = new Country("MY", "Malaysia", 60000); 
    countryList.add(cty);

    return countryList; 
    }

    public Boolean createCountry(Country cty){
        if (countryList == null){
            countryList = new ArrayList<Country>();
        }
        countryList.add(cty); 
        return true; 
    }
    
}
