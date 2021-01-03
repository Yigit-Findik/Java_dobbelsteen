package dobbelFolder;
import java.util.*;

public class Dice {
    public static void main(String[] args) {
        System.out.println("do not search up *thicc broly*");
        System.out.println("loop poop hi ");
        loop();
    }

    public static void loop() {
        while (Result != 5) {
            Randomiser();
             
            try {
                Thread.sleep(1000);
            } 
            
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static Random random = new Random();
    static int Result = random.nextInt(6);

    public static void Randomiser() { 
        Result = random.nextInt(6);
        switch (Result) {
            case 0:
                System.out.println("-----");
                System.out.println("|   |");
                System.out.println("| o |");
                System.out.println("|   |");
                System.out.println("-----");
                break;
            
            case 1:
                System.out.println("-----");
                System.out.println("|o  |");
                System.out.println("|   |");
                System.out.println("|  o|");
                System.out.println("-----");
                break;
            
            case 2:
                System.out.println("-----");
                System.out.println("|o  |");
                System.out.println("| o |");
                System.out.println("|  o|");
                System.out.println("-----");
                break;

            case 3:
                System.out.println("-----");
                System.out.println("|o o|");
                System.out.println("|   |");
                System.out.println("|o o|");
                System.out.println("-----");
                break;
            
            case 4:
               System.out.println("-----"); 
               System.out.println("|o o|");
               System.out.println("| o |");
               System.out.println("|o o|");
               System.out.println("-----");
                break;

            case 5:
                System.out.println("-----");
                System.out.println("|o o|");
                System.out.println("|o o|");
                System.out.println("|o o|");
                System.out.println("-----");
                System.out.println("Eindelijk, je hebt 6 dedobbeld :DDDDDD");
                break;
            
            default:
                System.out.println("this should not be here :)");
        }

    }
}
