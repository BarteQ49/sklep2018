
package shop2018;


public class produkt {
    private String nazwa;
    private double cena;
    
    public produkt(String nazwa, double cena){
        this.nazwa = nazwa;
        this.cena = cena;
        
    }
    public String gNazwa()
    {
        return nazwa;
    }
    
    public double gCena()
    {
        return cena;
    }
    
}
