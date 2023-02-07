package ibf2022.ssf.day12_workshop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Country {
    private String code; 
    private String name; 
    private Integer population; 
    
}
