package vo;

public class CartVo {
	private int no;
	private int count;
	private int price;
	private int member_no;
	private int book_no;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getMember_no() {
		return member_no;
	}
	public void setMember_no(int member_no) {
		this.member_no = member_no;
	}
	public int getBook_no() {
		return book_no;
	}
	public void setBook_no(int book_no) {
		this.book_no = book_no;
	}
	
	@Override
	public String toString() {
		return "CartVo [no=" + no + ", count=" + count + ", price=" + price + ", member_no=" + member_no + ", book_no="
				+ book_no + "]";
	}
	
	
	
}
