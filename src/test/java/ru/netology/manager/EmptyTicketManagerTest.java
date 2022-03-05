package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Ticket;


public class EmptyTicketManagerTest {
    private TicketManager manager = new TicketManager();

    @Test
    public void shouldRemoveById() {
        manager.shouldRemoveById(2);
        Ticket[] expected = new Ticket[]{};
        Assertions.assertArrayEquals(expected, manager.shouldGetAll("VKO", "LED"));
    }

    @Test
    public void shouldGetAll() {
        Ticket[] expected = new Ticket[]{};
        Assertions.assertArrayEquals(expected, manager.shouldGetAll("VKO", "LED"));
    }
}
