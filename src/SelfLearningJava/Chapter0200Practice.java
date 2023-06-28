package SelfLearningJava;

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
    }
}
