import java.util.Stack;

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

public class ReverseLinkedList {


    public static void insertData(int data, Node head) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node newNode = new Node(data);
        temp.next = newNode;
    }

    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node reverseList(Node head) {
        Stack<Integer> s = new Stack<>();
        Node temp = head;
        while (temp != null) {
            s.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            temp.data = s.pop();
            temp = temp.next;
        }
        return head;
    }

    public static Node reverseList2(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node prev = null;
        Node temp = head;
        while (temp != null) {
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }

    public static void reverseListRecur(Node head) {
        if (head == null || head.next == null) {
            System.out.println(head.data);
            return;
        }
        reverseListRecur(head.next);
        System.out.println(head.data);
        

    }
    
    public static void main(String[] args) {
     
        Node head = new Node(1);
        insertData(2, head);
        insertData(3, head);
        insertData(4, head);
        insertData(5, head);
        insertData(6, head);
        // printLinkedList(head);
        // reverseList(head);
        reverseListRecur(head);
        // printLinkedList(head);
    }
}
