public class MyRange {
    public static void main(String[] args) {
        String input1 = args[0].split(",")[0];
        String input2 = args[0].split(",")[1];
        Character sign1 = input1.charAt(0);
        Character sign2 = input2.charAt(input2.length()-1);
        String number1 = input1.substring(1);
        String number2 = input2.substring(0, input2.length() - 1);
        int start = Integer.parseInt(number1);
        int stop= Integer.parseInt(number2);
        if(new Character('(').equals(sign1)){
            start+=1;
        }
        else if(new Character('[').equals(sign1)){
            ;
        }
        else {throw new Error("invalid format");}
        if(new Character(')').equals(sign2)){
            stop-=1;
        }
        else if(new Character(']').equals(sign2)){
            ;
        }
        else {throw new Error("invalid format");}
        for (int i=start;i<=stop;i++){
            System.out.print(i);
            if(i!=stop){System.out.print(",");}
        }
    }
}
