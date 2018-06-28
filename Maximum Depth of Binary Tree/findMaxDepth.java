/*
 * Given a binary tree, find its maximum depth.
 */
 
 /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        
        int lDepth = maxDepth(root.left);
        int rDepth = maxDepth(root.right);
        
        if(lDepth > rDepth){
            return lDepth + 1;
        }
        else{
            return rDepth + 1;
        }
    }
}
