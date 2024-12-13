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
    public boolean isBalanced(TreeNode root) {
        if(root==null)
        {
            return true;
        }
        int left=h(root.left);
        int right=h(root.right);

        if(left-right>1 || right-left>1)
        return false;
        
       
      
       return  isBalanced(root.left)&&
       isBalanced(root.right);
        
    }
    public int h(TreeNode root)
    {
         if(root==null)
        {
            return 0;
        }
    int left=h(root.left);
    int right=h(root.right);
    return 1+Math.max(left,right);
}
}