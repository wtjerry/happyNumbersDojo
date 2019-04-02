package dojo.happynumbers;

import java.util.ArrayList;

class Happy {

    private final DigitSplitter digitSplitter;
    private final SquareAndSum squareAndSum;
    private final LoopDetector loopDetector;

    Happy(DigitSplitter digitSplitter, SquareAndSum squareAndSum, LoopDetector loopDetector) {
        this.digitSplitter = digitSplitter;
        this.squareAndSum = squareAndSum;
        this.loopDetector = loopDetector;
    }

    boolean validate(final int number) {
        var history = new ArrayList<Integer>();
        var isLoop = false;
        var sumOfSquares = number;

        while (!isLoop && sumOfSquares != 1) {
            var digits = this.digitSplitter.split(sumOfSquares);
            sumOfSquares = this.squareAndSum.squareAndSum(digits);
            isLoop = this.loopDetector.isLoop(history, sumOfSquares);
            history.add(sumOfSquares);
        }

        return sumOfSquares == 1;
    }
}
