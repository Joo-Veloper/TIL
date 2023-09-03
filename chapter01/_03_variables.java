package chapter_01;

public class _03_variables {
    public static void main(String[] args) {
        //여러개 문자를 사용하기 위한 String
        String name = "자바";
        //정수형 변수
        int hour = 15;

        System.out.println(name +"님 배송이 시작됩니다."+ hour + "시 방문 예정입니다.");
        System.out.println(name +"님 배송이 완료되었습니다.");

        //실수값
        double score = 90.5;

        //하나의 문자열 사용할때는 char
        char grade = 'A';
        name = "강백호";//값을 업데이트 할 수 있다.
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은" + grade + "입니다.");

        //참과 거짓 값을 가지는 boolean
        boolean pass = true; // true 또는 false 값을 가집니다.
        System.out.println("이번 시험에 함격했을까요?" + pass);

        //실수를 표현하는 변수
        double d = 3.14123456789; //모든 소수점 자리 나옮 (정밀한 계산가능)
        float f = 3.14123456789F;// 6까지 만 출력

        System.out.println(d);
        System.out.println(f);

        //long 형 자료형 변수
        //int로 숫자가 길때 long 변수 사용 (int 범위 -21억~+21억 ) 그 이상이면 long 함수!
        long l = 1000000000000l;
        l=1_000_000_000_000l;
        System.out.println(l);
    }
}
