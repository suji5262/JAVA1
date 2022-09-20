package me.jave.input;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 사용자가 콘솔을 통해 입력한 데이터를 저장 - 입력메소드
        Scanner sc = new Scanner(System.in);
        // 객체(object) : 실제 행동하는 단위

        System.out.print("정수를 입력하시오 : "); //입력유도 메세지

        int num = sc.nextInt();
        System.out.println(num);

        System.out.print("실수를 입력하시오 : ");


        double d = sc.nextDouble();
        System.out.println(d);
    }


}
