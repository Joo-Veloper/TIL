package chapter_05;
// 신발사이즈는 250 부터 295 까지 5단위로 증가
// 신발 사이즈 수는 총 10가지

//출력
// 사이즈 250 (재고 있음)
// 사이즈 255 (재고 있음)
//...
// 사이즈 295 (재고 있음)

public class _Quiz_05 {
    //  내가 푼 풀이
    /*public static void main(String[] args) {
        int [] size = new int[10];
        for (int i = 250; i < 296; i+=5) {
            System.out.println("사이즈 " + i + " (재고 있음)");
        }

    }*/
    //해설
    public static void main(String[] args) {
        int[] sizeArray = new int[10];
        for (int i = 0; i < sizeArray.length; i++) {
            sizeArray[i] = 250 + (5 * i);
        }
        for (int size : sizeArray) {
            System.out.println("사이즈 " + size + " (재고 있음) ");
        }
    }
}
