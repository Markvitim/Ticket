package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Ticket;


class TicketManagerTest {
    private TicketManager manager = new TicketManager();
    private Ticket first = new Ticket(1, 8000, "DME", "KJA", 4);
    private Ticket second = new Ticket(2, 3000, "VKO", "LED", 2);
    private Ticket third = new Ticket(3, 2800, "VKO", "LED", 2);
    private Ticket four = new Ticket(4, 2500, "VKO", "LED", 2);
    private Ticket five = new Ticket(5, 8500, "DME", "KJA", 4);
    private Ticket six = new Ticket(6, 8600, "VKO", "KJA", 4);
    private Ticket eleven = new Ticket(11, 2800, "VKO", "LED", 1);
    private Ticket ten = new Ticket(10, 2600, "VKO", "LED", 2);
    private Ticket nine = new Ticket(9, 9500, "DME", "KJA", 4);
    private Ticket fifteen = new Ticket(15, 8300, "VKO", "LED", 4);

    @BeforeEach
    public void shouldAdd() {
        manager.shouldAdd(first);
        manager.shouldAdd(four);
        manager.shouldAdd(third);
        manager.shouldAdd(second);
        manager.shouldAdd(five);
        manager.shouldAdd(six);
        manager.shouldAdd(fifteen);
        manager.shouldAdd(nine);
        manager.shouldAdd(ten);
        manager.shouldAdd(eleven);
    }

    @Test
    public void shouldRemoveById() {
        manager.shouldRemoveById(2);
        Ticket[] expected = new Ticket[]{four, ten, third, eleven, fifteen};
        Ticket[] actual = manager.shouldGetAll("VKO", "LED");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetAll() {
        Ticket[] expected = new Ticket[]{four, ten, third, eleven, second, fifteen};
        Assertions.assertArrayEquals(expected, manager.shouldGetAll("VKO", "LED"));
    }

//    @Test
//    public void shouldSortByPrice() {
//        Ticket[] expected = new Ticket[]{four, ten, third, eleven, second, fifteen};
//        Ticket[] actual = manager.shouldGetAll("VKO", "LED");
////        Arrays.sort(actual);
//        Assertions.assertArrayEquals(expected, actual);
//    }
}