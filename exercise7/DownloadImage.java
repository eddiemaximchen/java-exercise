package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.xml.sax.InputSource;

public class DownloadImage {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		//上網下載圖片  網址不能有中文 圖片一定要是JPG
		URL url = new URL("https://graph.facebook.com/AppStore/picture?type=large"); 
	    //openStream拿到對方網站的inputstream
		try(InputStream is = url.openStream();
	    	BufferedInputStream bis = new BufferedInputStream(is);
	    	FileOutputStream fos = new FileOutputStream("c:\\java\\image.jpg");
	    	BufferedOutputStream bos = new BufferedOutputStream(fos);
	    	){
	    		//buffer太大 會佔記憶體 太小速度慢
				byte[] buffer = new byte[1024];
	    		int length;
	    		//bis.read是把網路資料讀到buffer裡
	    		while((length=bis.read(buffer))!=-1) {
	    			//從網站拿到的byte是對方網站決定
	    			System.out.println(length);
	    			//寫入本機檔案, 從buffer位置0到底 
	    			bos.write(buffer,0,length);
	    		}
	    		System.out.println("done");
	   
	    } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
  
}
