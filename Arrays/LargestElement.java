import java.util.Arrays;

public class LargestElement {

    /*  brute force    
        time complexity: O(N log N)
        space complexity: O(1)
     */
    public static int largestElement(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }


    /*
     * optimal 
     * time complexity: O(N)
     * space complexity: O(1)
     */
    public static int largestElement1(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i< arr.length;i++){
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        
        int[] array = { 12, 45, 533, 64, 74, 23, 6 };
        System.out.println(largestElement1(array));

    }

}
