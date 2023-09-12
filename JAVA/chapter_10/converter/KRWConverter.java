package chapter_10.converter;

public class KRWConverter implements Convertible {
    @Override
    public void convert(int USD) {
//        1달러는 = 1400원
        System.out.println(USD + " 달러 = " + (USD * 1400) + "원");
    }
}
