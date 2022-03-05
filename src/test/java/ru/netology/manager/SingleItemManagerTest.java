package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Ticket;

import java.util.Arrays;

public class SingleItemManagerTest {
    private TicketManager manager = new TicketManager();
    private Ticket eleven = new Ticket(11, 2800, "VKO", "LED", 1);


    @BeforeEach
    public void shouldAdd() {
        manager.shouldAdd(eleven);
    }

    @Test
    public void shouldRemoveByIdEleven() {
        manager.shouldRemoveById(11);
        Ticket[] expected = new Ticket[]{};
        Assertions.assertArrayEquals(expected, manager.shouldGetAll("VKO", "LED"));
    }


    @Test
    public void shouldGetAll() {
        Ticket[] expected = new Ticket[]{eleven};
        Assertions.assertArrayEquals(expected, manager.shouldGetAll("VKO", "LED"));
    }

    @Test
    public void shouldGetAlVkoKja() {
        Ticket[] expected = new Ticket[]{};
        Assertions.assertArrayEquals(expected, manager.shouldGetAll("VKO", "KJA"));
    }

    @Test
    public void shouldSortByPrice() {
        Ticket[] expected = new Ticket[]{eleven};
        Ticket[] actual = manager.shouldGetAll("VKO", "LED");
//        Arrays.sort(actual);
        Assertions.assertArrayEquals(expected, actual);
    }
}
