import java.util.Scanner;

class Node{
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

}
public class Main {


    public static Node createBinaryTree() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(5);
        return root;
    }

    public static void main(String[] args) {
        
    }
}