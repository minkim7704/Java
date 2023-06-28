package SelfLearningJava;

import java.util.Scanner;
// Scanner를 배우면서 Scanner 클래스를 사용하기 위해 자바에서 제공하는 스캐너 클래스를 호출한다.

public class Chapter0204SystemPrint {
    public static void main(String[] args) throws Exception {

        // 0. 모니터로 변수값 출력하기
        System.out.println("시스템 표준 출력 장치로 출력");
        // System.in.read();
        //      - 시스템 표준 입력 장치에서 읽음
        //      - 키보드로부터 데이터를 읽고 변수에 저장하는 방법


        // 1. System.out.printf
            // formal string (형식화된 문자열) 출력
            // printf(%[argument_index$] [flags] [width] [.precision] conversion)
            // flags, width, precision 생략가능

        System.out.printf("Name: %s", "Kim Java"); // %s String
        System.out.printf("Age: %d", 25);          // %d Int
        System.out.printf("Weight: %f", 55.5);     // %f float

        int value = 123;
        System.out.printf("상품의 가격:%d원\n", value);   //123원
        System.out.printf("상품의 가격:%6d원\n", value);  //   123원 - 6자리 정수, 앞쪽 공백
        System.out.printf("상품의 가격:%-6d원\n", value); //123   원 - 6자리 정수, 뒷쪽 공백
        System.out.printf("상품의 가격:%06d원\n", value); //000123원 - 6자리 정수, 공백 0으로 채우기

        double area = 3.14159 * 10 * 10;
        System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 10, area);
                                            // %10.2f = 소수점 이상 7자리 이하 2자리, 앞쪽 빈 자리 공백.

        String name = "홍길동";
        String job = "도적";
        System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
                        // %6d = 6자리 정수, 앞쪽 공백
                              // %-10s = 10자리 문자열, 뒷쪽 공백
                                        // %10s = 소수점 이상 7자리, 앞쪽의 공백


        // 2. 키코드 System.in.read()
            // 키보드에서 키를 입력할 때 프로그램에서 숫자로 된 키코드를 읽음
            // 얻은 키코드는 int 변수에 저장
        int keyCode;
        keyCode = System.in.read();
        System.out.println("keyCode: " + keyCode); // 1 입력시 49

        keyCode = System.in.read();
        System.out.println("keyCode: " + keyCode); // enter 키는 10

        keyCode = System.in.read();
        System.out.println("keyCode: " + keyCode); // q는 113

        // keyCode 세번 받는거니까 3개 눌러보세용..
            // 2개 이상 키가 조합된 한글은 읽을 수 없다는 단점
            // 통문자열을 읽을 수 없다는 단점
        // 메인 메소드 만들 때 에러 막기 위해 public static void main ~ throws Exception {} 써주기

        // 2-1. keyCode & while block & if block
        while(true) {
            keyCode = System.in.read();
            System.out.println("keyCode: " + keyCode);
            if (keyCode == 113) {
                break;              // keyCode 가 113 과 동일할 경우 while 문을 빠져 나온다.
            }
        }
        System.out.println("종료");


        // 3. Scanner - keyCode 의 단점을 보완한다.
        Scanner scanner = new Scanner(System.in);
        // 스캐너 변수 선언 = 시스템 입력장치로부터 읽는 스캐너 생성 및 스캐너 변수에 저장
        String inputData;
        inputData = scanner.nextLine();

        System.out.println("입력된 문자열: \"" + inputData + "\"");
        // 스트링 변수 선언

        while(true) {
            inputData = scanner.nextLine();
            // 엔터키 이전까지 입력된 문자열을 읽는 스캐너 생성 및 스트링 변수에 저장
            System.out.println("입력된 문자열: \"" + inputData + "\"");
            if(inputData.equals("q")) {
                break;
            }
        }

        System.out.println("종료");


        // 4. 기본 타입의 값 비교 & 문자열 비교
        // 기본 타입의 값 비교 (==) 사용
        int x = 5;
        boolean result = (x == 5);      // true

        // 문자열 비교는 (.equals()) 메소드 사용
        String compare = "Java";
        result = compare.equals("Java");    // true
        System.out.println(result);
        result = compare.equals("java");    // false
        System.out.println(result);




    }



}
