package chapter_02;

public class _03_operator03 {
    public static void main(String[] args) {
        // 비교 연산자
        System.out.println(5 > 3);// 5는 3보다 크다 참 True 거짓 False
        System.out.println(5 >= 3);//5는 3보다 크거나 같다T
        System.out.println(5 >= 5); // 5는 5보다 크거나 같다T
        System.out.println(5 >= 7); // 5는 7보다 크거나 같다F

        System.out.println(5 < 3); // 5가 3보다 작다F
        System.out.println(5 <= 3); // 5는 3보다 작거나 같다.F


        System.out.println(5 == 5);//5는 5와 같다.T
        System.out.println(5 == 3);//5는 3과 같다. F

        System.out.println(5 != 5);//5는 5와 같지 않다. F
        System.out.println(5 != 3);//5는 3과 같지 않다. T
    }
}
