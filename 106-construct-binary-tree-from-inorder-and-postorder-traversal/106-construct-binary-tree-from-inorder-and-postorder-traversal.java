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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
        if(inorder == null|| postorder== null || postorder.length!= inorder.length) return null;
       Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        
        for(int i =0;i<inorder.length;i++)
        {
            mp.put(inorder[i],i);
        }
        
        TreeNode root = buildTree(postorder, 0, postorder.length-1, inorder, 0 , inorder.length-1, mp);
        return root;
     
    }
    
    public TreeNode buildTree(int[] postorder, int ps, int pe, int[]inorder, int is, int ie, Map<Integer, Integer> mp)
    {
        if(ps>pe || is>ie)
        {
            return null;
        }
        
        TreeNode root = new TreeNode(postorder[pe]);
        
        int inroot = mp.get(root.val);
        int numsleft = inroot-is;
        
        root.left = buildTree(postorder, ps, ps+ numsleft-1,inorder,is, inroot-1, mp);
        root.right = buildTree(postorder,ps+numsleft,pe-1, inorder,inroot+1, ie, mp);
        
        return root;
    }
}