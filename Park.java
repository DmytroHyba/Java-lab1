package com.company;

public class Park {

    private String address = "Zelena str.";
    private int lenght ;
    private int ticketPrize;
    private String name;
    private String name1 = "Z1";
    protected String city = "Lviv";
    protected String country = "Ukraine";
    private static int EntranceTicketPrize = 0;

    public Park(String address) {
        this.address = address;
    }

    public Park() {

    }

    public Park(String address, int lenght, int ticketPrize, String name_trees){

        this.address = address;
        this.lenght = lenght;
        this.ticketPrize = ticketPrize;
        this.name = name;
    }

    public Park (String address,
                 int lenght,
                 int ticket_prize,
                 String name_trees,
                 String name_park,
                 String city,
                 String country) {
        this.address = address;
        this.lenght = lenght;
        this.ticketPrize = ticket_prize;
        this.name = name_park;
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

    public void setName_park(String name_park) {

        this.name = name_park;
    }

    public static void printStaticEntranceTicketPrize() {

        System.out.println(EntranceTicketPrize + "ticket prize.");
    }

    public void printEntranceTicketPrize() {

        System.out.println(EntranceTicketPrize + "ticket prize");
    }

    public String toString() {
        String information = "\nInformation about Park:\n";
        information += "Address:" + address + "\n";
        information += "Lenght:" + lenght + "\n";
        information += "Ticket_prize:" + ticketPrize + "\n";
        information +=  "Country:" + country + "\n";
        information += "Name_park:" + name + "\n";
        information += "City:" + city + "\n";
        information += "Name_trees:" + name;
        return information;
    }
    public void resetValues (String address,
                              int lenght,
                              int ticket_prize,
                              String name_trees,
                              String name_park,
                              String city,
                              String country) {

        this.address = address;
        this.lenght = lenght;
        this.ticketPrize = ticket_prize;
        this.country = country;
        this.name = name_park;
        this.city = city;
        this.name = name_trees;
    }
}

