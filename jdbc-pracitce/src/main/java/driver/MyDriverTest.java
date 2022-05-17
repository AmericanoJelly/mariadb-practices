package driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MyDriverTest {
	public static void main(String[] args) {
		Connection connection = null;
		
		try {
			//1. JDBC Driver 로딩 (JDBC Class 로딩: class loader)
			Class.forName("driver.MyDriver");
			DriverManager.registerDriver(new MyDriver());
			
			//2. 연결하기
			String url = "jdbc:mysql://127.0.01:4404/webdb?charset=utf8";
			connection = DriverManager.getConnection(url,"webdb","webdb"); //DriverManager: jdbc자체에서 지원 //url,"계정","비밀번호"
			
			System.out.print("connected!");
		 
		} catch(ClassNotFoundException e) {
			System.out.print("드라이버 로딩 실패: "+e);
		} catch (SQLException e) {
			System.out.print("error: "+e);
		} finally {
			try {
				if(connection != null) {
				connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
