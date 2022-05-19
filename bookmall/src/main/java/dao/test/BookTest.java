package dao.test;

import dao.BookDao;
import vo.BookVo;

public class BookTest {
	public static void main(String[] args) {
		testInsert();
		//testFindAll();
		// testUpdate();
	}
	
	
	public static void testInsert() {
		BookDao dao = new BookDao();
		BookVo vo = new BookVo();
		
		vo.setTitle("누가 내 머리에 똥 쌌어?");
		vo.setPrice(7000);
		vo.setCategory_no(1);
		dao.insert(vo);
		
		vo.setTitle("이것이 MriaDB다");
		vo.setPrice(8000);
		vo.setCategory_no(2);
		dao.insert(vo);
		
		vo.setTitle("나루토 만화책 21권");
		vo.setPrice(5500);
		vo.setCategory_no(3);
		dao.insert(vo);
		
		System.out.println("book insert");

	}
}
