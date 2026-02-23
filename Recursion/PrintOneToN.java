import java.util.Scanner;

public class PrintOneToN {
    
    public static void printOneToN(int current, int n) {
        if (current == n) {
            System.out.println(current);
            return;
        }
        System.out.println(current);
        printOneToN(current+1, n);
    }
    
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        printOneToN(1, n);

    }
}
