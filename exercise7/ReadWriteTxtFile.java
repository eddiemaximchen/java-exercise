package io; 

import java.io.*;

import java.util.Scanner;

import javax.xml.bind.annotation.XmlElementRef.DEFAULT;

public class ReadWriteTxtFile {

  public static void main(String args[]) throws IOException {
	  //reader在try的()寫法, 因為
	  System.out.println("檔名:");
	  Scanner scanner = new Scanner(System.in);
	  String filePath = scanner.nextLine();
	  scanner.close();
	  try(
		  FileInputStream fis = new FileInputStream(filePath);
	      InputStreamReader ir = new InputStreamReader(fis);
	      BufferedReader br = new BufferedReader(ir);
	      FileOutputStream fos = new FileOutputStream("/mysql/test.txt");  //斜線方向不同
		  BufferedOutputStream bos = new BufferedOutputStream(fos);
		  )
	  {
		  System.out.println("內容如下:");
		  int ch;
		  while ((ch=br.read())!=-1) {
			  System.out.print((char)ch);
	          bos.write((char)ch);
	      }
		  System.out.printf("\n");
          System.out.println("copy ok");
	  }catch (FileNotFoundException e) {
          e.printStackTrace();
      } catch (IOException e) {
          e.printStackTrace();
      }
      File f = new File("c:\\mysql\\test.txt");//要放在try catch外面
      File f2=new File("c:\\mysql\\testb.txt");
        f.renameTo(f2); //如果test忘了刪, rename就不會執行
        f2.delete();
	}
  }	  
