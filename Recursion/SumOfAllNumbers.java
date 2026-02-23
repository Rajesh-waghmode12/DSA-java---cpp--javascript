import java.util.Scanner;

public class SumOfAllNumbers {


    public static int sumOfAllNumbers(int n, int current) {
        if (current > n) {
            return 0;
        }
        return current + sumOfAllNumbers(n, current + 1);
    }

    public static int sumOfAllNumbers2(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumOfAllNumbers2(n - 1);
    }
    
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        System.out.println(sumOfAllNumbers(n, 1));
        System.out.println(sumOfAllNumbers2(n));
    }

}
