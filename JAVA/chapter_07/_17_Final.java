package chapter_07;

import chapter_07.camera.ActionCam;
import chapter_07.camera.SlowActionCam;

public class _17_Final { //(클래스, 변수, 메소드 앞에 final overriding x, 값 변경 x, 클래스 상속 x)

    public static void main(String[] args) {
        //Final
        // public (final) class...
        // public (final) void ...
        // public > abstract > static > final >..
        ActionCam actionCam = new ActionCam();
//        actionCam.lens = "표준렌즈";
        actionCam.recordVideo();
        actionCam.makeVideo();

        System.out.println("------------");

        SlowActionCam slowActionCam = new SlowActionCam();
        slowActionCam.makeVideo();

    }
}
