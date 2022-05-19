package vo;

public class OrderBookVo {
	private int no;
	private int price;
	private int count;
	private int category_no;
	private int order_no;
	private int book_no;
	
	public int getOrder_no() {
		return order_no;
	}
	public void setOrder_no(int order_no) {
		this.order_no = order_no;
	}
	public int getBook_no() {
		return book_no;
	}
	public void setBook_no(int book_no) {
		this.book_no = book_no;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getCategory_no() {
		return category_no;
	}
	public void setCategory_no(int category_no) {
		this.category_no = category_no;
	}
	@Override
	public String toString() {
		return "OrderBookVo [no=" + no + ", price=" + price + ", count=" + count + ", category_no=" + category_no
				+ ", order_no=" + order_no + ", book_no=" + book_no + "]";
	}
	
}
