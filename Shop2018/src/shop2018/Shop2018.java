
package shop2018;

import java.math.BigDecimal;


public class Shop2018 {

    
    public static void main(String[] args) {
        produkt chleb = new produkt("chleb", new BigDecimal("2.1"));
        produkt olej = new produkt("olej", new BigDecimal("3.1"));
        produkt Woda = new produkt("Woda", new BigDecimal("1.8"));
        produkt Bulka = new produkt("Bulka", new BigDecimal("0.45"));
        
        koszyk Koszyk = new koszyk();
        Koszyk.dodaj(chleb);
        Koszyk.dodaj(chleb);
        Koszyk.dodaj(Woda);
        Koszyk.dodaj(Bulka);
        
        System.out.println(Koszyk.doZaplaty());
        
    }
    
}
