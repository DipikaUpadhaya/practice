package conditions;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number ,a: ");
        double a= sc.nextInt();
        System.out.println("Enter second number, b: ");
        double b= sc.nextInt();
        System.out.println("Enter the operator you want to perform: +, -, *, /, % ");
        char op= sc.next().charAt(0);
       double result;
        switch(op){
            case '+': result= a+b;
                System.out.println("The result after addition is : "+ result);
                break;
            case '-': result= a-b;
                System.out.println("The result after subtraction is : "+ result);
                break;
            case '*': result= a*b;
                System.out.println("The result after multiplication is : "+ result);
                break;
            case '/': result= a/b;
                System.out.println("The result after division is : "+ result);
                break;
            case '%': result= a%b;
                System.out.println("The result after modulo is : "+ result);
                break;
            default:
                System.out.println("You entered invalid operator.");
        }

    }
}
