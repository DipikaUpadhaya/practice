package conditions;

import java.util.Scanner;

public class OddEven {
    public static  void main(String args[]){
        System.out.println("Enter your number : ");
        Scanner sc= new Scanner(System.in);

        int x= sc.nextInt();
        if(x%2 ==0){
            System.out.println(" your number is even");
        }else{
            System.out.println(" your number is odd");
        }

    }
}
