import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyRange2Test {

    @Test
    public void startWithInclude() {
        MyRange2 myRange = new MyRange2("[1,5]");
        boolean isInclude = myRange.checkStartWithInclude();
        assertTrue(isInclude);
    }

    @Test
    public void startWithExclude() {
        MyRange2 myRange = new MyRange2("(1,5]");
        boolean isInclude = myRange.checkStartWithInclude();
        assertFalse(isInclude);
    }

    @Test
    public void endWithInclude() {
        MyRange2 myRange = new MyRange2("[1,5]");
        boolean isInclude = myRange.checkEndWithInclude();
        assertTrue(isInclude);
    }

    @Test
    public void endWithExclude() {
        MyRange2 myRange = new MyRange2("[1,5)");
        boolean isInclude = myRange.checkEndWithInclude();
        assertFalse(isInclude);
    }

    @Test
    public void getFirstNumberAndStartWithInclude() {
        MyRange2 myRange = new MyRange2("[1,5]");
        int firstNumber = myRange.getFirstNumber();
        assertEquals(1, firstNumber);
    }

    @Test
    public void getFirstNumberAndStartWithExclude() {
        MyRange2 myRange = new MyRange2("(1,5]");
        int firstNumber = myRange.getFirstNumber();
        assertEquals(2, firstNumber);
    }

    @Test
    public void getResultIncludeInclude() {
        MyRange2 myRange = new MyRange2("[1,5]");
        String result = myRange.getResult();
        assertEquals("1,2,3,4,5", result);
    }

    @Test
    public void getResultIncludeExclude() {
        MyRange2 myRange = new MyRange2("[1,5)");
        String result = myRange.getResult();
        assertEquals("1,2,3,4", result);
    }

    @Test
    public void getResultExcludeInclude() {
        MyRange2 myRange = new MyRange2("(1,5]");
        String result = myRange.getResult();
        assertEquals("2,3,4,5", result);
    }

    @Test
    public void getResultExcludeExclude() {
        MyRange2 myRange = new MyRange2("(1,5)");
        String result = myRange.getResult();
        assertEquals("2,3,4", result);
    }

}