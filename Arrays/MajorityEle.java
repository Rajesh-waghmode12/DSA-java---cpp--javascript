import java.util.HashMap;
import java.util.Map;

public class MajorityEle {

    /*
     * brute force
     * time complexity: O(N^2)
     * space complexity: O(1)
     */
    public static int majorityEle(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count > arr.length / 2) {
                return arr[i];
            }
        }
        return -1;
    }
    
    public static int majorityEle2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count > arr.length / 2) {
                return arr[i];
            }
        }
        return -1;
    }

    /*
     * better 
     * time complexity: O(N)
     * space complexity: O(N)
     */
    
    public static int majorityEle3(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n / 2) {
                return entry.getKey();
            }
        }
        return -1;
    }

    /*
     * optimal
     * time complexity: O(N)
     * space complexity: O(1)
     */
    
    public static int majorityEle4(int[] arr) {
        int ele = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                ele = arr[i];
                count++;
            } else if (count != 0 && arr[i] != ele) {
                count--;
            } else
                count++;

        }
        int count1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                count1++;
            }
        }
        if (count1 > arr.length / 2)
            return ele;
        else
            return -1;
    }
    
    
    public static void main(String[] args) {
        int[] arr = { 7, 0, 0, 1, 7, 7, 2, 7, 7 };
        int[] nums = { 1, 1, 1, 2, 1, 2 };
        
        System.out.println(majorityEle4(arr));
        System.out.println(majorityEle4(nums));
    }
}
