import Manager.LibrarySystem;
import Objects.DemoBook;
import Objects.EBook;
import Objects.PaperBook;

public class Main {
    public static void main(String[] args) {
        LibrarySystem librarySystem = new LibrarySystem();


        PaperBook paperBook = new PaperBook("PB1", "OOP", 2025,200.0,50);
        DemoBook demoBook = new DemoBook("DB1","Blindness",2020,150.0);
        EBook eBook = new EBook("EB1","Sap1ens",2015,100.0,"PDF");

        librarySystem.addBook(paperBook);
        librarySystem.addBook(demoBook);
        librarySystem.addBook(eBook);

        librarySystem.printInventory();

        librarySystem.buy("PB1",5,"ma6397949@gmail.com","Cairo, Egypt");
        librarySystem.buy("EB1",1,"ma6397949@gmail.com","Cairo, Egypt");
        librarySystem.printInventory();


        librarySystem.removeOutDatedBooks();
        librarySystem.printInventory();
    }
}