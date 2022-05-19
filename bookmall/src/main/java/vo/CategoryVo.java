package vo;

public class CategoryVo {
	private long no;
	private String sort;
	
	public long getNo() {
		return no;
	}
	public void setNo(long no) {
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
