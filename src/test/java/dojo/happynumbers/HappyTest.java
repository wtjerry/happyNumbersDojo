package dojo.happynumbers;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class HappyTest {

    @Test
    void does1ReturnTrue() {
        var happy = new Happy();

        assertThat(happy.validate(1)).isTrue();
    }

    @Test
    void does100ReturnTrue() {
        var happy = new Happy();

        assertThat(happy.validate(100)).isTrue();
    }
}