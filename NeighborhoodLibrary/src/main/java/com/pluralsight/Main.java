package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book[] inventory = new Book[20];

        inventory[0] = new Book(1, "5435345345", "book1", false, "");
        inventory[1] = new Book(1, "5353453456","book2", false, "");
        inventory[2] = new Book(1, "5435345347", "book3", false, "");
        inventory[3] = new Book(1, "5435355345", "book4", false, "");
        inventory[4] = new Book(1, "5435345345", "book5", false, "");
        inventory[5] = new Book(1, "5435335345", "book6", false, "");
        inventory[6] = new Book(1, "5435325345", "book7", false, "");
        inventory[7] = new Book(1, "5435365345", "book8", false, "");
        inventory[8] = new Book(1, "5435325345", "book9", false, "");
        inventory[9] = new Book(1, "5435365345", "book10", false, "");
        inventory[10] = new Book(1,"5435745345", "book11", false, "");
        inventory[11] = new Book(1,"5435345345", "book12", false, "");
        inventory[12] = new Book(1,"5465345345", "book13", false, "");
        inventory[13] = new Book(1,"5435845345", "book14", false, "");
        inventory[14] = new Book(1,"5435345145", "book15", false, "");
        inventory[15] = new Book(1,"543534575",  "book16", false, "");
        inventory[16] = new Book(1,"5435345845", "book17", false, "");
        inventory[17] = new Book(1,"5435325345", "book18", false, "");
        inventory[18] = new Book(1,"5435375345", "book19", false, "");
        inventory[19] = new Book(1,"5425345345", "book20", false, "");

        inventory[0].checkOut("Alice");

        inventory[0].checkIn();
    }

}