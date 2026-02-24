

public class MissingNumber {


    // bruite force
    public static int missingNumber(int[] arr) {

        for (int i = 1; i <= arr.length; i++) {
            int flag = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                return i;
            }
        }
        return 100;
    }
    
    // better 

    public static int missingNumber2(int[] arr) {
        int[] temp = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            temp[arr[i] - 1] = 1;
        }
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == 0) {
                return i + 1;
            }
        }
        return 100;
    }


    public static void main(String[] args) {
        
        int[] array = { 1, 2,3, 4, 5, 6,7, 8,10};

        System.out.println(missingNumber(array));
        System.out.println(missingNumber2(array));

        
    }

}
