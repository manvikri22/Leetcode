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
    public TreeNode bstFromPreorder(int[] preorder) {
        return helper(preorder, Integer.MAX_VALUE, new int[]{0});   
    }
    
    private TreeNode helper(int[] A, int bound, int[] i) {
        if(i[0]==A.length || A[i[0]]>bound) return null;
        
        TreeNode node = new TreeNode(A[i[0]++]);
        node.left = helper(A,node.val, i);
        node.right = helper(A,bound, i);
        return node; 
    
    }
}