package sum;
//ÇÕ°è Æò±Õ ±¸ÇÏ±â
public class SumProblem {

	public static void main(String[] args) {
		int sum =0; //ÃÑÇÕ
		float average = 0F; //Æò±Õ
		
		int[] score = {100,98,87,55,49,76,53,46};
		for(int i = 0; i<score.length; i++) {
			sum +=score[i]; //ÃÑÇÕ °è»ê
		}
		//Æò±Õ°è»ê
		average = sum /(float)score.length;// Çüº¯È¯
		System.out.println("ÃÑÁ¡:"+sum);
		System.out.println("ÃÑÁ¡:"+average);
	}

}
