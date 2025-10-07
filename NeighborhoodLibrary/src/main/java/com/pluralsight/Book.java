package com.pluralsight;

public class Book {
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    public Book(int id, String isbn, String title, boolean isCheckedOut, String checkedOutTo) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = isCheckedOut;
        this.checkedOutTo = checkedOutTo;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

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

public void CheckOut(String name) {
        if(!isCheckedOut) {
            isCheckedOut = true;
            checkedOutTo = name;
            System.out.println(title + " has been checked out to " + name + ".");
        } else {
            System.out.println(title + " is already checked out to " + checkedOutTo + ".");
        }
}

public void CheckIn() {
        if (isCheckedOut) {
            isCheckedOut = false;
            System.out.println(title + " has been checked in from " + checkedOutTo + ".");
            checkedOutTo = null;
        } else {
            System.out.println(title + " is not currently checked out.");
        }
}

}
