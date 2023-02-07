package ibf2022.ssf.day12_workshop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//this uses lombok to generate getters and setters and constructors automatically
@Data
@NoArgsConstructor
@AllArgsConstructor

//this adds item so it's in the model folder
public class Item {
    private String itemName; 
    private Integer quantity; 

    
}
