package dojo.happynumbers;

import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class HappyTest {

    @Test
    void does2ResultInSquareSumBeingCalled() {
        var squareMock = mock(SquareAndSum.class);
        var happy = new Happy(squareMock);

        happy.validate(2);

        verify(squareMock).squareAndSum(Collections.singletonList(2));
    }
}