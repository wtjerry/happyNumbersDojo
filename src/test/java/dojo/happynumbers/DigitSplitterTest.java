package dojo.happynumbers;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class DigitSplitterTest {
    static DigitSplitter testee;

    @BeforeAll
    static void Initiate() {
        testee = new DigitSplitter();
    }

    @Test
    void does10ReturnListOf1And0() {
        var result = testee.split(10);
        assertThat(result, is(Arrays.asList(1, 0)));
    }

    @Test
    void does6ReturnListOf6() {
        var result = testee.split(6);
        assertThat(result, is(Arrays.asList(6)));
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
}