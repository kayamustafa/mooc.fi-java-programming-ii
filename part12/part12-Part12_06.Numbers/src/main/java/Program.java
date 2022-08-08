
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers do you want to generate: ");
        int input = scanner.nextInt();
        Random random = new Random();
        for(int i = 0; i<input; i++){
            System.out.println(random.nextInt(11));
        }
    }

}
