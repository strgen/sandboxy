package algorithms.recursion1.pascaltriangle;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> base = new ArrayList<>();
        base.add(1);

        return rec(rowIndex, 0, base);
    }


    public List<Integer> rec(int rowIndex, int curInd, List<Integer> previous){
        if(rowIndex == 0)
            return previous;
        if(rowIndex == curInd){
            return previous;
        }
        List<Integer> next = new ArrayList<>();
        next.add(1);
        for( int i = 0; i < previous.size() - 1; i++ )
        {
            next.add(previous.get(i) + previous.get(i + 1));
        }
        next.add(1);
        return rec(rowIndex, curInd + 1, next);
    }
}