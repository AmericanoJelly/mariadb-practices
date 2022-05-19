package main;

import java.util.List;

import dao.BookDao;
import dao.CartDao;
import dao.CategoryDao;
import dao.MemberDao;
import dao.OrderDao;
import vo.BookVo;
import vo.CartVo;
import vo.CategoryVo;
import vo.MemberVo;
import vo.OrderVo;

public class BookMall {

	public static void main(String[] args) {
		displayMemberInfo(  );
		displayCategoryInfo();
		displayBookInfo();
		displayCartInfo();
		displayOrderInfo();
		displayOrderBookInfo();
	}
	public static void displayMemberInfo() {
		List<MemberVo> list = new MemberDao().findAll();
		
		for(MemberVo vo : list) {
		System.out.println(vo.getName()+", "+vo.getEmail());
		}
		System.out.println("====================================");
		
	}
	public static void displayCategoryInfo() {
		List<CategoryVo> list = new CategoryDao().findAll();
		
		for(CategoryVo vo : list) {
		System.out.println(vo.getNo()+" "+vo.getSort());
		}
		System.out.println("====================================");
		
	}
	public static void displayBookInfo() {
		List<BookVo> list = new BookDao().findAll();
		
		for(BookVo vo : list) {
		System.out.println(vo.getNo()+" "+vo.getTitle()+", "+vo.getPrice()+" "+ vo.getSort());
		}
		System.out.println("====================================");
		
	}
	
	public static void displayCartInfo() {
		List<CartVo> list = new CartDao().findAll();
		
		for(CartVo vo : list) {
		System.out.println(vo.getName()+" "+vo.getTitle()+" "+vo.getCount());
		}
		System.out.println("====================================");
		
	}
	
	public static void displayOrderInfo() {
		List<MemberVo> list = new MemberDao().findAll();
		
		for(MemberVo vo : list) {
		System.out.println(vo.getOrder_no()+" "+vo.getName()+"("+vo.getEmail()+")"+vo.getPrice()+vo.getAddr());
		}
		System.out.println("====================================");
		
	}
	
	public static void displayOrderBookInfo() {
		List<OrderVo> list = new OrderDao().findAll();
		
		for(OrderVo vo : list) {
		System.out.println(vo.getNo()+" "+vo.getTitle()+" "+vo.getCount()+" "+vo.getPrice());
		}
		System.out.println("====================================");
		
	}
}
