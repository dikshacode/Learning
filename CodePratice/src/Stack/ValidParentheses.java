package Stack;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args){
    String str = "(]";
    System.out.print(checkParenthese(str));
    }
    static boolean checkParenthese(String s){
        Stack<Character> stack = new Stack<Character>();
        int n = s.length();
        for(int i=0; i<n; i++){
            if(s.charAt(i) =='('|| s.charAt(i)  == '{'|| s.charAt(i)=='['){
                char temp = s.charAt(i);
                stack.push(temp);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                else{
                   if((s.charAt(i) ==')' && stack.peek() != '(')||
                           (s.charAt(i) == '}' && stack.peek() != '{' )||
                           (s.charAt(i)==']' && stack.peek()!= '[' ) ){
                       return false;
                   }
                }
            }
        }
        return stack.isEmpty();
    }

}
