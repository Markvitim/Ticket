package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Ticket;
import ru.netology.domain.TravelTimeComparator;

import java.util.Arrays;

class TicketManagerTest {
    private TicketManager manager = new TicketManager();
    private Ticket first = new Ticket(1, 8000, "DME", "KJA", 4);
    private Ticket second = new Ticket(2, 3000, "VKO", "LED", 1);
    private Ticket third = new Ticket(3, 2800, "VKO", "LED", 3);
    private Ticket four = new Ticket(4, 2500, "VKO", "LED", 2);


    @BeforeEach
    public void shouldAdd() {
        manager.shouldAdd(first);
        manager.shouldAdd(second);
        manager.shouldAdd(third);
        manager.shouldAdd(four);
    }

    @Test
    public void shouldRemoveById() {
        TravelTimeComparator comparator = new TravelTimeComparator();
        manager.shouldRemoveById(2);
        Ticket[] expected = new Ticket[]{third, four};
        Assertions.assertArrayEquals(expected, manager.shouldGetAll("VKO", "LED", Ticket::compareTo));
    }

    @Test
    public void shouldGetAll() {
        Ticket[] expected = new Ticket[]{second, third, four};
        Assertions.assertArrayEquals(expected, manager.shouldGetAll("VKO", "LED",
                Ticket::compareTo));
    }

    @Test
    public void shouldSortPrice(){
        Ticket[] expected = new Ticket[]{four, third, second};
        Ticket[] actual = manager.shouldGetAll("VKO", "LED", Ticket::compareTo);
        Arrays.sort(actual);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSortTravelTime() {
        TravelTimeComparator comparator = new TravelTimeComparator();
        Ticket[] expected = new Ticket[]{second, four, third};
        Ticket[] actual = manager.shouldGetAll("VKO", "LED", comparator);
        Arrays.sort(actual, comparator);
        Assertions.assertArrayEquals(expected, actual);
    }
}