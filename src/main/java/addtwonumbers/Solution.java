package addtwonumbers;


import java.math.BigInteger;
import java.util.Stack;

/*

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.

sum = 0, pow = 1;
потом берёшь по одной цифре и
sum += a[i] * pow;
pow = pow * 10;
повторяешь то же самое для второго числа и потом их складываешь

*/
public class Solution {
    /*public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = new ListNode( 0 );

        StringBuilder n1 = new StringBuilder();
        StringBuilder n2 = new StringBuilder();

        while(l1 != null || l2 != null ){
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;



        }

        //return result;
    }*/

    public static class ListNode {
      public int val;
      public ListNode next;
      public ListNode(int x) { val = x; }
    }

    /*
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder n1 = new StringBuilder();
        StringBuilder n2 = new StringBuilder();
        Stack<Integer> l1Stack = new Stack<>();
        while(l1 != null){
            l1Stack.push(l1.val);
            l1 = l1.next;
        }
        Stack<Integer> l2Stack = new Stack<>();
        while(l2 != null){
            l2Stack.push(l2.val);
            l2 = l2.next;
        }

        while (!l1Stack.empty()){
            n1.append(l1Stack.pop());
        }
        while (!l2Stack.empty()){
            n2.append(l2Stack.pop());
        }
        StringBuilder res;
        if((n1.length() >= 25) || (n2.length() >= 25)){
            BigInteger n1B = new BigInteger(n1.toString());
            BigInteger n2B = new BigInteger(n2.toString());
            n1B = n1B.add(n2B);
            res = new StringBuilder(
                    n1B.toString()
            );
        }else {
            res = new StringBuilder(
                    String.valueOf(
                            Long.valueOf(n1.toString()) + Long.valueOf(n2.toString())
                    )
            );
        }

        res.reverse();

        ListNode result = null;
        ListNode temp = null;
        for(int i = 0; i < res.length(); i++){
            if(temp == null){
                temp = new ListNode( Character.getNumericValue(res.charAt(i)) );
                result = temp;
            }
            else {
                temp.next = new ListNode( Character.getNumericValue(res.charAt(i) ));
                temp = temp.next;
            }
        }
        return result;
    }

    */
}
