class Solution {
    public int fnc(int i,int j,int m,int n,int dp[][])
    {
        if(i==0 && j==0)
        {
            return dp[i][j]=1;
        }

       if (i < 0 || j < 0) 
        return 0;
        
            if(dp[i][j]!=-1)return dp[i][j];

        int left=fnc(i-1,j,m,n,dp);
        int right=fnc(i,j-1,m,n,dp);

        return dp[i][j]=left+right;
    }
    public int uniquePaths(int m, int n) {

        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                dp[i][j]=-1;
            }
        }
        return fnc(m-1,n-1,m,n,dp);
        
    }
}