class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder("");
        String baseStr = strs[0];
        for(int i = 0; i < baseStr.length(); i++){
            char letter = baseStr.charAt(i);
            for(int j = 1; j < strs.length;j++){
                if(i >= strs[j].length() || strs[j].charAt(i) != letter){
                    return prefix.toString();
                }
            }
            prefix.append(letter);
        }
        return prefix.toString();
    }
}