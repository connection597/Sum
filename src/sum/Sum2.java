package sum;

import java.util.Scanner;

//1~n���� ��
public class Sum2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� n�� �Է��ϼ���");
		int n = sc.nextInt();
		
		int sum =0;
		for(int i =0; i<=n; i++)
			sum +=i;
		System.out.println("1����"+n+"������ ����"+sum+"�Դϴ�");

	}

}
