package chapter_08;

import chapter_08.Camera.FactoryCam;
import chapter_08.Reporter.NormalReporter;
import chapter_08.Reporter.Reportable;
import chapter_08.Reporter.VideoReporter;
import chapter_08.detectable.AdvancedFireDetector;
import chapter_08.detectable.Detectable;
import chapter_08.detectable.FireDetector;

public class _02_Interface {
    public static void main(String[] args) {
        // 인터페이스
        // 단일 상속 (extends)

        Reportable normalReporter = new NormalReporter();
        normalReporter.report();

        Reportable videoReporter = new VideoReporter();
        videoReporter.report();

        System.out.println("-------------------");

        Detectable fireDetector = new FireDetector();
        fireDetector.detect();

        Detectable advancedFireDetector = new AdvancedFireDetector();
        advancedFireDetector.detect();

        System.out.println("-------------------");

        FactoryCam factoryCam = new FactoryCam();
//        factoryCam.setDetector(fireDetector);
//        factoryCam.setReporter(normalReporter);
        factoryCam.setDetector(advancedFireDetector);
        factoryCam.setReporter(videoReporter);

        factoryCam.detect();
        factoryCam.report();

    }
}
