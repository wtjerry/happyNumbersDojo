package dojo.happynumbers;

import java.util.ArrayList;

public class Happy {

    private final DigitSplitter digitSplitter;
    private final SquareAndSum squareAndSum;
    private final LoopDetector loopDetector;
    private int x = 0;

    public Happy(DigitSplitter digitSplitter, SquareAndSum squareAndSum, LoopDetector loopDetector) {
        this.digitSplitter = digitSplitter;
        this.squareAndSum = squareAndSum;
        this.loopDetector = loopDetector;
    }

    public boolean validate(final int number) {
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

    public void testMe() throws Exception {
        if(x != 0){
            throw new Exception();
        }

        x = 2;
    }
}
