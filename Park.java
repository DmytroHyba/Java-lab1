package com.company;

public class Park {

    public String address = "Zelena str.";
    public int lenght = 5;
    public int ticket_prize = 50;
    private String name_trees = "red";
    private String name_park = "Z1";
    protected String city = "Lviv";
    protected String country = "Ukraine";
    private static int EntranceTicketPrize = 0;

    public Park(String address) {
        this.address = address;
    }

    public Park() {

    }

    public Park(String address, int lenght, int ticket_prize, String name_trees){

        this.address = address;
        this.lenght = lenght;
        this.ticket_prize = ticket_prize;
        this.name_park = name_park;
    }

    public Park (String address,
                 int lenght,
                 int ticket_prize,
                 String name_trees,
                 String name_park,
                 String city,
                 String country) {
        this(address, lenght, ticket_prize, name_trees);
        this.name_park = name_park;
        this.city = city;
        this.country = country;
    }

    public String getName_trees() {

        return name_trees;
    }

    public void setName_trees(String name_trees) {

        this.name_trees = name_trees;
    }

    public String getName_park() {
        return name_park;
    }

    public void setName_park(String name_park) {

        this.name_park = name_park;
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
        information += "Ticket_prize:" + ticket_prize + "\n";
        information +=  "Country:" + country + "\n";
        information += "Name_park:" + name_park + "\n";
        information += "City:" + city + "\n";
        information += "Name_trees:" + name_trees;
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
        this.ticket_prize = ticket_prize;
        this.country = country;
        this.name_park = name_park;
        this.city = city;
        this.name_trees = name_trees;
    }
}
