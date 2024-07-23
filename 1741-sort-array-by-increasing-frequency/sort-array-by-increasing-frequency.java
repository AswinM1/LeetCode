
class Solution {
    public int[] frequencySort(int[] nums) {
           Arrays.sort(nums);

           HashMap<Integer,Integer> hm = new HashMap();

           for(var i: nums)
           {
               if (hm.containsKey(i)) {
    hm.put(i, hm.get(i) + 1);
} else {
    hm.put(i, 1);
}
           } 


            List<Integer> numList = new ArrayList();

            for(var i:nums)
                numList.add(i);

           Collections.sort(numList, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
            int v1=hm.get(a);
            int v2=hm.get(b);
            if(v1>v2)
            return 1;//swap
            else if(v1==v2)
            {
                if(a<b)
                return 1;
                else 
                return -1;

            }
            else
            {
            return -1;//no swap
    
            }
            }
            });
      
            for(int i=0;i<nums.length;i++)
            {
                nums[i] = numList.get(i);
            }

            return nums;
    }
}