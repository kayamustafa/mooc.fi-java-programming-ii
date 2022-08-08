
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ka_ya
 */
public class UserInterface {
    private TodoList list;
    private Scanner scanner;
    
    public UserInterface(TodoList list, Scanner scanner){
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start(){
        while(true){
            System.out.println("Command: ");
            String input = scanner.nextLine();
            if(input.equals("stop")) break;
            switch(input){
                case "add":
                    System.out.println("To add: ");
                    String task = scanner.nextLine();
                    list.add(task);
                    break;
                case "list":
                    list.print();
                    break;
                case "remove":
                    System.out.println("Which one is removed?");
                    int index = scanner.nextInt();
                    list.remove(index);
                    break;
                default:
                    break;
            }
        }
    }
    
}
