package SelfLearningJava;

public class Chapter0202Types {
    public static void main(String[] args) {
            // 정수 타입 변수

            // 1. Integer Literal (리터럴)
            int in_var1 = 0b1011;        // 2진수				// starting from "0b" or "0B", made up of 0 and 1
            int in_var2 = 0206;        // 8진수				// starting from "0", made up between 0 and 7
            int in_var3 = 365;            // 10진수			// between int(0) and int(9)
            int in_var4 = 0xB3;        // 16진수			// starting from "0x" or "0X", made up between 0 and 9 and A/a and F/f
            int in_var5 = 0x2A0F;        // 16진수

            System.out.println("in_var1: " + in_var1);
            System.out.println("in_var2: " + in_var2);
            System.out.println("in_var3: " + in_var3);
            System.out.println("in_var4: " + in_var4);
            System.out.println("in_var5: " + in_var5);


            // 2. Byte (바이트) - range between -128 and 127
            byte by_var1 = -128;
            byte by_var2 = -30;
            byte by_var3 = 0;
            byte by_var4 = 30;
            byte by_var5 = 127;
            // byte var6 = 128;
            // 컴파일 에러(Type mismatch: cannot covert from int to byte) - 바이트 범위에 벗어나기 때문

            System.out.println(by_var1);
            System.out.println(by_var2);
            System.out.println(by_var3);
            System.out.println(by_var4);
            System.out.println(by_var5);


            // 3. Long (롱)
            long lo_var1 = 10;
            long lo_var2 = 20L;
            // long lo__var3 = 1000000000000;
            // 컴파일 에러: 범위에 벗어나는 값
            long lo_var4 = 1000000000000L;

            System.out.println(lo_var1);
            System.out.println(lo_var2);
            System.out.println(lo_var4);


            // 4. Char (차) - between 0 and 65535 (유니코드)
            char c1 = 'A';          // 문자를 직접 저장		// "A" 유니코드 = 65
            char c2 = 65;            // 십진수로 저장
            char c3 = '\u0041';        // 16진수로 저장

            // 작은 따옴표로 감싼 문자 리터럴은 유니코드로 변환되어 저장
            // char 는 정수 타입이므로 10진수 또는 16진수 형태의 유니코드 저장

            char c4 = '가';            // 문자를 직접 저장		// "가" 유니코드 = 44032
            char c5 = 44032;        // 십진수로 저장
            char c6 = '\uac00';        // 16진수로 저장

            System.out.println(c1);
            System.out.println(c2);
            System.out.println(c3);
            System.out.println(c4);
            System.out.println(c5);
            System.out.println(c6);


            // 5. String (문자열) - 큰 따옴표로 감싸진 문장
            // 큰 따옴표로 감싸진 문장 char 타입 변수 저장 불가
            // String notrue = '이건 문자열 변수에 안되는 값이야 왜냐면 작은 따옴표라서';
            // char stillfalse = '작은 따옴표라고 char 변수에 저장되는 건 아냐 char는 한 글자의 문자만 허용해';
            String name = "홍길동";
            String job = "프로그래머";

            System.out.println(name);
            System.out.println(job);


            // 6. Escape (이스케이프) - backslash "\" 특정 문자 출력 포함 or 제어
            System.out.println("번호\t이름\t직업 ");              // tap space
            System.out.print("행 단위 출력");
            System.out.print("행 단위 출력\n행 단위 출력\n");       // return new line
            System.out.println("우리는 \"개발자;;\" 입니다.");     // print out "developer"
            System.out.print("봄\\여름\\가을\\겨울");             // print out a slash between words

            // 7. Float & Double
            // float f1 = 3.14;		// 컴파일 에러(Type mismatch)
            float f2 = 3.14f;            // should end with F or f
            double d1 = 3.14;
            System.out.println("f2: " + f2);
            System.out.println("d1: " + d1);

            // double 타입이 float 타입보다 정밀도 2배 이상 높아 정확한 데이터 저장 가능
            // 정밀도 확인
            float fl_precision = 0.1234567890123456789f;
            double doub_precision = 0.1234567890123456789;
            System.out.println("fl_precision: " + fl_precision);
            System.out.println("doub_precision: " + doub_precision);

            // E / e 사용
            // 실수 리터럴 - double 타입 실수 변수로 인식
            // 소스 코드에서 소수점 있는 리터럴 = 10진수 실수로 인식
            // 알파벳 E/e 포함된 숫자 리터럴 = 소수점 있는 10진수 실수로 인식
            double d2 = 3e6;
            float f3 = 3e6F;
            double d3 = 2e-3;
            System.out.println("d2: " + d2);
            System.out.println("f3: " + f3);
            System.out.println("d3: " + d3);


            // 8. Boolean
            // boolean stop = true;
            boolean stop = false;
            if (stop) {                                // if stop is true
                System.out.println("중지합니다.");        // print "중지합니다."
            } else {                                // otherwise, stop is false
                System.out.println("시작합니다.");        // print "시작합니다."
            }
            // boolean stop = true; 로 정의하고 run 하면 as stop is true, print "중지 blah"
        }
    }

