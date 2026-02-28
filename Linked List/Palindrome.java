import java.util.Stack;

class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }

    Node(int data , Node next) {
        this.data = data;
        this.next = next;
    }
}

public class Palindrome {

    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true;
        }
        Stack<Node> s = new Stack<>();
        Node temp = head;
        while (temp != null) {
            s.push(temp);
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            if (temp.data != s.pop().data) {
                return false;
            }
            temp = temp.next;
        }
        return true;
    }

    public static boolean isPalindrome(Node head) {
        if(head == null || head.next == null){
            return true;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            
        }
    }
    
    public static void main(String[] args) {
        

    }
}
