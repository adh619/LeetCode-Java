/*
 * Given a non-empty array of integers, return the k most frequent elements.
 */

class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else{
                map.put(nums[i], 1);
            }
        }
        
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());
        
        List<Integer> res = new ArrayList<Integer>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            pq.add(entry);
        }
        
        while(res.size() < k){
            res.add(pq.poll().getKey());
        }
        
        return res;
    }
}
