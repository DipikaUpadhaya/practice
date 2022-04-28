package basics;

import java.util.Scanner;

public class DataTypeAndInputPractice {

    public static void main(String[] args) {
        //PRIMITIVE DATA TYPES
//        byte: 1 byte -> (-128 to 127)
//        short: 2 byte -> (-32k to 32k)
//        int: 4 byte -> (-2B to 2B)
//        long: 8 byte -> ()
//        float: 8 byte -> (upto 7 decimal digits)
//        double: 2 byte -> (upto 16 decimal digits)
//        char: 2 byte -> (a,b,c..)
//        boolean: 1byte -> (true, false)

        //NON PRIMITIVE DATA TYPES
       // String, Class, Arrays, Objects, Interface

        final float PI= 3.14f; // specifying constant value
        System.out.println("Enter the radius of circle: ");
        Scanner sc= new Scanner(System.in); // for user input
        float radius= sc.nextFloat();
        float area= PI*radius*radius;
        System.out.println("The area of circle is : "+ area);
    }
}
