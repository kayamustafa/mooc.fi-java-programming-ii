
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        try{
            Files.lines(Paths.get("literacy.csv")).map(data -> data.split(","))
                    .sorted((d1, d2) -> {return d1[5].compareTo(d2[5]);})
                    .forEach(data -> System.out.println(data[3] + " (" + data[4] + "), " + data[2].replace("(%)", "").trim() + ", " + data[5]));
        }catch(Exception e){
            System.out.println("Error: " + e);
        }
    }
}
