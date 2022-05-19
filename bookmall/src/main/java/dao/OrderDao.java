package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import vo.OrderVo;

public class OrderDao {
	public boolean insert(OrderVo vo) {
		boolean result = false;
		Connection connection = null;
		PreparedStatement pstmt = null;
		
		try {
			connection = getConnection();
			
			String sql = "insert into orders values(?, ?, ?, ?)";
			pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, vo.getNo());
			pstmt.setString(2, vo.getAddr());
			pstmt.setInt(3, vo.getCost());
			pstmt.setLong(4, vo.getMember_no());
	
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
	
	public List<OrderVo> findAll() {
		List<OrderVo> result = new ArrayList<>();
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			connection = getConnection();

			String sql =
					" select b.no, c.title, b.count, b.price " 
					+" from orders a, order_book b, book c"
				    +" where a.no = b.order_no"
				    +" and b.book_no = c.no";
			pstmt = connection.prepareStatement(sql);			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String no = rs.getString(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				int cost = rs.getInt(4);
				String addr = rs.getString(5);
				
				OrderVo vo = new OrderVo();
				vo.setNo(no);
				vo.setName(name);
				vo.setEmail(email);
				vo.setCost(cost);
				vo.setAddr(addr);
		
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