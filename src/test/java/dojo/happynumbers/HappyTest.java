package dojo.happynumbers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HappyTest {

    @Test
    void when10ReturnTrue() {
        var digitSplitter = new DigitSplitter();
        var squareAndSum = new SquareAndSum();
        var loopDetector = new LoopDetector();
        var happy = new Happy(digitSplitter, squareAndSum, loopDetector);

        assertThat(happy.validate(10)).isTrue();
    }

    @Test
    void when2ReturnFalse() {
        var digitSplitter = new DigitSplitter();
        var squareAndSum = new SquareAndSum();
        var loopDetector = new LoopDetector();
        var happy = new Happy(digitSplitter, squareAndSum, loopDetector);

        assertThat(happy.validate(2)).isFalse();
    }
}