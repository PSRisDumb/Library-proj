
import java.util.Scanner;

public class Library {
    
    public static void main(String[] args){

        Scanner bookScanner = new Scanner(System.in);
        System.out.println("What are you looking for?");
        String search = bookScanner.nextLine();

        Books [] books = {
            new Books("Harry Potter and the Sorcerer's Stone"
            ,"J.K. Rowling"
            ,false
            ,"Brayan"
            ,"Fantasy"
            ,"28800"),
            new Books("Percy Jackson and the lightning theif"
            ,"Rick Roidan"
            ,true
            ,"No one"
            ,"Mythology"
            ,"0"),
            new Books("48 laws of power"
            ,"Robert Greene"
            ,false
            ,"Nick"
            ,"Science"
            ,"12960"),
            new Books("Sun Tzu: The art of war"
            ,"Sun Tzu"
            ,true
            ,"No one"
            ,"History"
            ,"0"),
            new Books("The Blood of Olympus: The Mark of Athena "
            ,"Rick Roidan"
            ,false
            ,"Ray"
            ,"Mythology"
            ,"525960"),
            new Books("Amulet 4: The Last Council"
            ,"Kazu Kibuishi"
            ,true
            ,"Yippie"
            ,"Fantasy/Fiction"
            ,"Yippie"),
            new Books("The Odyssey"
            ,"Homer"
            ,true
            ,"Yippie"
            ,"Mythology"
            ,"Yippie"),
            new Books("The Trials of Apollo: The Tower of Nero"
            ,"Rick Roidan"
            ,true
            ,"Yippie"
            ,"Mythology"
            ,"Yippie"),
            new Books("The Sun and Star"
            ,"Rick Roidan"
            ,true
            ,"Yippie"
            ,"Mythology"
            ,"Yippie"),
            new Books("Percy Jackson and The Battle of The Labyrinth"
            ,"Rick Roidan"
            ,false
            ,"David"
            ,"Mythology"
            ,"12960")
        };

        for (Books i : books){
            if (i.title.equals(search) || i.author.equals(search) || i.whoBorrowed.equals(search) || i.genre.equals(search) ){
                i.bookInfo();
            }
        }
        
     }

}
