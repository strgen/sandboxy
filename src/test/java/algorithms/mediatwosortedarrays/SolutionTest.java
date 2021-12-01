package algorithms.mediatwosortedarrays;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    void test(){
        Solution underTest = new Solution();
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        var res = underTest.findMedianSortedArrays(nums1, nums2);
        assert res == 2;
    }

    @Test
    void test1(){
        Solution underTest = new Solution();
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        var res = underTest.findMedianSortedArrays(nums1, nums2);
        assert res == 2.50000;
    }

    @Test
    void test2(){
        Solution underTest = new Solution();
        int[] nums1 = {1, 1};
        int[] nums2 = {1, 2};
        var res = underTest.findMedianSortedArrays(nums1, nums2);
        assert res == 1;
    }
}
