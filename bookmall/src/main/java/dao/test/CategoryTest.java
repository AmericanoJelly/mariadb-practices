package dao.test;

import java.util.List;

import dao.CategoryDao;
import vo.CategoryVo;

public class CategoryTest {
	public static void main(String[] args) {
		testInsert();
		//testFindAll();
	}
	
	private static void testFindAll() {
		System.out.println("---Category select---");
		List<CategoryVo> list = new CategoryDao().findAll();
		for(CategoryVo vo : list) {
			System.out.println(vo);
		}
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
