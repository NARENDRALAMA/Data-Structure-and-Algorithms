class Solution {
    public int subarraySum(int[] nums, int k) {

      Map<Integer,Integer> h1=new HashMap<>();
        h1.put(0,1);

        int prefixSum=0;
        int max_sum=0;
        
        for(int i=0;i<nums.length;i++){
            prefixSum=prefixSum+nums[i];
            if(h1.containsKey(prefixSum-k)){
               max_sum+=h1.get(prefixSum-k);
            }
            h1.put(prefixSum,h1.getOrDefault(prefixSum,0)+1);
        }
        return max_sum; 
    }
}