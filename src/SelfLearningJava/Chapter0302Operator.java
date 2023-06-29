package SelfLearningJava;

public class Chapter0302Operator {
    public static void main(String[] args) {
        // 1. 비교와 논리


        // 1-1. 비교
        // == != > < >= <= instanceof
        int x = 10;
        int y = 10;

        int int_result = x + y;
        boolean bool_result = (x + y) < 5;
        System.out.println("(x + y) < 5     " + bool_result);

        int num1 = 10;
        int num2 = 10;
        boolean boolresult1 = (num1 == num2);
        boolean boolresult2 = (num1 != num2);
        boolean boolresult3 = (num1 <= num2);
        System.out.println("boolresult1" + boolresult1);
        System.out.println("boolresult2" + boolresult2);
        System.out.println("boolresult3" + boolresult3);

        char char1 = 'A';
        char char2 = 'B';
        boolean boolresult4 = (char1 < char2);
        System.out.println("result4=" + boolresult4);

        int v2 = 1;
        double v3 = 1.0;
        System.out.println(v2 == v3);   //true

        double v4 = 0.1;
        float v5 = 0.1f;
        System.out.println(v4 == v5);                       //false
        // double 타입과 float 타입은 같지 않다.
        System.out.println((float) v4 == v5);                //true
        // double 타입을 float으로 변환해 타입을 일치시켜야만 동일한 값을 가진다고 말할 수 있다.
        System.out.println((int) (v4 * 10) == (int) (v5 * 10)); //true


        // 1-2. Deny Logic Operator (논리 부정 연산자)
        // ! & | && ||
        boolean play = true;
        System.out.println((play)); // true

        play = !play;               // play is not play (not true)
        System.out.println(play);   // false

        play = !play;               // play is not (not play) (not false)
        System.out.println(play);   // true
        // (!)에 대한 단순 설명 : 피연산자가 true 면 false 산출, false 면 true 산출.


        // 1-3. Logical Operator
        int charCode = 'A';

        if ((charCode >= 65) & (charCode <= 90)) {
            System.out.println("대문자 이군요");          // 65 ~ 90 사이 char 유니코드 = 대문자
        }
        if ((charCode >= 97) && (charCode <= 122)) {
            System.out.println("소문자 이군요");          // 97 ~ 122 사이 char 유니코드 = 소문자
        }
        if (!(charCode < 48) && !(charCode > 57)) {
            System.out.println("0~9 숫자 이군요");       // 48 미만 57 초과 char = 0 ~ 9 사이의 숫자
        }

        int value = 6;

        if ((value % 2 == 0) | (value % 3 == 0)) {
            System.out.println("2 또는 3의 배수 이군요");       // 2로 나누었을 때 나머지가 0 OR 3으로 나누었을때 나머지가 0
        }

        if ((value % 2 == 0) || (value % 3 == 0)) {         // | == || == OR
            System.out.println("2 또는 3의 배수 이군요");
        }


        // 2. 조건문
        int score = 85;
        char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
        /* score 가 90 초과하면 (true case)
        * 피연산자 'A' 선택
        * score 가 90 이하라면 (false case)
        * 콜론 (:) 뒤의 조건을 선택
        *                               score 가 90 이하 + 80 초과라면 (true case)
        *                               피연산자 'B' 선택
        *                               80 이하라면 (false case)
        *                               'C' 선택 */
        System.out.println(score + "점은 " + grade + "등급입니다.");

    }
}
