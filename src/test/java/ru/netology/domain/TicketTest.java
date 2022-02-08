package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {
    private Ticket first = new Ticket(1, 8000, "DME", "KJA", 4);
    private Ticket second = new Ticket(2, 3000, "VKO", "LED", 2);
    private Ticket third = new Ticket(3, 2800, "VKO", "LED", 2);
    private Ticket four = new Ticket(4, 2500, "VKO", "LED", 2);
    private Ticket five = new Ticket(5, 8500, "DME", "KJA", 4);
    private Ticket six = new Ticket(6, 8600, "VKO", "KJA", 4);

    @Test
    public void shouldSortByPrice(){
        Ticket[] expected =new Ticket[]{four, third, second, first, five, six};
        Ticket[] actual = new Ticket[]{first, second, third, four, five, six};

        Arrays.sort(actual);
        Assertions.assertArrayEquals(expected, actual);
    }

}