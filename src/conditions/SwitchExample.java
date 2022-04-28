package conditions;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args){
        System.out.println("Press the button of your choice: " );
        Scanner sc= new Scanner(System.in);
        int button= sc.nextInt();
        switch(button){
            case 1:
                System.out.println("hi");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Hello");
                break;
            default:
                System.out.println("You pressed invalid button");
        }
    }
}
