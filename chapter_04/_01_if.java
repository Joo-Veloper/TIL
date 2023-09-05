package chapter_04;

public class _01_if {
    public static void main(String[] args) {
        //조건문 if
        int hour = 15; //오전 10시
//        if ( 조건 )
//            ...수행할 명령 ...
        //1개의 문자만 사용할때는 중괄호 없어도 괜찮음
        if (hour < 14)
            System.out.println("아이스 아메리카노 + 1");
        // 2개 이상의 문자를 사용 할때는 중괄호 필수 사용 !! 중괄호 생략 불가능 !!!
        if (hour < 14) {
            System.out.println("아이스 아메리카노 + 1");
            System.out.println("샷추가");
        }
        System.out.println("커피 주문 완료");


        // 오후 2시 이전, 모닝 커피를 마시지 않은 경우?
        System.out.println("오후 2시 이전, 모닝 커피를 마시지 않은 경우?");
        hour = 10;
        boolean morningCoffee = false ; //모닝 커피
        // if (hour < 14 && morningCoffee == false) { //논리 부정 연산자를 사용하여 == false 가 아닌 !로 사용가능
        if (hour < 14 && !morningCoffee) {
            System.out.println("아이스 아메리카노 + 1");
        }
        System.out.println("커피 주문 완료#1");

        // 오전 2시 이전, 모닝 커피를 마신 경우?
        System.out.println(" 오전 2시 이전, 모닝 커피를 마신 경우?");
        hour = 15;
        boolean Coffee = true ; //모닝 커피
        if (hour < 14 && Coffee == false) {
            System.out.println("아이스 아메리카노 + 1");
        }
        System.out.println("커피 주문 완료#2");

        // 오후 2시 이후이거나 모닝 커피를 마신 경우?
        System.out.println("오후 2시 이후이거나 모닝커피를 마신경우");
        hour = 15;
        morningCoffee = true;
        // if (hour >= 14 || morningCoffee == true) {
        if (hour >= 14 || morningCoffee) {
            System.out.println("아이스 아메리카노 (디카페인) +1");
        }
        System.out.println("커피 주문 완료!#3");

    }

}
