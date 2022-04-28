package conditions;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        System.out.println("Enter the number of month: ");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        switch(n){
            case 1:
                System.out.println("The number 1 indicate January");
                break;
            case 2:
                System.out.println("The number 2 indicate Feburary");
                break;
            case 3:
                System.out.println("The number 3 indicate March");
                break;
            case 4:
                System.out.println("The number 4 indicate April");
                break;
            case 5:
                System.out.println("The number 5 indicate May");
                break;
            case 6:
                System.out.println("The number 6 indicate June");
                break;
            case 7:
                System.out.println("The number 7 indicate July");
                break;
            case 8:
                System.out.println("The number 8 indicate August");
                break;
            case 9:
                System.out.println("The number 9 indicate September");
                break;
            case 10:
                System.out.println("The number 10 indicate October");
                break;
            case 11:
                System.out.println("The number 11 indicate November");
                break;
            case 12:
                System.out.println("The number 12 indicate December");
                break;
            default:
                System.out.println("Invalid number to indicate months");
        }
    }
}
