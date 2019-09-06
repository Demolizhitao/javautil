package zhejiang.ningbo.common.util;

import java.io.*;

public class FiledownloadUtil {

    public static void FileDownload(String fileName,String filePath){

        try(InputStream is = FiledownloadUtil.class.getClassLoader().getResourceAsStream(filePath);
            BufferedInputStream bis = new BufferedInputStream(is);
            FileOutputStream  fos = new FileOutputStream(fileName);
            BufferedOutputStream bos = new BufferedOutputStream(fos)
            ) {

            int len =0;
            while ((len = is.read()) != -1){
                bos.write(len);
               // bos.flush();
            }
            System.out.println("下载文件成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String filePath = "zrrxx/qyxx.xlsx";
        String fileName = "C:\\qyxx.xlsx";
      //  FiledownloadUtil f = new FiledownloadUtil();
        FileDownload(fileName,filePath);
    }
}
