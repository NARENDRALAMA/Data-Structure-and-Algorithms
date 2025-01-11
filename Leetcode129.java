
class Solution {

    int Sum=0;
    int finalSum=0;
      
    public int sumNumbers(TreeNode root) {
        if(root==null){
            return 0;
        }

        Sum=Sum*10+root.val;
        if(root.left==null && root.right==null){
            finalSum=finalSum+Sum;
        }
        sumNumbers(root.left);
        sumNumbers(root.right);

        Sum=Sum/10;
        return finalSum;   
       
    }
}