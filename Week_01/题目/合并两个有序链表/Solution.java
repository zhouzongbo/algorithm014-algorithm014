/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // 题意: 把两个升序的链表, 合并成一个链表
        // 解法: 迭代
        // 时间复杂度: O(m + n)
        // 空间复杂度: O(1)
        ListNode result = new ListNode(-1);
    
        ListNode pre = result;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
               pre.next = new ListNode(l1.val);
               l1 = l1.next;
            } else {
                pre.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            pre = pre.next;
        }

        pre.next = l1 == null ? l2 : l1;

        return result.next;
    }
}