class Solution {
    public double myPow(double x, int n) {
        long N = n;
        return power(x,N);
    }
    private double power(double x , long N){
        if(N==0) return 1;
            if(N<0){
                x = 1/x;
                N = -N;
            }

            double res = power(x,N/2);

            if(N%2 == 0){
                return res * res;
            }else{
                return x * res * res;
            }
    }
}