public class Leetcode70_ClimbingStars {


    public int climbStairs(int n) {

        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            int prevSteps = 2;
            int prevPrevSteps = 1;
            int currentSteps = 0;
            for (int i = 3; i <= n; i++) {
                currentSteps = prevSteps + prevPrevSteps;
                int temp = prevSteps;
                prevSteps = currentSteps;
                prevPrevSteps = temp;
            }

            return currentSteps;
        }
    }
}
