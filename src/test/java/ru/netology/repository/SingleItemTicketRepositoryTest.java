package ru.netology.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Ticket;

public class SingleItemTicketRepositoryTest {
    private TicketRepository repository = new TicketRepository();
    private Ticket eleven = new Ticket(11, 2800, "VKO", "LED", 1);


    @BeforeEach
    public void setUp() {
        repository.save(eleven);
    }

    @Test
    public void shouldRemoveById() {
        repository.removeById(11);
        Ticket[] expected = new Ticket[]{};
        Assertions.assertArrayEquals(expected, repository.findAll());
    }

    @Test
    public void shouldFindAll() {
        Ticket[] expected = new Ticket[]{eleven};
        Assertions.assertArrayEquals(expected, repository.findAll());
    }
}
