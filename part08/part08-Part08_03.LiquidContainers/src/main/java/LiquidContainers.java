
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {
            System.out.print("> ");
            
            
            
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");
            
            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);
            
            if(amount<0) continue;
            
            if(command.equals("add")){
                firstContainer = firstContainer + amount > 100 ? 100 : firstContainer + amount;
            }            
            else if(command.equals("move")){
                if(firstContainer - amount < 0){
                    secondContainer += firstContainer;
                    firstContainer = 0;
                }
                else if(secondContainer + amount > 100){
                    firstContainer -= amount;
                    secondContainer = 100;
                }
                else{
                    firstContainer -= amount;
                    secondContainer += amount;
                }
            }
            else if(command.equals("remove")){
                secondContainer = secondContainer - amount < 0 ? 0 : secondContainer - amount;
            }
            
            
            
        }
    }

}
