
class Solution {
    public TreeNode sortedListToBST(ListNode head) {

        if(head==null){
            return null;
        }
        if(head.next==null){
            return new TreeNode(head.val);
        }

        ListNode fast=head;
        ListNode slow=head;
        ListNode valuebeforemid=head;

        while(fast!=null && fast.next!=null){
            valuebeforemid=slow;
            fast=fast.next.next;
            slow=slow.next;

        }

        TreeNode root=new TreeNode(slow.val);

        valuebeforemid.next=null;

        root.left=sortedListToBST(head);
        root.right=sortedListToBST(slow.next);
        return root;  
    }
}