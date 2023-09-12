package chapter_13;

import java.io.File;

public class _04_Folder {
    public static void main(String[] args) {
        String folderName = "t";
        File folder = new File(folderName);
        folder.mkdir();
        if(folder.exists()) {
            System.out.println("폴더 존재 : " + folder.getAbsolutePath());
        }
        System.out.println("----------");

        folderName = "t/v/i";
        folder = new File(folderName);
        folder.mkdir();
        if (folder.exists()) {
            System.out.println("폴더 존재 :" + folder.getAbsolutePath());
        } else {
            System.out.println("생성 실패 (mkdir)");
        }

    }
}
