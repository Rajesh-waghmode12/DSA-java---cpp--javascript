import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityE {
    

    /*
     * brute force
     * time complexity: O(N^2)
     * space complexity: O(1)
     */
    
    public static List<Integer> majorityE(int[] arr) {
        int n = arr.length;
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > (n / 3) && !ans.contains(arr[i])) {
                ans.add(arr[i]);
                break;
            }
        }
        return ans;
    }

    /*
     * better
     * time complexity: O(N lon N)
     * space complexity: O(N)
     */
    public static List<Integer> majorityE2(int[] arr) {
        int n = arr.length;
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int mini = (n / 3) + 1;
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            if (map.get(arr[i]) == mini) {
                list.add(arr[i]);
            }
        }
        return list;
    }

    /*
     * optimal
     * time complexity: O(N)
     * space complexity: O(1)
     */

    public static List<Integer> majorityEle3(int[] arr) {
        int n = arr.length;
        int cnt1 = 0;
        int cnt2 = 0;
        int ele1 = Integer.MIN_VALUE;
        int ele2 = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (cnt1 == 0 && arr[i] != ele2) {
                cnt1 = 1;
                ele1 = arr[i];
            } else if (cnt2 == 0 && arr[i] != ele1) {
                cnt2 = 1;
                ele2 = arr[i];
            } else if (arr[i] == ele1) {
                cnt1++;
            } else if (arr[i] == ele2) {
                cnt2++;
            } else {
                cnt1--;
                cnt2--;
            }
        }
        
        cnt1 = 0;
        cnt2 = 0;
        for (int i = 0; i < n; i++) {
            if (ele1 == arr[i]) {
                cnt1++;
            }
            if (ele2 == arr[i]) {
                cnt2++;
            }
        }
        List<Integer> res = new ArrayList<>();
        int mini = (n / 3) + 1;
        if (cnt1 >= mini)
            res.add(ele1);
        if (cnt2 >= mini && ele1 != ele2)
            res.add(ele2);

        return res;
    }

    public static void main(String[] args) {
        
        int[] arr = { 1, 2, 1, 1, 3, 2 };
        System.out.println(majorityEle3(arr)); 
    }
}