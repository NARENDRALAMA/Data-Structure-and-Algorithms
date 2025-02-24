
class Solution {
    List<Integer> l1=new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {

        if(root==null){
            return l1;
        }

        Deque<TreeNode> q1=new LinkedList<>();
        q1.add(root);

        while(!q1.isEmpty()){

            int size=q1.size();
            l1.add(q1.getLast().val);

           for(int i=1;i<=size;i++){
                 TreeNode x=q1.poll();
                 if(x.left!=null){
                    q1.add(x.left);
                 }

                 if(x.right!=null){
                    q1.add(x.right);
                 }
           }
        }
        return l1;
        
    }
}
