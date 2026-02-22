class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            // for(int j = 1; j < nums.length; j++){
            // }
                if(map.containsKey(nums[i])){
                    int a =  i - map.get(nums[i]);
                    if(a <= k) return true;
                }
                    map.put(nums[i] , i);
        }
        return false;
    }
}