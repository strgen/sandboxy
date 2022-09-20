package algorithms.partitioningintominimumnumberofdecibinarynumbers;

public class Solution {
    public int minPartitions(String n) {
        int max = n.charAt(0) - '0';
        for(int i = 1; i < n.length(); i++){
            int num = n.charAt(i) - '0';
            if(num > max){
                max = num;
            }
        }
        return max;
    }
}
