package dao.test;

import java.util.List;

import dao.MemberDao;
import vo.MemberVo;

public class MemberTest {
	public static void main(String[] args) {
		testInsert();
		//testFindAll();
		// testUpdate();
	}
	
	private static void testFindAll() {
		System.out.println("---Member select---");
		List<MemberVo> list = new MemberDao().findAll();
		for(MemberVo vo : list) {
			System.out.println(vo);
		}
	}
	
	public static void testInsert() {
		MemberDao dao = new MemberDao();
		MemberVo vo = new MemberVo();
		
		vo.setName("정유진");
		vo.setPhone("01023955480");
		vo.setEmail("jyj6010@gmail.com");
		vo.setPw("0000");
		dao.insert(vo);
		
		vo.setName("별나비");
		vo.setPhone("01055895480");
		vo.setEmail("yujinj704@gmail.com");
		vo.setPw("03300");
		dao.insert(vo);
		
	
		
		System.out.println("member insert");

	}
}
