package solver;

public class Solver {
    public static Integer solve(int[] temperatures) {
        int n = temperatures.length;

        if (n == 0) return 0;

        int minPositive = Integer.MAX_VALUE;
        int maxNegative = Integer.MIN_VALUE;

        for (int temperature : temperatures) {
            if (temperature >= 0) {
                minPositive = Math.min(minPositive, temperature);
            } else {
                maxNegative = Math.max(maxNegative, temperature);
            }
        }

        if (maxNegative == Integer.MIN_VALUE) return minPositive;
        if (minPositive == Integer.MAX_VALUE) return maxNegative;

        return (maxNegative * -1) >= minPositive ? minPositive : maxNegative;
    }
}
