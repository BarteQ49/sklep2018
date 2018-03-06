
package shop2018;

import java.math.BigDecimal;


public class produkt {
    private String nazwa;
    private BigDecimal cena;
    
    public produkt(String nazwa, BigDecimal cena){
        this.nazwa = nazwa;
        this.cena = cena;
        
    }
    public String gNazwa()
    {
        return nazwa;
    }
    
    public BigDecimal gCena()
    {
        return cena;
    }
    
    public String toString()
    {
        return nazwa + " ("+cena+"zl)"; 
    }
    
}
