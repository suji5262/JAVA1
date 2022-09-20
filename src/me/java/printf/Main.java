package me.java.printf;

public class Main { public static void main(String[] args) {
    int i = 10;
    float f = 12.34f;
    double d = 56.78;
    char c = 'a';
    String s = "Hello World";
    boolean b = true;

    // int
    System.out.printf("%d\n", i);
    System.out.printf("%10d\n", i); // 오른쪽으ㄷ로 정렬
    System.out.printf("%-10d\n", i); // 왼쪽으로 정렬
    System.out.printf("%010d\n", i); //0000000010
    System.out.printf("%o\n", i); //8진수
    System.out.printf("%x\n", i); // 16진수
    System.out.printf("%X\n", i); // 16진수
    System.out.printf("%n"); // 엔터 출력 '\n'
    System.out.println();

    // float
    // f = 3.1412312412412312f
    System.out.printf("%f\n", f);
    System.out.printf("%.2f\n", f);
    System.out.printf("%.8f\n", f); // 부동 소수점의 오차 (**)
    System.out.printf("%5.2f\n", f);
    System.out.printf("%-5.2f\n", f);
    System.out.printf("%e\n", f); // 12345.1234 ==1.23451234 x 10^4 == 1.2341234e4- 지수표기법으로 출력 하겠다
    System.out.printf("%E\n", f); // 1.2341234E4 - 실수를 저장->지수표기법
    System.out.printf("%30.3e\n", f); // 30칸에 3번째 부분까지만 출력
    System.out.printf("%30.3E\n", f);
    System.out.println();

    // double
    System.out.printf("%f\n", d);
    System.out.printf("%.2f\n", d);
    System.out.printf("%.8f\n", d);
    System.out.printf("%5.2f\n", d);
    System.out.printf("%-5.2f\n", d);
    System.out.printf("%e\n", f);
    System.out.printf("%E\n", f);
    System.out.printf("%30.3e\n", f);
    System.out.printf("%30.3E\n", f);
    System.out.println();

    // char
    System.out.printf("%c\n", c);
    System.out.printf("%C\n", c);
    System.out.printf("%30c\n", c);
    System.out.printf("%30C\n", c);
    System.out.println();

    // String
    System.out.printf("%s\n", s);
    System.out.printf("%S\n", s);
    System.out.printf("%30s\n", s);
    System.out.printf("%30S\n", s);
    System.out.println();

    // boolean
    System.out.printf("%b\n", b);
    System.out.printf("%B\n", b);
    System.out.printf("%30b\n", b);
    System.out.printf("%30B\n", b);
    System.out.println();


    // 변수에 저장하지 않은 리터럴도 가능
    System.out.printf("%d\n", 12345);
    System.out.printf("%f\n", 12.34);
    System.out.printf("%c\n", 'a');
    System.out.printf("%s\n", "a");
    System.out.printf("%b\n", true);
    System.out.println();


    // 변수의 자료형과 맞지 않은 지시자 사용 - 런타임 오류 발생 (IllegalFormatConversionException)
    System.out.printf("%c", i);
    System.out.printf("%d", b);

    // 존재하지 않은 지시자 사용 - 런타임 오류 발생 (IllegalFormatConversionException)
    System.out.printf("%a", i);
    System.out.printf("%k", i);
    System.out.printf("%q", i);

}
}
