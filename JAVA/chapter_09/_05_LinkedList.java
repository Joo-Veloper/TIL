package chapter_09;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class _05_LinkedList {
    public static void main(String[] args) {
        // Linked List
        LinkedList<String>list = new LinkedList<>();

        // 데이터 추가
        list.add("Java");
        list.add("Python");
        list.add("C+");
        list.add("Ruby");
        list.add("React");

        // 데이터 조회 (인덱스)
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.getFirst()); // 처음 작성 list 조회
        System.out.println(list.getLast());  // 마지막 작성 list 조회
        System.out.println("-----------------------------------------");


        // 추가
        list.addFirst("Spring");  //list 목록중 맨 위로
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("-----------------------------------------");

        list.addLast("Node.js");  //list 목록중 맨 뒤로
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("-----------------------------------------");

        System.out.println("추가 전 : " + list.get(1));
        list.add(1, "Mongo DB");
        System.out.println("추가 후 : " + list.get(1));
        System.out.println("추가 후 : " + list.get(2));
        System.out.println("-----------------------------------------");


        //삭제
        System.out.println("남은 수 (제외 전) : " + list.size());
        list.remove(list.size() - 1);
        System.out.println("남은 수 (제외 후) : " + list.size());


        System.out.println("-----------------------------------------");

        for (String s : list) {
            System.out.println(s);
        }
        // 처음과 마지막 제거
        System.out.println("남은 수 (삭제 전) : " + list.size());
        list.removeFirst(); // 처음 데이터
        list.removeLast();  // 마지막
        System.out.println("남은 수 (삭제 후) : " + list.size());

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("-----------------------------------------");

        // 변경
        list.set(0, "Kotlin");
        System.out.println(list.get(0));

        System.out.println("-----------------------------------------");

        // 확인
        System.out.println(list.indexOf("Python"));
        if(list.contains("Python")) {
            System.out.println("성공");
        }else {
            System.out.println("실패");
        }

        System.out.println("-----------------------------------------");
        // 삭제
        list.clear();
        if (list.isEmpty()) {
            System.out.println("개수 : " + list.size());
            System.out.println("Empty list");
        }
        System.out.println("-----------------------------------------");

        // 정렬
        list.add("Java");
        list.add("Python");
        list.add("C+");
        list.add("Ruby");
        list.add("React");

        Collections.sort(list);
        for (String s:
             list) {
            System.out.println(s);
        }
    }
}
