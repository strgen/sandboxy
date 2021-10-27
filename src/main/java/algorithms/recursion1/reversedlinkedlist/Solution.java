package algorithms.recursion1.reversedlinkedlist;

public class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode listNode = reverse(head);
        return listNode;
    }


    public ListNode reverse(ListNode head){
        if(head == null)
            return head;

        if(head.next == null){
            return head;
        }
        ListNode listNode = reverse(head.next);

        head.next.next = head;
        head.next = null;

        return listNode;
    }

    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }
}