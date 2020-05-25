package 栈;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created By Halen 2020/5/16 17:33
 * https://leetcode-cn.com/problems/valid-parentheses/
 */
public class _20_有效的括号 {

    public boolean isValid1(String s) {
        while(s.contains("{}") || s.contains("[]")||s.contains("()")){
            s = s.replace("{}","");
            s = s.replace("[]","");
            s = s.replace("()","");
        }
        return s.isEmpty();
    }

    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        Stack<Character> stack = new Stack();
        String[] strings = {};
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                if (c!=map.get(stack.pop())) return false;
            }
        }
        return stack.isEmpty();
    }
}
