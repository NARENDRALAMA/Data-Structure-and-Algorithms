
class Solution {
    private TreeNode helper(int[] preOrder, Map<Integer, Integer> h1, int preStart, int left, int right) {
   
        
       TreeNode root = new TreeNode(preOrder[preStart]);
        int mid=h1.get(preOrder[preStart]);

        if(mid>left){
              root.left=helper( preOrder,h1,preStart+1,left,mid-1);
        }
        if(mid<right){
             root.right=helper( preOrder,h1,preStart +1+ (mid-left),mid+1,right);

        }
      
      return root;
       }


   public TreeNode buildTree(int[] preorder, int[] inorder) {
       Map<Integer, Integer> h1 = new HashMap<>();
       for (int i = 0; i < inorder.length; i++){
            h1.put(inorder[i], i);

       } 
   
       return helper(preorder, h1,
           0, 0, inorder.length - 1);
       
   }
}
