import java.util.HashSet;

public class RemoveDuplicate {

    /*
     * brute force
     * time complexity: O(N)
     * space complexity: O(N)
     */
    public static int removeDuplicate(int[] arr) {
        HashSet<Integer> res = new HashSet<>();
        int index = 0;
        for (int i : arr) {
            if (!res.contains(i)) {
                arr[index] = i;
                res.add(i);
                index++;
            }
        }
        return index;
    }
    
    /*
     * optimal
     * time complexity: O(N)
     * space complexity: O(1)
     */
    public static int removeDuplicate2(int[] arr) {
        if (arr.length == 0)
            return 0;
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }
    
    public static void printArray(int[] arr , int index) {
        for(int i =0 ;i < index;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {

        int[] arr = { 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5 };

        int last = removeDuplicate2(arr);
        printArray(arr, last);
    
        
    }    
}
