class Solution {
    public boolean isPalindrome(int x) {
        String a = String.valueOf(x);
        StringBuilder b = new StringBuilder(a).reverse();
        if(b.toString().equals(a)) return true;
        return false;
    }
}