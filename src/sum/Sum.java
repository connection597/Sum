package sum;

public class Sum {

	public static void main(String[] args) {
		int[] score= {56,52,23,98,85};
		int sum =0;
		int sumCondition =0;
		
		for(int i=0; i<score.length; i++) {
			sum +=score[i];
			
			if(score[i]>=80) {
				sumCondition += score[i];
			}
		}
		System.out.println(score.length +"���� ����"+ sum);
		System.out.println(score.length +"���� ������ 80���̻��� ����"+ sumCondition);
	}

}
