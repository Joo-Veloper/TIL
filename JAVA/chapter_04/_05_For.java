package chapter_04;

public class _05_For {
    public static void main(String[] args) {
        // 반복문
        // 나코 매장
        System.out.println("어서오세요. 나코입니다.");
        // 또다른 손님이 들어오면?
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        //만약에 인사 법이 바뀌면?
        System.out.println("환명합니다. 나코입니다.");
        System.out.println("환명합니다. 나코입니다.");
        System.out.println("환명합니다. 나코입니다.");
        //매장 이름이 바뀌면?
        // 나코 -> 코나
        System.out.println("환영합니다. 코나입니다.");
        System.out.println("환영합니다. 코나입니다.");
        System.out.println("환영합니다. 코나입니다.");

        System.out.println("----반복문 사용 ----");

        //반복문 사용 For
//        for (선언;조건;증감) {
//              ..수행 명령..
//        }
        for (int i = 0; i < 10; i++ ) {
//            System.out.println("어서오에서요. 나코입니다." + i);
//            System.out.println("환영합니다. 나코입니다." + i);
            System.out.println("환영합니다. 코나입니다." + i);

        }

        // 짝수만 출력(for i만 찍고 enter)

        for (int i = 0; i < 10; i += 2 ) {
            System.out.print(i); // println에 ln 없으면 줄바꿈 없이 출력!
        }
        System.out.println();
        // 홀수만 출력
        // 13579
        for (int i = 1; i < 10; i+=2) {
            System.out.print(i);
        }

        System.out.println();

        // 거꾸로 숫자 출력
        // 5,4,3,2,1
        for (int i = 5; i > 0 ; i--) {
            System.out.print(i);
        }

        //1부터 10까지의 수들의 합
        // 1 + 2 + ... + 10 = 55
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.println("현재까지 총합은 " +sum+"입니다.");

        }
        System.out.println("1부터 10까지의 모든 수의 총합은" + sum + "입니다.");
    }
}
