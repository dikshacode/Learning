package Heap;

import java.util.PriorityQueue;

public class MinimumCostToConnectRopes {
    static int findMinimumCost(int[] arr){
        PriorityQueue<Integer>minHeap = new PriorityQueue<>();
        int totalCost = 0;
        for(int ele:arr){
            minHeap.add(ele);
        }
        while (minHeap.size() > 1){
            int first = minHeap.poll();
            int second = minHeap.poll();
            int cost = first + second;
            totalCost += cost;
            minHeap.add(cost);
        }
        return totalCost;
    }
    public static void main(String[] args) {
        int[] arr = {4,3,2,6};
        System.out.println(findMinimumCost(arr));

    }
}
