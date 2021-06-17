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

    private List<Integer> sort() {
        int unsortedNumber = this.input.size();
        for(int i=0;i<this.input.size();i++){
            unsortedNumber -= 1;
            for (int j=0;j<unsortedNumber;j++) {
                if(Integer.compare(this.input.get(j),this.input.get(j+1))>0) {
                    int temp = this.input.get(j + 1);
                    this.input.set(j + 1, this.input.get(j));
                    this.input.set(j, temp);
                }
            }
        }
        return this.input;
    }

    public List<Integer> getResult() {
        if(checkIfEmpty()){
            return new ArrayList<>();
        }
        if(checkIfSingleElement()){
            System.out.println(this.input);
            return this.input;
        }
        List<Integer> result = this.sort();
        return result;
    }
}
