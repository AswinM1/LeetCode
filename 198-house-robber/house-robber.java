class Solution {
    public int rob(int[] nums) {
         int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
        return fnc(nums,0,dp);
        
    }
    public int fnc(int nums[],int i,int dp[])
    {
        if(i==nums.length)
        return 0;

        if(i>=nums.length)
        return 0;
        
        if(dp[i]!=-1)
        return dp[i];

        int skip=fnc(nums,i+1,dp);
        int rob=nums[i]+fnc(nums,i+2,dp);

        return dp[i]=Math.max(skip,rob);


    }
}