package dao.test;

import dao.OrderDao;
import vo.OrderVo;

public class OrderTest {
	
	public static void main(String[] args) {
		testInsert();
		//testFindAll();
		// testUpdate();
	}
	
	public static void testInsert() {
		OrderDao dao = new OrderDao();
		OrderVo vo = new OrderVo();
		
		vo.setOrder_no("20220519-0001");
		vo.setAddr("센텀월드오피스텔");
		dao.insert(vo);
		

		System.out.println("order insert");

	}
}
