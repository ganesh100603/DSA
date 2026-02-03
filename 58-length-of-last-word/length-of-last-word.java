class Solution {
    public int lengthOfLastWord(String s) {
        String[] a = s.split(" ");
        String b = a[a.length-1];
        int sum = b.length();
        return sum;
    }
}