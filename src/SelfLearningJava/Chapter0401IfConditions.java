package SelfLearningJava;

public class Chapter0401IfConditions {
    public static void main(String[] args) {

        // 1. if
        int score = 93;

        if(score >= 90) {                              // 조건문
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A 입니다.");       // 조건문이 True 이면 실행하는 실행문
        }
        if(score < 90) {
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("등급은 B 입니다.");
        }


        // 2. it - else
        score = 85;

        if(score >= 90) {                           // 조건문 True 일 때 실행
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A 입니다.");
        } else {                                    // 조건문 False 일 때 실행
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("등급은 B 입니다.");
        }


        // 3. if - else if - else if - else
        score = 75;

        if(score >= 90) {
            System.out.println("점수가 100 ~ 90 입니다.");
            System.out.println("등급은 A 입니다.");
        } else if(score >= 80) {
            System.out.println("점수가 80 ~ 89 입니다.");
            System.out.println("등급은 B 입니다.");
        } else if(score >= 70) {
            System.out.println("점수가 70 ~ 79 입니다.");
            System.out.println("등급은 C 입니다.");
        } else {
            System.out.println("점수가 70 미만 입니다.");
            System.out.println("등급은 D 입니다.");
        }

        // 4. if dice
        int num = (int)(Math.random()*6) + 1;
                // random 숫자 6개 불러오고 + 1부터 시작하는 값을 = int 타입 변수에 저장
                // Math.random() 을 이용해 double 타입의 난수를 불러 올 때는 0.0 <= Math.random() < 1.0
        if(num == 1) {
            System.out.println("1번이 나왔습니다.");
        } else if(num == 2) {
            System.out.println("2번이 나왔습니다.");
        } else if(num == 3) {
            System.out.println("3번이 나왔습니다.");
        } else if(num == 4) {
            System.out.println("4번이 나왔습니다.");
        } else if(num == 5) {
            System.out.println("5번이 나왔습니다.");
        } else {
            System.out.println("6번이 나왔습니다.");
        }
    }
}
