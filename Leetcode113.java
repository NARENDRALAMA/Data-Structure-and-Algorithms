
class Solution {

    List<List<Integer>> l1=new ArrayList<>();
    List<Integer> l2=new ArrayList<>();


    
    int Sum=0;

    

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root==null){
            return l1;
        }

        l2.add(root.val);
        Sum=Sum+root.val;
        if(root.left==null && root.right==null && Sum==targetSum){
            l1.add(new ArrayList(l2));
        }

        pathSum(root.left,targetSum);
           
        pathSum(root.right,targetSum);

        l2.remove(l2.size()-1);
        Sum=Sum-root.val;

        return l1;

      }
}