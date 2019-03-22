package dojo.happynumbers;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class DigitSplitterTest {
    private static DigitSplitter testee;

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
        assertThat(result, is(Collections.singletonList(6)));
    }
}