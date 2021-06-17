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

    public List<Integer> getResult() {
        if(checkIfEmpty()){
            return new ArrayList<>();
        }
        if(checkIfSingleElement()){
            System.out.println(this.input);
            return this.input;
        }
        return this.input;
    }
}