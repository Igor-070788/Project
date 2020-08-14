package calc;

    import java.util.Scanner;
    import calc.Answer; // подгружаю переменные из класса Answer - ans

    public class General {
                public static void main(String[] args) {
                    Scanner input = new Scanner(System.in);
                    Calculator calc = new Calculator();
                    String myinput;

                    while (true) {
                        System.out.println("Input: ");
                        myinput = input.nextLine();
                    }
                    if (ans.success)
                        System.out.println(ans.result);
                    else {
                        for (String error: ans.errors)
                            System.out.println(error);
                        }
                }
    }