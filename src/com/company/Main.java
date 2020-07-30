package com.company;

import javax.xml.stream.events.Comment;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("данные args= " + args);
        System.out.println("изменения");
//        комментарий через Code или ctr+/
        /*комментарий через Code или ctr+shift+/ -
        многострочный*/
//        \u000a System.out.println("бэкдор");

        int age = 3; // сейчас котёнку три года
        System.out.println(age++); // увеличили на год
        System.out.println(++age); // выводим результат еще +1 сразу

        char ch=103; // символ 'G'
        System.out.println(ch);
    }



}
