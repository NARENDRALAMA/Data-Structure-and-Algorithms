
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }

        int leftheight=maxDepth(root.left);
        int rightheight=maxDepth(root.right);

        int height=1+Math.max(leftheight,rightheight);

        return height;
        
    }
}
