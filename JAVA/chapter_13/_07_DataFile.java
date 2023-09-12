package chapter_13;

import java.io.File;

public class _07_DataFile {
    public static void main(String[] args) {
        File file = new File("job.txt");
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("파일 삭제 성공 : " + file.getName());
            } else {
                System.out.println("파일 삭제 실패 : " + file.getName());
            }
        }
        File folder = new File("t");
        if (folder.exists()) {
            if (folder.delete()) {
                System.out.println("폴더 삭제 성공 : " + folder.getAbsolutePath());
            } else {
                System.out.println("폴더 삭제 실패 : " + folder.getAbsolutePath());
            }
        }
        // 하위 폴더까지 모두 삭제
//        deleteFolder(folder);
    }
//    public static boolean deleteFolder(File folder) {
//        if (folder.isDirectory()) {
//            for (File file : folder.listFiles()) {
//                deleteFolder(file);
//            }
//        }
//        System.out.println("삭제 대상 : " + folder.getAbsolutePath());
//        return folder.delete();
//    }
}
