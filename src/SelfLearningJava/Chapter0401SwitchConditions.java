package SelfLearningJava;

public class Chapter0401SwitchConditions {
    public static void main(String[] args) {

        // 1. Switch with break
        int num = (int) (Math.random() * 6) + 1;
        // random 숫자 6개 불러오고 + 1부터 시작하는 값을 = int 타입 변수에 저장
        // Math.random() 을 이용해 double 타입의 난수를 불러 올 때는 0.0 <= Math.random() < 1.0

        switch (num) {      // Switch 문: 변수가 갖는 값에 따라 실행문 선텍 실행
            case 1:
                System.out.println("1번이 나왔습니다.");
                break;
            case 2:
                System.out.println("2번이 나왔습니다.");
                break;
            case 3:
                System.out.println("3번이 나왔습니다.");
                break;
            case 4:
                System.out.println("4번이 나왔습니다.");
                break;
            case 5:
                System.out.println("5번이 나왔습니다.");
                break;
            default:
                System.out.println("6번이 나왔습니다.");
                break;
        }


        // 같은 기능의 if 문 보다 코드가 간결하다는 장점이 있다.
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


        // 2. Switch without break

        int time = (int)(Math.random()*4) + 8;          // 8 <= … < 12 사이의 정수 얻기
        System.out.println("[현재시간: " + time + " 시]");

        switch(time) {
            case 8:
                System.out.println("출근합니다.");
            case 9:
                System.out.println("회의를 합니다.");
            case 10:
                System.out.println("업무를 봅니다.");
            default:
                System.out.println("외근을 나갑니다.");
        }       // break가 없기 때문에 주사위 8일 경우 case 8 부터 default 까지 해당하는 실행문이 실행됨.
                // case int time > 10 부터는 default case 의 실행문이 실행된다.


        // 3. Switch char
        char grade = 'B';

        switch(grade) {
            case 'A':
            case 'a':
                System.out.println("우수 회원입니다.");    // A or a 이면
                break;
            case 'B':
            case 'b':
                System.out.println("일반 회원입니다.");    // B or b 이면
                break;
            default:
                System.out.println("손님입니다.");       // 그 외 다른 char 타입 알파벳이면
        }


        // 4. Switch String
        String position = "과장";

        switch(position) {
            case "부장":
                System.out.println("700만원");
                break;
            case "과장":
                System.out.println("500만원");
                break;
            default:
                System.out.println("300만원");
        }
    }
}
