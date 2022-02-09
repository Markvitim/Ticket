package ru.netology.domain;

import java.util.Comparator;

public class TravelTimeComparator implements Comparator<Ticket> {

    public int compare(Ticket o1, Ticket o2) {
        if (o1.getTravelTime() == o2.getTravelTime()) {
            return 0;
        }
        if (o1.getTravelTime() > o2.getTravelTime()) {
            return 1;
        } else {
            return -1;
        }
    }
}
