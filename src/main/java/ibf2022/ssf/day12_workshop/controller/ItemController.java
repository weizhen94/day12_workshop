package ibf2022.ssf.day12_workshop.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import ibf2022.ssf.day12_workshop.model.Item;
import ibf2022.ssf.day12_workshop.service.ItemService;

@Controller
@RequestMapping(path = {"/shoppingCart"})
public class ItemController {

    //this autowires to service class
    @Autowired
    ItemService itmsvc; 

    @GetMapping(produces = "text/html")
    public String displayCart(Model model){

        List<Item> items = itmsvc.retrieveitemList(); 
        model.addAttribute("cartItems", items); 
        return "cartList"; 
    }

    // @GetMapping
    // public String filteredCart(@PathVariable("name=itemname") String itemname, Model model){
    //     List<Item> items = itmsvc.retrieveitemList(); 
    //     Item foundItem = items.stream().filter(i -> i.getItemName().equalsIgnoreCase(itemname)).collect(Collectors.toList()); 
    //     model.addAttribute("cartItems", foundItems); 
    //     return "cartList"; 
    // }
    
}
