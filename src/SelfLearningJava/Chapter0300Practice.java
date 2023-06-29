package SelfLearningJava;

import java.util.Scanner;

public class Chapter0300Practice {
    /* Chapter 2 에서 시스템 입력장치에서 받은 통문자열을 인식하는 Scanner, 타입 변환에 대해 공부했다.
    Chapter 2 에서 공부한 것들을 포함해 Chapter 3에서 공부한 것들을 사용해보는 연습문제를 풀어보장. */
    public static void main(String[] args) {
        // 1. exam 1
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number: ");
        double num1 = Double.parseDouble(scanner.nextLine());
        // 입력받은 숫자를 double 타입의 변수로 바꿔준다

        System.out.print("Second number: ");
        double num2 = Double.parseDouble(scanner.nextLine());

        if (num2 != 0.0) {
            // 만약 num2 변수가 0.0이 아니라면
            System.out.println("result: " + (num1 / num2));
        } else { // 만약 num2 변수가 0.0 이라면
            System.out.println("result: infinite");
        }


        // 2. exam 2
        int var1 = 10;
        int var2 = 3;
        int var3 = 14;

        double var4 = var1 * var1 * Double.parseDouble(var2 + "." + var3);
            // 연산식 내에서 한 변수가 double이면 다른 변수는 double 로 자동 타입 변환된다.
        System.out.println("원의 넓이: " + var4);


        // 3. exam 3
        System.out.print("아이디:");
        String name = scanner.nextLine();

        System.out.print("패스워드:");
        String strPassword = scanner.nextLine();

        int password = Integer.parseInt(strPassword);
                    // 문자열로 받은 패스워드를 정수 타입으로 변환시켜준다.

        if (name.equals("java")) {                              // 만약 이름에 "java" 가 들어간다면
            if (password == 12345) {                                // 그리고 비밀번호가 12345 라면
                System.out.println("로그인 성공");                     // 로그인 성공 메시지를 띄운다.
            } else {                                                // 비밀번호가 12345 가 아니라면
                System.out.println("로그인 실패:패스워드가 틀림");         // 로그인 실패 메시지를 띄운다.
            }
        } else {                                                // 만약 이름에 "java" 가 안들어간다면
            System.out.println("로그인 실패:아이디 존재하지 않음");     // 로그인 실패 메시지를 띄운다.
        }

    }
}
