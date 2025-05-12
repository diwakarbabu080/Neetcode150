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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null)
            return ans;

        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode curr = stack.pop();
            ans.add(0,curr.val); // reverse the process order

            if (curr.left != null)
                stack.push(curr.left); // left pushed first
            if (curr.right != null)
                stack.push(curr.right); // right on top, so it’s processed first
        }

        return ans;
    }
}