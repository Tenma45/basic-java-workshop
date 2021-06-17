public class MyRange2 {

    private final String input;

    public MyRange2(String input) {
        this.input = input;
    }

    public boolean checkStartWithInclude() {
        return input.startsWith("[");
    }

    public boolean checkEndWithInclude() {
        return input.endsWith("]");
    }

    public int getFirstNumber() {
        int firstNumber = Character.getNumericValue(input.charAt(1));
        if( checkStartWithInclude() ) {
            return firstNumber;
        }
        return firstNumber + 1;
    }

    public int getSecondNumber() {
        int secondNumber = Character.getNumericValue(input.charAt(3));
        if( checkEndWithInclude() ) {
            return secondNumber;
        }
        return secondNumber - 1;
    }

    public String getResult() {
        int firstNumber = getFirstNumber();
        int secondNumber = getSecondNumber();
        String results = "";
        for (int i = firstNumber; i < secondNumber + 1 ; i++) {
            results += i+",";
        }
        return results.substring(0,results.length()-1);
    }

}