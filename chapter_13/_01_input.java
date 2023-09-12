package chapter_13;

import java.sql.SQLOutput;
import java.util.Scanner;

public class _01_input {
    public static void main(String[] args) {
        //user input
        Scanner sc = new Scanner(System.in);
//        System.out.println("input");
//        String name = sc.next();
//        System.out.println("input information");
//        System.out.println("input blood type");
//        String bloodType = sc.next();
//        System.out.println("height");
////        int height = Integer.parseInt(sc.next());
//        int height = sc.nextInt();
//        System.out.println("weight");
////        double weight = Double.parseDouble(sc.next());
//        double weight = sc.nextDouble();
//
//        System.out.println("name : " + name);
//        System.out.println("blood type : " + bloodType);
//        System.out.println("height : " + height);
//        System.out.println("weight :" + weight);

        System.out.println("Program");
        String lang = sc.next();
//        String lang = sc.nextLine();
        System.out.println("language :" + lang);

        sc.nextLine(); //불필요 문장 삭제

        System.out.println("feel");
        String feeling = sc.next();
//        String feeling = sc.nextLine();
        System.out.println("feel : " + feeling);
    }
}
