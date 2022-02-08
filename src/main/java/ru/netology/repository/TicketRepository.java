package ru.netology.repository;

import ru.netology.domain.Ticket;

public class TicketRepository {
    private Ticket[] tickets = new Ticket[0];

    public void save(Ticket ticket) {
        Ticket[] tmp = new Ticket[tickets.length + 1];
        System.arraycopy(tickets, 0, tmp, 0, tickets.length);
        tmp[tmp.length - 1] = ticket;
        this.tickets = tmp;
    }

    public void removeById(int idToRemove) {
        Ticket[] tmp = new Ticket[tickets.length - 1];
        int copyTo = 0;
        for (Ticket ticket : tickets) {
            if (ticket.getId() != idToRemove) {
                tmp[copyTo] = ticket;
                copyTo++;
            }
        }
        tickets = tmp;
    }

    public Ticket[] findAll() {
        return tickets;
    }

}
