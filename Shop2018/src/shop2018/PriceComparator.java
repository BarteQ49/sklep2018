
package shop2018;

import java.util.Comparator;


public class PriceComparator implements Comparator<product> {

    @Override
    public int compare(product p1, product p2) {
        
            return p1.gPrice().compareTo(p2.gPrice());
    }
    
}
