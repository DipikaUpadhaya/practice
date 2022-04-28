package loops;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= sc.nextInt();
        System.out.println("All even numbers upto "+n+" are :");
        for(int i=0; i<n; i++){

            if(i%2==0)
            System.out.print(i +" ");
        }
    }
}
