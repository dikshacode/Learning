package LinkedList;

public class ReverseKGroups {
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
        reverseKGroup(node1,2);
    }
    protected static ListNode reverseKGroup(ListNode head, int k){
        return createSubList(head,2);
    }
    protected static ListNode createSubList(ListNode head, int k)
    {
        ListNode temp = head;
        ListNode front = temp.next;
        int count = 0;
        while(count < k){
            if(temp==null)
                return head;

            temp = temp.next;

            count++;
        }
    ListNode prev = createSubList(temp,k);
        temp = head;
        count =0;
        while(count < k){
            ListNode next = temp.next;
            prev = temp;
            temp = next;
        }
        return temp;
    }
}
