
class Solution {
    boolean flag=true;
    public int Heights(TreeNode root){

        if(root==null){
            return 0;
        }

        int leftheight= 1+ Heights(root.left);
        int rightheight= 1+ Heights(root.right);

        int biggerheight=Math.max(leftheight,rightheight);

        if(Math.abs(leftheight-rightheight)>1){
            flag=false;
        }

        return biggerheight;

    }
    public boolean isBalanced(TreeNode root) {
        Heights(root);
        if(flag==false){
            return false;
        }
        return true;

        
    }
}