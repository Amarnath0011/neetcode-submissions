class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefP = new int[n];
        int[] suffP = new int[n];

        int[] ans = new int[n];

        prefP[0] = nums[0];
        for(int i = 1; i< n ;i++){
            prefP[i] = prefP[i-1] * nums[i];
        }
        suffP[n-1] = nums[n-1];
        for(int i = n - 2; i>= 0 ; i--){
            suffP[i] = suffP[i+1] * nums[i];
        }


        for(int i = 0 ; i< n ;i++){
            if(i == 0){
                ans[i] = suffP[1];
            }
            else if(i == n-1){
                ans[i] = prefP[n-2];
            }
            else{
                ans[i] = suffP[i + 1] * prefP[i - 1];
            }
        }
        return ans;
    }
}  
