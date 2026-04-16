class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length <=2) return nums.length;
        int index = 2;
        int k = 2;
        while(index < nums.length){
            if(nums[index] != nums[k-2]){
                nums[k] = nums[index];
                k++;
            }
            index++;
        }
        return k;
    }
}