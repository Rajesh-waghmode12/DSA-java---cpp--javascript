
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

}

public class Creation {
    
    public static void main(String[] args) {
        
        int[] arr = { 2, 5, 8, 7 };

        Node head = new Node(arr[0]);

        System.out.println(head);

        System.out.println(head.data);

    }


}
