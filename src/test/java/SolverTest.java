import org.junit.jupiter.api.Test;
import solver.Solver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolverTest {

    @Test
    public void testSolveWithEmptyArray() {
        int[] temperatures = {};
        Integer result = Solver.solve(temperatures);
        assertEquals(0, result);
    }

    @Test
    public void testSolveWithPositiveTemperatures() {
        int[] temperatures = {5, 10, 3, 8};
        Integer result = Solver.solve(temperatures);
        assertEquals(3, result);
    }

    @Test
    public void testSolveWithTwoCloseTemperatures() {
        int[] temperatures = {15, -7, 9, 14, 7, 12};
        Integer result = Solver.solve(temperatures);
        assertEquals(7, result);
    }

    @Test
    public void testSolveWithNegativeTemperatures() {
        int[] temperatures = {-5, -10, -3, -8};
        Integer result = Solver.solve(temperatures);
        assertEquals(-3, result);
    }

    @Test
    public void testSolveWithMixedTemperatures() {
        int[] temperatures = {-5, 10, -3, 8};
        Integer result = Solver.solve(temperatures);
        assertEquals(-3, result);
    }

    @Test
    public void testSolveWithZeroTemperature() {
        int[] temperatures = {0, 5, -3, -8};
        Integer result = Solver.solve(temperatures);
        assertEquals(0, result);
    }

    @Test
    public void testSolveWithSingleTemperature() {
        int[] temperatures = {5};
        Integer result = Solver.solve(temperatures);
        assertEquals(5, result);
    }

    @Test
    public void testSolveWithDuplicateNegativeTemperatures() {
        int[] temperatures = {-10, -10};
        Integer result = Solver.solve(temperatures);
        assertEquals(-10, result);
    }
}