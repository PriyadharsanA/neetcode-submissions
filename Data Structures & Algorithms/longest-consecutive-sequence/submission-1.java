class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int maxval=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int val=0;
                while(set.contains(num++)){
                    val++;
                }
                maxval=Math.max(maxval,val);
            }
        }
        return maxval;
    }
}
