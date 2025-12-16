package Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args){
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        nextGreaterElement(nums1,nums2);
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int m = nums2.length;
        Stack<Integer> stack = new Stack<Integer>();
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=m-1;i>=0;i--)
        {
            int currNum = nums2[i];
            while(!stack.isEmpty() && stack.peek()<currNum)
            {
                stack.pop();
            }
            if(stack.isEmpty())
                map.put(currNum,-1);
            else
                map.put(currNum,stack.peek());
            stack.push(currNum) ;
        }
        for(int i=0;i<nums1.length;i++)
        {
            nums1[i] = map.containsKey(nums1[i])?map.get(nums1[i]):-1;
        }
        return nums1;
    }
}
