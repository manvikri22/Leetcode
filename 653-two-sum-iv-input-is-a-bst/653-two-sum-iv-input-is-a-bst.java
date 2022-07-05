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
public class BSTIterator{
    Stack<TreeNode> s = new Stack<>();
    boolean reverse = true;
    
    public BSTIterator(TreeNode root, boolean isreverse) {
        reverse = isreverse;
        pushAll(root);
    }
    
    public int next() {
        TreeNode tmp = s.pop();
        if(reverse == false) pushAll(tmp.right);
        else pushAll(tmp.left);
        return tmp.val;
        
    }
    
    public boolean hasNext() {
        return !s.isEmpty();
    }
    
    public void pushAll(TreeNode node)
    {
        while(node!=null)
        {
            s.push(node);
            if(reverse== true)
            {
                node = node.right;
            }else{
                 node = node.left;
            }
           
        }
    }
}
class Solution {
    
    public boolean findTarget(TreeNode root, int k) {
        if(root == null) return false;
        BSTIterator l = new BSTIterator(root,false);
        BSTIterator r = new BSTIterator(root,true);
        
        int i = l.next();
        int j = r.next();
        
        while(i<j)
        {
            if(i+j == k)return true;
            else if(i+j<k) i=l.next();
            else j = r.next();
        }
        return false;
    }
}