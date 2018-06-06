package DbUtils.MySql;

import java.io.File;

import javax.servlet.ServletException;

import test.file.fileUtils;

public class Test {
	/**
	 * 作为一个测试类，对文件进行测试
	 * 
	 */
	public static void main(String[] args) {
		/**
		 * 以下方法读写是对文本文件进行的
		 */
//		Properties properties = System.getProperties();
//		System.out.println(properties.getProperty("user.dir"));//查看用户的文件路径
//		Path relative = Paths.get("relative" ,"child");
//		System.out.println(relative);
//		Path absolute = Paths.get("/Users", "demo","test");
//		System.out.println(absolute);
//		System.out.println(absolute.getParent());
		
		/**
		 * 读字符文件
		 */
		fileUtils fu = new fileUtils();
		fu.filebin();
	}
}