package io;

import java.io.*;
import java.nio.charset.Charset;

public class ReadByFileReader {
    public static void main(String[] args) throws IOException {

        System.out.println("JVM Encoding＝"+Charset.defaultCharset());

        try(FileInputStream fis = new FileInputStream("C:\\java\\char_MS950.txt");
        //讀寫之前要知道環境用哪種編碼
        InputStreamReader isr = new InputStreamReader(fis, "MS950");		
        //FileReader fr = new FileReader("C:\\java\\char_UTF8.txt")
        BufferedReader br = new BufferedReader(isr)		
        ){
        //MS950會讀出亂碼,因為非系統預設編碼
        //try(FileReader fr = new FileReader("C:\\java\\char_MS950.txt")){    
            //改成InputSteamReader
            /*  FileInputStream fis = new FileInputStream(file);
                InputStreamReader isr = new InputStreamReader(fis, "MS950");
                BufferedReader br = new BufferedReader(isr)
                */
                //int c;
                //while ((c = isr.read()) != -1) {
                  //  System.out.println((char) c);
                //}
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
