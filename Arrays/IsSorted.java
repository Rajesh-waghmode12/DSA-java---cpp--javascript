


public class IsSorted {
    
    /*
     * brute force
     * time complexity: O(N^2)
     * space complexity: O(1)
     */
    public static boolean isSorted(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }
    
    /*
     * optimal
     * time complexity: O(N)
     * space complexity: O(1)
     */
    
    public static boolean isSorted2(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int[] arr = { 45, 12, 89, 3, 67, 21, 55, 94, 7, 38 };
        int[] arr2 = {3, 7, 12, 21, 38, 45, 55, 67, 89, 94 };
        System.out.println(isSorted2(arr));
        System.out.println(isSorted2(arr2));
        
    }

}
