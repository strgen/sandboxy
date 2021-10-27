package algorithms.mergetwosortedlists;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    static final String input1 = "1-2-4";
    static final String input2 = "1-3-4";


    @Test
    void testSolution(){
        Solution solution = new Solution();
        Solution.ListNode l1 = getListNodeFromString(input1);
        Solution.ListNode l2 = getListNodeFromString(input2);

        var res = solution.mergeTwoLists(l1, l2);

        int c = 0;
        while (res.next != null){
            System.out.println("number = " + c);
            System.out.println("res.val = " + res.val);
            System.out.println("getting next node");

            res = res.next;
            c++;
        }
    }

    private Solution.ListNode getListNodeFromString(String input){
        Solution.ListNode res = new Solution.ListNode();
        Solution.ListNode begin = res;
        String[] nodes = input.split("-");
        for(int i = 0; i < nodes.length; i++){
            res.val = Integer.valueOf( nodes[i] );
            if(i == nodes.length - 1){
                break;
            }
            else {
                res.next = new Solution.ListNode();
                res = res.next;
            }
        }
        return begin;
    }
}
