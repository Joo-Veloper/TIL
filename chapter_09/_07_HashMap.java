package chapter_09;

import java.util.HashMap;

public class _07_HashMap {
    public static void main(String[] args) {
        // Map(Key, Value)
        HashMap<String, Integer> map = new HashMap<>(); // linked 사용시 순서대로 출력

        // 데이터 추가
        map.put("A", 10);
        map.put("B", 5);
        map.put("C", 3);
        map.put("D", 15);

        System.out.println("총 고객 수 : "+ map.size());
        System.out.println("----------------------");

        // 조회
        System.out.println("A point : " + map.get("A"));
        System.out.println("B point : " + map.get("B"));
        System.out.println("C point : " + map.get("C"));
        System.out.println("----------------------");

        // 확인
        if (map.containsKey("D")) {
            int point = map.get("D");
            map.put("D", ++point);

            System.out.println("D의 누적 포인트 : " + map.get("D"));
        }else {
            map.put("D",1);
            System.out.println("D 신규 등록 (point 1)");
        }
        System.out.println("----------------------");


        // 삭제 (key 없으면 null)
        map.remove("A");
        System.out.println(map.get("A"));
        System.out.println("----------------------");
        
        // 전체 삭제
        map.clear();
        
        if (map.isEmpty()) {
            System.out.println("남은 고객 수 : " + map.size());
            System.out.println("파산");
        }
        System.out.println("----------------------");

        map.put("A", 10);
        map.put("B", 5);
        map.put("C", 3);
        map.put("D", 15);

        // key 확인
        for (String key : map.keySet()){
            System.out.println(key);
        }
        System.out.println("----------------------");

        //Value 확인
        for (int value : map.values()) {
            System.out.println(value);
        }
        System.out.println("----------------------");

        // KEY & VALUE 확인
        for (String key : map.keySet()){
            System.out.println("고객 이름 :" + key + "\t포인트 : " + map.get(key));
        }
        System.out.println("----------------------");
        map.put("A", 10);
        map.put("A", 30);
        map.put("A", 50);

        for (String key : map.keySet()) {
            System.out.println("고객 이름 :" + key + "\t포인트 : " + map.get(key));
        }
        System.out.println("-------------------------");
    }
}
