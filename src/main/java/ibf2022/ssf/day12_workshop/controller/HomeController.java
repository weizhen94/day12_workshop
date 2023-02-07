package ibf2022.ssf.day12_workshop.controller;

import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path={"/home", "/index"})
public class HomeController {

    @GetMapping("/firstpage")
    //for the controller to access the index.html file, index html needs to be outside of the static folder, static folder means data does not change, if data changes, the html used by the controller needs to be in the templates folder
    public String home(Model model){
        Calendar cal = Calendar.getInstance(); 
        model.addAttribute("currHour", cal.get(Calendar.HOUR_OF_DAY)); 

        model.addAttribute("currTime", new Date().toString()); 
        return "index"; 
    }
    
}
