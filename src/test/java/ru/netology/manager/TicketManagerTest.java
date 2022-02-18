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
    private Ticket four = new Ticket(4, 1, "VKO", "LED", 3);
    private Ticket eleven = new Ticket(11, 10000, "VKO", "LED", 50);
    private Ticket twelve = new Ticket(12, 2500, "VKO", "KJA", 2);
    private Ticket nine = new Ticket(9, 8500, "DME", "KJA", 0);
    private Ticket seven = new Ticket(7, 0, "VKO", "LED", 5);
    private Ticket eight = new Ticket(7, 2801, "VKO", "LED", 2);

    @BeforeEach
    public void shouldAdd() {
        manager.shouldAdd(first);
        manager.shouldAdd(second);
        manager.shouldAdd(third);
        manager.shouldAdd(four);
        manager.shouldAdd(twelve);
        manager.shouldAdd(seven);
        manager.shouldAdd(eleven);
        manager.shouldAdd(nine);
        manager.shouldAdd(eight);

    }

    @Test
    public void shouldRemoveById() {
        manager.shouldRemoveById(2);
        Ticket[] expected = new Ticket[]{third, four,seven, eleven, eight};
        Assertions.assertArrayEquals(expected, manager.shouldGetAll("VKO", "LED", Ticket::compareTo));
    }

    @Test
    public void shouldGetAll() {
        Ticket[] expected = new Ticket[]{second, third, four,seven, eleven, eight};
        Assertions.assertArrayEquals(expected, manager.shouldGetAll("VKO", "LED",
                Ticket::compareTo));
    }

    @Test
    public void shouldSortPrice(){
        Ticket[] expected = new Ticket[]{seven, four, third, eight, second, eleven};
        Ticket[] actual = manager.shouldGetAll("VKO", "LED", Ticket::compareTo);
        Arrays.sort(actual);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSortTravelTime() {
        TravelTimeComparator comparator = new TravelTimeComparator();
        Ticket[] expected = new Ticket[]{second, eight, third, four, seven, eleven};
        Ticket[] actual = manager.shouldGetAll("VKO", "LED", comparator);
        Arrays.sort(actual, comparator);
        Assertions.assertArrayEquals(expected, actual);
    }
}