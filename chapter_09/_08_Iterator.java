package chapter_09;

import java.util.*;

public class _08_Iterator {
    public static void main(String[] args) {
        // Iterator
        List<String> list = new ArrayList<>();
//        List<String> list2 = new LinkedList<>();
        list.add("A");
        list.add("(알 수 없음)");
        list.add("B");
        list.add("(알 수 없음)");
        list.add("C");
        list.add("(알 수 없음)");
        list.add("D");
        list.add("(알 수 없음)");
        list.add("E");

        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("--------------------");

        Iterator<String> it = list.iterator();
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());


        // 모든 데이터 출력
        System.out.println("--------------------");
        it = list.iterator();// 커서 처음위치 이동
        while (it.hasNext()){
            System.out.println(it.next());
        }


        System.out.println("--------------------");

        // 삭제된 데이터 빼고 출력
        it = list.iterator();
        while (it.hasNext()){
            String s = it.next();
            if (s.contains("(알 수 없음)")) {
                it.remove();
            }
        }
        it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("--------------------");

        HashSet<String> set = new HashSet<>();
        set.add("Spring");
        set.add("Node");
        Iterator<String> itSet = set.iterator();
        while (itSet.hasNext()) {
            System.out.println(itSet.next());
        }
        System.out.println("--------------------");

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Spring",10);
        map.put("Node",5);

//        map.iterator() // 제공되지않음
        Iterator<String> itMapKey = map.keySet().iterator();
        while (itMapKey.hasNext()){
            System.out.println(itMapKey.next());
        }
        System.out.println("--------------------");

        Iterator<Integer> itMapValue = map.values().iterator();
        while (itMapValue.hasNext()){
            System.out.println(itMapValue.next());
        }
        System.out.println("--------------------");

        Iterator<Map.Entry<String, Integer>> itMap = map.entrySet().iterator();
        while (itMap.hasNext()) {
            System.out.println(itMap.next());
        }
    }
}
