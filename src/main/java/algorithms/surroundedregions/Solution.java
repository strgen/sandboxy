package algorithms.surroundedregions;

import java.awt.geom.Point2D;
import java.util.*;

public class Solution {

    private List<GraphNodes> flip = new ArrayList<>();
    private Set<Node> visited = new HashSet<>();

    public void solve(char[][] board) {

        for(int x = 1; x < board.length - 1; x++) {
            for (int y = 1; y < board[0].length - 1; y++) {
                var node = new Node(x,y);
                var graph = getNextPoint(node, board, new GraphNodes(new HashSet<>(), false));
                //visited.add(node);
                if(!graph.nodes.isEmpty())
                    flip.add(graph);
            }
        }
        for(GraphNodes graphNodes : flip){
            if(graphNodes.connectedToBorder)
                continue;
            for( Node node: graphNodes.nodes ){
                board[node.x][node.y] = 'X';
            }
        }
    }

    private GraphNodes getNextPoint(Node node, char[][] board, GraphNodes graphNodes){
        if (isOutOfBorder(node, board))
            return graphNodes;
        if(visited.contains(node)) {
            return graphNodes;
        }
        else {
            visited.add(node);

            if (board[node.x][node.y] == 'O') {
                if (!graphNodes.nodes.contains(node)) {
                    graphNodes.nodes.add(node);
                    if (connectedToBorderO(node, board)) {
                        graphNodes.connectedToBorder = true;
                    }
                }
                var left = new Node(node.x - 1, node.y);

                if (!visited.contains(left)) {
                    getNextPoint(left, board, graphNodes);
                }
                var right = new Node(node.x + 1, node.y);
                if (!visited.contains(right)) {
                    getNextPoint(right, board, graphNodes);
                }
                var down = new Node(node.x, node.y - 1);
                if (!visited.contains(down)) {
                    getNextPoint(down, board, graphNodes);
                }
                var up = new Node(node.x, node.y + 1);
                if (!visited.contains(up)) {
                    getNextPoint(up, board, graphNodes);
                }
            }
            return graphNodes;
        }
    }


    private boolean isOutOfBorder(Node node, char[][] board){
        if(node.x <= 0){
            return true;
        }
        if(node.y <= 0){
            return true;
        }
        if(node.x >= board.length - 1){
            return true;
        }
        if(node.y >= board[0].length -1){
            return true;
        }
        return false;
    }

    private boolean isOnBorder(Node node, char[][] board){
        if(node.x == board.length){
            return true;
        }
        if(node.y == board[0].length) {
            return true;
        }
        if(node.x == 0){
            return true;
        }
        if(node.y == 0){
            return true;
        }
        return false;
    }

    private boolean connectedToBorderO(Node node, char[][] board) {
        /*
             22222
            1000003
            1000003
            1000003
             44444
        */

        if(node.x == 1){
            if(board[node.x - 1][ node.y ] == 'O')
                return true;
        }
        if(node.y == 1){
            if(board[node.x][node.y - 1] == 'O')
                return true;
        }
        if(node.x == board.length - 2){
            if(board[board.length - 1][node.y] == 'O')
                return true;
        }
        if(node.y == board[0].length - 2){
            if(board[node.x][board[0].length - 1] == 'O')
                return true;
        }
        return false;
    }

    private static class GraphNodes{
        public Set<Node> nodes;
        public boolean connectedToBorder;

        public GraphNodes(Set<Node> nodes, boolean connectedToBorder) {
            this.nodes = nodes;
            this.connectedToBorder = connectedToBorder;
        }
    }

    private static class Node{
        public int x;
        public int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + x;
            result = prime * result + y;
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if(obj == null) return false;
            if (!(obj instanceof Node)) return false;
            return ((Node) obj).x == this.x && ((Node) obj).y == this.y;
        }
    }
}
