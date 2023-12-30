package Main;

import solver.Solver;

public class Main {
    public static void main(String[] args) {
        int[] temperatures = {5, 10, 3, 8};
        System.out.println(Solver.solve(temperatures));
    }
}