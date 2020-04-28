package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {


        Scanner input = new Scanner(System.in);

        System.out.println("You should enter your first name buddy");
        String name = input.nextLine();

        System.out.println("Wassup, " + name);

         System.out.println("Wanna enter your last?");
        String last = input.nextLine();

        System.out.println("I like your last name, " + last);

         System.out.println("How old are you?");
        String age = input.nextLine();

        System.out.println("You're only " + age + "?");

         System.out.println("Are you a freshman, sophomore, junior, or senior?");
        String grade = input.nextLine();

        System.out.println("You must know a lot if you're a " + grade);

         System.out.println("What's your favorite color?");
        String color = input.nextLine();

        System.out.println(color + " is a great color!");





    }
 }
