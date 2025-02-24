class Solution {
     
    public int minDepth(TreeNode root) {

        if(root==null){
            return 0;
        }
         int Level=1;

     Queue<TreeNode> q1=new LinkedList<>();
     q1.add(root);

   

     while(!q1.isEmpty()){

        int size=q1.size();
        for(int i=1;i<=size;i++){
            TreeNode x=q1.poll();
        if(x.left==null && x.right==null){
            return Level;
        }
        if(x.left!=null){
            q1.add(x.left);
        }
        if(x.right!=null){
            q1.add(x.right);
        }
        }  
        Level++;

     }
     return Level;
     }
     }


