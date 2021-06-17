import java.util.List;

public class MySort {

    private final List<Integer> input;

    public MySort(List<Integer> input) {
        this.input = input;
    }

    public boolean checkIfEmpty() {
        if(Integer.compare(this.input.size(),0)==0){
            return true;
        }
        return false;
    }
}
