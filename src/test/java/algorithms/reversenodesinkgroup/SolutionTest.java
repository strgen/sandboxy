package algorithms.reversenodesinkgroup;


import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testSolution() {
        int[] head = {1, 2, 3, 4, 5};
        int k = 2;
        var canonicalOutput = putIntoLinkedList(new int[]{2, 1, 4, 3, 5}, new Solution.ListNode());
        Solution solution = new Solution();
        var result = solution.reverseKGroup(putIntoLinkedList(head, new Solution.ListNode()), k);
        checkResult(result, canonicalOutput);
    }

    @Test
    public void testSolution1() {
        int[] head = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 3;
        var canonicalOutput = putIntoLinkedList(new int[]{3, 2, 1, 6, 5, 4, 9, 8, 7, 10}, new Solution.ListNode());
        Solution solution = new Solution();
        var result = solution.reverseKGroup(putIntoLinkedList(head, new Solution.ListNode()), k);
        checkResult(result, canonicalOutput);
    }

    @Test
    public void testSolution2() {
        int[] head = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 4;
        var canonicalOutput = putIntoLinkedList(new int[]{4, 3, 2, 1, 8, 7, 6, 5, 9, 10}, new Solution.ListNode());
        Solution solution = new Solution();
        var result = solution.reverseKGroup(putIntoLinkedList(head, new Solution.ListNode()), k);
        checkResult(result, canonicalOutput);
    }

    @Test
    public void testSolution3() {
        int[] head = {1, 2, 3, 4, 5};
        int k = 1;
        var canonicalOutput = putIntoLinkedList(new int[]{1, 2, 3, 4, 5}, new Solution.ListNode());
        Solution solution = new Solution();
        var result = solution.reverseKGroup(putIntoLinkedList(head, new Solution.ListNode()), k);
        checkResult(result, canonicalOutput);
    }

    @Test
    public void testSolution4() {
        int[] head = {1, 2};
        int k = 2;
        var canonicalOutput = putIntoLinkedList(new int[]{2, 1}, new Solution.ListNode());
        Solution solution = new Solution();
        var result = solution.reverseKGroup(putIntoLinkedList(head, new Solution.ListNode()), k);
        checkResult(result, canonicalOutput);
    }

    @Test
    public void testSolution5() {
        int[] head = {1, 2, 3, 4, 5, 6};
        int k = 6;
        var canonicalOutput = putIntoLinkedList(new int[]{6, 5, 4, 3, 2, 1}, new Solution.ListNode());
        Solution solution = new Solution();
        var result = solution.reverseKGroup(putIntoLinkedList(head, new Solution.ListNode()), k);
        checkResult(result, canonicalOutput);
    }

    private void checkResult(Solution.ListNode result, Solution.ListNode canonicalOutput) {
        while (result != null || canonicalOutput != null) {
            assert result != null;
            boolean match = result.val == canonicalOutput.val;
            assert match;
            result = result.next;
            canonicalOutput = canonicalOutput.next;
        }
    }

    private Solution.ListNode putIntoLinkedList(int[] values, Solution.ListNode listNode) {
        var begin = listNode;
        for (int i = 0; i < values.length; i++) {
            listNode.val = values[i];
            if (i < values.length - 1) {
                listNode.next = new Solution.ListNode();
                listNode = listNode.next;
            } else
                break;
        }
        return begin;
    }
}
