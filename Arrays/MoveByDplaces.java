

public class MoveByDplaces {

    /*
     * brute force
     * time complexity: O(N)
     * space complexity: O(d)
     */
    public static void moveByDPlaces(int[] arr, int d) {
        if (arr.length == 0)
            return;
        int n = arr.length;
        d = d % n;
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }
        int count = 0;
        for (int j = n - d; j < n; j++) {
            arr[j] = temp[count++];
        }
    }

    public static void printArray(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    /*
     * optimal
     * time complexity: O(N)
     * space complexity: O(1)
     */
    public static void moveByDPlaces2(int[] arr, int d) {
        if (arr.length == 0)
            return;
        int n = arr.length;
        d = d % n;
        reverseArray(arr, 0, d - 1);
        reverseArray(arr, d, n - 1);
        reverseArray(arr, 0, n-1);
    }
    
    public static void main(String[] args) {
        
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        moveByDPlaces2(arr, 2);
        printArray(arr);
    }

}
