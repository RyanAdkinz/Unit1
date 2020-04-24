package app;

public class App {
    public static void main(String[] args) throws Exception {


        System.out.println("Start first loop");

       {for (int j = 1; j <= 10; j++)
    
        if (j == 5){
         System.out.println("five");
        }
       else{
            System.out.println(j);     }                             
        
       }
         System.out.println("End first loop");
         System.out.println("Start second loop");
       
    
        for (int j= 100; j <= 200; j= j + 10){
            System.out.println(j);
        if (j == 150){

            for (int x = 150; x <= 159; x++){
         System.out.println(x); }
    
     }
     
     
     
        }
        {System.out.println("End Second loop");}
    }
 }
