package vo;

public class OrderVo {
	private String no;
	private int cost;
	private String addr;
	private Long member_no;
	private String name;
	private String email;
	
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public Long getMember_no() {
		return member_no;
	}
	public void setMember_no(Long member_no) {
		this.member_no = member_no;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "OrderVo [no=" + no + ", " + ", cost=" + cost + ", addr=" + addr + ", member_no="
				+ member_no + ", name=" + name + ", email=" + email + "]";
	}
		
}