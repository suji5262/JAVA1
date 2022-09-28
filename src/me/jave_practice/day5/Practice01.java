package me.jave_practice.day5;

import java.util.Arrays;
import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("문자를 입력하시오: "); // 문자 입력 유도
        String str = sc.nextLine(); // 입력

        String[] inputStr = str.split(" "); // 스플릿 사용해서 공백 넣기
        String answer = "";

        for (int i = 0; i < inputStr.length; i++) {
            String first = inputStr[i].substring(0,1); // 첫번째 문자
            String remain = inputStr[i].substring(1);
            first = first.toLowerCase();
            remain = remain.toUpperCase();
            String result = first + remain;
            answer += " " + result;
        }
        answer = answer.strip();
        System.out.println(answer);//입력 - 한문장에서 각 단어의
// 첫 글자는 소문자로 작성
// 나머지 글자는 대문자로 작성할 수 있도록


//출력  메세지 입력: Hello Sally
//      hELLO sALLY

        // 스플릿 안에 나눌껄 ""안에 공백을 넣어라


    }
}
