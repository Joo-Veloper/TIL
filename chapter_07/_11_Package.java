package chapter_07;

import java.util.Random;

public class _11_Package {
    public static void main(String[] args) {
        //패키지 (랜덤 클래스)

        Random random = new Random();
        System.out.println("랜덤 정수 : " + random.nextInt()); //Int 범위내에 정수값 반환
        System.out.println("랜덤 정수(범위) : "+random.nextInt(10)); //0 이상 10미만 정수
        System.out.println("랜덤 실수 : " + random.nextDouble());//0.0이상 1.0미만 실수값
//        System.out.println("랜덤 정수(범위) : "+random.nextInt(10)); //0 이상 10미만 정수 // nextDouble 범위 지정 불가
        //5.0이상 10.0미만 실수
        double min = 5.0;
        double max = 10.0;
        System.out.println("랜덤 실수 (범위) : "+(min + (max-min)  * random.nextDouble()));
        System.out.println("랜덤 boolean : " + random.nextBoolean());

        //로또 번호 랜덤 뽑기 1~45
        System.out.println("로또 번호 :" + (random.nextInt(45) + 1));
        // nextInt(45) : 0이상 45 미만
        // nextInt(45) + 1 : 1이상 46미만의 수 = 1이상 45이하의 수

        // Math, Scanner, StringBuilder, StringBuffer, StringTokenizer
        //BigInteger, BigDecimal
        // LocalDate, LocalTime, LocalDateTime, DateTimeFormatter,.


    }
}
