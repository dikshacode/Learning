package Stack;

import java.util.Stack;

public class LargestHistoryGram {
    public static void main(String[] args){
        int[] arr = {2,1,5,6,2,3};
        solve(arr);
    }
    static int solve(int[]  input){
        int n = input.length;
        Stack<Integer> stack = new Stack<Integer>();
        int maxArea = 0;
        for(int i = 0;i <= n;i++){

            while(!stack.isEmpty() &&  input[i] <= input[stack.peek()]){
                int height = input[stack.peek()];stack.pop();
                int width = !stack.isEmpty() ? i - stack.peek() -1 : -1;
                int totalArea =  height * width;
                maxArea = Math.max(maxArea,totalArea);
            }
            stack.push(i);
        }
        return maxArea;
    }
}
