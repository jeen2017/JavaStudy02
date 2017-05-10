package bit.edu;
//책 → 제목,가격,출판사,페이지수 : 상태정보
public class BookVO {
	// 1. 멤버변수(상태정보) → 보호(정보은닉)
	private String title;
	private int price;
	private String company;
	private int page;
	// 2. setter / getter method를 만들것(자동으로 만들것)
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

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	@Override   // 마우스 오른쪽 클릭 → source → Genarate toString()
	public String toString() {
		return "BookVO [title=" + title + ", price=" + price + ", company=" + company + ", page=" + page + "]";
	}

}

