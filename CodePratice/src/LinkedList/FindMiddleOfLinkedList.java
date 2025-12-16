package LinkedList;

public class FindMiddleOfLinkedList {
    public static ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode second = head;
        while(fast.next!=null && second.next!=null){
            second = second.next.next;
            fast = fast.next;
        }
        return fast;
    }
    public static ListNode deleteNode(ListNode head,int n){
        ListNode temp = head; int len = 1;
        while(temp.next != null){
            temp = temp.next;
            len++;
        }
        ListNode temp2 = head;
        int removeNode = len - n;
        int count =1;
        while(temp2.next!=null && count < removeNode){
           temp2 =  temp2.next;
           count++;
        }
        temp2.next = temp2.next.next;
        return head;
    }
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
        //middleNode(node1);
        deleteNode(node1,2);
    }
}
