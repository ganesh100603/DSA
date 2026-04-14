class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length ==0) return 0;
        int index = 1;
        int k = 1;
        while(index < nums.length){
            if(nums[index] != nums[k-1]){
                nums[k] = nums[index];
                k++;
            }
            index++;
        }
        return k;
    }
}