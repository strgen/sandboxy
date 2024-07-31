package algorithms.reversenodesinkgroup;

public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode orgHead = head;
        ListNode tail = head;
        ListNode lastTail = null;

        main:
        while (tail != null) {
            if(k == 1){
                break;
            }
            if (lastTail != null) {
                tail = lastTail.next;
                head = tail;
                if(head == null) {
                    break;
                }
            }
            int leftShift = 0, rightShift = k - 1;
            boolean firstMovementToTail = true;

            var nextParticularTail = tail;
            while (    leftShift < k - 1
                    && rightShift >= 0
                    && leftShift < rightShift) {
                head = tail;
                for (int i = leftShift; i < rightShift; i++) {
                    tail = tail.next;
                    if(tail == null){
                        break main;
                    }
                }

                reverseValues(head, tail);
                if (firstMovementToTail) {
                    lastTail = tail;
                    firstMovementToTail = false;
                }
                leftShift++;
                rightShift--;
                tail = nextParticularTail.next;
                nextParticularTail = tail;
            }
        }

        return orgHead;
    }

    private void reverseValues(ListNode left, ListNode right) {
        var leftVal = left.val;
        left.val = right.val;
        right.val = leftVal;
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
