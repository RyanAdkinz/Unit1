package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String name;
        String pass;
        String pa;
        String na;
        String acc;
        int dig;
        int num;
        int wit;


        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");
        na = input.nextLine();

        System.out.println("How much money are you starting with?");
        dig = input.nextInt();

        System.out.println("Please enter a password");
        pa = input.nextLine();

        System.out.println("Acc Created!");
        pa = input.nextLine();

        System.out.println("Please enter name");
        name = input.nextLine();

        System.out.println("Please enter password");
        pass = input.nextLine();

        if (pa == pass)
        System.out.println("You're in");

        System.out.println("What would you like to do? (1= withdraw) (2= deposit)");
        num = input.nextInt();

        if (num == 1)
        System.out.println("How much would you like to withdraw?");
        wit = input.nextInt();
        System.out.println("You withdrew" + " " + (wit) + ". " + "Your new balance is" + " " + (dig - wit) +".");

         if (num == 2)
        System.out.println("How much would you like to deposit?");
        wit = input.nextInt();
        System.out.println("You deposited" + " " + (wit) + ". " + "Your new balance is" + " " + (dig + wit) +".");

        

        

    }
 }
