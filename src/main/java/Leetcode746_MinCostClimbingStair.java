public class Leetcode746_MinCostClimbingStair {

    public int minCostClimbingStairs(int[] cost) {

        int prevMin = cost[1];
        int prevPrevMin = cost[0];
        int currentMin = 0;

        for (int i = 2; i < cost.length; i++) {
            currentMin = cost[i] + Math.min(prevMin, prevPrevMin);
            int temp = prevMin;
            prevMin = currentMin;
            prevPrevMin = temp;

        }

        return Math.min(prevMin, prevPrevMin);

    }
}
