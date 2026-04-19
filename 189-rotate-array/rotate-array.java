class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length <= 1) return;
        int n = nums.length - 1;
        k = k % nums.length;
        swap(nums, 0, n);
        swap(nums, 0, k-1);
        swap(nums, k, n);
    }
        public void swap(int[] nums,int first,int last){
        while (first < last) {
            int temp = nums[first];
            nums[first] = nums[last];
            nums[last] = temp;
            first++;
            last--;
        }
        }
}