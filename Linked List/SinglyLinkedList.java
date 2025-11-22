
class Node<T> {
    
    T data;
    Node next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}


public class SinglyLinkedList<T> {

    private Node<T> head;
    private int size;

    public SinglyLinkedList() {
        this.size = 0;
    }

    public void insertAtHead(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
        size++;
    }
    
    public void insertAtTail(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            size++;
            return;
        }

        Node<T> curruntNode = head;
        while (curruntNode.next != null) {
            curruntNode = curruntNode.next;
        }
        curruntNode.next = newNode;
        size++;
    }
    
    public void deleteNode(T data) {
        if (head == null)
            return;
        if (data == head.data) {
            Node<T> temp = head;
            head = head.next;
            temp.next = null;
            return;
        }

        Node<T> currNode = head;
        while (currNode.next != null && currNode.next.data != data) {
            currNode = currNode.next;
        }

        if (currNode.next != null) {
            Node<T> temp = currNode.next;
            currNode.next = temp.next;
            temp.next = null;
        }
    }

    public boolean search(T data) {
        Node<T> temp = head;
        while (temp != null) {
            if (temp.data == data) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void print() {
        Node<T> temp = head;

        while (temp != null) {
            System.err.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();

        list.insertAtHead(3);
        list.insertAtHead(2);
        list.insertAtHead(1);

        list.insertAtTail(4);
        list.insertAtTail(5);

        System.out.println("Linked List:");
        list.print();

        System.out.println("Searching for 3: " + list.search(3));
        System.out.println("Deleting 3...");
        list.deleteNode(3);

        System.out.println("Linked List after deletion:");
        list.print();
        
    }
}