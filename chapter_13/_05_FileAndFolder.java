package chapter_13;

import java.io.File;

public class _05_FileAndFolder {
    public static void main(String[] args) {
//        String folder = "C:\\Users\\SeungJoo\\Java workspace\\src\\chapter_13";
        String folder = "src/chapter_13";
        File filesAndFolders = new File(folder);
        System.out.println("폴더 경로 :" + filesAndFolders.getAbsolutePath());
        for (File file :
                filesAndFolders.listFiles()) {
            if(file.isFile()) {
                System.out.println("(파일)" + file.getName());
            } else if (file.isDirectory()) {
                System.out.println("(폴더) " +file.getName());
            }
            System.out.println(file.getName());
        }
    }
}
