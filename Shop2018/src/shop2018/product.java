
package shop2018;

import java.math.BigDecimal;


public class product {
    private String name;
    private BigDecimal price;
    
    public product(String name, BigDecimal price){
        this.name = name;
        this.price = price;
        
    }
    public String gName()
    {
        return name;
    }
    
    public BigDecimal gPrice()
    {
        return price;
    }
    
    public String toString()
    {
        return name + " ("+price+"zl)"; 
    }
    
}
