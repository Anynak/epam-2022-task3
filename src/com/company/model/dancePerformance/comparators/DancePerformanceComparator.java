package com.company.model.dancePerformance.comparators;

import com.company.model.dancePerformance.DancePerformance;

import java.util.Comparator;

public class DancePerformanceComparator implements Comparator<DancePerformance> {

    @Override
    public int compare(DancePerformance o1, DancePerformance o2) {
        return Integer.compare(o1.getNumber(), o2.getNumber());
    }
}
