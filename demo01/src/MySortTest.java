import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;

class MySortTest {
    @Test
    public void emptyList() {
        List<Integer> input = new ArrayList<>();
        MySort mySort = new MySort(input);
        boolean isEmpty = mySort.checkIfEmpty();
        assertTrue(isEmpty);
    }

    @Test
    public void singleElementList() {
        List<Integer> input = new ArrayList<>(asList(1));
        MySort mySort = new MySort(input);
        boolean isSingleElement = mySort.checkIfSingleElement();
        assertTrue(isSingleElement);
    }

    @Test
    public void getResultEmptyList() {
        List<Integer> input = new ArrayList<>();
        MySort mySort = new MySort(input);
        List<Integer> result = mySort.getResult();
        assertEquals(new ArrayList<>(),result);
    }

    @Test
    public void getResultSingleElementList() {
        List<Integer> input = new ArrayList<>(asList(1));
        MySort mySort = new MySort(input);
        List<Integer> result = mySort.getResult();
        assertEquals(new ArrayList<>(asList(1)),result);
    }
}