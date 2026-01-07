

public class Sort012 {

    /*
     * better force
     * time complexity: O(N)
     * space complexity: O(1)
     */
    public static void sort012(int[] arr) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                count0++;
            else if (arr[i] == 1)
                count1++;
            else
                count2++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (count0 > 0) {
                arr[i] = 0;
                count0--;
            } else if (count1 > 1) {
                arr[i] = 1;
                count1--;
            } else {
                arr[i] = 2;
                count2--;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    /*
     * optimal 
     * time complexity: O(N)
     * space complexity: O(1)
     */
    
    public static void sort0122(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, mid, low);
                mid++;
                low++;
            }
            else if (arr[mid] == 1) {
                mid++;
            }
            else {
                swap(arr, mid, high);
                high--;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        
        int[] arr = { 0, 1, 2, 0, 1, 1, 0, 1, 2 };
        sort0122(arr);
        printArray(arr);

    }
}
