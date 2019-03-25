package dojo.happynumbers;

import java.util.List;

class LoopDetector {

    boolean isLoop(List<Integer> previousOccurrences, int newOccurrence) {
        return previousOccurrences.contains(newOccurrence);
    }
}
