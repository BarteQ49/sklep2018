
package shop2018;

import java.util.ArrayList;
import java.util.List;


public class koszyk {
    private List<produkt> lista = new ArrayList();
    
    public void dodaj(produkt p)
    {
        lista.add(p);
    }
    
    public double doZaplaty()
    {
        double suma = 0;
        for (produkt p : lista)
        {
           suma+=p.gCena();
        }
        return suma;
    }
    
}
