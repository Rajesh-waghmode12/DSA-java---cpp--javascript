import java.util.Scanner;

public class PrintNToOne {
    
    public static void printNToOne(int current) {
        
        if (current < 1) {
            return;
        }
        System.out.println(current);
        printNToOne(current -1);
    }
    
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        int current = obj.nextInt();
        printNToOne(current);

    }

}
