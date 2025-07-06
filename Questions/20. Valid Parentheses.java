import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else {
                // 如果栈空 或 括号不匹配，返回 false
                if (stack.isEmpty() || stack.pop() != c) {
                    return false;
                }
            }
        }

        // 栈为空，说明全部匹配成功
        return stack.isEmpty();
    }
}
