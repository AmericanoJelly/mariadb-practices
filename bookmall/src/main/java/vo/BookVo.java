package vo;

public class BookVo {
	private long no;
	private String title;
	private int price;
	private long category_no;
	private String Sort;
	private int cost;
	private int count;
	
	public long getNo() {
		return no;
	}
	public void setNo(long no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public long getCategory_no() {
		return category_no;
	}
	public void setCategory_no(long category_no) {
		this.category_no = category_no;
	}

	public String getSort() {
		return Sort;
	}
	public void setSort(String sort) {
		Sort = sort;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "BookVo [no=" + no + ", title=" + title + ", price=" + price + ", category_no=" + category_no + ", Sort="
				+ Sort + ", cost=" + cost + ", count=" + count + "]";
	}
	
	
}
