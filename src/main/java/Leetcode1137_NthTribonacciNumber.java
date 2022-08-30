public class Leetcode1137_NthTribonacciNumber {

    public int tribonacci(int n) {

        int previousTribonacci = 1;
        int prevPreviousTribonacci = 1;
        int prevPrevPreviousTribonacci = 0;
        int currentTribonacci = 0;

        if (n == 0) {
            return 0;

        } else if (n == 1) {
            return 1;

        } else if (n == 2) {
            return 1;
        } else {

            for (int i = 3; i <= n; i++) {
                currentTribonacci = previousTribonacci + prevPreviousTribonacci + prevPrevPreviousTribonacci;
                int temp1 = previousTribonacci;
                int temp2 = prevPreviousTribonacci;
                previousTribonacci = currentTribonacci;
                prevPreviousTribonacci = temp1;
                prevPrevPreviousTribonacci = temp2;

            }

            return currentTribonacci;
        }

    }
}
