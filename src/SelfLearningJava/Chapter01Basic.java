package SelfLearningJava;

public class Chapter01Basic {


    public static void main(String[] args) {
        // static 정적 메소드 : 이후에 공부할 챕터에서 설명
        // main() method 시작
        // 프로그램 실행 진입점 entry point


        // 1. 출력
        System.out.println("Hello, Java!");
        System.out.println("안녕, 자바!");


        // 2. Run Statements
        int x;                      // 변수 선언 [변수타입 변수이름;]
        x = 1;                      // 선언한 정수 타입 변수 x 에 값 저장
        int y = 2;                  // 변수 선언 + 값 저장 동시에도 가능

        // int x, y, z;             // 여러 변수 한번에 선언 가능
        // int $shap, _underbar;    // 변수 첫번째 글자에 $, _ 가능
        int int_result = x + y;     // 연산 수행, 결과값을 정수 타입 int_result 변수에 저장

        System.out.println("int_result: " + int_result);     // 모니터에 출력하는 메소드 호출
        System.out.println("x: " + x);
        System.out.println("y" + y);
    }
}
