package chapter_11;

import java.io.FileWriter;
import java.io.IOException;

public class _07_Throws {
    public static void main(String[] args) {
        try {
            writeFile();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("메인 메소드에서 해결");
        }
    }
    public static void writeFile() throws IOException {
//        try {
//            FileWriter writer = new FileWriter("test.txt");
//            throw new IOException("Failed to write file");
//        } catch (IOException e) {
//            System.out.println("writeFile method");
//        }
            FileWriter writer = new FileWriter("test.txt");
            throw new IOException("Failed to write file");
    }
}
