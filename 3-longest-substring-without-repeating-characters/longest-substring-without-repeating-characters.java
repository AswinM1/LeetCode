class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        int len=0;
        Set<Character> ss=new HashSet<>();

        while(j<s.length())
        {

          if(!ss.contains(s.charAt(j)))
          {
          ss.add(s.charAt(j));
          j++;
          len=Math.max(ss.size(),len);
            
          }
          else if(ss.contains(s.charAt(j)))
          {

          ss.remove(s.charAt(i));
          i++;
          }
        
        


        }
        return len;
    }
}