
import java.util.Stack;

public class Reverse {
    

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reserse(int[] arr , int start , int end) {
        if (start >= end) {
            return;
        }
        reserse(arr, start+1, end-1);
        swap(arr, start, end);
    }
    
    public static void main(String[] args) {

        int[] arr = { 23, 54, 64, 6, 34, 5 };

        // Stack<Integer> s = new Stack<>();

        // for (int i = 0; i < arr.length; i++) {
        //     s.push(arr[i]);
        // }
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = s.pop();
        // }

        reserse(arr, 0, arr.length - 1);
        
        print(arr);
    }
}
