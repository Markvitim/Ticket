package ru.netology.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Ticket;

class TicketRepositoryTest {
    private TicketRepository repository = new TicketRepository();
    private Ticket first = new Ticket(1, 8000, "DME", "KJA", 4);
    private Ticket second = new Ticket(2, 3000, "VKO", "LED", 2);
    private Ticket third = new Ticket(3, 2800, "VKO", "LED", 2);
    private Ticket four = new Ticket(4, 2500, "VKO", "LED", 2);
    private Ticket five = new Ticket(5, 8500, "DME", "KJA", 4);
    private Ticket six = new Ticket(6, 8600, "VKO", "KJA", 4);

    @BeforeEach
    public void setUp() {
        repository.save(first);
        repository.save(second);
        repository.save(third);
        repository.save(four);
        repository.save(five);
        repository.save(six);
    }

    @Test
    public void shouldRemoveById() {
        repository.removeById(6);
        Ticket[] expected = new Ticket[]{first, second, third, four, five};
        Assertions.assertArrayEquals(expected, repository.findAll());
    }

    @Test
    public void shouldFindAll() {
        Ticket[] expected = new Ticket[]{first, second, third, four, five, six};
        Assertions.assertArrayEquals(expected, repository.findAll());
    }
}