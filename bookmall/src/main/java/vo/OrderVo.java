package vo;

public class OrderVo {
	private int no;
	private String addr;
	private String order_no;
	private int cart_no;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getOrder_no() {
		return order_no;
	}
	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}
	public int getCart_no() {
		return cart_no;
	}
	public void setCart_no(int cart_no) {
		this.cart_no = cart_no;
	}
	@Override
	public String toString() {
		return "OrderVo [no=" + no + ", addr=" + addr + ", order_no=" + order_no + ", cart_no=" + cart_no + "]";
	}
	
	
	
}
