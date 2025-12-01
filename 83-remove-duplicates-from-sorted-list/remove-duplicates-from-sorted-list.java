
class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode temp=head;
        while(temp!=null&& temp.next!=null){
            if(temp.next.val==temp.val){
                temp.next=temp.next.next;
            }
            if(temp.next==null) return head;
            if(temp.next.val!=temp.val){
                temp=temp.next;
            }
        }
        return head;
        
    }
}