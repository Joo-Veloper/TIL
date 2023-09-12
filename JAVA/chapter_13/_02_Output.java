package chapter_13;

public class _02_Output {
    public static void main(String[] args) {
        System.out.println("--- 정수 ---");
        System.out.printf("%d%n", 1);
        System.out.printf("%d %d %d%n",1,2,3);
        System.out.printf("%d%n", 1234);
        System.out.printf("%6d%n", 1234); // 6자리 공간 확보후 출력 --1234
        System.out.printf("%06d%n", 1234);
        System.out.printf("%6d%n", -1234);
        System.out.printf("%06d%n", -1234);
        System.out.printf("%+6d%n", 1234);
        System.out.printf("%,15d%n", 1000000000 );
        System.out.printf("%-6d%n", 1234); // 왼쪽정렬
        System.out.println("--- 실수 ---");
        System.out.printf("%f%n", Math.PI);
        System.out.printf("%.2f%n", Math.PI);
        System.out.printf("%6.2f%n", Math.PI);
        System.out.printf("%-6.2f%n", Math.PI);
        System.out.printf("%06.2f%n", Math.PI);
        System.out.printf("%+6.2fn", Math.PI);
        System.out.println("문자열");
        System.out.printf("%s%n", "JAVA");
        System.out.printf("%6s%n", "JAVA"); // 우측정렬
        System.out.printf("%-6s%n", "JAVA");// 좌측정렬
        System.out.printf("%6.2s%n", "JAVA");
        System.out.printf("%-6.2s%n", "JAVA");
        System.out.println("--- 응용 ---");
        System.out.println("name English math avg ");
        System.out.println("JAVA " + 90 + " " + 80 + " " + 85.0);
        System.out.println("Spring " + 100 + " " + 100 + " " + 100);
        System.out.println("Node " + 95 + " " + 100 + " " + 97.5);

        System.out.println("--- 응용2 ---");
        System.out.println("name     English   math   avg");
        System.out.printf("%-6s %4d %4d %6.1f%n","JAVA" ,90, 80, 85.0);
        System.out.printf("%-6s %4d %4d %6.1f%n","spring" ,100, 100, 100.0);
        System.out.printf("%-6s %4d %4d %6.1f%n","Node" ,95, 100, 97.5);
    }
}
