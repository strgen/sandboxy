package algorithms.mergetwosortedlists;

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        var begin = l1.val > l2.val ? l1 : l2;
        var res = merge(begin, l1.val > l2.val ? l2 : l1);
        return begin;
    }

    ListNode merge(ListNode l1, ListNode l2){

        if(l1 == null && l2 == null)
            return null;
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;

        if(l1.val > l2.val){
            var tmp = l1.next;
            l1.next = l2;
            l2.next = tmp;
            return merge(l1.next, l2);
        }
        else {
            return merge(l1, l2.next);
        }
    }

      public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
}
