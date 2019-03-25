package dojo.happynumbers;

import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.mockito.Mockito.*;

class HappyTest {

    @Test
    void validateCallsSubmodulesInCorrectOrder() {
        var digitSplitterMock = mock(DigitSplitter.class);
        var squareMock = mock(SquareAndSum.class);
        var loopDetectorMock = mock(LoopDetector.class);
        var happy = new Happy(digitSplitterMock, squareMock, loopDetectorMock);

        var digits = Collections.singletonList(7);
        var squareAndSum = 49;

        when(digitSplitterMock.split(3)).thenReturn(digits);
        when(squareMock.squareAndSum(digits)).thenReturn(squareAndSum);

        happy.validate(3);

        verify(loopDetectorMock).isLoop(Collections.emptyList(), squareAndSum);
    }

    @Test
    void validateCallsDigitSplitter() {
        var digitSplitterMock = mock(DigitSplitter.class);
        var happy = new Happy(digitSplitterMock, mock(SquareAndSum.class), mock(LoopDetector.class));

        happy.validate(3);

        verify(digitSplitterMock).split(3);
    }

    @Test
    void validateCallsSquareAndSum() {
        var digitSplitterMock = mock(DigitSplitter.class);
        var squareMock = mock(SquareAndSum.class);
        var happy = new Happy(digitSplitterMock, squareMock, mock(LoopDetector.class));

        var digits = Collections.singletonList(7);

        when(digitSplitterMock.split(anyInt())).thenReturn(digits);

        happy.validate(3);

        verify(squareMock).squareAndSum(digits);
    }

    @Test
    void validateCallsLoopDetector() {
        var digitSplitterMock = mock(DigitSplitter.class);
        var squareMock = mock(SquareAndSum.class);
        var loopDetectorMock = mock(LoopDetector.class);
        var happy = new Happy(digitSplitterMock, squareMock, loopDetectorMock);

        var digits = Collections.singletonList(7);
        var squareAndSum = 49;


        when(digitSplitterMock.split(anyInt())).thenReturn(digits);
        when(squareMock.squareAndSum(any())).thenReturn(squareAndSum);

        happy.validate(3);

        verify(loopDetectorMock).isLoop(Collections.emptyList(), squareAndSum);
    }
}