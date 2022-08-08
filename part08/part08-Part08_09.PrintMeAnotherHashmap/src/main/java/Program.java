
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
    }
    
    public static void printValues(HashMap<String,Book> hashmap){
        hashmap.keySet().forEach(key -> {
            System.out.println(hashmap.get(key));
        });
    }
    public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text){
        hashmap.keySet().forEach(key -> {
            if(hashmap.get(key).getName().contains(text)) System.out.println(hashmap.get(key));
        });
    }
}
