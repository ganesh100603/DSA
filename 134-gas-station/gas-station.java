class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0;
        int tank = 0;
        int n = gas.length;
        int totalgas = sum(gas);
        int totalcost = sum(cost);
        if(totalgas < totalcost) return -1;
        for(int i = 0; i<n; i++){
            tank += gas[i] - cost[i];
            if (tank < 0) {
                start = i + 1;
                tank = 0;
            };
        }
        return start;
    }

    public int sum(int [] arr){
        int total= 0;
        for(int i=0; i < arr.length; i++){
            total += arr[i];
        }
        return total;
    }
}