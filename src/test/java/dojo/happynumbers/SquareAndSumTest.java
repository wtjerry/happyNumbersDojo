package dojo.happynumbers;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class SquareAndSumTest {
    private static SquareAndSum testee;

    @BeforeAll
    static void setUp() {
        testee = new SquareAndSum();
    }

    @Test
    void does10Return1() {
        var result = testee.squareAndSum(Arrays.asList(1, 0));
        assertThat(result, is(1));
    }

    @Test
    void does11Return2() {
        var result = testee.squareAndSum(Arrays.asList(1, 1));
        assertThat(result, is(2));
    }

    @Test
    void does17Return50() {
        var result = testee.squareAndSum(Arrays.asList(1, 7));
        assertThat(result, is(50));
    }
}
