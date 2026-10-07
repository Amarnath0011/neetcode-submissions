class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int [] ans = new int[k];
        int n = nums.length;
        for(int i = 0; i < n ; i++){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0) +1);
        }
PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a,b) -> a.getValue() - b.getValue());

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            pq.add(entry);
            if(pq.size() > k){
                pq.poll();
            }
        }

        for(int i = 0; i< k ; i++){
            ans[i] = pq.poll().getKey();
        }

        return ans;
    }
}