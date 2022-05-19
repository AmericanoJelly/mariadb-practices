package vo;

public class CategoryVo {
	private int no;
	private String sort;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	
	@Override
	public String toString() {
		return "CategoryVo [no=" + no + ", sort=" + sort + "]";
	}
	
	
	
}
