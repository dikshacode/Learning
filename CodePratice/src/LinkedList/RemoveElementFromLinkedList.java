package LinkedList;

public class RemoveElementFromLinkedList {
    public static void main(String[] args){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(6);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(5);
        //ListNode node7 = new ListNode(6);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = null;
        deleteNode(node1,6);
    }

    public static ListNode solve(ListNode head, int val)
    {
        // code here
        ListNode temp = new ListNode(0,head);
        ListNode curr = temp;

        while(curr.next != null){
            if(curr.next.val==val){
                curr.next = curr.next.next;
            }
            else
                curr = curr.next ;
        }
        return temp.next;
    }

    public static ListNode deleteNode(ListNode head, int val)
    {
        // code here
        ListNode ptr = new ListNode(0,head);
        ListNode temp = head;

        while(temp != null){
            if(temp.val==val){
                ptr.next = temp.next;
            }
                 ptr  = temp;
                temp = temp.next ;

        }
        return head;
    }


}
