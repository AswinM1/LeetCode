class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        fnc(n,ans,0,0,"");
        return ans;
        
    }
    public void fnc(int n,List<String> ans,int open,int close,String s)
    {
        if(open==close && open+close==2*n)
        {
            ans.add(s);
            return;
        }
     

        if(open<n)
        fnc(n,ans,open+1,close,s+"(");

        if(close<open)
        fnc(n,ans,open,close+1,s+")");

    }
}