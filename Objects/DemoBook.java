package Objects;

public class DemoBook extends Book {

    public DemoBook(String ISBN, String title, int year, Double price) {
        super(ISBN, title, year, price);
    }

    @Override
    public boolean isPurchasable() {
        return false;
    }

    @Override
    public boolean isShippable() {
        return false;
    }

    @Override
    public void buy(int quantity, String email, String address) {
        throw new UnsupportedOperationException("Can't buy a Showcase Book");
    }

    @Override
    public void print() {
        System.out.printf("ISBN: %s\n",this.getISBN());
        System.out.printf("Title: %s\n",this.getTitle());
        System.out.printf("Year: %s\n",this.getYear());
        System.out.printf("Price: %.2f\n",this.getPrice());
        System.out.println("-------------------------------------");
    }
}
