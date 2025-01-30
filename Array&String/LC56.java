import java.util.Arrays;

class Solution {
    public int[][] merge(int[][] intervals) {
        int[][] arr=new int[intervals.length][2];

        return arr;
    }
}

public class LC56 {
    public static void main(String[] args) {
        System.out.println("LC56");
        Solution sol = new Solution();
        int[][] intervals={{1,3},{2,6},{8,10},{15,18}};
        int[][] ans=sol.merge(intervals);
        for(int i=0;i<ans.length;i++){
            System.out.println(Arrays.toString(ans[i]));
        }
    }
}