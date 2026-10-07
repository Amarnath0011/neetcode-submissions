class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i= 0 ; i < nums.length ; i++){
            int req  = target - nums[i];

            if(!map.containsKey(req)){
                map.put(nums[i] , i);
            }
            else{
                int j = map.get(req);
            return new int[]{j, i};
            }
            
        }
        return new int[]{0,0};
    }
}
