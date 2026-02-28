
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

public class Segregate {
    

    public static Node segregateEvenOdd(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node evenHead = null , evenTail = null;
        Node oddHead = null, oddTail = null;
        Node current = head;
        while (current != null) {
            if (current.data % 2 == 0) {
                if (evenHead == null) {
                    evenHead = current;
                    evenTail = current;
                } else {
                    evenTail.next = current;
                    evenTail = evenTail.next;
                }
            } else {
                if (oddHead == null) {
                    oddHead = current;
                    oddTail = current;
                } else {
                    oddTail.next = current;
                    oddTail = oddTail.next;
                }
            }
            current = current.next;
        }
        if (evenHead == null)
            return oddHead;
        if (oddHead == null)
            return evenHead;
        evenTail.next = oddHead;
        oddTail.next = null;
        return evenHead;
    }

    public static Node segregateEvenOdd2(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node evenHead = null, evenTail = null;
        Node oddHead = null, oddTail = null;

        Node current = head;

        while (current != null) {

            Node nextNode = current.next; // save next node
            current.next = null; // break old link

            if (current.data % 2 == 0) {

                if (evenHead == null) {
                    evenHead = evenTail = current;
                } else {
                    evenTail.next = current;
                    evenTail = current;
                }

            } else {

                if (oddHead == null) {
                    oddHead = oddTail = current;
                } else {
                    oddTail.next = current;
                    oddTail = current;
                }
            }

            current = nextNode; // move forward safely
        }

        if (evenHead == null)
            return oddHead;
        if (oddHead == null)
            return evenHead;

        evenTail.next = oddHead;

        return evenHead;
    }
    
    public static void main(String[] args) {
        
        // Creating linked list: 17 -> 15 -> 8 -> 12 -> 10 -> 5 -> 4
        
        Node head = new Node(17);
        head.next = new Node(15);
        head.next.next = new Node(8);
        head.next.next.next = new Node(12);
        head.next.next.next.next = new Node(10);
        head.next.next.next.next.next = new Node(5);
        head.next.next.next.next.next.next = new Node(4);

        // Call segregation function
        Node newHead = segregateEvenOdd(head);

        // Print result
        while (newHead != null) {
            System.out.print(newHead.data + " ");
            newHead = newHead.next;
        }
    }

}
