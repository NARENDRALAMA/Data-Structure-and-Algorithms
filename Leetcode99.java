
class Solution {


    TreeNode first=null;
    TreeNode Second=null;
    TreeNode mid=null;
    TreeNode prev= new TreeNode(Integer.MIN_VALUE);


    public  void Inorder(TreeNode root){
        if(root==null){
            return;
        }

        Inorder(root.left);
        if(prev.val>root.val){
            if(first==null){
                first=prev;
                mid=root;
               
            }
            else{
                Second=root;

            }   
            
        }
         prev=root;
      
        Inorder(root.right);
    }

    public void recoverTree(TreeNode root) {
        if(root==null){
            return;
        }
        Inorder(root);
        if(Second!=null){
        int temp=first.val;
        first.val=Second.val;
        Second.val=temp;
        }
        else{
            int temp=first.val;
            first.val=mid.val;
            mid.val=temp;
        }

       
        
    }
}
