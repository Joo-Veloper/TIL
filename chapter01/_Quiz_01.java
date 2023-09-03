package chapter_01;

/*
(실행결과)
상암 08번 버스
약 3 분후 도착
남은 거리 1.2KM
*/

public class _Quiz_01 {
    public static void main(String[] args) {
        String bus_Number = ("상암 08 버스");
        System.out.println(bus_Number);
        int minute = 3;
        System.out.println("약"+minute+"분 후 도착");

        double distance = 1.2;
        System.out.println("남은 거리"+distance+"KM");
    }
}
