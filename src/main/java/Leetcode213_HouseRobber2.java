public class Leetcode213_HouseRobber2 {




    //Lessons learnt:
    // You can divide the solution of the problem into subcases of a previously solved problem
    //From Java side you can play with indeces when trying to slice an Java Array (check the helper function)
    //Try to think simple in terms of the helper variables that are needed,

    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        return Math.max( houseRob(nums,0,nums.length-1),houseRob(nums,1,nums.length));
    }

    public int houseRob(int[] nums , int start , int end) {
        int oneStepBefore=0;
        int twoStepsBefore=0;
        for (int i=start;i<end;i++){
            int currentBest = Math.max(nums[i]+twoStepsBefore,oneStepBefore );
            twoStepsBefore = oneStepBefore;
            oneStepBefore = currentBest;
        }
        return oneStepBefore;
    }

}
