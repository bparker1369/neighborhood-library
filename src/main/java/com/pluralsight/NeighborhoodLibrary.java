package com.pluralsight;

import java.util.Scanner;

public class NeighborhoodLibrary {

    static Book[] books = new Book[20];

    public static void main(String[] args) {
        books[0] = new Book(1, "1111111", "Honey Bears",false, "");
        books[1] = new Book(2, "2222222", "Bumble Bee", false, "");
        books[2] = new Book(3, "3333333", "Lady Frog", false, "");
        books[3] = new Book(4, "4444444", "Brave Dog", false, "");
        books[4] = new Book(5, "5555555", "Transformers", false, "");
        books[5] = new Book(6, "6666666", "Spider-Man", false, "");
        books[6] = new Book(7, "7777777", "Ant-Man", false, "");
        books[7] = new Book(8, "8888888", "Iron Man", false, "");
        books[8] = new Book(9, "9999999", "Sora", false, "");
        books[9] = new Book(10, "10101010", "Donald Duck", false, "");
        books[10] = new Book(11, "010101010", "Goofy", false, "");
        books[11] = new Book(12, "121212121", "Riku", false, "");
        books[12] = new Book(13, "1313131313", "Kairi", false, "");
        books[13] = new Book(14, "1414141414", "Hillside Man", false, "");
        books[14] = new Book(15, "1515151515", "Jersey Boys", false, "");
        books[15] = new Book(16, "1616161616", "How To Make Chocolate", false, "");
        books[16] = new Book(17, "1717171717", "Toronto Raptors", false, "");
        books[17] = new Book(18, "1818181818", "Deadpool", false, "");
        books[18] = new Book(19, "1919191919", "Star Wars", false, "");
        books[19] = new Book(20, "2020202020", "Jak & Daxter",false, "");

        Scanner scanner = new Scanner(System.in);
        showMenu(scanner);
    }

    public static void showMenu(Scanner scanner) {
        boolean isRunning = true;

        while(isRunning) {
            System.out.println("1. Show Available Books");
            System.out.println("2. Show Checked Out Books");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();

            if(choice == 1) {
                showAvailableBooks(scanner);
            } else if(choice == 2) {
                showCheckedOut(scanner);
            } else if(choice == 3) {
                isRunning = false;
            }
        }
    }

    public static void showAvailableBooks(Scanner scanner) {
        for(int i = 0; i < 20; i++) {
            if(!books[i].getCheckedOut()) {
                System.out.println(books[i].getId() + " " + books[i].getIsbn() + " " + books[i].getTitle());
            }
        }

        System.out.println("Enter Book ID you would like to check out");
        System.out.println("Enter B to exit to main menu");

        String choice = scanner.nextLine();

        if(choice.equalsIgnoreCase("B")) {
            return;
        } else {
            System.out.print("Enter your name: ");
            String name = scanner.next();

            for(int j = 0; j < 20; j++) {
                if(books[j].getId() == Integer.parseInt(choice)) {
                    books[j].checkOut(name);
                    System.out.println("You have checked out this book!");
                }
            }
        }
    }

    public static void showCheckedOut(Scanner scanner) {
        for (int t = 0; t < 20; t++) {
            if (books[t].getCheckedOut()){
                System.out.println(books[t].getId() + " " + books[t].getIsbn() + " " + books[t].getTitle() + " " + books[t].getCheckedOutTo());
            }
        }

        System.out.println("Enter C to check in a book");
        System.out.println("Enter X to return to main menu");

        String choice = scanner.nextLine();

        if(choice.equalsIgnoreCase("C")) {
            System.out.println("Enter book ID you would like to check in:");
            String bookId = scanner.next();

            for(int c = 0; c < 20; c++) {
                if(books[c].getId() == Integer.parseInt(bookId)) {
                    books[c].checkedIn();
                    System.out.println("Book checked in successfully!");
                }
            }
        } else if(choice.equalsIgnoreCase("X")) {
            return;
        }





    }
}