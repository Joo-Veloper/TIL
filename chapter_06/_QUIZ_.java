package chapter_06;
//substring 사용하면 문자열 자를수 있음
//length()를 이용하면 문자열의 길이를 알 수 있음
public class _QUIZ_ {
    public static String getHiddenData(String data, int index){
        String hiddenData = data.substring(0, index);
        for (int i = 0; i < data.length() - index; i++) {
            hiddenData += "*";
        }
        return hiddenData;
    }
    public static void main(String[] args) {
        String name = "박승주";
        String id = "123456-789101";
        String number = "010-1234-5678";

        System.out.println("이름 " + getHiddenData(name, 1));
        System.out.println("주민등록번호 " + getHiddenData(id, 8));
        System.out.println("번호 " + getHiddenData(number, 9));
    }

}
