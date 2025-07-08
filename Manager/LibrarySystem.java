package Manager;

import Objects.Book;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class LibrarySystem {
    private ArrayList<Book> inventory;

    public LibrarySystem() {
        inventory = new ArrayList<>();
    }

    public void addBook(Book book) {
        inventory.add(book);
    }

    public void removeBook(Book book) {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty");
            return;
        }
        inventory.remove(book);
    }

    public void removeBook(String ISBN) {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty");
            return;
        }
        for (Book book : inventory) {
            if (book.getISBN().equals(ISBN)) {
                inventory.remove(book);
                System.out.println("Book has been Removed Successfully");
                return;
            }
        }
        System.out.printf("Invalid ISBN %s, Book hasn't been Found\n", ISBN);
    }

    public void removeOutDatedBooks() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty");
            return;
        }
        int numOfYearsPassed = 5;
        int currentYear = LocalDate.now().getYear();
        Iterator<Book> iterator = inventory.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getYear() <= currentYear - numOfYearsPassed) {
                iterator.remove();
                System.out.printf("the Book \"%s\" has been Removed\n", book.getTitle());
            }
        }
    }

    public void buy(String ISBN, int quantity, String email, String address) {
        for (Book book : inventory) {
            if (book.getISBN().equals(ISBN)) {
                book.buy(quantity, email, address);
                return;
            }
        }
        System.out.printf("Invalid ISBN %s, Book hasn't been Found\n", ISBN);
    }

    public void printInventory() {
        System.out.printf("\nInventory (%d Book/s Available):\n", inventory.size());
        for (Book book : inventory) {
            book.print();
        }
    }
}
