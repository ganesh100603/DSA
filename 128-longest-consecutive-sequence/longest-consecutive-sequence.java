class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> seq = new HashSet<>();
        int length = 0;
        int curr = Integer.MAX_VALUE;
        int longest = 0;
        for(int i = 0; i < nums.length; i++){
            seq.add(nums[i]);
        }
        for(int num : seq){
            if(!seq.contains(num-1)){
                curr = num;
                length = 1;
                while(seq.contains(curr+1)){
                    curr++;
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}