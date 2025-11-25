
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

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        if (index == 0) {
            head = head.next;
            size--;
            return;
        }

        Node<T> current = head;

        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        current.next = current.next.next;
        size--;
    }
    
    
    public void deleteNode(T data) {
        if (head == null)
            return;
        if (head.data.equals(data)) {
            Node<T> temp = head;
            head = head.next;
            temp.next = null;
            size--;
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
            size--;
        }
    }


    public void reverse() {
        
        Node<T> prev = null;
        Node<T> curr = head;
        Node<T> next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    public boolean search(T data) {
        Node<T> temp = head;
        while (temp != null) {
            if (temp.data.equals(data)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int size() {
        return size;
    }

    public void print() {
        Node<T> temp = head;

        while (temp != null) {
            System.err.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    public static void main(String[] args) {

        SinglyLinkedList<String> list = new SinglyLinkedList();

        list.insertAtHead("Rajesh Waghmode");
        list.insertAtHead("Avinash Waghmode");
        list.insertAtTail("Ganesh Thengal");
        list.deleteNode("Rajesh Waghmode");
        System.out.println(list.head.data);
        list.print();
        
        
        
        System.out.println();
        SinglyLinkedList<Integer> anotherList = new SinglyLinkedList<>();

        anotherList.insertAtHead(23);
        anotherList.insertAtHead(342);
        anotherList.insertAtHead(32);
        anotherList.insertAtTail(44);
        anotherList.insertAtTail(122);
        anotherList.insertAtTail(2);
        System.out.println(anotherList.size);
        System.out.println(anotherList.search(100));

        anotherList.print();
    }
}