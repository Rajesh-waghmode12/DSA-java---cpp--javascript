

public class SetMatrix0 {


    /*
     * brute force
     * time complexity: O(N^3)
     * space complexity: O(1)
     */
    
    public static void changeRows(int[][] arr, int i) {
        for (int j = 0; j < arr[i].length; j++) {
            if (arr[i][j] != 0) {
                arr[i][j] = -1;
            }
        }
    }
    public static void changeCols(int[][] arr, int j) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][j] != 0) {
                arr[i][j] = -1;
            }
        }
    }
    public static void setO(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    changeRows(arr, i);
                    changeCols(arr, j);                }
            }

        }
    }
    public static void sol(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0 || arr[i][j] == -1) {
                    arr[i][j] = 0;
                }
            }
            System.out.println();
        }
    }

    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    /*
     * Better 
     * time complexity: O(N^2)
     * space complexity: O(1)
     */
    
    public static void setO2(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        boolean[] cols = new boolean[m];
        boolean[] rows = new boolean[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (rows[i]  || cols[j]) {
                    arr[i][j] = 0;
                }
            }
        }
    }

    
    public static void main(String[] args) {
        
        int[][] arr = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        int[][] arr1 = { {0,1,2,0},{3,4,5,2},{1,3,1,5} };

        printArray(arr1);
        System.out.println();
        setO2(arr1);
        sol(arr1);
        printArray(arr1);
    }
}
