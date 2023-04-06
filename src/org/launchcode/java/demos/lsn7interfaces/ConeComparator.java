package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone> {


    @Override
    public int compare(Cone o1, Cone o2) {
        double o1Cost = o1.getCost();
        double o2Cost = o2.getCost();
        if (o1Cost - o2Cost < 0) {
            return -1;
        } else if (o1Cost - o2Cost > 0) {
            return 1;
        } else {
            return 0;
        }
    }

}
