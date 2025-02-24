
class Solution {

    public static boolean Check(TreeNode left1, TreeNode right1){
        if(left1==null && right1==null){
            return true;
        }
        if(left1==null || right1==null){
            return false;
        }
        if(left1.val!=right1.val){
            return false;
        }

        return Check(left1.left,right1.right) && Check(left1.right,right1.left);
    }

    
    public boolean isSymmetric(TreeNode root) {
       return Check(root,root);
        
    }
}