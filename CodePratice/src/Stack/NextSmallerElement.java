package Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextSmallerElement {
    public static void main(String[] args){
        int[] arr = {4, 8, 5, 2, 25};
        findNextSmallerNumberWithIndex(arr);
    }
    public static int[] findNextSmallerNumberWithIndex(int[] arr){
        int[] ans = new int[arr.length];
        Arrays.fill(ans,-1);
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<arr.length;i++){
            while(!stack.isEmpty() && arr[i] < arr[stack.peek()]){
                ans[stack.peek()] = arr[i];
                stack.pop();
                //stack.push(i);
            }
            stack.push(i);
        }
       return ans;
    }

    public static int[] findNextSmallerNumber(int[] arr){
        int[] ans = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<arr.length;i++){
            while(!stack.isEmpty() && arr[i] > stack.peek()){
                ans[i] = stack.peek();
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i] = -1;
            }
            else
                ans[i] = stack.peek();
            stack.push(arr[i]);
        }
        return ans;
    }
}
