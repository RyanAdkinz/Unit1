package app;

public class App {
    public static void main(String[] args) throws Exception {

       for (int i = 20; i >= 1; i = i - 1){

        
            System.out.println(i);
            if (i== 10)
                for (int y = 0; y < 7; y++)
            System.out.println(i);
        }
     
        
        
            System.out.println("End First Loop");
            System.out.println("Start Second Loop");
        

        {
        
       for (int i = 0; i <= 36; i = i + 4){
        System.out.println(i);
        if (i % 12 == 0){

            System.out.println("Hey!");
        }
        
       }
      
       System.out.println("End Second Loop");

        
        }
    }
 }