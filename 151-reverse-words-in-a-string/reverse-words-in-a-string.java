class Solution {
    public String reverseWords(String s) {
        String a[] = s.trim().split("\\s+");
        StringBuilder reverse = new StringBuilder();
        for(int i = a.length -1; i>=0; i--){
            reverse.append(a[i]);
            if(i!=0){
                reverse.append(" ");
            }
        }
        return reverse.toString();
    }
}