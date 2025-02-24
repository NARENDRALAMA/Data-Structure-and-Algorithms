
class Solution {
    List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        if(root==null){
            return result;
        }

        Queue<TreeNode> q1=new LinkedList<>();

        q1.add(root);

        while(!q1.isEmpty()){
            int Size=q1.size();
            List<Integer> l1=new ArrayList<>();
            for(int i=1;i<=Size;i++){
                TreeNode x=q1.poll();
                l1.add(x.val);
                if(x.left!=null){
                    q1.add(x.left);
                }
                if(x.right!=null){
                    q1.add(x.right);
                }

            }
            result.add(l1);

        }

        Collections.reverse(result);

        return result;

        
    }
}
