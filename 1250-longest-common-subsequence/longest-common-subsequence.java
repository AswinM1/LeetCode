class Solution {
    public int longestCommonSubsequence(String text1, String text2) 
    {
       int dp[][]=new int[text1.length()][text2.length()];

         for(int i=0;i<text1.length();i++)
         {
            for(int j=0;j<text2.length();j++)
            {
               dp[i][j]=-1;
            }
         }

        return fnc(text1.length()-1,text2.length()-1,text1,text2,dp);



       
        
    }
    public int fnc(int i,int j,String text1,String text2,int dp[][])
    {
       
        if(i<0 || j<0 )
        return 0;

         if(dp[i][j]!=-1) return dp[i][j];

        if(text1.charAt(i)==text2.charAt(j))
        {
           
            dp[i][j]=1+fnc(i-1,j-1,text1,text2,dp);

        }
        else
        {

        
        int take=fnc(i-1,j,text1,text2,dp);
        int ta=fnc(i,j-1,text1,text2,dp);
        dp[i][j]=Math.max(take,ta);
        }
        return dp[i][j];

    }
    
}