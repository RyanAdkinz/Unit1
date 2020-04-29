package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {


        Scanner input = new Scanner(System.in);

        System.out.println("What's the password?");
        String enteredPassword = input.nextLine();

        if (enteredPassword.equals("183726073"))
        System.out.println("Access Granted");

        else
        System.out.println("Access Denied");


    }
 }
