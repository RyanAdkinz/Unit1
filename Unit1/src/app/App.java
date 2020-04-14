package app;

public class App {
    public static void main(String[] args) throws Exception {
        int count = 0;
        String color = "red";
        boolean T = true;

        while (count <=10) {
            System.out.println("The count is " + count);
            count = count + 1;
        }

        System.out.println("Count finished");

        while (color == "red"){
            System.out.println("The color is " + color);
            color = "green";
        }

        System.out.println("Color finished");

        while (T == true){
            System.out.println("Ryan Adkins likes to play lacrosse " + T);
            T = false;
        }

        System.out.println("True statement finished");

    }
     
}