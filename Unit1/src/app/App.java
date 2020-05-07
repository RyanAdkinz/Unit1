package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {


        String nme;
        String adj;
        String ani;
        String age;
        String ver;
        String foo;
        String spt;
        String act;
        String plc;
        String brd;
        
        Scanner input = new Scanner(System.in);

        
        System.out.println("Please enter your name.");
         nme = input.nextLine();

        System.out.println("Please enter your age.");
         age = input.nextLine();

        System.out.println("Please enter an adjective.");
        adj = input.nextLine();

        System.out.println("Please enter an animal.");
        ani = input.nextLine();

        System.out.println("Please enter a verb.");
        ver = input.nextLine();

        System.out.println("Please enter a food.");
        foo = input.nextLine();

        System.out.println("Please enter a sport.");
        spt = input.nextLine();

        System.out.println("Please enter your favorite activity.");
        act = input.nextLine();

        System.out.println("Please enter a place.");
        plc = input.nextLine();

        System.out.println("Please enter a shoe brand.");
        brd = input.nextLine();

        System.out.println(nme + age + adj + ani + ver +  foo + spt + act + plc + brd);
      
    }
 }
