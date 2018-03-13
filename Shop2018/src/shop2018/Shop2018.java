
package shop2018;

import java.math.BigDecimal;


public class Shop2018 {

    
    public static void main(String[] args) {
        product chleb = new product("chleb", new BigDecimal("2.1"));
        product olej = new product("olej", new BigDecimal("3.1"));
        product Woda = new product("Woda", new BigDecimal("1.8"));
        product Bulka = new product("Bulka", new BigDecimal("0.45"));
        
        cart Koszyk = new cart();
        Koszyk.add(chleb);
        Koszyk.add(chleb);
        Koszyk.add(Woda);
        Koszyk.add(Bulka);
        
        System.out.println(Koszyk.toPay());
        System.out.println(Koszyk);
        
        Warehouse w = new Warehouse();
        System.out.println(w);
        w.doOrder(Koszyk);
        System.out.println(w);
        
    }
    
}
