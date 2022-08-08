
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

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
        
        String positiveOrNegative = scanner.nextLine();
        double average;
        
        if(positiveOrNegative.equals("p")){
            average = numbers.stream().mapToInt(number -> Integer.parseInt(number))
                    .filter(number -> number > 0).average().getAsDouble();
        }
        else{
            average = numbers.stream().mapToInt(number -> Integer.parseInt(number))
                    .filter(number -> number < 0).average().getAsDouble();
        }
        System.out.println(average);

    }
    
}
