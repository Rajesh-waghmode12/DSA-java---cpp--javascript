import java.util.Random;

public class Main{
    public static void main(String args[]){
        // System.out.println("hello world");

        Random obj = new Random();

        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = obj.nextInt(100);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
