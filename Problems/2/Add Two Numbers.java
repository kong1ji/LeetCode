/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int curr1,curr2,currSum,flag=0;
        ListNode listNode = new ListNode(0);
        ListNode curr = listNode;
        while(l1 != null || l2 != null){
            curr1 = (l1 !=null)?l1.val:0;
            curr2 = (l2 !=null)?l2.val:0;
            currSum = curr1 + curr2 + flag;
            flag = currSum/10;
            curr.next = new ListNode(currSum%10);
            curr = curr.next;
            if(l1 != null){l1 = l1.next;}
            if(l2 != null){l2 = l2.next;}
        }
        if(flag>0){
            curr.next = new ListNode(flag);
        }
        return listNode.next;
    }
}