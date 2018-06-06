package DbUtils.MySql;

import java.util.List;

import test.file.excel.excelRead;

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
		 * 读写文件
		 */
//		fileUtils fu = new fileUtils();
//		fu.filebin();
		excelRead poi = new excelRead();
        // List<List<String>> list = poi.read("d:/aaa.xls");
        List<List<String>> list = poi.read("D:/1.xls");
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                System.out.print("第" + (i) + "行");
                List<String> cellList = list.get(i);
                for (int j = 0; j < cellList.size(); j++) {
//                     System.out.print("    第" + (j + 1) + "列值：");
                    System.out.print("    " + cellList.get(j));
                }
                System.out.println();
            }

        }

    }
}