package LinkedList;

public class ListNode {
    public int val;
     public  ListNode next;
     ListNode() {}
     public ListNode(int val) { this.val = val; }
     public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public static void printListNode(ListNode node){
         while(node != null){
             System.out.print(node.val + "->");
             node = node.next;
         }
        System.out.print( "null ");
    }
}
