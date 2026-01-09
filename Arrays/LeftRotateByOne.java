import java.util.Arrays;

public class LeftRotateByOne {

    /*
     * brute force
     * time complexity: O(N)
     * space complexity: O(N)
     */
    public static void leftRotateByOne(int[] arr) {
        int[] temp = new int[arr.length];
        for (int i = 1; i < arr.length; i++) {
            temp[i - 1] = arr[i];
        }
        temp[temp.length - 1] = arr[0];

        //printing array
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }
    }
    
    /*
     * optimal
     * time complexity: O(N)
     * space complexity: O(1)
     */
    public static void leftRotateByOne2(int[] arr) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i -1] = arr[i];
        }
        arr[arr.length -1 ] = temp;

          //printing array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }



    public static void main(String[] args) {
        int[] array = { 12, 45, 533, 64, 74, 23, 6, 10 };
        leftRotateByOne2(array);
    }
}
