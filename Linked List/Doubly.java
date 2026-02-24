

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data, Node next, Node prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}


public class Doubly {
    
    public static void main(String[] args) {

        int[] arr = { 2, 5, 8, 7 };

        Node head = new Node(arr[0]);

        System.out.println(head);
        System.out.println(head.data);
    }

}
