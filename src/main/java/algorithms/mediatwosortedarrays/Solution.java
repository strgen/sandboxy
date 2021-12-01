package algorithms.mediatwosortedarrays;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public static int[] merge(int[] first, int[] second) {

        int fL = first.length;
        int sL = second.length;

        int[] res = new int[fL + sL];

        int fP, sP, rP;
        fP = sP = rP = 0;

        while(fP < fL && sP < sL) {
            if (first[fP] < second[sP]) {
                res[rP++] = first[fP++];
            } else {
                res[rP++] = second[sP++];
            }
        }

        while (fP < fL) {
            res[rP++] = first[fP++];
        }

        while (sP < sL) {
            res[rP++] = second[sP++];
        }

        return res;
    }


    public double findMedianSortedArrays(int[] nums1, int[] nums2){
        var arr = merge(nums1, nums2);
        if(arr.length % 2 != 0) {
            return arr[arr.length / 2];
        }
        else {
            var f = arr[ ( arr.length / 2) - 1 ];
            var s = arr[ ( arr.length / 2)];
            var r = (f + s) / 2d;
            return r;
        }
    }
}
