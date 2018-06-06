package DbUtils.MySql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 这个类是对数据库进行连接并进行操作，默认连接的数据库为MySQL数据库
 * @author jhin
 * @version 1.0-alpha
 */
public class MySqlJDBC {
	static {
		//静态代码块，可以独立执行的代码，可作为类的初始化代码
	}
	static final String jdbcDriver = "";//这里存放数据库的驱动名字
	static final String dbUri="";//数据库的连接地址
	static final String dbUsername = "";//数据库的管理员名字
	static final String dbPassword = "";//数据库的管理员密码
	public static void main(String[] args){
		Connection connection = null;//连接设置为空
		Statement statement = null;//数据集设置为空
		try {
			Class.forName(jdbcDriver);
			connection = DriverManager.getConnection(dbUri, dbUsername, dbPassword);//对数据库进行连接
			statement = connection.createStatement();//创建结果集
			String sql = "select * from tmp";//待执行的sql语句
			ResultSet resultSet = statement.executeQuery(sql);//执行sql语句
		} catch (ClassNotFoundException e) {
			// TODO 没有找到对应的类就将错误打印出来，抛出给日志监控平台
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO 在数据库连接出现问题的时候，抛出给日志监控平台
			e.printStackTrace();
		}
	}
}
