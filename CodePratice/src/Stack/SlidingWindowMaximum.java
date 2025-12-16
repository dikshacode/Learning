package Stack;

import java.util.*;

public class SlidingWindowMaximum {
    public static void main(String[] args){
        int[] arr = {1,3,-1,-3,5,3,6,7};
        findMax(arr,3);
    }
    static int[] findMax(int[] nums, int k ){
        Deque < Integer > queue = new ArrayDeque<>();
        int maxNum = 0;
        int n = nums.length;
        int[] ans = new int[n-k+1]; int r = 0;
        for(int i =0; i < nums.length; i++) {
            if(!queue.isEmpty() && queue.peek() == i - k){
                queue.poll();
            }
            while(!queue.isEmpty() && nums[queue.peekLast()] < nums[i]){
                queue.pollLast();
            }
            queue.offer(i);

            if(i >=k-1){
                ans[r++] = nums[queue.peek()];
            }
        }
        return ans;
    }
}
