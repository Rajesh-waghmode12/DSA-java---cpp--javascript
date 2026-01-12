import java.util.ArrayList;

public class SpiralMatrix {

    /*
     * optimal 
     * time complexity: O(N*M)
     * space complexity: O(1)
     */
    public static ArrayList<Integer> spiralMatrix(int[][] arr) {
        ArrayList<Integer> res = new ArrayList<>();
        int top = 0;
        int bottom = arr.length - 1;
        int left = 0;
        int right = arr[0].length - 1;

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) {
                res.add(arr[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                res.add(arr[i][bottom]);
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    res.add(arr[bottom][i]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    res.add(arr[i][left]);
                }
                left++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };


        ArrayList<Integer> result = spiralMatrix(matrix);

        for (int i : result) {
            System.out.print(i + " ");
        }
        
    }

}
