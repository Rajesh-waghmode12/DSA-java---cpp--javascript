import java.util.Scanner;

public class PrintNTimes {

    public static void printName(String name, int number) {
        if (number == 0) {
            return;
        }
        System.out.println(name);
        printName(name, number - 1);
    }
    
    
    public static void main(String[] args) {
        
        String name = "Rajesh Waghmode";
        Scanner obj = new Scanner(System.in);
        int number = obj.nextInt();
        printName(name, number);
    }
}
