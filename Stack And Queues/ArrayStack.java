import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class ArrayStack {

    private int[] stackArray;
    private int capacity;
    private int topIndex;

    public ArrayStack(int size) {
        this.capacity = size;
        stackArray = new int[capacity];
        topIndex = -1;
    }

    public ArrayStack() {
        this(1000);
    }

    public void push(int ele) {
        if (topIndex >= capacity - 1) {
            System.out.println("Stack is Overflow");
            return;
        }
        stackArray[++topIndex] = ele;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("the array is already empty");
            return -1;
        }
        return stackArray[topIndex--];
    }

    public int top() {
        if (isEmpty()) {
            System.out.println("the stack is empty");
            return -1;
        }
        return stackArray[topIndex];
    }

    public boolean isEmpty() {
        return topIndex == -1;
    }

    public static void main(String[] args) {
        
        ArrayStack stack = new ArrayStack();
        List<String> commands = Arrays.asList("ArrayStack", "push", "push", "top", "pop", "isEmpty");
        List<List<Integer>> inputs = Arrays.asList(Arrays.asList(), Arrays.asList(5), Arrays.asList(10),
                Arrays.asList(), Arrays.asList(), Arrays.asList());

        for (int i = 0; i < commands.size(); ++i) {
            switch (commands.get(i)) {
                case "push":
                    stack.push(inputs.get(i).get(0));
                    System.out.print("null ");
                    break;
                case "pop":
                    System.out.print(stack.pop() + " ");
                    break;
                case "top":
                    System.out.print(stack.top() + " ");
                    break;
                case "isEmpty":
                    System.out.print((stack.isEmpty() ? "true" : "false") + " ");
                    break;
                case "ArrayStack":
                    System.out.print("null ");
                    break;
            }
        }
    }

}
