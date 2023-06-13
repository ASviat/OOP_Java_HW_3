package Task02;

import java.util.Comparator;

/**
 * DoseComparator
 */

public class DoseComparator implements Comparator<Punished> {
    @Override
    public int compare(Punished o1, Punished o2) {

        return Integer.compare(Integer.parseInt(o1.doseTaken), Integer.parseInt(o2.doseTaken));

    }

}