package chapter_09.COFFEE;

public class CoffeeByName {

    public Object name;

    public CoffeeByName(Object name) {
        this.name = name;
    }
    public void ready() {
        System.out.println(" 커피 주문 완료 : " + name);
    }
}
