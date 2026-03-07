

public class ArrayQueue {

    int[] arr;
    int start, end;
    int currSize, maxSize;

    public ArrayQueue() {
        arr = new int[10];
        start = -1;
        end = -1;
        currSize = 0;
        maxSize = 10;
    }

    public void push(int ele) {
        if (currSize == maxSize) {
            System.out.println("the queue is full \n existing...");
            System.exit(1);
        }
        if (end == -1) {
            start = 0;
            end = 0;
        } else {
            
        }
    }
    
    public static void main(String[] args) {
        
    }
}
