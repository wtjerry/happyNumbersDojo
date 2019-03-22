package dojo.happynumbers;

import java.util.ArrayList;
import java.util.List;

public class Happy {

    public boolean validate(final int i) {
        return true;
    }

    public List<Integer> split(int integerToSplit){
        ArrayList<Integer> integers = new ArrayList<>();
        while (integerToSplit > 0) {
            integers.add(0, integerToSplit % 10);
            integerToSplit = integerToSplit / 10;
        }

        return integers;
    }
}
