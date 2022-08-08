
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your method here

    }
    
    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest){
        int sum = 0;
        if(fromWhere >= 0 && toWhere >= 0 && toWhere - 1 < array.length){
            for(int i = fromWhere; i < toWhere; i++){
                if(array[i] <= largest && array[i] >= smallest) sum += array[i];
            }
        }
        
        return sum;
    }
    
}
