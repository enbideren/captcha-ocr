package cn.z;

import java.io.File;

public class FileRename {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            File fileD = new File("C:/Users/jiang/Desktop/shibie/train/" + i);
            String[] files = fileD.list();
            for (int i1 = 0; i1 < files.length; i1++) {
                String string = files[i1];
                String name = ("" + Math.random()).substring(2, 10)
                              + ("" + System.currentTimeMillis()).substring(6, 12);
                File file = new File("C:/Users/jiang/Desktop/shibie/train/" + i + "/" + string); //指定文件名及路径  
                File t1 = new File("C:/Users/jiang/Desktop/shibie/train/" + i + "/" + i + "-" + i1
                                   + name + ".jpg");
                boolean renameTo = file.renameTo(t1); //改名
                System.out.println(renameTo);
            }
        }

        for (int i = 0; i < 10; i++) {
            File fileD = new File("E:/workspace/wk_engage/ocr/src/ocr/imgtrain/" + i);
            String[] files = fileD.list();
            for (int i1 = 0; i1 < files.length; i1++) {
                String string = files[i1];
                File file = new File("E:/workspace/wk_engage/ocr/src/ocr/imgtrain/" + i + "/" + string); //指定文件名及路径  
                file.delete();
            }
        }
    }

}
