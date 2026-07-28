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
    List<Integer> lst = new ArrayList<>();
    public boolean findTarget(TreeNode root, int k) {
        if(root == null)
            return false;
        boolean l = findTarget(root.left,k);
        TreeNode temp = root;
        int comp = k - temp.val;
        boolean c = false;
        if(lst.contains(comp)){
            c = true;
            return true;
        }
        
        lst.add(temp.val);

        boolean r = findTarget(root.right,k);
        return l || r || c;
    }
}