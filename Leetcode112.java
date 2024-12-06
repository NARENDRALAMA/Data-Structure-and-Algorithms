
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {

        

        if(root==null ){
            return false;
        }
        

        Stack<TreeNode> path=new Stack<>();
        Stack<Integer> pathSum=new Stack<>();

        path.push(root);
        pathSum.push(root.val);

        while(!path.isEmpty()){
            TreeNode temp=path.pop();
            int sumpath=pathSum.pop();

            if(temp.left==null && temp.right==null && sumpath==targetSum){
                return true;
            }

            if(temp.left!=null){
                path.push(temp.left);
                pathSum.push(temp.left.val+sumpath);
            }
            if(temp.right!=null){
                path.push(temp.right);
                pathSum.push(temp.right.val+sumpath);
            }
        }

        return false;
        
    }
}