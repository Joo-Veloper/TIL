package chapter_09;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class _06_HashSet {
    public static void main(String[] args) {
        // Set
        HashSet<String> set = new HashSet<>();

        // 데이터 추가
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Java");
        set.add("Node.js");
        set.add("Spring");
        set.add("MySQL");
        set.add("Maria DB");

        System.out.println("총 상품 수 : " + set.size());

        // 순회
        for (String s : set) {
            System.out.println(s);
        }
        System.out.println("-----------------------------");
        // 확인
        if (set.contains("Java")) {
            System.out.println("Java 시작");
        }
        System.out.println("-----------------------------");
        // 삭제
        System.out.println("총 상품 수 (구매 전) : " + set.size());
        set.remove("Java");
        System.out.println("총 상품 수 (구매 후) : " + set.size());

        System.out.println("-----------------------------");

        // 전체 삭제
        set.clear();
        if (set.isEmpty()) {
            System.out.println("남은 구매 상품 수 :" + set.size());
            System.out.println("출발");
        }
        System.out.println("-----------------------------");

        // 세트 : 중복 허용 x, 순서 보장 x
        HashSet<Integer> intSet = new HashSet<>();
        intSet.add(1);
        intSet.add(13);
        intSet.add(2);

        for (int i : intSet) {
            System.out.println(i);
        }

        System.out.println("-----------------------------");

        // list 작성 순서 보장이 필요할 때
        HashSet<Integer> intset = new LinkedHashSet<>();
        intset.add(1);
        intset.add(13);
        intset.add(2);

        for (int i : intset) {
            System.out.println(i);
        }
    }
}
