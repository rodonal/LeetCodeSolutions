public class Leetcode45_JumpGame2 {
    public int jump(int[] nums) {

        //This is a hard question
        //You have two pointers and keep track of how far you can get , the interval
        int minimumSteps=0;
        int leftPoint=0,rightPoint=0;
        while(rightPoint<nums.length-1){

            int furthestYouCanGet=0;
            for(int i = leftPoint; i<= rightPoint;i++ ){
                furthestYouCanGet = Math.max(furthestYouCanGet,i+nums[i]);
            }

            leftPoint=rightPoint+1;
            rightPoint=furthestYouCanGet;
            minimumSteps=minimumSteps+1;
        }

        return minimumSteps;

    }
}
