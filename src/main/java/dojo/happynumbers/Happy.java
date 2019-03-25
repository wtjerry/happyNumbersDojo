package dojo.happynumbers;


import java.util.Collections;

class Happy {

    private final SquareAndSum squareAndSum;

    Happy(SquareAndSum squareAndSum) {
        this.squareAndSum = squareAndSum;
    }

    boolean validate(final int i) {
        this.squareAndSum.squareAndSum(Collections.singletonList(i));
        return true;
    }
}
