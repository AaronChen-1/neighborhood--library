package com.pluralsight;

public class Book {
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    // Constructor
    public Book(int id, String isbn, String title, boolean isCheckedOut, String checkedOutTo) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = isCheckedOut;
        this.checkedOutTo = checkedOutTo;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    // Setters
    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }


// Methods
public void checkOut(String name) {
        if(!isCheckedOut) {
            isCheckedOut = true;
            checkedOutTo = name;
            System.out.println(title + " has been checked out to " + name + ".");
        } else {
            System.out.println(title + " is already checked out to " + checkedOutTo + ".");
        }
}

public void checkIn() {
        if (isCheckedOut) {
            isCheckedOut = false;
            System.out.println(title + " has been checked in from " + checkedOutTo + ".");
            checkedOutTo = null;
        } else {
            System.out.println(title + " is not currently checked out.");
        }
}

}
