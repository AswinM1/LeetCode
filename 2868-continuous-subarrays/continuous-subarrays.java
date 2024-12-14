class Solution {
    public long continuousSubarrays(int[] nums) {
        long c=0;
        
        TreeMap<Integer,Integer> h=new TreeMap<>();
       

      int i=0;
      int j=0;
      while(j<nums.length)
      {
        h.put(nums[j],h.getOrDefault(nums[j],0)+1);

        while(h.lastKey()-h.firstKey()>2)
        {
            h.put(nums[i],h.getOrDefault(nums[i],0)-1);
            if(h.get(nums[i])==0)
            {
                h.remove(nums[i]);

            }
            i++;
        }

 c+=j-i+1;


        j++;
        
      }
     
return c;
        
    }
}