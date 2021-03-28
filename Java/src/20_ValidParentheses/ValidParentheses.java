import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for(char c : s.toCharArray()){
            if(c =='(' || c =='{' || c == '[') st.push(c);
            else if(st.empty()|| (c==')'&&st.peek()!='(')|| (c=='}'&& st.peek()!='{')|| (c==']'&& st.peek()!='['))
                        return false;
            else st.pop();
                
        }
        if(st.size() == 0) return true;
        else return false;
    }
}