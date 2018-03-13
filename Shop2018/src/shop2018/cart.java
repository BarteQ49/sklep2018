
package shop2018;

import java.math.BigDecimal;
//import java.util.ArrayList;
import java.util.HashMap;
//import java.util.List;
import java.util.Map;


public class cart {
    //private List<produkt> lista = new ArrayList();
    
    private Map<product, Integer> map = new HashMap();
    
    public void add(product p)
    {
       // lista.add(p);
        if(map.containsKey(p))
        {
            int i = map.get(p);
            i++;
            map.put(p,i);   
        }
        else
        {
            map.put(p,1);
        }    
    }
    
    public BigDecimal toPay()
    {
        BigDecimal suma = BigDecimal.ZERO;
        //for (produkt p : lista)
        for(product p : map.keySet())
        {
            int ilosc = map.get(p);
           //suma=suma.add(p.gCena());
           suma = suma.add(p.gPrice().multiply(new BigDecimal(ilosc)));
        }
        return suma;
    }
    
    public String toString()
    {
        //return lista.toString()+" "+doZaplaty();
        return map.toString()+" "+toPay();
    }
    
}
