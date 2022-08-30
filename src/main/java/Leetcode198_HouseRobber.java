public class Leetcode198_HouseRobber {
    public int rob(int[] nums) {
        int oneStepBefore=0;
        int twoStepsBefore=0;
        for (int i=0;i<nums.length;i++){
            int currentBest = Math.max(nums[i]+twoStepsBefore,oneStepBefore );
            twoStepsBefore = oneStepBefore;
            oneStepBefore = currentBest;
        }

        return oneStepBefore;
    }
}
