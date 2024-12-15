class Solution {
    public int totalNQueens(int n) {
       
        List<List<String>> sol=new ArrayList<>();
        List<String> temp=new ArrayList<>();
        char arr[][]=new char[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]='.';
            }
        }
        fnc(sol,temp,n,arr,0);
        return sol.size();
        
    }
    public boolean isSafe(int row,int col,char arr[][],int n)
    {
        for(int i=0;i<n;i++)
        {
            

            if(arr[i][col]=='Q')return false;

        }
int drow=row;
int dcol=col;
        while(row>=0 && col>=0)
        {
            if(arr[row][col]=='Q')
            return false;

            row--;
            col--;
        }
        row=drow;
        col=dcol;
        while(row>=0 && col<n)
        {

            if(arr[row][col]=='Q')return false;
            row--;
            col++;


        }
        row=drow;
        col=dcol;
          while(row<n && col>=0)
        {

            if(arr[row][col]=='Q')return false;
            row++;
            col--;


        }
        row=drow;
        col=dcol;
          while(row<n && col<n)
        {

            if(arr[row][col]=='Q')return false;
            row++;
            col++;


        }

        return true;
    }
    public void fnc( List<List<String>> sol,List<String> temp,int n, char arr[][],int row)
    {
        if(row==n)
        {

        for(char [] a:arr)
        {
            temp.add(new String(a));
        }
        sol.add(new ArrayList<>(temp));
        temp.clear();
        return;
        }

        for(int i=0;i<n;i++)
        {
            if(isSafe(row,i,arr,n))
            {
                arr[row][i]='Q';
                fnc(sol,temp,n,arr,row+1);
                arr[row][i]='.';
            }
        }

        
    }
}