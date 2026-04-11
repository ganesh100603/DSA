class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        int k = 0;
        while (index < nums.length){
            if(nums[index] == val){
                index++;
                continue;
            }else{
                nums[k] = nums[index];
                index++;
                k++;
            }
        }
        return k;
    }
}