
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> numbers = new ArrayList<>();
        boolean isInputEnd = false;
        
        while(!isInputEnd){
            String input = scanner.nextLine();
            if(input.equals("end")) isInputEnd = true;
            else{
                numbers.add(input);
            }
        }
        
        double average = numbers.stream().mapToInt(number -> Integer.parseInt(number))
                .average().getAsDouble();
        
        System.out.println(average);

    }
}
