
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String input2 = scan.nextLine();
        List<String> list = new List<>();
        
        list.add(input);
        list.add(input2);
        
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.value(i));
        }

    }

}
