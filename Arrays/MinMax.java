import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

// devide & Conquer
class Solution {

    static class Pair {
        int min, max;

        Pair(int min, int max) {
            this.min = min;
            this.max = max;
        }
    }

    public Pair getMinMax(int[] arr, int low, int high) {
        if (low == high) {
            return new Pair(arr[low], arr[low]);
        }
        if (high == low + 1) {
            return new Pair(
                    Math.min(arr[low], arr[high]),
                    Math.max(arr[low], arr[high]));
        }

        // Case 3: more than two elements
        int mid = (low + high) / 2;

        Pair left = getMinMax(arr, low, mid);
        Pair right = getMinMax
        (arr, mid + 1, high);

        return new Pair(
                Math.min(left.min, right.min),
                Math.max(left.max, right.max));

    }
}

public class MinMax {

    public static ArrayList<Integer> minMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
            if (arr[i] > max)
                max = arr[i];
        }
        ArrayList<Integer> res = new ArrayList<>();
        res.add(min);
        res.add(max);
        return res;

    }

    // brute force
    public static ArrayList<Integer> minMax2(int[] arr) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        ArrayList<Integer> res = new ArrayList<>();
        res.add(min);
        res.add(max);
        return res;
    }

    // using sorting
    public static ArrayList<Integer> minMax3(int[] arr) {

        Arrays.sort(arr);
        ArrayList<Integer> res = new ArrayList<>();
        res.add(arr[0]);
        res.add(arr[arr.length - 1]);

        return res;

    }

    // using streams
    public static ArrayList<Integer> minMax4(int[] arr) {
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();

        return new ArrayList<>(List.of(min, max));
    }

    // using priorityQueue
    public static ArrayList<Integer> minMax5(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i : arr) {
            pq.add(i);
        }
        int min = pq.peek();
        int max = min;
        while (!pq.isEmpty()) {
            max = pq.poll();
        }
        return new ArrayList<>(List.of(min, max));
    }

    public static void main(String[] args) {

        int[] arr = { 23, 4, 673, 34, 34, 7, 56, 346, 6, 7, 445 };
        ArrayList<Integer> list = minMax5(arr);
        for (int i : list) {
            System.out.print(i + " ");
        }

    }
}
