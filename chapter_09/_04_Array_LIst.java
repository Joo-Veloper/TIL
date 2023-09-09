package chapter_09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class _04_Array_LIst {
    public static void main(String[] args) {
        // 컬렉션 프레임 워크 (list, set, map)

        ArrayList<String> list = new ArrayList<>();

        // +data
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        //조회 (index)
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));

        System.out.println("-----------------");

        //삭제
        System.out.println("신청 학생 수 (이사 전) :" + list.size());
        list.remove("D");
        System.out.println("신청 학생 수 (이사 후):" + list.size());
        System.out.println(list.get(3));

        System.out.println("-----------------");


        System.out.println("남은 학생 수 (제외 전) : " + list.size());
        list.remove(list.size() - 1);
        System.out.println("남은 학생 수 (제외 후) : "  + list.size());

        // 순회
        for (String s: list) {
            System.out.println(s);
        }

        System.out.println("-----------------");
        
        // 변경
        System.out.println("양도 전 : " + list.get(0));
        list.set(0, "F");
        System.out.println("양도 후 : " + list.get(0));

        System.out.println("-----------------");

        // 확인
        System.out.println(list.indexOf("C"));
        // 포함 여부 확인
        if (list.contains("C")) {
            System.out.println("신청 성공");
        }else {
            System.out.println("신청 실패");
        }
        System.out.println("-----------------");
        // 전체 삭제
        list.clear();
        if (list.isEmpty()) {
            System.out.println("수 : " + list.size());
            System.out.println("Empty list");
        }
        System.out.println("-----------------");


        // 다음 학기
        list.add("C");
        list.add("D");
        list.add("B");
        list.add("E");
        list.add("A");
        // 정렬
        Collections.sort(list);
        for (String s :
                list) {
            System.out.println(s);
        }

//        int [] array = new int[3];
//        array[0] = 1;
//        array[1] = 2;
//        array[2] = 3;
    }
}
