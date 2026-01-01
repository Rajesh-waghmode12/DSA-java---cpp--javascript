import java.util.Arrays;

public class SecondLargestAndSecondSmalles {


    /*
     * brute force
     * time complexity: O(N log N)
     * space complexity: O(1)
     */
    public static void sLargestsSmallest(int[] arr) {
        if (arr.length == 1) {
            System.out.println("there is second smallest and second largest element in the array");
            return;
        }
        Arrays.sort(arr);
        System.out.println("Second Largest: " + arr[arr.length - 2]);
        System.out.println("Second smallest: " + arr[1]);
    }

    /*
     * better 
     * time complexity: O(N)
     * space complexity: O(1)
     */
    public static void sLargestsSmallest2(int[] arr) {
        int smallest = Integer.MAX_VALUE, second_smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE, second_largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            smallest = Math.min(smallest, arr[i]);
            largest = Math.max(largest, arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < second_smallest && arr[i] != smallest) {
                second_smallest = arr[i];
            }
            if (arr[i] > second_largest && arr[i] != largest) {
                second_largest = arr[i];
            }
        }
        System.out.println("Second Largest: " + second_largest);
        System.out.println("Second smallest: " + second_smallest);
    }



    /*
     * optimal 
     * time complexity: O(N)
     * space complexity: O(1)
     */
    public static int second_smallest(int[] arr) {
        int small = Integer.MAX_VALUE;
        int second_smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < small) {
                second_smallest = small;
                small = arr[i];
            }
            else if (arr[i] < second_smallest && arr[i] != small) {
                second_smallest = arr[i];
            }
        }
        return second_smallest;
    }

    public static int second_largest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                second_largest = largest;
                largest = arr[i];
            }
            else if (arr[i] > second_largest && arr[i] != largest) {
                second_largest = arr[i];
            }
        }
        return second_largest;
    }
    
    public static void main(String[] args) {
        int[] array = { 12, 45, 533, 64, 74, 23, 6 ,10};
        sLargestsSmallest(array);
        sLargestsSmallest2(array);

        System.out.println("Second Largest: " + second_largest(array));
        System.out.println("Second smallest: " + second_smallest(array));
        
    }
}
