package dojo.happynumbers;

import java.util.List;

public class LoopDetector {

    public boolean isLoop(List<Integer> previousOccurrences, int newOccurrence) {
        return previousOccurrences.contains(newOccurrence);
    }
}
