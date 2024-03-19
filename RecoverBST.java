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
 /**
 This solution aims to correct a binary search tree (BST) where two nodes have been incorrectly swapped. It utilizes an inorder traversal to identify these nodes. 
 Time complexity: O(N) - where N is the number of nodes in the tree.
  Space complexity: O(1) - constant space is used.
  */
class Solution {
    TreeNode first;
    TreeNode second;
    TreeNode prev;
    public void recoverTree(TreeNode root) {
        inorder(root);
        int temp = first.val;
        first.val = second.val;
        second.val = temp;


    }
    private void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        if(prev!=null && prev.val >= root.val){
            if(first == null){
                first = prev;
            }second = root;
        }
        prev = root;
        inorder(root.right);


    }
}
