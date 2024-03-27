class Solution {
    public boolean isValid(String s) {
        Stack<Character> st= new Stack<>();
        for(char it: s.toCharArray()){
            if(it== '(' || it=='{' || it=='['){
                st.push(it);
            }
            else{
                if(it == ')'){
                    if(st.isEmpty() || st.pop()!='(' ){
                        return false;
                    }
                }
                if(it == '}'){
                    if(st.isEmpty() || st.pop()!='{'){
                        return false;
                    }
                }
                if(it == ']'){
                    if( st.isEmpty() || st.pop()!='[' ){
                        return false;
                    }
                }
            }
        }
        return st.isEmpty();
    }
}