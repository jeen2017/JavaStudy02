public class J42 {
	public static void main(String[] args) {
		// 70�� �迭���� ã�� �˰��� (2���˻�
		int[] a = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int sd = 70; // index=6
		int low = 0;
		int high = a.length - 1; // 10-1(9)
		int middle = 0;
		int index = -1;
		while (low <= high) {
			middle = (low + high) / 2;
			if (sd == a[middle]) {
				index = middle;
				break;
			} else if (sd > a[middle]) { // RIGHT
				low = middle + 1;
			} else { // LEFT
				high = middle - 1;
			}
		} // while
		if (index != -1) {
			System.out.println(index);
		} else {
			System.out.println("����");
		}
	}

}
