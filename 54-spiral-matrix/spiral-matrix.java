class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
         int top=0;
         int bottom=matrix.length-1;
         int left=0;
         int right=matrix[0].length-1;
         int dir=0;
         List<Integer> l=new ArrayList<>();
         while(left<=right && top<=bottom)
         {
            if(dir==0)
            {
                for(int i=left;i<=right;i++)
                {
                     l.add(matrix[top][i]);
                }
                top++;
            }
            else if(dir==1)
            {
                for(int i=top;i<=bottom;i++)
                {
                     l.add(matrix[i][right]);
                }
                right--;
            }
            else if(dir==2)
            {
                for(int i=right;i>=left;i--)
                {
                     l.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(dir==3)
            {
                
                for(int i=bottom;i>=top;i--)
                {
                     l.add(matrix[i][left]);
                }
                 left++;
            }
           dir=(dir+1)%4;
         }
         return l;

}

}