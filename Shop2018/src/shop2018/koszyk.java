
package shop2018;

import java.math.BigDecimal;
//import java.util.ArrayList;
import java.util.HashMap;
//import java.util.List;
import java.util.Map;


public class koszyk {
    //private List<produkt> lista = new ArrayList();
    
    private Map<produkt, Integer> map = new HashMap();
    
    public void dodaj(produkt p)
    {
       // lista.add(p);
        map.put(p,1);
    }
    
    public BigDecimal doZaplaty()
    {
        BigDecimal suma = BigDecimal.ZERO;
        //for (produkt p : lista)
        for(produkt p : map.keySet())
        {
            int ilosc = map.get(p);
           //suma=suma.add(p.gCena());
           suma = suma.add(p.gCena().multiply(new BigDecimal(ilosc)));
        }
        return suma;
    }
    
    public String toString()
    {
        //return lista.toString()+" "+doZaplaty();
        return map.toString()+" "+doZaplaty();
    }
    
}
