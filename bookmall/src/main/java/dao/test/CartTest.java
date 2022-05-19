package dao.test;

import java.util.List;

import dao.CartDao;
import vo.CartVo;


public class CartTest {
	public static void main(String[] args) {
		testInsert();
		//testFindAll();
		// testUpdate();
	}
	
	private static void testFindAll() {
		System.out.println("---cart select---");
		List<CartVo> list = new CartDao().findAll();
		for(CartVo vo : list) {
			System.out.println(vo);
		}
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
