class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer>[] buckets=new List[nums.length+1];
        for(int key:map.keySet()){
            int f=map.get(key);
            if(buckets[f]==null){
                buckets[f]=new ArrayList<>();
            }
            buckets[f].add(key);
        }
        List<Integer> res=new ArrayList<>();
        for(int i=buckets.length-1;i>=0 && res.size()<k;i--){
            if(buckets[i]!=null){
                res.addAll(buckets[i]);
            }
        }
        int[] result=new int[k];
        for(int i=0;i<k;i++){
            result[i]=res.get(i);
        }
        return result;
    }
}
