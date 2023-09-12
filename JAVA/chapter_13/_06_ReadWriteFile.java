package chapter_13;

import java.io.*;

public class _06_ReadWriteFile {
    public static void main(String[] args) {
        //BufferedReader : read
        //BufferedWriter : write

        //write file
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("job.txt", true))) {  //내용 추가 append : True
//            bw.write("THE");
//            bw.newLine();
//            bw.write("END");
//            bw.newLine();
            bw.write("3 really");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //read file
        try (BufferedReader br = new BufferedReader(new FileReader("job.txt"))) {
            String line;
            while((line = br.readLine())!=null) {
                System.out.println(line);
            }
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
