package Task03;

import java.util.Comparator;

/**
 * PriceComparator
 */
public class PriceComparator implements Comparator<Pen> {
    @Override
    public int compare(Pen o1, Pen o2) {

        return Integer.compare(o1.price, o2.price);
    }
}