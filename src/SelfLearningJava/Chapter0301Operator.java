package SelfLearningJava;

public class Chapter0301Operator {
    public static void main(String[] args) {

        // 1. Sign - So basic~~ so easy~~
        int a = -100;
        int result1 = +a;
        int result2 = -a;

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);


        // 2. Addition & Subtraction
        // 증감연산자. boolean 타입 외 모든 기본 타입 피연산자에 사용 가능.
        int x = 10, y = 10;
        int z;

        System.out.println("x = " + x);         // 10
        x++;
        System.out.println("x++;    = " + x);   // 11
        ++x;
        System.out.println("++x;    = " + x);   // 12
        /* 새로운 변수에 저장하지 않은 상태라면
        * 플러스의 위치가 앞에 있던 뒤에 있던 동일하게 1만큼 증가한다. */

        System.out.println("y = " + y);         // 10
        y--;
        System.out.println("y--;    = " + y);   // 9
        --y;
        System.out.println("--y;    = " + y);   // 8
        /* 덧셈과 마찬가지로 뺄셈 역시 마이너스 위치에 상관없이
        * 동일하게 1만큼 감소한다. */

        z = ++x;
        System.out.println("z = ++x;    z = " + z);   // 13
        System.out.println("z = ++x;    x = " + x);   // 13
        System.out.println("x = " + x);             // 13
        /* ++x 를 변수 z에 저장한다면 z 에 저장된 값도 기존 x 깂인 12에서
        * 1만큼 증가한 값인 13 이고
        * 변수 x 의 값도 1만큼만 증가한 값인 13이 저장된다. */

        z = x++;
        System.out.println("z = x++;    z = " + z);   // 13
        System.out.println("z = x++;    x = " + x);   // 14
        System.out.println("x = " + x);             // 14
        /* x++ 를 변수 z 에 저장한다면
        * z 에 저장된 값이 ++x 를 저장했을 때와 동일한 값인 13을 갖는다.
        * 1만큼 증가하지 않았다.
        * 변수 x 에 저장된 값은 1만큼 증가하여 14가 저장되었다. */

        z = ++x + y++;
        System.out.println("z = ++x + y++;  z = " + z);
        System.out.println("z = ++x + y++;  x = " + x);
        System.out.println("z = ++x + y++;  y = " + y);
        /* 현재까지 결과적으로 x = 14, y = 8
        * (++x + y++) 값을 변수 z 에 저장한다면 z = 23 (15 + 8),
        * 왜냐하면 ++x 의 경우 연산식 내에서 x + 1, 따라서 ++x = 15
        * y++ 의 경우 연산식 내에서 y, 따라서 기존 y 값인 8이 그대로 온다.
        * x 값을 출력할 시, 연산식 내에서 x + 1이 적용된 값인 15가 x 에 저장되었기 때문에
        * x 값으로 15 반환된다.
        * y 의 경우 연산식 내에서 y++ = y 였으나
        * y 값을 출력할 시 y++가 적용된 값인 9가 y 에 저장되어
        * y 값으로 9가 출력된다. */

        /* 추가 설명..
        * z = ++x + y++ 계산 순서
        * x + 1 = x
        *         x + y = z
        *                   y = y++; */

        /*
        연산식 내에서는 연산자의 위치가 앞에 있느냐 뒤에 있느냐에 따라 결과가 달라진다.
        * 연산식 내에서의
        * ++x = (x + 1)
        * x++ = x
        * */


        // 3. Boolean 을 이용한 비교와 논리
        // 3-1. 비교
            // == != > < >= <= instanceof
        boolean play = true;
        System.out.println((play)); // true

        play = !play;               // play is not play (not true)
        System.out.println(play);   // false

        play = !play;               // play is not (not play) (not false)
        System.out.println(play);   // true
        // (!)에 대한 단순 설명 : 피연산자가 true 면 false 산출, false 면 true 산출.

        int int_result = x + y;
        boolean bool_result = (x + y) < 5;
        System.out.println("(x + y) < 5     " + bool_result);

        // 연산은 우선선위에 따라 수행된다. * 단항 - 이항 - 삼항 * 산술 - 비교 - 논리 - 대입 *
        bool_result = x > 0 && y < 0;
                    // x > 0 True
                    // y < 0 False
                    // True && False = False
        System.out.println("x > 0 && y < 00     " + bool_result);

        // 우선순위가 같다면 왼쪽에서 오른쪽으로 수행된다.
        int_result = 100 * 2 / 3 % 5;
        System.out.println(int_result);
            // 예외: 대입 연산자 (오른쪽에서 왼쪽으로 수행)
            // a = b = c = 5;

        // 괄호를 이용해 우선순위 지정할 수 있다.
        int var1 = 1;
        int var2 = 2;
        int var3 = 3;
        int_result = var1 + var2 * var3;
        System.out.println(int_result);     // 7
        int_result = (var1 + var2) * var3;
        System.out.println(int_result);     // 9


        // 3-2. Deny Logic Operator (논리 부정  연산자)
            // ! & | && ||


        // 4. Arithmetic Operators
        int v1 = 5;
        int v2 = 2;
        int result4 = v1 / v2;          // 나눈 값. int 타입이니까 소수점 아래 자리 생략하기
        System.out.println("result4 = " + result4);
        int result5 = v1 % v2;          // 나누고 남은 나머지
        System.out.println("result5 = " + result5);
        double result6 = (double) v1 / v2;
            /* 소수점 표현하고 싶으면 double 타입 변수에 연산식 저장
            + int 타입 double 타입 변수로 변환 */
        System.out.println("result6 = " + result6);


        // 5. Char Operator
        char c1 = 'A' + 1;
        char c2 = 'A';
        //char c3 = c2 + 1;    //컴파일 에러
        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        //System.out.println("c3: " + c3);


        // 6. String Concat
        String str1 = "JDK" + 6.0;
        String str2 = str1 + " 특징";
        System.out.println(str2);

        String str3 = "JDK" + 3 + 3.0; // 앞에서부터 concat 되서 JDK3 + 3.0 = JDK33.0
        String str4 = 3 + 3.0 + "JDK"; // 앞에서부터 더하니까 3 + 3.0 = 6.0JDK
        System.out.println(str3);
        System.out.println(str4);


    }
}
