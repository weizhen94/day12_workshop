package ibf2022.ssf.day12_workshop.repository;

import org.springframework.stereotype.Repository;
import ibf2022.ssf.day12_workshop.model.Item;
import lombok.Data;


import java.util.*; 

@Data

@Repository
public class ItemRepo {

     

    public List<Item> getCartItems(){

    List<Item> itemList = new ArrayList<Item>();

    Item itm; 

        itm = new Item(); 
        itm.setItemName("Chanel"); 
        itm.setQuantity(6); 
        itemList.add(itm); 

        itm = new Item(); 
        itm.setItemName("Hermes"); 
        itm.setQuantity(15); 
        itemList.add(itm); 

        itm = new Item(); 
        itm.setItemName("Prada"); 
        itm.setQuantity(5); 
        itemList.add(itm); 

        return itemList; 
    }
}
