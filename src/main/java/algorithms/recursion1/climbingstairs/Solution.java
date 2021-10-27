package algorithms.recursion1.climbingstairs;

public class Solution {

    public int climbStairs(int n) {
        if(n == 1 || n == 2)
            return n;
        int a = 1;
        int b = 1;

        for( int i = 1; i < n; i++ ){
            a = a + b;
            b = a - b;
        }

        return a;
    }
}
