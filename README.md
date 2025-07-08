# Code Examples

## Scenario 1: Normal Scenario with Different Functionalities

```
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

==CONSOLE OUTPUT==
Inventory (3 Book/s Available):
ISBN: PB1
Title: OOP
Year: 2025
Price: 200.00
Stock Available: 50
-------------------------------------
ISBN: DB1
Title: Blindness
Year: 2020
Price: 150.00
-------------------------------------
ISBN: EB1
Title: Sap1ens
Year: 2015
Price: 100.00
File Format: PDF
-------------------------------------

ma6397949@gmail.com have Successfully Bought 5 of the Book "OOP"
your Paid Amount is 1000.00
The Objects.Book has been sent to the Shipping Services and will soon be shipped to your address "Cairo, Egypt"

ma6397949@gmail.com have Successfully Bought the Digital Version of the Book "Sap1ens" in "PDF" Format
your Paid Amount is 100.00
The Objects.Book has been sent to the Mail Services and will be sent to your email "ma6397949@gmail.com" Shortly

Inventory (3 Book/s Available):
ISBN: PB1
Title: OOP
Year: 2025
Price: 200.00
Stock Available: 45
-------------------------------------
ISBN: DB1
Title: Blindness
Year: 2020
Price: 150.00
-------------------------------------
ISBN: EB1
Title: Sap1ens
Year: 2015
Price: 100.00
File Format: PDF
-------------------------------------
the Book "Blindness" has been Removed
the Book "Sap1ens" has been Removed

Inventory (1 Book/s Available):
ISBN: PB1
Title: OOP
Year: 2025
Price: 200.00
Stock Available: 45
```

## Scenario 2: Adding a Book with Negative Price 

```
EBook eBook = new EBook("EB1","Sap1ens",2015,-100.0,"PDF");  
  
librarySystem.addBook(eBook);

==CONSOLE OUTPUT==

Exception in thread "main" java.lang.IllegalArgumentException: Price cannot be negative
	at Objects.Book.<init>(Book.java:13)
	at Objects.PaperBook.<init>(PaperBook.java:7)
	at Main.main(Main.java:11)

```

## Scenario 3: Adding a Book with Negative Stock

```
PaperBook paperBook = new PaperBook("PB1", "OOP", 2025,200.0,-50);

librarySystem.addBook(paperBook);

==CONSOLE OUTPUT==
Exception in thread "main" java.lang.IllegalArgumentException: Stock must not be negative
	at Objects.PaperBook.<init>(PaperBook.java:9)
	at Main.main(Main.java:11)
```

## Scenario 4: Quantity Purchased Exceeds Stock 

```
PaperBook paperBook = new PaperBook("PB1", "OOP", 2025,200.0,50);  

librarySystem.addBook(paperBook);  
librarySystem.buy("PB1",51,"ma6397949@gmail.com","Cairo, Egypt");
  
==CONSOLE OUTPUT==

Exception in thread "main" java.lang.IllegalArgumentException: Quantity must be less than stock
	at Objects.PaperBook.buy(PaperBook.java:30)
	at Manager.LibrarySystem.buy(LibrarySystem.java:51)
	at Main.main(Main.java:16)
```

## Scenario 5: Trying to Buy a Demo Book

```
DemoBook demoBook = new DemoBook("DB1","Blindness",2020,150.0);  

librarySystem.addBook(demoBook);  
librarySystem.buy("DB1",1,"ma6397949@gmail.com","Cairo, Egypt");

==CONSOLE OUTPUT==

Exception in thread "main" java.lang.UnsupportedOperationException: Can't buy a Showcase Book
	at Objects.DemoBook.buy(DemoBook.java:21)
	at Manager.LibrarySystem.buy(LibrarySystem.java:51)
	at Main.main(Main.java:17)
	
```


# Screeshots

![Pasted image 20250708195417](https://github.com/user-attachments/assets/75c66fb4-9a2a-4278-94a3-f702c5fccf94)
