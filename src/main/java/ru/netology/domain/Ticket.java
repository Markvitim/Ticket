package ru.netology.domain;

public class Ticket implements Comparable<Ticket> {
    private int id;
    private int price;
    private String airportFrom;
    private String airportTo;
    private int travelTime;

    public Ticket() {
    }

    public Ticket(int id, int price, String airportDeparture, String airportArrival, int travelTime) {
        this.id = id;
        this.price = price;
        this.airportFrom = airportDeparture;
        this.airportTo = airportArrival;
        this.travelTime = travelTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAirportFrom() {
        return airportFrom;
    }

    public void setAirportFrom(String airportFrom) {
        this.airportFrom = airportFrom;
    }

    public String getAirportTo() {
        return airportTo;
    }

    public void setAirportTo(String airportTo) {
        this.airportTo = airportTo;
    }

    public int getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(int travelTime) {
        this.travelTime = travelTime;
    }

    @Override
    public int compareTo(Ticket o) {
        if (this.price==o.price){
            return 0;
        } else if (this.price<o.price){
            return -1;
        } else {
            return 1;
        }
//        return this.price - o.price;
    }
}
