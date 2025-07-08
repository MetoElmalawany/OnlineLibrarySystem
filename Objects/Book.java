package Objects;

import java.time.LocalDate;

public abstract class Book {
    private String ISBN;
    private String title;
    private int year;
    private Double price;

    public Book(String ISBN, String title, int year, Double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        if (year > LocalDate.now().getYear()) {
            throw new IllegalArgumentException("Year cannot be greater than current year");
        }
        this.ISBN = ISBN;
        this.title = title;
        this.year = year;
        this.price = price;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public Double getPrice() {
        return price;
    }

    public abstract boolean isPurchasable();

    public abstract boolean isShippable();

    public abstract void buy(int quantity, String email, String address);

    public abstract void print();

}
