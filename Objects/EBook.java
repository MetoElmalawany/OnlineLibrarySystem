package Objects;

public class EBook extends Book {
    private String fileType;

    public EBook(String ISBN, String title, int year, Double price, String fileType) {
        super(ISBN, title, year, price);
        this.fileType = fileType;
    }

    @Override
    public boolean isPurchasable() {
        return true;
    }

    @Override
    public boolean isShippable() {
        return false;
    }

    @Override
    public void buy(int quantity, String email, String address) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be greater than 0");
        }
        if (quantity > 1) {
            throw new IllegalArgumentException("Can't buy more than one copy of an E-book");
        }
        System.out.printf("\n%s have Successfully Bought the Digital Version of the Book \"%s\" in \"%s\" Format\n", email, this.getTitle(),this.fileType);
        System.out.printf("your Paid Amount is %.2f\n", this.getPrice());
        System.out.printf("The Objects.Book has been sent to the Mail Services and will be sent to your email \"%s\" Shortly\n", email);

    }

    @Override
    public void print() {
        System.out.printf("ISBN: %s\n",this.getISBN());
        System.out.printf("Title: %s\n",this.getTitle());
        System.out.printf("Year: %s\n",this.getYear());
        System.out.printf("Price: %.2f\n",this.getPrice());
        System.out.printf("File Format: %s\n",this.getFileType());
        System.out.println("-------------------------------------");
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }
}
