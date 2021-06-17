import java.util.ArrayList;
import java.util.List;

public class MySort {

    private final List<Integer> input;

    public MySort(List<Integer> input) {
        this.input = input;
    }

    public boolean checkIfEmpty() {
        return Integer.compare(this.input.size(),0)==0;
    }

    public boolean checkIfSingleElement() {
        return Integer.compare(this.input.size(),1)==0;
    }

}
