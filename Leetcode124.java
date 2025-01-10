
class Solution {
    int Max=Integer.MIN_VALUE;
    public int maxPath(TreeNode root) {
        if(root==null){
            return 0;
        }
        
       
       int left=Math.max(0,maxPath(root.left));
       int right=Math.max(0,maxPath(root.right));

       int MaxPath=root.val+left+right;

       Max=Math.max(Max,MaxPath);

       
     int Sum=root.val+Math.max(left,right);
       
        return Sum;
        
    }

    public int maxPathSum(TreeNode root){
        maxPath(root);
        return Max;
    }
}
