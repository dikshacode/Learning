package LinkedList;

public class ReverseLinkedList2 {

    static ListNode reverseList(ListNode head, int left, int right){

        ListNode dummy = new ListNode(0,head);
        ListNode leftNode = dummy;
        ListNode currNode = head;

        for(int i = 0; i < left-1;i++){
            leftNode = leftNode.next;
            currNode = currNode.next;
        }
        ListNode subListHead = currNode;
        ListNode preNode = null;
        for(int i =0; i <= right - left;i++){
            ListNode nextNode = currNode.next;
            currNode.next = preNode;
            preNode = currNode;
            currNode = nextNode;
        }
        subListHead.next = currNode;
        leftNode.next = preNode;
        return dummy.next;
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
        ListNode ans =   reverseList(node1,2,4);
        System.out.print(ans);
    }
}
