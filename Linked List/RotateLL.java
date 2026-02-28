class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}



public class RotateLL {
    
    
    public static ListNode rotateRight(ListNode head , int k){
        if(head == null || head.next == null || k == 0){
            return head;
        }
        int length = 1;
        ListNode tail = head;
        while(tail.next != null){
            tail = tail.next;
            length++;
        }
        tail.next = head;
        k = k % length;
        int stepsToNewTail = length - k ;
        ListNode newTail = head;
        for(int i = 1; i < stepsToNewTail; i++){
            newTail = newTail.next;
        }
        ListNode newHead = newTail.next;
        newTail.next = null;
        return newHead;
    }


    public static void printList(ListNode head){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k = 2;
        System.out.println("before ratatig list: ");
        printList(head);
        head = rotateRight(head , k);
        System.out.println("after ratatig list: ");
        printList(head);
        

    }
}