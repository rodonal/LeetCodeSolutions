import java.util.*;

public class Leetcode740_DeleteAndEarn {

    public int deleteAndEarn(int[] nums) {

        //There is room for improvements
        //Create a counts Hashmap
        HashMap<Integer, Integer> counts = new HashMap<Integer, Integer>();

        for (int num : nums) {
            if (!counts.containsKey(num)) {
                counts.put(num, 1);
            } else {
                counts.put(num, counts.get(num) + 1);
            }
        }


        //Create the sorted ordered List of unique numbers in the nums array
        HashSet<Integer> uniqueNumbers = new HashSet<Integer>();

        for (int num : nums) {
            uniqueNumbers.add(num);
        }
        ArrayList<Integer> uniqueNums = new ArrayList<>(uniqueNumbers);
        Collections.sort(uniqueNums);


        int currentMax = 0;
        int maxOneStepBefore = 0;
        int maxTwoStepsBefore = 0;

        //Keep track of the already traver
        HashSet<Integer> traversedSofar = new HashSet<>();

        for (Integer uniqueNum : uniqueNums) {

            if (traversedSofar.contains(uniqueNum - 1)) {
                currentMax = Math.max(maxOneStepBefore, maxTwoStepsBefore + uniqueNum * counts.get(uniqueNum));

            } else {
                currentMax = maxOneStepBefore + uniqueNum * counts.get(uniqueNum);
            }

            maxTwoStepsBefore = maxOneStepBefore;
            maxOneStepBefore = currentMax;
            traversedSofar.add(uniqueNum);

        }

        return maxOneStepBefore;

    }
}
