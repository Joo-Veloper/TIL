package chapter_12.clean;

public class CleanThread extends Thread {
    public void run() {
        System.out.println("-- 직원 청소 시작 (Thread) --");
        for (int i = 2; i <= 10  ; i += 2) {
            System.out.println("(직원) " + i + "번방 청소 중 (Thread)");
        }
        System.out.println("--직원 청소 끝- (Thread)-");

    }
    public static void cleanByBoss(){
        System.out.println("사장 청소 시작");
        for (int i = 1; i <= 10  ; i+=2) {
            System.out.println("(사장) " + i + "번방 청소중");
        }
        System.out.println("--사장 청소 끝--");
    }
}
