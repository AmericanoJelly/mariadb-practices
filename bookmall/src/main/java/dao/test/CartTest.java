package dao.test;

import dao.CartDao;
import vo.CartVo;

public class CartTest {
	public static void main(String[] args) {
		testInsert();
		//testFindAll();
		// testUpdate();
	}
	
	public static void testInsert() {
		CartDao dao = new CartDao();
		CartVo vo = new CartVo();
		
		vo.setCount(2);
		vo.setPrice(7000);
		vo.setMember_no(1);
		vo.setBook_no(1);
		dao.insert(vo);
		
		vo.setCount(1);
		vo.setPrice(8000);
		vo.setMember_no(1);
		vo.setBook_no(2);
		dao.insert(vo);
		
	
		
		System.out.println("cart insert");

	}
}
