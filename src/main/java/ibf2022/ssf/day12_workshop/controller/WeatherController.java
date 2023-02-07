package ibf2022.ssf.day12_workshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam; 
import org.springframework.web.bind.annotation.PathVariable; 
import org.springframework.ui.Model;

@Controller
@RequestMapping("/weather")
public class WeatherController {

    @GetMapping
    //request parameter is true means need to put city city?Singapore
    public String weather(@RequestParam(required = true) String city, @RequestParam(name="units", defaultValue="kilometers") String units, Model model){

        model.addAttribute("city", city); 
        model.addAttribute("units", units); 
        return "weather"; 
    }

    //http://localhost:8080/weather/Singapore?units=meters
    @GetMapping("{country}")
    
    public String weather2(@PathVariable(name="country", required = true) String city, @RequestParam(name="units", defaultValue="kilometers") String units, Model model){

        model.addAttribute("city", city); 
        model.addAttribute("units", units); 
        return "weather"; 
    }

    
}
