class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
       int a[][]=new int[intervals.length+1][2];
    
       for(int i=0;i<a.length-1;i++)
       {
        for(int j=0;j<2;j++)
        {
            a[i][j]=intervals[i][j];
        }
       }
       a[a.length-1][0]=newInterval[0];
       a[a.length-1][1]=newInterval[1];
       Arrays.sort(a,(x,y)->x[0]-y[0]);

     int index=0;
     ArrayList<int[]> aa=new ArrayList<>();
     while(index<a.length)
     {
        int cstart=a[index][0];
        int cend=a[index][1];
        while(index<a.length-1 && cend>=a[index+1][0])
        {
            cend=Math.max(a[index+1][1],cend);
            index++;
        }
        int newend=cend;
        aa.add(new int[]{cstart,newend});

        
        
        
        index++;
     }
     int ans[][]=new int[aa.size()][2];
     for(int i=0;i<aa.size();i++)
     {
        for(int j=0;j<2;j++)
        {
            ans[i][j]=aa.get(i)[j];

        }
     }
       return ans;

        
    }
}