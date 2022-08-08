
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int sums = 0;
        int nums = 0;
        double avg = 0;
        int nums1 = 0;
 
        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());
            nums1 += 1;
            if (input == 0 && nums1 == 1) {
                System.out.println("Cannot calculate the average");
                break;
            }
 
            if (input > 0) {
                sums += input;
                nums += 1;
                avg = (double) sums / nums;
            }
 
            if (input == 0) {
                break;
            }
 
        }
        if (avg > 0.0) {
            System.out.println(avg);
        }
 
    }
}
