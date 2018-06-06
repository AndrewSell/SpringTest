package test.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * 对文件读写进行测试
 * @author jhin
 *
 */
public class fileUtils {
	public void filebin() {
		FileInputStream inputStream = null;
		OutputStream outputStream = null;
		try {
			outputStream = new FileOutputStream("1.exe");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			inputStream = new FileInputStream("D:/340.52-notebook-win8-win7-64bit-international-whql.exe");
			byte[] buffer = new byte[1024];
			while(true){
				int lenth = inputStream.read(buffer);	
				if (lenth ==-1) {
					break;
				}
//				String str = new String(buffer,0,lenth,"GBK");
//				System.out.println(str);
				outputStream.write(buffer);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				outputStream.close();
				inputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
