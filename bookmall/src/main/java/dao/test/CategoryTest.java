package dao.test;

import dao.CategoryDao;
import vo.CategoryVo;

public class CategoryTest {
	public static void main(String[] args) {
		testInsert();
		//testFindAll();
		// testUpdate();
	}
	public static void testInsert() {
		CategoryDao dao = new CategoryDao();
		CategoryVo vo = new CategoryVo();
		
		vo.setSort("아동");
		dao.insert(vo);
		
		vo.setSort("IT");
		dao.insert(vo);
		
		vo.setSort("만화");
		dao.insert(vo);
		
		System.out.println("Category insert");

	}
}
