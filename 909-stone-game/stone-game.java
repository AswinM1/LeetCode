class Solution {
    public boolean stoneGame(int[] piles) {
        int j=piles.length-1;
        int alice=0;
        int bob=0;
        int i=0;

        for(int t=0;t<piles.length;t++)
        {
            if(t%2==0)
            {

            if(big(piles[i],piles[j]))
            {
                alice+=piles[i];
                i++;
            }
            else
            {
                alice+=piles[j];
                j--;
            }
            }
            else
            {
                if(!big(piles[i],piles[j]))
                {
                    bob+=piles[i];
                    i++;

                }
                else
                {
                    bob+=piles[j];
                    j--;
                }
            }
        }
        if(alice<bob)
        return false;

        return true;
        
    }
    public boolean big(int f,int l)
    {
        if(f>l||f==l)return true;

        return false;
    }
}