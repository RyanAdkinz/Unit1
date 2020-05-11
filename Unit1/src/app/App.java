package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {


        int num1;
        int num2;
        String print;
     
        Scanner input = new Scanner(System.in);
               
        System.out.println("Please a number");
         num1 = input.nextInt();

        System.out.println("Please enter another number");
         num2 = input.nextInt();

        System.out.println("Would you like to add, subtract, multiply, or divide these?");
         print = input.nextLine();

        {if (print == "add")
         System.out.println(num1 + num2); }

        {if (print == "subtract")
         System.out.println(num1 - num2); }

        {if (print == "multiply")
         System.out.println(num1 * num2); }
          
        {if (print == "divide")
         System.out.println(num1 / num2); }


       
    }
 }
