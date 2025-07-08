package Objects;

public class PaperBook extends Book {
    private int stock;

    public PaperBook(String ISBN, String title, int year, Double price, int stock) {
        super(ISBN, title, year, price);
        if (stock < 0) {
            throw new IllegalArgumentException("Stock must not be negative");
        }
        this.stock = stock;
    }

    @Override
    public boolean isPurchasable() {
        return true;
    }

    @Override
    public boolean isShippable() {
        return true;
    }

    @Override
    public void buy(int quantity, String email, String address) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be greater than 0");
        }
        if (quantity > stock) {
            throw new IllegalArgumentException("Quantity must be less than stock");
        }
        double paidAmount = quantity * this.getPrice();
        this.reduceStock(quantity);
        System.out.printf("\n%s have Successfully Bought %d of the Book \"%s\"\n", email, quantity, this.getTitle());
        System.out.printf("your Paid Amount is %.2f\n", paidAmount);
        System.out.printf("The Objects.Book has been sent to the Shipping Services and will soon be shipped to your address \"%s\"\n", address);
    }

    @Override
    public void print() {
        System.out.printf("ISBN: %s\n",this.getISBN());
        System.out.printf("Title: %s\n",this.getTitle());
        System.out.printf("Year: %s\n",this.getYear());
        System.out.printf("Price: %.2f\n",this.getPrice());
        System.out.printf("Stock Available: %d\n",this.getStock());
        System.out.println("-------------------------------------");
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void reduceStock(int stock) {
        this.stock -= stock;
    }
}
