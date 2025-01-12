
public class Books{

    String title;
    String author;
    Boolean isavailable;
    String whoBorrowed;
    String genre;
    String minutesBorrowedFromLibrary;

    Books(String title, String author, Boolean isavailable, String whoBorrowed, String genre, String minutesBorrowedFromLibrary){
        
        this.title = title;
        this.author = author;
        this.isavailable = isavailable;
        this.whoBorrowed = whoBorrowed;
        this.genre = genre;
        this.minutesBorrowedFromLibrary = minutesBorrowedFromLibrary;
    }
    void bookInfo(){
        System.out.println("Book title: " + title);
        System.out.println("Author: " + author);
        System.out.println("In the Library? " + isavailable);
        System.out.println("Genre: " + genre);
        if (isavailable == true) {  
            System.out.println("Book is available!");
        } else {
            System.out.println("Book is not available at the moment. The book is currently borrowed by: " + whoBorrowed);
            System.out.println("The book has been borrowed for " + minutesBorrowedFromLibrary + " minutes.");
        };
    }
}


