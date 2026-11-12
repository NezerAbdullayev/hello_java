package Java;

import java.util.Scanner;

public class testfile {
    public static void main(String[] args) {
//        var test="new test";
//        byte square = 2;
//        short number = 230;
//        short number2 = 50;
//        int  calcItem= number * square * number2;
//        System.out.println("test "+ test+" "+ calcItem);
//        float number= 34.52f; //float type f and F
        Scanner scan= new Scanner(System.in);
        System.out.println("your name");
        String name= scan.nextLine();

        System.out.println("your email");
        String email= scan.nextLine();

        System.out.println("your age ");
        int age= scan.nextInt();

        System.out.println("your name: "+ name + " your email: "+ email + " your age: "+ age);

    }
}
