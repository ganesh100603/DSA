class Solution {
    public int reverse(int x) {
        int a = 0;
        int reverse = 0;
        while(x != 0){
            a = x % 10;
            x = x/10;
            if(reverse > Integer.MAX_VALUE/10 || reverse < Integer.MIN_VALUE/10){
                return 0;
            }
            reverse = reverse * 10 + a;
        }
        
        return reverse;
    }
}