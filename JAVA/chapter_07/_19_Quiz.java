package chapter_07;


public class _19_Quiz {
    public static void main(String[] args) {
        HamBurger[] hamBurgers = new HamBurger[3];
        hamBurgers[0] = new HamBurger();
        hamBurgers[1] = new CheeseBurger();
        hamBurgers[2] = new ShrimpBurger();
        System.out.println("주문하신 메뉴를 만듭니다.");
        System.out.println("---------------");
        for (HamBurger hamBurger : hamBurgers) {
            hamBurger.cook();
            System.out.println("----------------");
        }
        System.out.println("메뉴 준비가 완료되었습니ㅏㄷ.");
    }


}
// 재료 HamBurger (양상추, 패티, 피클)
class HamBurger {
    public String name;

    public HamBurger() {
        this("햄버거");
    }


    public HamBurger(String name) {
        this.name = name;
    }

    public void cook(){
        System.out.println(this.name + "를 만듭니다.");
        System.out.println("빵 사이에 들어가는 재료는?");
        System.out.println("> 양상추");
        System.out.println("+ 패티 ");
        System.out.println("+ 피클");
    }

}
// CheeseBurger( 양상추, 패티, 피클 + 치즈)
class CheeseBurger extends HamBurger {
    public CheeseBurger() {
        super("치즈버거");
    }

    public void cook(){
        System.out.println(this.name + "를 만듭니다.");
        System.out.println("빵 사이에 들어가는 재료는?");
        System.out.println("> 양상추");
        System.out.println("+ 패티 ");
        System.out.println("+ 피클");
        System.out.println("+ 치즈");
    }

}
// ShrimpBurger (양상추, 패티, 피클 +새우)
class ShrimpBurger extends HamBurger {
    public ShrimpBurger() {
        super("새우버거 ");
    }

    public void cook(){
        System.out.println(this.name + "를 만듭니다.");
        System.out.println("빵 사이에 들어가는 재료는?");
        System.out.println("> 양상추");
        System.out.println("+ 패티 ");
        System.out.println("+ 피클");
        System.out.println("+ 새우");
    }

}