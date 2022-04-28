package conditions;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        System.out.println("Enter the number of the days, n:");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        switch(n){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Sunday");

        }

    }
}
