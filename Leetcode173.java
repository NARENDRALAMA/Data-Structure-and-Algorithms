
class BSTIterator {

    Stack<TreeNode> s1=new Stack<>();

    public  void partialiterater(TreeNode root){
        if(root==null){
            return;
        }
        s1.push(root);
        partialiterater(root.left);
    }

    public BSTIterator(TreeNode root) {
     partialiterater(root);  
    }

    public int next() {

        TreeNode x=s1.pop();
        if(x.right!=null){
            partialiterater(x.right);
        }

        return x.val;
     
    }
    
    public boolean hasNext() {

        return !s1.isEmpty();
        
    }
}


