package SelfLearningJava;

public class Chapter0203TypeTransformation {

    public static void main(String[] args) {
        // 핵심 키워드: 자동 타입 변환, 강제 타입 변환, 문자열 결합 연산
        // Integer.parselnt(), Double.parseDouble()

        // 타입 변환: 다른 데이터 타입으로의 변환
        //   byte to int / int to byte / double to int / String to int ...
        // 변수 값을 다른 타입 변수에 저장할 때 타입 변환 발생
        byte a = 10;    // byte 타입 변수 a 에 10 저장
        int b = a;      // int 타입 변수 b 에 변수 a 에 저장된 10 복사 및 저장


        // 1. Promotion (자동 타입 변환) - 값의 허용 범위가 작은 타입이 큰 타입으로 저장될 경우
        // 기본 타입의 허용 범위 순서
        // byte < short < int < long < float < double
        // byte to int
        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println("intValue: " + intValue);

        // byte to char
        // byteValue = 65;
        // charValue = byteValue; // compile error

        // char to int
        char charValue = '가';   // '가'의 유니코드 값이 출력될 변수 선언
        intValue = charValue;   // char 변수에 저장된 '가'의 유니코드 값이 int 타입 변수에 저장
        System.out.println("\"가\"의 유니코드: " + intValue);

        // int to long
        intValue = 50;
        long longValue = intValue;
        System.out.println("longValue: " + longValue);

        // long to float
        longValue = 100;
        float floatValue = longValue;
        System.out.println("floatValue: " + floatValue);

        // float to double
        floatValue = 100.5F;
        double doubleValue = floatValue;
        System.out.println("doubleValue:" + doubleValue);


        // 2. Casting (강제 타입 변환) - 값의 허용 범위가 큰 것에서 작은 것으로 강제로 나누어 한 조각만 저장
        // 캐스팅 연산자 괄호() 사용. 나뉘는 단위.
        // byte < short < int < long < float < double

        // int to byte
        intValue = 10;
        byteValue = (byte) intValue;    // int 변수를 byte 변수로 강제 변환할 때 (type)
        System.out.println("byteValue: " + byteValue);

        // int to char
        intValue = 65;
        charValue = (char) intValue;
        System.out.println("charValue: " + charValue);

        intValue = 44032;
        charValue = (char) intValue;
        System.out.println("charValue: " + charValue);

        // long to int
        longValue = 500;
        intValue = (int) longValue;
        System.out.println("intValue: " + intValue);

        // double to int
        doubleValue = 3.14;
        intValue = (int) doubleValue;
        System.out.println("intValue: " + intValue);


        // 3. 정수 연산에서의 자동 타입 변환
        // byte, char, short 타입 변수 -> int 타입 변수 자동 변환
        // (char + char) (byte + byte) (short + short) (int + int) 연산식 결과 = int 타입

        // 3-1. Byte Operation : byte + byte = int
        byte result1 = 10 + 20;
        System.out.println("10 + 20 = " + result1);

        byte x = 10;
        byte y = 20;
        // byte result2 = x + y;        // compile error
        int result2 = x + y;
        System.out.println("byte + byte = int " + result2);
        // 특별한 경우가 아니라면 정수 연산에 사용하는 변수는 int 타입을 사용해주는 게 좋다.

        // 3-2. Long Operation : long + byte + int = long
        // 피연산자 하나가 long 타입이면 다른 피연산자도 long 타입으로 자동 변환
        byteValue = 10;
        intValue = 100;
        longValue = 1000L;
        long longResult = byteValue + intValue + longValue;
        System.out.println("byte + int + long = long " + longResult);

        // 3-3. Promotion Operations

        // byte + byte = int
        byte byteValue1 = 10;
        byte byteValue2 = 20;
        //byte byteValue3 = byteValue1 + byteValue2;   //컴파일 에러
        int intValue1 = byteValue1 + byteValue2;
        System.out.println(intValue1);

        // char + char = int
        char charValue1 = 'A';
        char charValue2 = 1;
        System.out.println("charValue1=" + charValue1);
        System.out.println("charValue2=" + charValue2);
        //char charValue3 = charValue1 + charValue2;   //컴파일 에러
        int intValue2 = charValue1 + charValue2;
        System.out.println("charValue1 + charValue2 = " + intValue2);
        System.out.println("유니코드 = " + intValue2);
        System.out.println("출력문자 = " + (char)intValue2);

        // int / int = int
        int intValue3 = 10;
        int intValue4 = intValue3/4;
        System.out.println("int / int = int " + intValue4);


        // 4. 실수 연산에서의 자동 타입 변환

        // 4-1. int + double = double
        // 피연산자 하나가 double 타입이면 다른 하나도 double 타입으로 바뀜
        intValue = 10;
        doubleValue = 5.5;
        double result3 = intValue + doubleValue;
        // 15.5 출력
        System.out.println("int + double = double " + result3);

        intValue = 20;
        doubleValue = 15.5;
        int result4 = intValue + (int)doubleValue;
        // int 타입으로 연산 결과값을 저장하려면 double 타입 변수 앞에 (int) 지정,
        // 소수점 아래는 삭제되어 결과값으로 35 출력
        System.out.println("int + (int)double = int " + result4);

        // 4-2. 정수 연산의 결과를 실수 (double/ float)으로 저장할 때 주의점
        intValue1 = 1;
        intValue2 = 2;
        double result5 = intValue1 / intValue2;
        System.out.println("int/int = int " + result5);
        // 정수 연산의 결과는 정수. 0.0 출력됨.
        // 실수 결과를 얻으려면 아래 3 가지 방법을 통해 실수 연산으로의 변환 필수.
        // double result5 = (double) intValue1 / intValue2;
        // double result5 = intValue1 / (double) intValue2;
        // double result5 = (double) intValue1 / (double) intValue2;


        // 5. (+) "plus" 연산
        // + 연산은 앞에서부터 순차적으로 진행된다.
        intValue = 10 + 2 + 8;
        System.out.println("intValue: " + intValue);

        // 5-1. String Concat - (+) "plus" 연산에서의 문자열 자동 타입 변환
        String str1 = 10 + 2 + "8";
        System.out.println("str1: " + str1); // 128

        String str2 = 10 + "2" + 8;
        System.out.println("str2: " + str2); // 1028

        String str3 = "10" + 2 + 8;
        System.out.println("str3: " + str3); //1028

        String str4 = "10" + (2 + 8);
        System.out.println("str4: " + str4); // 1010


        // 6. Primitive and String Conversation
        // 문자열을 기본 타입으로 강제 변환 Type.parseType() 사용

        // String to byte
        String str = "10";
        byteValue = Byte.parseByte(str);
        System.out.println(byteValue);

        // String to short
        str = "500";
        short shortValue = Short.parseShort(str);
        System.out.println(shortValue);

        // String to int
        str = "300000";
        intValue = Integer.parseInt(str);
        System.out.println(intValue);

        // String to long
        str = "400000000000";
        longValue = Long.parseLong(str);
        System.out.println(longValue);

        // String to float
        str = "12.345";
        floatValue = Float.parseFloat(str);
        System.out.println(floatValue);

        // String to double
        doubleValue = Double.parseDouble(str);
        System.out.println(doubleValue);

        // String to boolean
        str = "true";
        boolean boolValue = Boolean.parseBoolean(str);
        System.out.println(boolValue);

        // String 타입의 변수가 없어도 괄호에 문자열 값을 넣어주면 기본 타입으로 강제 변환이 가능하다.
        int     value1 = Integer.parseInt("10");
        double  value2 = Double.parseDouble("3.14");
        boolean value3 = Boolean.parseBoolean("true");

        System.out.println("value1: " + value1);
        System.out.println("value2: " + value2);
        System.out.println("value3: " + value3);

        // 6-1. 문자열이 숫자 외 요소를 포함할 경우
        // str = "1a";
        // intValue = Integer.parseInt(str);
        // System.out.println(intValue);    //NumberFormatException 발생

        // 6-2. 기본 타입을 문자열로 변환 String.valueOf() 사용
        str1 = String.valueOf(10);
        str2 = String.valueOf(3.14);
        str3 = String.valueOf(true);

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);

    }
}
