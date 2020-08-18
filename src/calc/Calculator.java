package calc;

public class Calculator {
    private final char[] operator = {'+', '-', '*', '/'};
    private String myinput;
    private Answer catchNumberException (String)
}

class Rimnumb {
    private final int num;
    private static int[]    numbers = { 1000,  900,  500,  400,  100,   90, 50,   40,   10,    9,    5,    4,    1 };
    private static String[] letters = { "M",  "CM",  "D",  "CD", "C",  "XC", "L",  "XL",  "X",  "IX", "V",  "IV", "I" };

    public Rimnumb(int arab){
        if (arab < 1 | arab > 10)
            throw new NumberFormatException("Неподходящее значение");
        num = arab;
    }
}