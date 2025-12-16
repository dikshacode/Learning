package Stack;

import java.util.Stack;

public class ReversePolishNotation {
    public static void main(String[] args){
        String[] str = {"-", "8", "3", "/"};
        System.out.println(solve(str));
    }
    static int solve(String[]  input){
        Stack<Integer> stack = new Stack();
        for(int i=0;i< input.length;i++){
            String str = input[i];
            if(!str.equalsIgnoreCase("+")&& !str.equalsIgnoreCase("-")&&!str.equalsIgnoreCase("*")&&!str.equalsIgnoreCase("/")){

                stack.push(Integer.valueOf(str));
            }
            else{
                if(!stack.isEmpty()) {
                    int a = stack.pop();
                    int b = stack.pop();
                    int res = applyOperation(a, b, str);
                    stack.push(res);
                }
            }
        }
        return stack.pop();
    }
    static int applyOperation(int a,int b,String opr){
        int res =0;
        switch(opr){

            case ("+"):
                res = a+b;
                break;
            case ("-"):
                res = b-a;
                break;
            case ("*"):
                res = a*b;
                break;
            case ("/"):
                res = b/a;
                break;
            default:
                break;
        }
        return res;
    }
}
