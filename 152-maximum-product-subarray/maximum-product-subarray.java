class Solution {
    public int maxProduct(int[] nums) {
        int pro=1;
        int pre=1;
        int max=Integer.MIN_VALUE;
       int n=nums.length;
        int suff=1;
       
        for(int i=0;i<nums.length;i++)
        {
            if(pre==0)pre=1;
            if(suff==0)suff=1;
            pre=pre*nums[i];
            suff=suff*nums[n-i-1];
            max=Math.max(max,Math.max(pre,suff));
        }
return max;
        
    }
}