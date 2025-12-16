package LinkedList;

public class PalindromeLinkedList {
    public static void main(String[] args){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        ListNode reversedLL =  reverseNode(node1);
       boolean isPalindrome =  checkPalindrome(node1,reversedLL);
       System.out.print(isPalindrome);
    }
    public static boolean checkPalindrome(ListNode head1,ListNode head2){
        while (head1!=null && head2!=null){
            if(head1.val==head2.val)
                return true;
            head1 = head1.next;
            head2 = head2.next;
        }
        return false;
    }
    public static ListNode reverseNode(ListNode head){
        ListNode front = null;
        ListNode prev = null;
        ListNode temp = head;

        while(temp!=null){
            front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        head.next = null;
        return prev;
    }
}
