class Solution {
    public int[][] merge(int[][] intervals) {
      Arrays.sort(intervals,(a,b)->a[0]-b[0]);
      int curr=0;
      int i=0;
      ArrayList<int[]> a=new ArrayList<>();
      while(i<intervals.length)
      {
        int cs=intervals[i][0];
        int cend=intervals[i][1];
        while(i<intervals.length-1 && cend>=intervals[i+1][0] )
        {
            cend=Math.max(cend,intervals[i+1][1]);
            i++;
        }
        int newend=cend;
        a.add(new int[]{cs,newend});
        i++;
    

      }
int ans[][]=new int[a.size()][2];
      for( i=0;i<a.size();i++)
      {
        for(int j=0;j<2;j++)
        {
            ans[i][j]=a.get(i)[j];
        }
      }
       return ans; 
    }
}