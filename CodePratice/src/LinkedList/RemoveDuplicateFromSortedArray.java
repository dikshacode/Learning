package LinkedList;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(4);
        ListNode node7 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = null;
        removeDuplicate(node1);
    }
    private static ListNode removeDuplicate(ListNode head){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = head;
        ListNode prev = dummy;
        while(curr != null){
            System.out.print("curr--"+curr.val);
            if(curr.next!=null && curr.val==curr.next.val){
                System.out.print(" line 29-"+curr.next.val);
                while (curr.next!=null && curr.val==curr.next.val) {
                    curr = curr.next;
                }
                prev.next = curr.next;
            }
            else {
                System.out.println("prev--"+prev.val);
                prev = curr.next;
                System.out.println("38--"+prev.val);
            }
            curr = curr.next;
        }
        return dummy.next;
    }
}
