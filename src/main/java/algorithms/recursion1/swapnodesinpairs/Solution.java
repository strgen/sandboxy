package algorithms.recursion1.swapnodesinpairs;

public class Solution {
    //Given 1->2->3->4, you should return the list as 2->1->4->3.
    public ListNode swapPairs(ListNode head) {

        int temp = head.val;
        head.val = head.next.val;
        head.next.val = temp;

        if (head.next.next == null)
            return head;

        swapPairs(head.next.next);

        return null;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}