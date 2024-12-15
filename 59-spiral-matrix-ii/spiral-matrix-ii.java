class Solution {
    public int[][] generateMatrix(int n) {
          int top=0;
          int matrix[][]=new int[n][n];
         int bottom=matrix.length-1;
         int left=0;
         int right=matrix[0].length-1;
         int dir=0;
         int num=0;
         List<Integer> l=new ArrayList<>();
         while(left<=right && top<=bottom)
         {
            if(dir==0)
            {
                for(int i=left;i<=right;i++)
                {
                    matrix[top][i]=num+1;
                     num++;
                }
                top++;
            }
            else if(dir==1)
            {
                for(int i=top;i<=bottom;i++)
                {
                    matrix[i][right]=num+1;
                      num++;
                }
                right--;
            }
            else if(dir==2)
            {
                for(int i=right;i>=left;i--)
                {
                    matrix[bottom][i]=num+1;
                      num++;
                }
                bottom--;
            }
            if(dir==3)
            {
                
                for(int i=bottom;i>=top;i--)
                {
                    matrix[i][left]=num+1;
                      num++;
                }
                 left++;
            }
           dir=(dir+1)%4;
         }
         return matrix;
  
        
    }
}