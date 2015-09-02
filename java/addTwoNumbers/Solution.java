/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ret = null;
        ListNode out = null;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int result = getNodeVal(l1) + getNodeVal(l2) + carry;
            carry = 0;
            while (result > 9) {
                carry++;
                result -= 10;
            }
            if (ret == null) {
                ret = new ListNode(result);
                out = ret;
            } else {
                out.next = new ListNode(result);
                out = out.next;
            }
            l1 = getNodeNext(l1);
            l2 = getNodeNext(l2);
        }
        return ret;
    }

    private static int getNodeVal(ListNode l) {
        if (l == null) {
            return 0;
        } else {
            return l.val;
        }
    }

    private static ListNode getNodeNext(ListNode l) {
        if (l == null) {
            return null;
        } else {
            return l.next;
        }
    }
}