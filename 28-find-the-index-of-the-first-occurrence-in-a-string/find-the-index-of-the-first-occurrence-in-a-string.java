class Solution {
    public int strStr(String haystack, String needle) {
        char a[] = haystack.toCharArray();
        char b[] = needle.toCharArray();
        if(haystack.length() < needle.length()) return -1;
        for(int i = 0; i <= haystack.length() - needle.length(); i++){
            int j;
            for(j = 0; j < needle.length(); j++){
                if(a[i+j] != b[j]) break;
            }
            if(j==needle.length()) return i;
        }
        return -1;
    }
}