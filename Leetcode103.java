
class Solution {
    List<List<Integer>> result=new ArrayList<>();

   public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
       if(root==null){
           return result;
       }

       Queue<TreeNode> q1=new LinkedList<>();
      
       q1.add(root);
       int count=1;

       while(!q1.isEmpty()){
           int size=q1.size();
           List<Integer> l1=new ArrayList<>();

           for(int i=1;i<=size;i++){
            TreeNode x=q1.poll();
            l1.add(x.val);
           if(x.left!=null){
               q1.add(x.left);
           }
           if(x.right!=null){
               q1.add(x.right);
           }
           }
           if(count%2==1){
               result.add(l1);
           }else{
               Collections.reverse(l1);
                result.add(l1);

           }
           count++;
          
       }
       return result;

       
   }
}