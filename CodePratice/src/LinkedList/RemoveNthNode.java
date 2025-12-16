package LinkedList;

public class RemoveNthNode {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        //ListNode node7 = new ListNode(6);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next =  null;
        solve(node1,2);
    }
   static ListNode solve(ListNode head, int n)
    {
        ListNode dummy = new ListNode(-1);
        dummy.next =head;
        ListNode firstPtr = dummy;
        ListNode secondPtr = dummy;

        for(int i=0;i<n;i++)
        {
            secondPtr = secondPtr.next;
        }
        while(secondPtr.next!=null)
        {
            secondPtr =  secondPtr.next;
            firstPtr = firstPtr.next;
        }
        firstPtr.next = firstPtr.next.next;
        return dummy.next;
    }
}
