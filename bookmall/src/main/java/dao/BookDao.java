package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import vo.BookVo;


public class BookDao {
	
	public boolean insert(BookVo vo) {
		boolean result = false;
		Connection connection = null;
		PreparedStatement pstmt = null;
		
		try {
			connection = getConnection();
			
			String sql = "insert into book values(null, ?, ?, ?)";
			pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, vo.getTitle());
			pstmt.setInt(2, vo.getPrice());
			pstmt.setInt(3, vo.getCategory_no());
			
			int count = pstmt.executeUpdate();
			result = count == 1;
		} catch (SQLException e) {
			System.out.println("드라이버 로딩 실패:" + e);
		} finally {
			try {
				if(pstmt != null) {
					pstmt.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;		
		}
	
	public List<BookVo> findAll() {
		List<BookVo> result = new ArrayList<>();
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			connection = getConnection();

			String sql =
					  " select no, title, price, category_no"
					+ " from book";
			pstmt = connection.prepareStatement(sql);			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int no = rs.getInt(1);
				String title = rs.getString(2);
				int price = rs.getInt(3);
				int category_no = rs.getInt(4);
				
				BookVo vo = new BookVo();
				vo.setNo(no);
				vo.setTitle(title);
				vo.setPrice(price);
				vo.setCategory_no(category_no);
				
				result.add(vo);
			}
		} catch (SQLException e) {
			System.out.println("드라이버 로딩 실패:" + e);
		} finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return result;		
	}

	private Connection getConnection() throws SQLException {
		Connection connection = null;
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			String url = "jdbc:mysql://192.168.10.38:3306/bookmall?charset=utf8";
			connection = DriverManager.getConnection(url, "user1", "user1");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패:" + e);
		}
		
		return connection;
	}
}
