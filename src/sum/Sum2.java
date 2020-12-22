package sum;

import java.util.Scanner;

//1~n까지 합
public class Sum2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 n을 입력하세요");
		int n = sc.nextInt();
		
		int sum =0;
		for(int i =0; i<=n; i++)
			sum +=i;
		System.out.println("1부터"+n+"까지의 합은"+sum+"입니다");

	}

}
