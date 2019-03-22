package dojo.happynumbers;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class HappyTest {
    static Happy testee;

    @BeforeAll
    static void Initiate() {
        testee = new Happy();
    }

    @Test
    void does1ReturnTrue() {
        var happy = new Happy();

        assertThat(happy.validate(1), is(true));
    }

    @Test
    void does100ReturnTrue() {
        var happy = new Happy();

        assertThat(happy.validate(100), is(true));
    }

    @Test
    void does10ReturnListOf1And0() {
        var result = testee.split(10);
        assertThat(result, is(Arrays.asList(1, 0)));
    }
}