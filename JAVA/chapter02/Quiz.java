package chapter_02;

public class Quiz {
    public static void main(String[] args) {
        int height = 115;
        String result =((height>=120)?"탑승가능합니다.":"탑승 불가능합니다.");
        System.out.println("키가"+height+"cm 이므로" + result);


    }
}
