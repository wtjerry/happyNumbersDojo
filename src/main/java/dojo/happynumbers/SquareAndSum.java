package dojo.happynumbers;

import java.util.List;

public class SquareAndSum {
    int squareAndSum(List<Integer> digits) {
        return digits.stream()
                .map(i -> i * i)
                .reduce(0, (a, b) -> a + b);
    }
}