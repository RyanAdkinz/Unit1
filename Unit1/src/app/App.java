package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        Scanner input = new Scanner (System.in);

        dog1.name = "Luna";
        dog2.name = "Cheezit";
        dog3.name = "Roofy";
       
        dog1.breed = "Husky";
        dog2.breed = "German Sheperd";
        dog3.breed = "Yorky";
       
        dog1.age = "2";
        dog2.age = "3";
        dog3.age = "4";

        dog1.color = "Black and White";
        dog2.color = "Brown and Black";
        dog3.color = "Brown and Black";

        dog1.speed = "Very Fast";
        dog2.speed = "Very Fast";
        dog3.speed = "Average Speed";

        dog1.strength = "Very Strong";
        dog2.strength = "Very Strong";
        dog3.strength = "Weak";
       
        System.out.println(dog1.name);
        System.out.println(dog1.breed);
        System.out.println(dog1.age);
        System.out.println(dog1.color);
        System.out.println(dog1.speed);
        System.out.println(dog1.strength);

        System.out.println(dog2.name);
        System.out.println(dog2.breed);
        System.out.println(dog2.age);
        System.out.println(dog2.color);
        System.out.println(dog2.speed);
        System.out.println(dog2.strength);

        System.out.println(dog3.name);
        System.out.println(dog3.breed);
        System.out.println(dog3.age);
        System.out.println(dog3.color);
        System.out.println(dog3.speed);
        System.out.println(dog3.strength);

    }
 }
