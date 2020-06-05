package addtwonumbers;

import org.junit.Test;

import java.io.*;

public class SolutionTest {
    /*

    Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
    Output: 7 -> 0 -> 8
    Explanation: 342 + 465 = 807.

Last executed input
[9]
[1,9,9,9,9,9,9,9,9,9]


[1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1]
[5,6,4]

    */
    @Test
    public void testSolution(){

        /*String fN = "9";
        String sN = "1999999999";*/
        String fN = "1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1";
        fN = fN.replace(",", "");

        String sN = "5,6,4";
        sN = sN.replace(",", "");

        Solution.ListNode l1 = new Solution.ListNode( Character.getNumericValue(fN.charAt(0)) );
        Solution.ListNode temp = null;
        temp = l1;
        for(int i = 1; i < fN.length(); i++){
            temp.next = new Solution.ListNode( Character.getNumericValue(fN.charAt(i)) );
            temp = temp.next;
        }

        Solution.ListNode l2 = new Solution.ListNode( Character.getNumericValue(sN.charAt(0)) );
        temp = l2;
        for(int i = 1; i < sN.length(); i++){
            temp.next = new Solution.ListNode( Character.getNumericValue(sN.charAt(i)) );
            temp = temp.next;
        }

        /*Solution.ListNode l1 = new Solution.ListNode(2);
        l1.next = new Solution.ListNode(4);
        l1.next.next = new Solution.ListNode(3);

        Solution.ListNode l2 = new Solution.ListNode(5);
        l2.next = new Solution.ListNode(6);
        l2.next.next = new Solution.ListNode(4);*/

        Solution solution = new Solution();
        //Solution.ListNode result = solution.addTwoNumbers(l1, l2);

        /*while (result != null){
            System.out.println(result.val);
            result = result.next;
        }*/

    }
}
