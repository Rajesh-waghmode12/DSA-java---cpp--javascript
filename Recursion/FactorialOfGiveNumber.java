import java.util.Scanner;

public class FactorialOfGiveNumber {

    public static int factorialOfGivenNumber(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorialOfGivenNumber(n - 1);
    }
    
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        System.out.println(factorialOfGivenNumber(n));

    }
}
