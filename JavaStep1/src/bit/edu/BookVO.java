package bit.edu;
//å �� ����,����,���ǻ�,�������� : ��������
public class BookVO {
	// 1. �������(��������) �� ��ȣ(��������)
	private String title;
	private int price;
	private String company;
	private int page;
	// 2. setter / getter method�� �����(�ڵ����� �����)
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

	@Override   // ���콺 ������ Ŭ�� �� source �� Genarate toString()
	public String toString() {
		return "BookVO [title=" + title + ", price=" + price + ", company=" + company + ", page=" + page + "]";
	}

}
