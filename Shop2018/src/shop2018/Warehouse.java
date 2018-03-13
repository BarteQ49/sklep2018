
package shop2018;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;


public class Warehouse {
    private List<product> products = new ArrayList();
    
    public Warehouse()
    {
        products.add(new product("Chleb", new BigDecimal("2.1")));
        products.add(new product("Olej", new BigDecimal("3.1")));
        products.add(new product("Woda", new BigDecimal("1.8")));
        products.add(new product("Bulka", new BigDecimal("0.45")));
        
    }
    
    public Collection<product> productsSortByName()
    {
        TreeSet set = new TreeSet();
        set.addAll(products);
        return set;
    }
    
    
    
    
    public Collection<product> productsSortByPrice()
    {
        PriceComparator c = new PriceComparator();
        TreeSet<product> set = new TreeSet(c);
        set.addAll(products);
        return set;
    }
    
    
    @Override
    public String toString()
    {
        return products.toString();
    }
    
    public static void main(String[] args) {
        Warehouse w = new Warehouse();
        System.out.println(w);
        System.out.println(w.productsSortByName());
        System.out.println(w.productsSortByPrice());
    }
    
}
