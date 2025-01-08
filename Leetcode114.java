
class Solution {

    List<Integer> l1=new ArrayList<>();

    public List<Integer> Inorder( TreeNode root){

        if(root==null){
            return l1;
        }

        l1.add(root.val);
        Inorder(root.left);
        Inorder(root.right);

        return l1;

    }

    public void makeLinkedlist(TreeNode root,int i){

        if(i >l1.size()-1){
            return;
        }

        root.left=null;
        root.right=new TreeNode(l1.get(i));
        makeLinkedlist(root.right,i+1);

    }
    public void flatten(TreeNode root) {

        Inorder(root);
        makeLinkedlist(root,1);

      
        
    }
}