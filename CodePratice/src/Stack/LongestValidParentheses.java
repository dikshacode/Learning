package Stack;

import java.util.Stack;

public class LongestValidParentheses {
    public static int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<Integer>();
        int index = -1;
        int max_len = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                if (!stack.isEmpty()) {
                    stack.pop();
                    if (!stack.isEmpty()) {
                        max_len = Math.max(max_len, i - stack.peek());
                    } else {
                        max_len = Math.max(max_len, i - index);
                    }
                } else {
                    index = i;
                }
            }
        }

        return max_len;
    }
    public static void main(String[] args){
        System.out.print(longestValidParentheses("(()()"));
    }
}
