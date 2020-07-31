package string;

public class LessonString2 {
    public static void main(String[] args) {

        String str1 = "Джава";
        String str2 = "Один из самых популярных языков программирования";
        String str3 = " - ";
        String str4 = str1 + str3 + str2 + "___" + 2020;
        String str6 = "Извлечение символов и подстрок";
        String text = "Метод split() позволяет разбить строку";

        System.out.println(str4);

        str1 = str1.concat(str3 + str2);
        System.out.println(str1);

        String str5 = String.join(" ", str1, str2);
        System.out.println(str5);

        char l = str1.charAt(3); //в
        System.out.println(l);

        int start = 6;
        int end = 12;
        char[] dst = new char[end - start];
        str6.getChars(start, end, dst, 0);
        System.out.println(dst);

        String[] words = text.split(" ");
        for (String word : words) {
            System.out.println(word);

        }
    }
}
