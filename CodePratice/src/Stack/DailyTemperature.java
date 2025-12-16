package Stack;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperature {
    public static void main(String[] args){
        int[] arr = {30,60,90};
        int[] ans = nextWarmerDay(arr);
       // System.out.print(ans.toString());
        System.out.print(nextWarmerDay(arr));
    }
    private static int[] nextWarmerDay(int[] arr){
        int diff =0;
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[arr.length];
        for(int i = arr.length-1;i>=0;i--) {
            int curr = arr[i];
            while(!stack.isEmpty() && curr > arr[stack.peek()]){
                stack.pop();
            }
            if (!stack.isEmpty() && curr < arr[stack.peek()]){
                diff = stack.peek() - i;
                ans[i] = diff;
            }
            stack.push(i);
        }
        return ans;
    }
    public static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<Integer>();
        int[] output = new int[temperatures.length];
        Arrays.fill(output,0);
        for(int i=0;i<temperatures.length;i++)
        {
            if(stack.isEmpty())
            {
                stack.push(i);
            }
            while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i])
            {
                int indx = i - stack.peek();
                output[stack.peek()] = indx;
                stack.pop();
            }
            stack.push(i);
        }
        return output;
    }
}
