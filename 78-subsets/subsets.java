class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> l=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        fnc(nums,l,ans,0);
        return l;

        
    }
    public void fnc( int nums[],List<List<Integer>> l,List<Integer> ans,int i)
    {
        if(i==nums.length)
        {
            l.add(new ArrayList<>(ans));
            return;
        }

        ans.add(nums[i]);
        fnc(nums,l,ans,i+1);

        ans.remove(ans.size()-1);
        fnc(nums,l,ans,i+1);
        

    }
}