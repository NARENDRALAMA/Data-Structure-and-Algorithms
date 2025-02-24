
class Solution {

    List<Integer> l1=new ArrayList<>();
    public void Inorder(TreeNode root){
        if(root==null ){
            return;
        }
        Inorder(root.left);
        l1.add(root.val);
        Inorder(root.right);    
    }
    public boolean isValidBST(TreeNode root) {
        Inorder(root);
        for(int i=0;i<l1.size()-1;i++){
            if(l1.get(i)>=l1.get(i+1)){
                return false;
            }
        }

        return true;
        
    }
}