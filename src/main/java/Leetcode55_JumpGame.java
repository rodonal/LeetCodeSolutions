public class Leetcode55_JumpGame {

    // That is statement is a nice trick when you have different choices
        public boolean canJump(int[] nums) {

            int lengthOfArray = nums.length;
            int goal = lengthOfArray-1;

            for (int i = lengthOfArray-1; i>=0;i--) {
                if (i+nums[i]>=goal) {
                    goal=i;
                }

            }

            return  (goal==0) ? true:false;

    }
}
