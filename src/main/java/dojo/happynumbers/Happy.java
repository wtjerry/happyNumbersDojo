package dojo.happynumbers;

import java.util.Collections;

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
        var digits = this.digitSplitter.split(number);
        int squareAndSum = this.squareAndSum.squareAndSum(digits);
        this.loopDetector.isLoop(Collections.emptyList(), squareAndSum);
        return true;
    }
}
