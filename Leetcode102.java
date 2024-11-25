
class Solution {
    List<List<Integer>> l1=new ArrayList<>();
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null){
            return l1;
        }
        Queue<TreeNode> q1=new LinkedList<>();
        q1.add(root);

        while(!q1.isEmpty()){

            int size=q1.size();
            List<Integer> l2=new ArrayList<>();

            for(int i=1;i<=size;i++){
                TreeNode x=q1.poll();
                if(x.left!=null){
                    q1.add(x.left);
                }
                if(x.right!=null){
                    q1.add(x.right);
                }

                l2.add(x.val);

            }

            l1.add(l2);


        }
        return l1;

        
    }
}
