package Mapandso;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesMain {

	public static void main(String[] args) {
		//프로퍼티 생성 
		Properties property = 
				new Properties();
		property.setProperty("name", "김기범");
		property.setProperty("age", "45");
		
		System.out.printf("%s\n",
				property.getProperty("name"));
		// 현재 작업 디렉토리에 파일을 생성 
		File f = new File("./temp.xml");
		try {
			FileOutputStream fos = 
					new 	FileOutputStream(f);
			property.storeToXML(fos, "현재 디렉토리 확인");
			fos.close();
		} catch(Exception e) {
			
		}
	}
}








