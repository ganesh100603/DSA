class Solution {
    public boolean isPalindrome(String s) {
        String a = s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        StringBuilder b = new StringBuilder();
        for(int i = a.length() - 1; i >= 0; i--){
            b.append(a.charAt(i));
        }
        if(b.toString().equals(a)) return true;
        return false;
    }
}