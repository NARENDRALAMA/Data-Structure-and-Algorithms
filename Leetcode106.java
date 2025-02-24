
class Solution {

    public TreeNode helper(int[] postorder,Map<Integer,Integer> h1,int postStart,int left,int right){

        TreeNode root=new TreeNode(postorder[postStart]);
        int mid=h1.get(postorder[postStart]);

        if(mid>left){
            root.left=helper(postorder,h1,postStart-1-(right-mid),left,mid-1);
        }
        if(mid<right){
            root.right=helper(postorder,h1,postStart-1,mid+1,right);
        }
        

        return root;

    
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {

        Map<Integer,Integer> h1=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            h1.put(inorder[i],i);
        }

        return helper(postorder,h1,postorder.length-1,0,inorder.length-1);
        
    }
}
