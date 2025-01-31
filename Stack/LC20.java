import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> arr = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                arr.push(ch);
            } 
            else {
                if (!arr.isEmpty()) {
                    char ch1 = arr.peek();
                    if (ch1 == '(') {
                        if (ch != ')') {
                            return false;
                        } else {
                            arr.pop();
                        }
                    } else if (ch1 == '{') {
                        if (ch != '}') {
                            return false;
                        } else {
                            arr.pop();
                        }
                    } else if (ch1 == '[') {
                        if (ch != ']') {
                            return false;
                        } else {
                            arr.pop();
                        }
                    }
                } 
                else {
                    return false;
                }
            }
        }
        return arr.isEmpty();
    }
}
