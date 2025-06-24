package Stack;

import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        String s = "([])";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                 stack.push(')');
            }
            else if (s.charAt(i) == '{'){
                stack.push('}');
            }
            else if(s.charAt(i) == '['){
                stack.push(']');
            } else if (stack.pop() != s.charAt(i) || stack.isEmpty()) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
