import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Leaders {

    /*
     * brute force
     * time complexity: O(N^2)
     * space complexity: O(1)
     */
    public static List<Integer> leader(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            boolean isLeader = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] >= arr[i]) {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader) {
                ans.add(arr[i]);
            }
        }
        return ans;
    }
    
    /*
     * optimal
     * time complexity: O(N)
     * space complexity: O(1)
     */
    public static List<Integer> leader2(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        int max = arr[arr.length - 1];
        ans.add(max);
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > max) {
                ans.add(arr[i]);
                max = arr[i];
            }
        }
        Collections.reverse(ans);
        return ans;
    }
    
    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 3, 1, 2 };
        List<Integer> res = leader2(arr);
        for (int ele : res) {
            System.out.println(ele + " ");
        }
    }
}