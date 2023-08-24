package algorithms.mergenlinkedlist;


import java.util.ArrayList;
import java.util.List;

/*
    1 -> 2 -> 3
    3 -> 4 -> 5
    6 -> 7 -> 8

    1,3,6

    2,4,7

    1,2,3,4,6,7

    3,5,9
*/
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        int n = 0;
        ListNode res = null;
        if((lists.length - 1) == 0){
            return lists[0];
        }
        for(int i = 0; i < lists.length - 1; i++){
            var result = mergeTwoLists(lists[i], lists[i + 1]);
            lists[i + 1] = result;

            if(i == lists.length - 2){
                res = result;
                break;
            }
        }
        return res;
    }


    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null)
            return null;
        if (l1 == null && l2 != null)
            return l2;
        if (l1 != null && l2 == null)
            return l1;

        ListNode m = new ListNode();
        ListNode begin = m;
        while (l1 != null || l2 != null) {
            if(l1 == null && l2 != null){
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

    /*
         {1, 4, 5}
         {1, 3, 4}
         {2, 6}

         {1, 4, 5}
         {1, 3, 4}

         1 ? 1 = 1,1
    */

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