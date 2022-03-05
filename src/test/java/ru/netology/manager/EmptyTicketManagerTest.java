package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Ticket;
import ru.netology.domain.TravelTimeComparator;

public class EmptyTicketManagerTest {
    private TicketManager manager = new TicketManager();


    @Test
    public void shouldRemoveById() {
        TravelTimeComparator comparator = new TravelTimeComparator();
        manager.shouldRemoveById(2);
        Ticket[] expected = new Ticket[]{};
        Assertions.assertArrayEquals(expected, manager.shouldGetAll("VKO", "LED", comparator));
    }

    @Test
    public void shouldGetAll() {
        TravelTimeComparator comparator = new TravelTimeComparator();
        Ticket[] expected = new Ticket[]{};
        Assertions.assertArrayEquals(expected, manager.shouldGetAll("VKO", "LED",
                comparator));
    }
}
