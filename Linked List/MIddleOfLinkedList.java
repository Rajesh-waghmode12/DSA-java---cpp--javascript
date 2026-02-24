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



public class MIddleOfLinkedList {
    
    
    public static void insertData(int data, Node head){
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
    }

    public static Node findMiddle(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        temp = head;
        count = (count / 2) + 1;
        while (count != 1) {
            count--;
            temp = temp.next;
        }
        return temp;
    }
    

    public static Node findMiddle2(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    
    public static Node findMiddleRecursive(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        return findMiddleHelper(head, head);
    }

    public static Node findMiddleHelper(Node slow , Node fast) {
        if (fast == null || fast.next == null) {
            return slow;
        }
        return findMiddleHelper(slow.next, fast.next.next);
    }
    
    public static void main(String[] args) {

        Node head = new Node(1);
        insertData(2, head);
        insertData(3, head);
        insertData(4, head);
        insertData(5, head);
        insertData(6, head);
        printLinkedList(head);
        System.out.println();
        System.out.println(findMiddleRecursive(head).data);
    }

}
