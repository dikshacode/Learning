package LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        reverseLinkedList(node1);
    }
    private static ListNode reverseLinkedList(ListNode head){
        ListNode temp = head;
        ListNode front = null;
        ListNode prev = null;

        while(temp!=null){
            front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        head = null;
        return prev;
    }
}
