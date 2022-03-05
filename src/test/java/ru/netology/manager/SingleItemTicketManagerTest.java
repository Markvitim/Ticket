package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Ticket;
import ru.netology.domain.TravelTimeComparator;

public class SingleItemTicketManagerTest {
    private TicketManager manager = new TicketManager();
    private Ticket eight = new Ticket(7, 2801, "VKO", "LED", 2);


    @BeforeEach
    public void shouldAdd() {
        manager.shouldAdd(eight);
    }

    @Test
    public void shouldRemoveById() {
        TravelTimeComparator comparator = new TravelTimeComparator();
        manager.shouldRemoveById(7);
        Ticket[] expected = new Ticket[]{};
        Assertions.assertArrayEquals(expected, manager.shouldGetAll("VKO", "LED", comparator));
    }

    @Test
    public void shouldGetAll() {
        TravelTimeComparator comparator = new TravelTimeComparator();
        Ticket[] expected = new Ticket[]{eight};
        Assertions.assertArrayEquals(expected, manager.shouldGetAll("VKO", "LED",
                comparator));
    }
}
