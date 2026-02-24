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
    int sum = 0;
    public int sumRootToLeaf(TreeNode root) {
        find(root,0);
        return sum;
    }
    private void find(TreeNode node,int curr){
        if(node.left==null && node.right==null){
            curr = curr*2+node.val;
            sum += curr;
            return;
        }
        curr = curr*2 + node.val;
        if(node.left != null) find(node.left,curr);
        if(node.right != null) find(node.right,curr);
    }
}