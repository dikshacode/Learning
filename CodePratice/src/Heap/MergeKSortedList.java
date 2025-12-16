package Heap;

import LinkedList.ListNode;
import Tree.TreeNode;

import java.util.*;

public class MergeKSortedList {
    public static void main(String[] args){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode nd1 = new ListNode(5);
        ListNode nd2 = new ListNode(6);
        ListNode nd3 = new ListNode(7);
        ListNode nd4 = new ListNode(8);
        ListNode nd5 = new ListNode(9);
        nd1.next = node2;
        nd2.next = node3;
        nd3.next = node4;
        nd4.next = node5;
       List<ListNode> list = new ArrayList<>();
        ListNode ans = canMerge(list);
        System.out.print(ans);
    }
    protected static ListNode canMerge(List<ListNode> trees) {
        PriorityQueue<Map.Entry<Integer,ListNode>> pq = new PriorityQueue<>(
                Comparator.comparingInt(Map.Entry::getKey));
        for(ListNode node : trees){
            if(node != null){
                pq.add(new AbstractMap.SimpleEntry<>(node.val, node));
            }
        }
        ListNode Dummy = new ListNode(-1,null);
        ListNode temp = Dummy;

        while (!pq.isEmpty()){
           Map.Entry<Integer,ListNode> hm =  pq.poll();
            ListNode nd =  hm.getValue().next;
           if(nd!=null){
               pq.add(new AbstractMap.SimpleEntry<>(nd.val, nd));
           }
            temp.next = nd;
           temp = temp.next;
        }
        return temp;
    }
}
