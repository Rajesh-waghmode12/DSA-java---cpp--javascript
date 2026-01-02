import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    
    /*
     * brute force
     * time complexity: O(N^2)
     * space complexity: O(1)
     */
    public static int[] twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }
    
    /*
     * better force
     * time complexity: O(N)
     * space complexity: O(N)
     */
    
    public static int[] twoSum2(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int remain = target - arr[i];
            if (map.containsKey(remain)) {
                return new int[] { i, map.get(remain) };
            }
        }
        return new int[] {};
    }

    /*
     * optimal
     * time complexity: O(N log N)
     * space complexity: O(N)
     */
    public static int[] twoSum3(int[] arr, int target) {
        int n = arr.length;
        int[][] arrWithKeys = new int[n][2];
        for (int i = 0; i < arr.length; i++) {
            arrWithKeys[i][0] = arr[i];
            arrWithKeys[i][1] = i;
        }
        Arrays.sort(arrWithKeys, (a, b) -> Integer.compare(a[0], b[0]));
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int sum = arrWithKeys[left][0] + arrWithKeys[right][0];
            if (sum == target) {
                return new int[] { arrWithKeys[left][1], arrWithKeys[right][1] };
            }
            else if (sum < target) {
                left++;
            }
            else
                right--;
        }
        return new int[] {};
    }
    
    public static void main(String[] args) {
        int[] arr = { 1, 6, 2, 10, 3 };
        int[] nums = { 1, 3, 5, -7, 6, -3 };
        
        int[] sol = twoSum3(arr, 7);
        int[] sol2 = twoSum3(nums, 0);
        Arrays.stream(sol).forEach((ele) -> System.out.print(ele + " "));
        System.out.println();
        Arrays.stream(sol2).forEach((ele) -> System.out.print(ele + " "));
    }
}
