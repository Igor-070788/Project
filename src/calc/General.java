package calc;

import java.util.Scanner;

public class General {

    public static void main(String[] args) {
        String numb1;
        String numb2;
        String oper = null;
        Rimnumb rim = new Rimnumb();

        System.out.print("Введите выражение типа: a + b, a - b, a * b, a / b");
        Scanner scanner = new Scanner(System.in);
        numb1 = scanner.nextLine();
        oper = scanner.next();
        numb2 = scanner.nextLine();

        int numb1 = toArab
        if (numb1 > 0 || numb1 < 10 || numb2 > 0 || numb2 < 10  ){
            throw new NumberFormatException("Неверный формат чисел");
        }
    }
}

