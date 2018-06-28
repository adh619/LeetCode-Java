/*
 * Given a binary tree, return all root-to-leaf paths.
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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<String>();
        
        if(root != null) {
            String path = root.val + "";
            findPaths(root, path, paths);
        }
        
        return paths;
    }
    
    public void findPaths(TreeNode root, String path, List<String> list){
        if(root.left == null && root.right == null){
            list.add(path);
        }
        if(root.left != null){
            findPaths(root.left, path + "->" + root.left.val, list);
        }
        if(root.right != null){
            findPaths(root.right, path + "->" + root.right.val, list);
        }
    }
}
