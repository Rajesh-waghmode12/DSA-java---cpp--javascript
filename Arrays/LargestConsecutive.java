import java.util.Arrays;

public class LargestConsecutive {
    
    private static boolean LinearSearch(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }
    
    /*
     * brute force
     * time complexity: O(N^2)
     * space complexity: O(1)
     */
    public static int lagestConsecative(int[] arr) {
        if (arr.length == 1) {
            return 1;
        }
        int n = arr.length;
        int maxCount = 1;
        for (int i = 0; i < n; i++) {
            int count = 1;
            int x = arr[i];
            while (LinearSearch(arr, x + 1) == true) {
                x += 1;
                count += 1;
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }

    public static int lagestConsecative3(int[] arr) {
        int longest = 1;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int count = 1;
            int ele = arr[i];
            while (true) {
                boolean findNext = false;
                for (int j = 0; j < n; j++) {
                    if (arr[j] == ele + 1) {
                        ele += 1;
                        count += 1;
                        findNext = true;
                        break;
                    }
                }
                if (!findNext) {
                    break;
                }
            }
            longest = Math.max(count, longest);
        }
        return longest;
    }

    /*
     * better force
     * time complexity: O(N longN)
     * space complexity: O(1)
     */
    public static int lagestConsecative2(int[] arr) {
        if (arr.length == 1)
            return 1;
        if (arr.length == 0)
            return 0;
        
        Arrays.sort(arr);
        int count = 1;
        int maxCount = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                continue;
            }
            if (arr[i + 1] == arr[i]+ 1) {
                count++;
                maxCount = Math.max(maxCount, count);
            } else
                count = 1;
        }
        return maxCount;
    }

    public static void main(String[] args) {
        
        int[] arr = { 100, 4, 200, 1, 3, 2 };

        int[] arr2 = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };
        
        System.out.println(lagestConsecative2(arr));
        System.out.println(lagestConsecative2(arr2));
    }
}