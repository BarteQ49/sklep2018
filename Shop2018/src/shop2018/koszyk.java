
package shop2018;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class koszyk {
    private List<produkt> lista = new ArrayList();
    
    public void dodaj(produkt p)
    {
        lista.add(p);
    }
    
    public BigDecimal doZaplaty()
    {
        BigDecimal suma = BigDecimal.ZERO;
        for (produkt p : lista)
        {
           suma=suma.add(p.gCena());
        }
        return suma;
    }
    
    public String toString()
    {
        return lista.toString()+" "+doZaplaty();
    }
    
}
