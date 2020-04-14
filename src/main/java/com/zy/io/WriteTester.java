package com.zy.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTester {
    public static void main(String[] args) throws IOException {   //拋出IO的例外處理，而不再main做try catch的處裡。
        File fwjk = new File("D:\\jk");       //先建立一個資料夾
        fwjk.mkdir();
        FileWriter fw = new FileWriter("D:\\jk\\output.txt");
        fw.write("abc");   //寫入abc
        fw.flush();  //將資料沖進去
        fw.close();  //寫完之後關檔案
    }
}
