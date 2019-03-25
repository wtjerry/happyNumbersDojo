package dojo.happynumbers;

import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;

class LoopDetectorTest {

    @Test
    void noPreviousOccurencesAnd1ReturnsFalse() {
        var loopDetector = new LoopDetector();

        boolean result = loopDetector.isLoop(Collections.emptyList(), 1);

        assertThat(result).isFalse();
    }

    @Test
    void oneAsPreviousOccurrenceAnd1ReturnsTrue() {
        var loopDetector = new LoopDetector();

        var isLoop = loopDetector.isLoop(Collections.singletonList(1), 1);

        assertThat(isLoop).isTrue();
    }
}
