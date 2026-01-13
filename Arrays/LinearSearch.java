

public class LinearSearch {
    

    /*
     * time complexity: O(N)
     * space complexity: O(1)
     */
    
    public static boolean linearSearch(int[] arr, int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 3 };
        int[] arr2 = {2, -4, 4, 0, 10};
        System.out.println(linearSearch(arr, 3));
        System.out.println(linearSearch(arr2, 6));
     }
}
