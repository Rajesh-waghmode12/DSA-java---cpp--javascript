import java.util.HashMap;
import java.util.Map;

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

public class LoopLength {

    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }


    public static int loopLength(Node head) {
        Node temp = head;
        int timer = 0;
        Map<Node, Integer> map = new HashMap<>();
        while (temp != null) {
            if (map.containsKey(temp)) {
                return timer - map.get(temp);
            }
            map.put(temp, timer);
            timer++;
            temp = temp.next;
        }
        return 0;
    }

    public static int loopLength3(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return countLoopLength(slow);
            }
        }
        return 0;
    }

    private static int countLoopLength(Node meetingPoint) {
        Node temp = meetingPoint;
        int length = 1;
        while (temp.next != meetingPoint) {
            length++;
            temp = temp.next;
        }
        return length;
    }


    public static void main(String[] args) {
        
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = third;
        System.out.println(loopLength3(head));
    }
}
