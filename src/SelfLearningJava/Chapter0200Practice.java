package SelfLearningJava;

import java.util.Scanner;

public class Chapter0200Practice {
    public static void main(String[] args) {

        // 1. exam 01
        String name = "Kim Java";
        int age = 25;
        String tel1 = "010", tel2 = "1234", tel3 = "5678";
        // 이렇게 한 번에 변수 선언 및 저장 해주기도 가능하다!

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.printf("Telephone: %1$s-%2$s-%3$s", tel1, tel2, tel3);
                                // %s 문자열 넣어줄건데
                                // 1$ 여기엔 첫번째 변수를
                                // 2$ , 3$  각각 두번째, 세번째 변수를 넣어줘

        System.out.printf("\nName: %1$s\nAge: %2$d\nTelephone: %3$s-%4$s-%5$s\n", name, age, tel1, tel2, tel3);
            // 상위 출력명령 3개를 한 번에 묶어서 할 수도 있다!


        // 2. exam 02
        Scanner scanner = new Scanner(System.in);
        // ~(System.in) : "시스템 입력 장치를 통해 얻은 입력값"을 저장할 스캐너를 생성해 스캐너 변수에 넣는다고 선언

        System.out.print("First number: ");
        String strNum1 = scanner.nextLine();
        // 스캐너 변수.nextLine() : 엔터키 전까지 입력된 통문자열을 스캐너로 생성해
        // String 변수인 strNum1 에 저장한다.

        System.out.print("Second number: ");
        String strNum2 = scanner.nextLine();

        int num1 = Integer.parseInt(strNum1);
        int num2 = Integer.parseInt(strNum2);
        // Integer.parseInt(var) : strNum1 & strNum2 에 입력된 "숫자" 문자열을 int 변수로 변환
        int result = num1 + num2;
        System.out.println("The result = " + result);


        // 3. exam 03
        // Scanner scanner = new Scanner(System.in);    // 위에서 변수 선언 및 저장 완료
        System.out.println("[필수 정보 입력]");

        System.out.print("1. 이름: ");
        name = scanner.nextLine();

        System.out.print("2. 주민등록번호 앞 6 자리: ");
        String ssn = scanner.nextLine();

        System.out.print("3. 전화번호: ");
        String tel = scanner.nextLine();

        System.out.println();

        System.out.println("[필수 정보 입력]");
        System.out.println("1. 이름: " + name);
        System.out.println("2. 주민등록번호 앞 6자리: " + ssn);
        System.out.println("3. 전화번호: " + tel);

        // print() 메소드 : 괄호 안의 내용만 출력
        // println() 메소드 : 괄호 안의 내용을 출력하고 행 바꿈
        // printf() 메소드 : 괄호 안의 첫 번째 문자열 형식대로 내용을 출력 - 형식에 넣을 변수 콤마(,) 기준 나열




    }
}
