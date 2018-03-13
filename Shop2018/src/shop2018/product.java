
package shop2018;

import java.math.BigDecimal;
import java.util.Comparator;


public class product implements Comparable<product>{
    private String name;
    private BigDecimal price;
    private int count = 100;
    
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
        return name + " ("+price+" zl "+ count +" szt.)"; 
    }
    
    public int gCount()
    {
        return count;
    }
    
    public void setCount(int count)
    {
        this.count = count;
    }

    @Override
    public int compareTo(product second) {
        return name.compareTo(second.name);
    }
    
     
    
    
}
