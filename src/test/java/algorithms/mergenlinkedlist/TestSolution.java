package algorithms.mergenlinkedlist;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestSolution {
    @Test
    void testSolution() {
        Solution solution = new Solution();
        int[] values = {1, 4, 5};
        int[] values1 = {1, 3, 4};
        int[] values2 = {2, 6};
        var array = putIntoLinkedList(values, new Solution.ListNode());
        var array1 = putIntoLinkedList(values1, new Solution.ListNode());
        var array2 = putIntoLinkedList(values2, new Solution.ListNode());

        Solution.ListNode[] listOfLinkedLists = {array, array1, array2};

        var mergedLinkedList = solution.mergeKLists(listOfLinkedLists);
        int[] canonicalArray = {1, 1, 2, 3, 4, 4, 5, 6};
        var canonicalLinkedList = putIntoLinkedList(canonicalArray, new Solution.ListNode());

        while (mergedLinkedList.next != null){
            if(mergedLinkedList.val == canonicalLinkedList.val){
                mergedLinkedList = mergedLinkedList.next;
                canonicalLinkedList = canonicalLinkedList.next;
            }
            else {
                assert false;
            }
        }
    }

    @Test
    void testSolution1() {
        int[] values = {1};
        int[] canonical = {1};
        var array = putIntoLinkedList(values, new Solution.ListNode());
        Solution.ListNode[] listOfLinkedLists = {array};
        var canonicalLinkedList = putIntoLinkedList(canonical, new Solution.ListNode());
        Solution solution = new Solution();
        var mergedLinkedList = solution.mergeKLists(listOfLinkedLists);

        while (mergedLinkedList.next != null){
            if(mergedLinkedList.val == canonicalLinkedList.val){
                mergedLinkedList = mergedLinkedList.next;
                canonicalLinkedList = canonicalLinkedList.next;
            }
            else {
                assert false;
            }
        }
    }

    @Test
    void testSolution2() throws IOException {
        var bigValues = getHugeInput();
        Solution.ListNode[] input = new Solution.ListNode[bigValues.length];
        for(int i = 0; i < bigValues.length; i++){
            var res = putIntoLinkedList(bigValues[i], new Solution.ListNode());
            input[i] = res;
        }
        Solution solution = new Solution();
        var result = solution.mergeKLists(input);

        assert result != null;
    }

    public int[][] getHugeInput() throws IOException {
        int[][] input = Arrays.stream(
                        Files.readString(
                                        Path.of(getPathFromTestResources("algorithms/mergensortedlinkedlists/input.txt")))
                                .replaceAll("[\\[\\]]", "")
                                .split(","))
                .map(string -> {
                    int value = Integer.parseInt(string);
                    return new int[]{value};
                })
                .toArray(int[][]::new);

        return input;
    }

    private String getPathFromTestResources(String fileName) {
        Path resourceDirectory = Paths.get("src", "test", "resources");

        String absolutePath = resourceDirectory.toFile().getAbsolutePath();

        return absolutePath.concat(File.separator).concat(fileName);
    }

    private Solution.ListNode putIntoLinkedList(int[] values, Solution.ListNode listNode) {
        var begin = listNode;
        for (int i = 0; i < values.length; i++) {
            listNode.val = values[i];
            if(i < values.length - 1){
                listNode.next = new Solution.ListNode();
                listNode = listNode.next;
            }
            else
                break;
        }
        return begin;
    }
}
