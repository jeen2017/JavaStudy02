package bit.edu;
// ��ȭ �� ����, ����, ���ΰ�, ���ۻ�, �󿵰�, �ð�, ��� ��... : ��������
public class MovieVO {    // MovieVO Ŭ��
    // 1. ��� ��������� �������� (private)
	private String title;
	private int price;
	private String major;
	private int level;
	
    // 2. ����Ʈ �����ڸ޼���(����)�� ���������� �����
	public MovieVO(){
		// a.��ü�� �����ϴ� ��(���������� �ϴ���)
		// b.��ü�� �ʱ�ȭ�ϴ� ��(����)
		title="���� ���̺�";
		price=15000;
		major="����";
		level=12;
	}
	
	public MovieVO(String title, int price, String major, int level) {
		super();
		this.title = title;
		this.price = price;
		this.major = major;
		this.level = level;
	}

	// 3. setter, getter method
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title; // this: Ŭ������ �����Ҷ� �������� ������� �ڱ��ڽ��� ����Ű�� ������
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
	// 4. ������� ���� toString()�� �����
	@Override
	public String toString() {
		return "MovieVO [title=" + title + ", price=" + price + ", major=" + major + ", level=" + level + "]";
	}
}