package algorithms.mergenlinkedlist;


import java.util.ArrayList;
import java.util.Arrays;
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
        if(lists.length == 0){
            return new ListNode();
        }
        List<ListNode> tempMergedListNodes = Arrays.asList(lists);
        while (tempMergedListNodes.size() > 1) {
            tempMergedListNodes = merge(tempMergedListNodes);
        }
        if(tempMergedListNodes.isEmpty()){
            return new ListNode();
        }
        return tempMergedListNodes.get(0);
    }

    private List<ListNode> merge(List<ListNode> listNodes) {
        List<ListNode> tempMergedListNodes = new ArrayList<>();
        for (int i = 0; i <= listNodes.size() - 1; i += 2) {
            var result = mergeTwoLists(listNodes.get(i), listNodes.get(i + 1));
            tempMergedListNodes.add(result);
            if ((i + 3) == listNodes.size()) {
                var lastOneMerged = tempMergedListNodes.get(tempMergedListNodes.size() - 1);
                var res1 = mergeTwoLists(listNodes.get(listNodes.size() - 1), lastOneMerged);
                tempMergedListNodes.remove(tempMergedListNodes.size() - 1);
                tempMergedListNodes.add(res1);
                break;
            }
        }
        return tempMergedListNodes;
    }

    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null)
            return null;
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;

        ListNode m = new ListNode();
        ListNode begin = m;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                ListNode tmp = l2;
                l2 = l2.next;
                m.val = tmp.val;
            }
            if (l2 == null && l1 != null) {
                ListNode tmp = l1;
                l1 = l1.next;
                m.val = tmp.val;
            }
            if (l1 != null && l2 != null) {
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
            if (l1 != null || l2 != null) {
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