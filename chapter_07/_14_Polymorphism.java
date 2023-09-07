package chapter_07;

import chapter_07.camera.Camera;
import chapter_07.camera.FactoryCam;
import chapter_07.camera.SpeedCam;

public class _14_Polymorphism {

    public static void main(String[] args) {
        //다형성

        //class Person : 사람
        //class Student extends Person : 학생 (Student is a person)
        //class Teacher extends Person : 선생님 (Teacher is a person)

        // 부모클래스는 상속하는 자식클래스 만들수 o
        Camera camera = new Camera();
        Camera factoryCam = new FactoryCam();
        Camera speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();

        System.out.println("-------------------------------------------------");

        Camera[] cameras = new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new SpeedCam();

        for (Camera cam :cameras) {
            cam.showMainFeature();
        }

        System.out.println("-------------------------------------------------");

        //      부모 클래스에 있는 메소드만 사용 가능 자식 클래스 메소드 사용 x
//        factoryCam.detectFire();
//        speedCam.checkSpeed();
//        speedCam.recognizeLicensePlate():

        if (camera instanceof Camera) {
            System.out.println("카메라입니다.");
        }

        if(factoryCam instanceof FactoryCam) {
//            (형변환 이름); 객체
           ((FactoryCam)factoryCam).detectFire();
        }

        if (speedCam instanceof SpeedCam) {
            ((SpeedCam) speedCam).checkSpeed();
            ((SpeedCam)speedCam).recognizeLicensePlate();
        }

//        Object[] objs = new Object[3];
//        objs[0] = new Camera();
//        objs[1] = new FactoryCam();
//        objs[2] = new SpeedCam();

    }

}
