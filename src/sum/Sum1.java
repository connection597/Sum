package sum;
//1���� 100������ ¦���� ��
public class Sum1 {

	public static void main(String[] args) {
		int sum =0;
		int i =0;
		for (i =1; i<=100; i++) {
			if(i%2==0) {
				sum +=i;
			}
			System.out.println(sum);
		}

	}

}
