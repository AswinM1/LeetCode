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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

List<List<Integer>> a=new ArrayList<>();

        if(root==null)
        return a;

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int level=0;
        while(q.size()>0)
        {
            int size=q.size();
            List<Integer>aa=new ArrayList<>();
            for(int i=0;i<size;i++)
            {
            TreeNode curr=q.poll();
                aa.add(curr.val);

                if(curr.left!=null)
                {
                    q.add(curr.left);
                }
                if(curr.right!=null)
                {
                    q.add(curr.right);
                }


            }
            level++;
            if(level%2==0)
            {
                Collections.reverse(aa);
                a.add(aa);
            }
            else
            {
                a.add(aa);
            }
            

        }



        return a;

        
    }
}