class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> ans = new ArrayList<>();
        HashMap<String , ArrayList<String>> map = new HashMap<>();

        for(int i = 0; i< strs.length ; i++){
            char[] arr = strs[i].toCharArray();

            Arrays.sort(arr);

            String key = new String(arr);

            if(!map.containsKey(key)){
                ArrayList<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(key , list);
            }
            else {
                map.get(key).add(strs[i]);
            }
        }

        for (Map.Entry<String, ArrayList<String>> entry:   map.entrySet()) {

    ArrayList<String> list = entry.getValue();
     ans.add(list);
}
return ans;
    }
}
