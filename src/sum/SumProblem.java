package sum;
//�հ� ��� ���ϱ�
public class SumProblem {

	public static void main(String[] args) {
		int sum =0; //����
		float average = 0F; //���
		
		int[] score = {100,98,87,55,49,76,53,46};
		for(int i = 0; i<score.length; i++) {
			sum +=score[i]; //���� ���
		}
		//��հ��
		average = sum /(float)score.length;// ����ȯ
		System.out.println("����:"+sum);
		System.out.println("����:"+average);
	}

}
