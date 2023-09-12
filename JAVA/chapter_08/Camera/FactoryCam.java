package chapter_08.Camera;

import chapter_08.Reporter.Reportable;
import chapter_08.detectable.Detectable;

public class FactoryCam extends Camera implements Detectable, Reportable {

    private Detectable detector; //private 외부에서 바로 접근 x
                                //public 은 가능
    private Reportable reporter;

    public void setDetector(Detectable detector) {
        this.detector = detector;
    }

    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }

    @Override
    public void showMainFeature() {
        System.out.println("화재 감지");
    }

     @Override
    public void detect() {
        detector.detect();

    }

    @Override
    public void report() {
        reporter.report();

    }
}
