package dojo.happynumbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DigitSplitter {
    public List<Integer> split(int integerToSplit) {
        var integers = new ArrayList<Integer>();
        while (integerToSplit > 0) {
            integers.add(0, integerToSplit % 10);
            integerToSplit = integerToSplit / 10;
        }

        return Collections.unmodifiableList(integers);
    }
}