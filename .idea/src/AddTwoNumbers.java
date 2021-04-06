/*
    Question #2 From LeetCode
    Link: https://leetcode.com/problems/add-two-numbers
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int ex;
        if((l1.val+l2.val)/10>0){
            ex = (l1.val+l2.val)/10;
        }else{
            ex = 0;
        }

        ListNode ln = new ListNode((l1.val+l2.val)%10);
        ListNode le = ln;
        while(l1.next!=null || l2.next!=null || ex>=1){
            if(l1.next==null && l2.next!=null){
                l2 = l2.next;
                le.next = new ListNode((l2.val+ex)%10);
                le = le.next;
                if((l2.val +ex)/10>0){
                    ex = (l2.val +ex)/10;
                }else{
                    ex = 0;
                }

            }else if(l1.next!=null && l2.next==null){
                l1 = l1.next;
                le.next = new ListNode((l1.val+ex)%10);
                le = le.next;
                if((l1.val+ex)/10>0){
                    ex = (l1.val +ex)/10;
                }else{
                    ex = 0;
                }

            }else if(l1.next==null && l2.next==null && ex>=1){
                le.next = new ListNode(ex);
                le = le.next;
                ex = 0;
            }
            else{
                l1 = l1.next;
                l2 = l2.next;
                le.next = new ListNode((l1.val + l2.val+ex)%10);
                le = le.next;
                if((l1.val+l2.val +ex)/10>0){
                    ex = (l1.val+l2.val +ex)/10;
                }else{
                    ex = 0;
                }
            }
        }
        return ln;
    }
}