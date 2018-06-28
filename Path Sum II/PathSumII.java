/*
 * Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.
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
public class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        findPaths(root, new ArrayList<Integer>(), res, sum);
        
        return res;
    }
    
    public void findPaths(TreeNode root, List<Integer> paths, List<List<Integer>> res, int sum){
        if(root == null){
            return;
        }
        
        paths.add(root.val);
        
        if(root.left == null && root.right == null && sum == root.val){
            res.add(new ArrayList<Integer>(paths));
        }
        else {
            findPaths(root.left, new ArrayList<Integer>(paths), res, sum - root.val);
            findPaths(root.right, new ArrayList<Integer>(paths), res, sum - root.val);
        }
    }
}
