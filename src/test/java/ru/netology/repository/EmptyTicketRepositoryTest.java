package ru.netology.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Ticket;

public class EmptyTicketRepositoryTest {
    private TicketRepository repository = new TicketRepository();

    @Test
    public void shouldRemoveById() {
        repository.removeById(11);
        Ticket[] expected = new Ticket[]{};
        Assertions.assertArrayEquals(expected, repository.findAll());
    }

    @Test
    public void shouldFindAll() {
        Ticket[] expected = new Ticket[]{};
        Assertions.assertArrayEquals(expected, repository.findAll());
    }
}
