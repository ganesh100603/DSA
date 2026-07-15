class Solution {
    public String removeStars(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        
        for(char c : s.toCharArray()){
            if(c == '*'){
                stack.pop();
            }else{
                stack.push(c);
            }
        }

        StringBuilder str = new StringBuilder();

        while(!stack.isEmpty()){
            str.append(stack.removeLast());
        }
        return str.toString();
    }
}