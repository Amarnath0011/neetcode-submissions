class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i< nums.length;i++){
            set.add(nums[i]);
        }
        int maxCount = 0;
        for(int num : nums){
            int curr = num ; 
            int count = 1;
            if(!set.contains(curr-1)){
                count = 1;
                curr = num;
                while(set.contains(curr+1)){
                    count++;
                    curr++;
                }
            }
            maxCount = Math.max(maxCount , count);
        }
        return maxCount;
    }
}
