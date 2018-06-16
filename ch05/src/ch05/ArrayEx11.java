package ch05;

public class ArrayEx11 {
	public static void main(String[] args) {
		int[] numArr = new int[10];
		int[] counter = new int[10];
		
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = (int)(Math.random() * 10);	// 0~9의 임의의 수를 배열에 저장
			System.out.print(numArr[i]);
		}
		System.out.println();
		
		for(int i = 0; i < numArr.length; i++) {
			counter[numArr[i]]++;
			/* 랜덤한 숫자가 6019660726일 경우 
			 * counter[numArr[i]]++
			 * counter[numArr[0]]++
			 * counter[6]++	 //	counter[6] = 1 저장
			 */	
		}
		
		for (int i = 0; i < numArr.length; i++) {
			System.out.println(i + "의 개수 : " + counter[i]);
		}

	}

}
