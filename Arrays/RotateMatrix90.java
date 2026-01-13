

public class RotateMatrix90 {
    
    /*
     * brute force
     * time complexity: O(N*M)
     * space complexity: O(N)
     */
    public static void rotateM(int[][] arr) {
        int[][] rotated = new int[arr.length][arr[0].length];
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                rotated[j][n - i - 1] = arr[i][j];
            }
        }
        printArray(rotated);
    }

    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    /*
     * optimal
     * time complexity: O(N*M)
     * space complexity: O(1)
     */
    public static void rotateM2(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[i].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int start = 0, end = arr.length - 1;
            while (start < end) {
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
                start++;
                end--;
            }
        }
        printArray(arr);
    }
    
    public static void main(String[] args) {
        
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        rotateM2(matrix);
    }

}
