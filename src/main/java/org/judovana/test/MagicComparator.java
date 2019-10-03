package org.judovana.test;

import java.util.Comparator;

class MagicComparator implements Comparator<Integer> {

    public int compare(Integer i1, Integer i2) {
        return i1 - i2;
    }
}
