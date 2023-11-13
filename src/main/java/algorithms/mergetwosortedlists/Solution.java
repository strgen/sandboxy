package algorithms.mergetwosortedlists;

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null)
            return null;
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;

        ListNode m = new ListNode();
        ListNode begin = m;
        while (l1 != null || l2 != null) {
            if(l1 == null){
                ListNode tmp = l2;
                l2 = l2.next;
                m.val = tmp.val;
            }
            if(l2 == null && l1 != null){
                ListNode tmp = l1;
                l1 = l1.next;
                m.val = tmp.val;
            }
            if(l1 != null && l2 != null) {
                if (l1.val < l2.val) {
                    ListNode tmp = l1;
                    l1 = l1.next;
                    m.val = tmp.val;
                } else {
                    ListNode tmp = l2;
                    l2 = l2.next;
                    m.val = tmp.val;
                }
            }
            if( l1 != null || l2 != null ){
                m.next = new ListNode();
                m = m.next;
            }
        }
        return begin;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
