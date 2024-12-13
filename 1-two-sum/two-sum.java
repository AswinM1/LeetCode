class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> h=new HashMap<>();
       for(int i=0;i<nums.length;i++)
       {
        int x=target-nums[i];
        if(h.containsKey(x))
        {
            int v=h.get(x);
            return new int[]{i,v};
        }
        else
        {
            h.put(nums[i],i);
        }

       }
       return new int[]{};
        
    }
}