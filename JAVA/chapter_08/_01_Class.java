package chapter_08;

import chapter_08.Camera.Camera;
import chapter_08.Camera.FactoryCam;
import chapter_08.Camera.SpeedCam;

public class _01_Class {
    public static void main(String[] args) {
        //데이터 추상화 (Data Abstraction)
        // abstract
        // 추상 클래스 (미완성 클래스) 객체로 사용 불가!
        // 추상 메소드 (추상 클래스 또는 인터페이스에서 사용 가능한 껍데기만 있는 메소드)

        // Camera camera = new Camera();
        Camera factoryCam = new FactoryCam();
        factoryCam.showMainFeature();

        Camera speedCam = new SpeedCam();
        speedCam.showMainFeature();
    }
}
