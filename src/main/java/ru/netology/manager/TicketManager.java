package ru.netology.manager;

import ru.netology.domain.Ticket;
import ru.netology.repository.TicketRepository;

import java.util.Arrays;
import java.util.Comparator;

public class TicketManager {
    private TicketRepository repository = new TicketRepository();

    public TicketManager() {
    }

    public TicketManager(TicketRepository repository) {
        this.repository = repository;
    }

    public void shouldAdd(Ticket ticket) {
        repository.save(ticket);
    }

    public void shouldRemoveById(int idToRemove) {
        repository.removeById(idToRemove);
    }

    public Ticket[] shouldGetAll(String from, String to, Comparator<Ticket> comparator) {
        Ticket[] result = new Ticket[0];
        for (Ticket ticket : repository.findAll()) {
            if (ticket.getAirportFrom().contains(from) && ticket.getAirportTo().contains(to)) {
                Ticket[] tmp = new Ticket[result.length + 1];
                System.arraycopy(result, 0, tmp, 0, result.length);
                tmp[tmp.length - 1] = ticket;
                result = tmp;
            }
//            Arrays.sort(result, comparator);
        }
        return result;
        Arrays.sort(result, comparator);
    }
}
