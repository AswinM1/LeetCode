class Solution {
    public int characterReplacement(String s, int k) {
        int i=0;
        int j=0;
        HashMap<Character,Integer> h=new HashMap<>();
        int maxl=0;
        int max=0;
        while(j<s.length())
        {
            h.put(s.charAt(j),h.getOrDefault(s.charAt(j),0)+1);
            max=Math.max(h.get(s.charAt(j)),max);
            int win=j-i+1;
            if(win-max>k && i<j)
            {
                h.put(s.charAt(i),h.get(s.charAt(i))-1);
                i++;

            }
            maxl=Math.max(maxl,j-i+1);
            j++;

        }
        return maxl;
        
    }
}