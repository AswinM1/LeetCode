/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
      List<Integer> a=new ArrayList<>();
      if(root==null)
      return a;

      Queue<TreeNode> q=new LinkedList<>();
      q.add(root);
    int lastnode=0;
      while(q.size()>0)
      {
        int size=q.size();

       
             for(int i=0;i<size;i++)
            {
              TreeNode curr=q.poll();
                lastnode=curr.val;
             if(curr.left!=null)
            {
                q.add(curr.left);
            }
                if(curr.right!=null)
            {
                q.add(curr.right);

            }

             }
           
        
            a.add(lastnode);
      }

    

      return a;
        
    }
}