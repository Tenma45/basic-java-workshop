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

    @Test
    public void multipleElement() {
        List<Integer> input = new ArrayList<>(asList(1,2));
        MySort mySort = new MySort(input);
        boolean isEmpty = mySort.checkIfSingleElement();
        boolean isSingleElement = mySort.checkIfSingleElement();
        assertFalse(isEmpty);
        assertFalse(isSingleElement);
    }

    @Test
    public void getResultTwoElements01() {
        List<Integer> input = new ArrayList<>(asList(1,2));
        MySort mySort = new MySort(input);
        List<Integer> result = mySort.getResult();
        assertEquals(new ArrayList<>(asList(1,2)),result);
    }

    @Test
    public void getResultTwoElements02() {
        List<Integer> input = new ArrayList<>(asList(2,1));
        MySort mySort = new MySort(input);
        List<Integer> result = mySort.getResult();
        assertEquals(new ArrayList<>(asList(1,2)),result);
    }

    @Test
    public void getResultThreeElements01() {
        List<Integer> input = new ArrayList<>(asList(1,2,3));
        MySort mySort = new MySort(input);
        List<Integer> result = mySort.getResult();
        assertEquals(new ArrayList<>(asList(1,2,3)),result);
    }
}