package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {


        Scanner input = new Scanner(System.in);

        System.out.println("How many inches are in a foot?");
        String num = input.nextLine();

        if (num.equals ("12")) {
        System.out.println("CORRECT"); }
        else {
        System.out.println("INCORRECT"); }

        System.out.println("What is the capitol of MN?");
        String Cap = input.nextLine();

        if (Cap.equals ("St. Paul")) {
        System.out.println("CORRECT"); }
        else {
        System.out.println("INCORRECT"); }

        System.out.println("What year is it");
        String Yr = input.nextLine();

        if (Yr.equals ("2020")) {
        System.out.println("CORRECT"); }
        else {
        System.out.println("INCORRECT"); }
  
    }
 }
