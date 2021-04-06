/*
    Link: https://leetcode.com/problems/maximum-depth-of-binary-tree/
 */

class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int rightMaxDepth = maxDepth(root.right);
        int leftMaxDepth = maxDepth(root.left);

        if(rightMaxDepth>leftMaxDepth){
            return rightMaxDepth+1;
        }else{
            return leftMaxDepth+1;
        }
    }
}