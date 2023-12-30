package solver;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Solver {
    public static Integer solve(int[] temperatures) {
        int n = temperatures.length;

        if (n == 0) return 0;
        if (n == 1) return temperatures[0];

        List<Integer> positives = new LinkedList<>();
        List<Integer> negatives = new LinkedList<>();

        for (int temperature : temperatures) {
            if (temperature >= 0) {
                positives.add(temperature);
            } else {
                negatives.add(temperature);
            }
        }

        Collections.sort(positives);
        Collections.sort(negatives);

        if (negatives.isEmpty()) return positives.getFirst();
        if (positives.isEmpty()) return negatives.getLast();

        int positivesMostLeft = positives.getFirst();
        int negativesMostRight = negatives.getLast();

        if ((negativesMostRight * -1) == positivesMostLeft) return positivesMostLeft;
        if ((negativesMostRight * -1) > positivesMostLeft) return positivesMostLeft;

        return negativesMostRight;
    }
}
