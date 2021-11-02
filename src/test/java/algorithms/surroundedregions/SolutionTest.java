package algorithms.surroundedregions;


import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


public class SolutionTest {
    @Test
    public void testSolution(){

        char[][] board = {{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};
        Solution solution = new Solution();
        solution.solve(board);

        char[][] expectedBoard = {{'X','X','X','X'},{'X','X','X','X'},{'X','X','X','X'},{'X','O','X','X'}};
        assertEquals(board, expectedBoard);
    }

    @Test
    public void testSolutionSecondCase(){

        char[][] board = {{'X','X','X'},{'X','O','X'},{'X','X','X'}};

        Solution solution = new Solution();
        solution.solve(board);
    }

    @Test
    public void testSolutionThirdCase(){

        char[][] board = {{'O','X','X','O','X'},{'X','O','O','X','O'},{'X','O','X','O','X'},{'O','X','O','O','O'},{'X','X','O','X','O'}};

        Solution solution = new Solution();
        solution.solve(board);

        char[][] expectedBoard = {{'O','X','X','O','X'},{'X','X','X','X','O'},{'X','X','X','O','X'},{'O','X','O','O','O'},{'X','X','O','X','O'}};
        assertEquals(board, expectedBoard);
    }
}
