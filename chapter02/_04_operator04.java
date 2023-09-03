package chapter_02;

public class _04_operator04 {
    public static void main(String[] args) {
        //논리 연산자
        boolean 김치찌개 = true;
        boolean 계란말이 = true;
        boolean 제육볶음 = true;

        System.out.println(김치찌개 || 계란말이 || 제육볶음); //or = ||
        //하나라도 True 이면 true
        System.out.println(김치찌개 && 계란말이&& 제육볶음); // 모두 true 이면 true

        //And연산
        System.out.println((5 > 3) && (3 > 1)); // 둘다 맞아야 true 한개라도 틀리면 false
        System.out.println((5 > 3) && (3 < 1));// 둘다 맞아야 true 한개라도 틀리면 false

        //or 연산
        System.out.println((5 > 3) || (3 > 1));//둘중 한개라도 만족하면 true
        System.out.println((5 > 3) || (3 < 1));//5는 3보다 크거나, 3든 1보다 작다
        System.out.println((5 < 3) || (3 < 1));//5는 3보다 작거나, 3은 1보다 작다


//        System.out.println((1 < 3 < 5)); //불가능한 코드

        //논리 부정 연산자
        System.out.println(!true); //false
        System.out.println(!false); //true
        System.out.println(!(5 == 5));//false
        System.out.println(!(5==3)); //true


    }
}
