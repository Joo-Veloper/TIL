package chapter_12;

import chapter_12.clean.CleanThread;

import static chapter_12.clean.CleanThread.cleanByBoss;

public class _01_Thread {
    public static void main(String[] args) {
        //하나의 프로세스
        //쓰레드

        //1 3 5 7 9
        //2 4 6 8 10

//        cleanBySelf();
        CleanThread cleanThread = new CleanThread();
//        cleanThread.run(); //직원청소
        cleanThread.start();

        cleanByBoss(); // 사장청소

    }
    public static void cleanBySelf(){
        System.out.println("혼자 청소 시작");
        for (int i = 0; i <= 10  ; i++) {
            System.out.println("(혼자) " + i + "번방 청소중");
        }
        System.out.println("--혼자 청소 끝--");
    }

}
