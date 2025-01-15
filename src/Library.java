
import java.util.Scanner;

public class Library {
    
    public static void main(String[] args){
        boolean leave = false;
        

        Books [] books = {
                new Books(1,"Harry Potter and the Sorcerer's Stone"
                ,"J.K. Rowling"
                ,false
                ,"Brayan"
                ,"Fantasy"
                ,"28800"),
                new Books(2,"Percy Jackson and the lightning theif"
                ,"Rick Roidan"
                ,true
                ,"No one"
                ,"Mythology"
                ,"0"),
                new Books(3,"48 laws of power"
                ,"Robert Greene"
                ,false
                ,"Nick"
                ,"Science"
                ,"12960"),
                new Books(4,"Sun Tzu: The art of war"
                ,"Sun Tzu"
                ,true
                ,"No one"
                ,"History"
                ,"0"),
                new Books(5,"The Blood of Olympus: The Mark of Athena "
                ,"Rick Roidan"
                ,false
                ,"Ray"
                ,"Mythology"
                ,"525960"),
                new Books(6,"Amulet 4: The Last Council"
                ,"Kazu Kibuishi"
                ,true
                ,"Yippie"
                ,"Fantasy/Fiction"
                ,"Yippie"),
                new Books(7,"The Odyssey"
                ,"Homer"
                ,true
                ,"Yippie"
                ,"Mythology"
                ,"Yippie"),
                new Books(8,"The Trials of Apollo: The Tower of Nero"
                ,"Rick Roidan"
                ,true
                ,"Yippie"
                ,"Mythology"
                ,"Yippie"),
                new Books(9,"The Sun and Star"
                ,"Rick Roidan"
                ,true
                ,"Yippie"
                ,"Mythology"
                ,"Yippie"),
                new Books(10,"Percy Jackson and The Battle of The Labyrinth"
                ,"Rick Roidan"
                ,false
                ,"David"
                ,"Mythology"
                ,"12960")
            };

        try (Scanner bookScanner = new Scanner(System.in)) {
            System.out.println("Input your username: ");
            String user = bookScanner.nextLine();

            while (leave == false){

                int bookpos = 0;
                System.out.println("Hello " + user + " Welcome to Some Library!");
                System.out.println("What would you like to do today?");
                System.out.println("1. Checkout a Book");
                System.out.println("2. Return a Book");
                System.out.println("3. Exit");
                int choice = Integer.parseInt(bookScanner.nextLine());
                if (choice == 1){
                    int booksavailable = 0;
                    System.out.println("Search or scroll through available?");
                    System.out.println("1. Search");
                    System.out.println("2. Whats available");
                    choice = Integer.parseInt(bookScanner.nextLine());
                     

                    if (choice == 1){
                        System.out.println("What are you looking for?");
                        String search = bookScanner.nextLine();
                            
                        for (Books i : books){
                            if (i.title.equals(search) || i.author.equals(search) || i.whoBorrowed.equals(search) || i.genre.equals(search) && i.isavailable == true){
                                booksavailable++;
                                System.out.println("Book ID: " + i.bookId +". Title: " + i.title);
                            }                            
                        }
                        if(booksavailable > 0 ){
                                System.out.println("Select a book by typing it it's bookID");
                                bookpos = Integer.parseInt(bookScanner.nextLine());
                            } else {
                                System.out.println("We apologize, the books you are currently looking for aren't available");
                            }
                        
                        

                        for (Books i : books){
                            
                            if (i.bookId == bookpos && booksavailable > 0){
                                System.out.println("Do you want to check out the book?");
                                System.out.println("1. Yes");
                                System.out.println("2. No");
                                choice = Integer.parseInt(bookScanner.nextLine());
                                if (choice == 1 && i.isavailable == true){
                                    i.isavailable = false;
                                    i.whoBorrowed = user;
                                    i.minutesBorrowedFromLibrary = "0";
                                }
                            }
                        }
                    }
                    if (choice == 2){
                        for (Books i : books){
                            if (i.isavailable == true){
                            System.out.println("Book ID: " + i.bookId +". Title: " + i.title);
                            }
                        }
                        System.out.println("Select a book by typing it it's bookID");
                        bookpos = Integer.parseInt(bookScanner.nextLine());                       
                        for (Books i : books){
                            
                            if (i.bookId == bookpos){
                                System.out.println("Do you want to check out the book?");
                                System.out.println("1. Yes");
                                System.out.println("2. No");
                                choice = Integer.parseInt(bookScanner.nextLine());
                                
                                if (choice == 1 && i.isavailable == true){
                                    i.isavailable = false;
                                    i.whoBorrowed = user;
                                    i.minutesBorrowedFromLibrary = "0";
                                }
                            }
                        }
                    }

                }

                if(choice == 2){
                    int booksavailable = 0;
                    for (Books i : books){
                        if(i.whoBorrowed == user){
                            System.out.println("Book ID: "+ i.bookId);
                            System.out.println("Title: "+ i.title);
                            System.out.println("Author: "+ i.author);
                            System.out.println("Time you've borrowed this book (In minutes): "+ i.minutesBorrowedFromLibrary);
                            booksavailable++;
                            
                        }
                    }
                    if (booksavailable < 0) {
                        System.out.println("You have no books borrowed!");
                        System.out.println("Sending you back to the main menu.");
                    }
                                      
                    if(booksavailable >0){
                        System.out.println("Which book would you like to return? (Type in the Book ID that you'd like to return, or type out -1 to leave.)");
                        int bookPos = Integer.parseInt(bookScanner.nextLine());
                        for(Books i : books){
                            
                                if(bookPos > 0){
                                    if (bookPos == i.bookId){
                                        System.out.println("Would you like to return this book?");
                                        i.bookInfo();
                                        System.out.println("1. Yes");
                                        System.out.println("2. No");
                                        choice = Integer.parseInt((bookScanner.nextLine()));
                                        if(choice == 1){
                                            i.isavailable = true;
                                            i.minutesBorrowedFromLibrary = "0";
                                            i.whoBorrowed = "No one";
                                        }
                                    }
                                }
                            }
                        }
                    }

                if(choice == 3){
                    System.out.println("Have a good day!");
                    leave = true;
                }
        }
        
    }

}
}