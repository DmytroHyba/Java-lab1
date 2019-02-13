package com.company;

public class Park {

    private String address = "Zelena str.";
    private int lenght;
    private int ticketPrice;
    private String name;
    private String name1 = "Z1";
    protected String city = "Lviv";
    protected String country = "Ukraine";
    private static int EntranceTicketPrice = 0;

    public Park(String address) {
        this.address = address;
    }

    public Park() {

    }

    public Park(String address, int lenght, int ticketPrice, String nameTrees) {

        this.address = address;
        this.lenght = lenght;
        this.ticketPrice = ticketPrice;
        this.name = name;
    }

    public Park(String address,
                int lenght,
                int ticketPrize,
                String nameTrees,
                String name,
                String city,
                String country) {
        this.address = address;
        this.lenght = lenght;
        this.ticketPrice = ticketPrice;
        this.name = nameTrees;
    }

    public String getNameTrees() {

        return name;
    }

    public void setNameTrees(String nameTrees) {

        this.name = nameTrees;
    }

    public String getName_park() {
        return name;
    }

    public void setName_park(String namePark) {

        this.name = namePark;
    }

    public static void printStaticEntranceTicketPrice() {

        System.out.println(EntranceTicketPrice + "ticket price.");
    }

    public void printEntranceTicketPrice() {

        System.out.println(EntranceTicketPrice + "ticket price");
    }

    public String toString() {
        String information = "\nInformation about Park:\n";
        information += "Address:" + address + "\n";
        information += "Lenght:" + lenght + "\n";
        information += "Ticket_price:" + ticketPrice + "\n";
        information += "Country:" + country + "\n";
        information += "Name_park:" + name + "\n";
        information += "City:" + city + "\n";
        information += "Name_trees:" + name;
        return information;
    }

    public void resetValues(String address,
                            int lenght,
                            int ticketPrice,
                            String nameTrees,
                            String namePark,
                            String city,
                            String country) {

        this.address = address;
        this.lenght = lenght;
        this.ticketPrice = ticketPrice;
        this.country = country;
        this.name = namePark;
        this.city = city;
        this.name = nameTrees;
    }
}


