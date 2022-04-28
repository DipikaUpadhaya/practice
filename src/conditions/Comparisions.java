package conditions;

import java.util.Scanner;

public class Comparisions {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number x: ");
        int x= sc.nextInt();
        System.out.println("Enter second number y: ");
        int y= sc.nextInt();
        if(x==y){
            System.out.println("X is equals to Y");
        }else if (x<y){
                System.out.println("X is lesser than Y");
            }else{
                System.out.println("X is greater than Y");
            }
        }
    }

