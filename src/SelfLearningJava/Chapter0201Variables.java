package SelfLearningJava;

public class Chapter0201Variables {

    public static void main(String[] args) {


        // 1. Variable Initialization (변수 초기화)
        // 변수에 최초로 저장된 값을 "변수 초기값"
        // 최초로 값이 저장될 때 메모리에 변수가 생성되는 것을 "변수 초기화"

        int value = 20;             // 정수 타입 변수 value 선언하며 값 20 저장
        int result = value + 10;    // 연산 결과 값을 변수 result 초기값으로 저장
        System.out.println("result: " + result);    // 변수 result 값을 읽고 출력

        value = 30;                 // 변수 value에 새로운 값 30 넣어서 변수 초기화
        result = value + 10;        // 연산 결과 값 변수 result 에 저장
        System.out.println("new result: " + result);


        // 2. Variable Use (변수 사용)

        int hour = 3;
        int minute = 5;
        System.out.println(hour + " 시간 " + minute + " 분");

        int totalMinute = (hour * 60) + minute;             // 연산식 내부에서 각 변수 값 사용
        System.out.println("총 " + totalMinute + " 분");

        minute = 120;                // minute 변수 새로 정의하고 싶을 땐 변수 타입은 쓰지 않는다.
        // 이미 선언이 된 변수이기 때문.
        // int totalHours = (int) (hour + (double) minute/60);      // 아래 연산식과 동일하다.
        double totalHours = hour + (double) minute / 60;
        System.out.println("총 " + totalHours + " 시간");


        // 3. Variable Exchange (변수 교환)
        int x = 3;
        int y = 5;
        System.out.println("x:" + x + ", y:" + y);

        int temp = x;                    // temp 변수에 x 값 (3) 저장 temp = 3
        x = y;                            // x 변수에 y 값 (5) 복사 및 저장 x = 5
        y = temp;                        // y 변수에 temp 변수에 저장된 값 (3) 복사 및 저장 y = 3
        System.out.println("x:" + x + ", y:" + y);

        int a = 10;                    // a 변수에 값 10 저장;
        int b = a;                        // b 변수에 a 변수에 저장된 값 (10) 저장;
        System.out.println("a:" + a + ", b:" + b);


        // 4. Variable Scope (변수 사용 범위)
        // local variables (로컬 변수) = 하나의 블락 내에서 선언된 변수
        // 만약 method 내에서 선언되었다면 method 내에 있는 if 블럭과 for 블럭에서도 사용 가능
        // method 내의 if 블럭에서 선언된 변수는 if 블럭 바깥에서 사용 불가능

        // 4-1. main() method 내에서 선언된 value & sum 변수 + v1 변수
        int method_value = 10;
        int method_sum = method_value + 20;
        System.out.println("value: " + method_value + ", sum: " + method_sum);
        int v1 = 15;

        // 4-2. if 블록 내에서 선언된 v2 변수
        if (v1 > 10) {                            // if 블록 시작
            int v2;
            v2 = v1 - 10;                        // if 내에서 v1, v2 사용 가능
            System.out.println("v2: " + v2);
        }                                        // if 블록 끝

        // 4-3. method 내에서 새롭게 선언된 v3 변수
        int v3 = v1 + 5;                // if 블록 바깥에서 v1, v3 사용 가능
        // int v3 = v1 + v2 + 5; 		// 컴파일 에러 - v2는 if 블록 내의 로컬 변수이므로 바깥에서 사용 불가능.
        // System.out.println(v2);		// v2는 if 블록 바깥에서 출력도 안되자나용
        System.out.println("v1: " + v1);
        System.out.println("v3: " + v3);


    }   // 여기까지 method block (main())
}   // 여기까지 class block
