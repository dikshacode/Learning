package LinkedList;

public class Test {
    public static void main(String[] args){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(1);
        //ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        //node4.next = node5;
        ListNode subList =  findMid(node1);
        ListNode.printListNode(subList);
        ListNode reversedSubList = reverseList(subList);
        ListNode.printListNode(reversedSubList);
        System.out.print(checkPalindrom(node1,reversedSubList));
    }
    public static ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;
        ListNode nextNode = null;
        while(temp != null){
            nextNode = temp.next;
            temp.next = prev;
            prev = temp;
            temp = nextNode;
        }
        head.next = null;
        return prev;
    }
    public static ListNode findMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast !=null && fast.next !=null){
           slow = slow.next;
           fast = fast.next.next;
        }
        return slow;
    }
    public static boolean checkPalindrom(ListNode head1, ListNode head2){

        while (head2 !=null){
            if(head1.val != head2.val)
                return false;
            head1 = head1.next;
            head2= head2.next;
        }
        return true;
    }
}
