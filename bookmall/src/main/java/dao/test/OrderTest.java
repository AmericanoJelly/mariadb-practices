package dao.test;

import java.util.List;

import dao.OrderDao;
import vo.OrderVo;

public class OrderTest {
	
	public static void main(String[] args) {
		testInsert();
		testFindAll();
	}
	
	private static void testFindAll() {
		System.out.println("---Category select---");
		List<OrderVo> list = new OrderDao().findAll();
		for(OrderVo vo : list) {
			System.out.println(vo);
		}
	}
	
	
	public static void testInsert() {
		OrderDao dao = new OrderDao();
		OrderVo vo = new OrderVo();
		
		vo.setNo("20220519-0001");
		vo.setAddr("센텀월드오피스텔");
		vo.setCost(3000);
		vo.setMember_no(1L);
		dao.insert(vo);
		

		System.out.println("order insert");

	}
}
