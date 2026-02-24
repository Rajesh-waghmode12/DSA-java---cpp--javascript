

public class ReverseArray {


    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverseArray(int[] arr) {
        for (int start = 0, end = arr.length - 1; start < end; start++, end--) {
            swap(arr, start, end);
        }
    }
    
    public static void reverseArray2(int[] arr) {
        int start = 0;
        int end = arr.length -1 ;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    

    public static void main(String[] args) {

        
        int[] arr = { 34, 5, 774, 34, 33, 75, 3, 23 };

        reverseArray2(arr);
        printArray(arr);
        
    }
}