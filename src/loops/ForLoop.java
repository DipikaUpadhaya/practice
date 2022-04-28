package loops;

import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number upto which you want the sum of: ");
        int n= sc.nextInt();
        int sum=0;
        for(int i=1; i<n; i++){
            sum=sum +i;
        }
        System.out.println(sum);
    }
}
