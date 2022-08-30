public class Leetcode509_FibonaciNumber {

    public int fib(int n) {

        int previousPreviousFibonacci = 0;
        int previousFibonacci = 1;
        int currentFibonacci = 0;

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            for (int i = 2; i <= n; i++) {
                currentFibonacci = previousFibonacci + previousPreviousFibonacci;
                int tempFibonacci = previousFibonacci;
                previousFibonacci = currentFibonacci;
                previousPreviousFibonacci = tempFibonacci;
            }

            return currentFibonacci;
        }

    }
}
