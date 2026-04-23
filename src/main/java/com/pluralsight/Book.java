package com.pluralsight;

public class Book {
    private int id;
    private String isbn;
    private String title;
    private Boolean isCheckedOut;
    private String checkedOutTo;

    public Book(int id, String isbn, String title, Boolean isCheckedOut, String checkedOutTo) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = false;
        this.checkedOutTo = "";
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(Boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    public void checkOut(String name) {
        this.checkedOutTo = name;
        this.isCheckedOut = true;
    }
    public void checkedIn() {
        this.checkedOutTo = "";
        this.isCheckedOut = false;
    }



}

