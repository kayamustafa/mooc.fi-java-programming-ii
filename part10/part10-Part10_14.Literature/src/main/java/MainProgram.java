
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        boolean isEmpty = false;
        
        while(!isEmpty){
            System.out.println("Input the name of the book, empty stops:");
            String nameInput = scanner.nextLine();
            if(nameInput.isEmpty()) isEmpty = true;
            else{
                System.out.println("Input the age recommendation:");
                String ageInput = scanner.nextLine();
                books.add(new Book(nameInput, Integer.parseInt(ageInput)));
            }
        }
        
        System.out.println(books.size() + " books in total.");
        Comparator<Book> comparator = Comparator.comparing(Book::getAgeRecommendation).thenComparing(Book::getName);
        Collections.sort(books, comparator);
        
        books.forEach(book -> System.out.println(book));
        
    }

}
