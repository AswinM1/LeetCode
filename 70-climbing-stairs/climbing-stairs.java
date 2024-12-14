class Solution {
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        for(int i=0;i<=n;i++)
        {
            dp[i]=-1;
        }
        return sol(n,dp);
        
    }
    public int sol(int n,int dp[])
    {
        if(n<0)
        return 0;

        if(n==0)
        return dp[n]=1;

         if(dp[n]!=-1)
         {
            return dp[n];
         }

        if(n==1)
        return dp[n]=1;

        int left=sol(n-1,dp);
        int right=sol(n-2,dp);

        return dp[n]=left+right;
    }
}