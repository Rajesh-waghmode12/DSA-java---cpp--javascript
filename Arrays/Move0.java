

public class Move0 {

    /*
     * brute force
     * time complexity: O(N)
     * space complexity: O(N)
     */
    
    public static void move0(int[] arr) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        int[] temp = new int[n - count];
        int tempIndex = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp[tempIndex++] = arr[i];
            }
        }
        tempIndex = 0;
        int indexArr = 0;
        while (tempIndex < temp.length) {
            arr[indexArr++] = temp[tempIndex++];

        }
        while (indexArr < n) {
            arr[indexArr++] = 0;
        }
        printArray(arr);
    }

    public static void move02(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                temp[index++] = arr[i];
            }
        }

        // just copy the temp in to arr 

        printArray(temp);
    }

    /*
     * optimal
     * time complexity: O(N)
     * space complexity: O(1)
     */
    
    public static void move03(int[] arr) {
        int n = arr.length;
        int slow = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                slow = i;
                break;
            }
        }
        if (slow == -1)
            return;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                swap(arr, slow, i);
                slow++;
            }
        }
        printArray(arr);
    }
    
    private static void swap(int[] arr, int slow, int i) {
        int temp = arr[slow];
        arr[slow] = arr[i];
        arr[i] = temp;
    }

    public static void printArray(int[] arr) {
        for (int ele : arr) {
            System.err.print(ele + " ");
        }
        System.err.println();
    }
    
    public static void main(String[] args) {
        int[] arr = { 0, 1, 4, 0, 5, 2 };
        move03(arr);
    }

}
