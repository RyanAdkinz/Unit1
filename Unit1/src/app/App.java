package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {


        Scanner input = new Scanner(System.in);

        System.out.println("What's the count?");
        String num = input.nextLine();

       System.out.println(">" + num + "(user entered)");
        
       for (int i= 1; i<= 7; i++) {
           System.out.println(">" + i);
       }
  
    }
 }
