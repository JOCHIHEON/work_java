package ch04;

public class basicStar {

	public static void main(String[] args) {
		// A나라와 B나라가 커다란 강을 가운데 두고 존재하는 강에는 섬이 하나 존재한다.
		// A나라와 섬을 연결하는 다리는 3개이며 B나라와 섬을 연결하는 다리는 4개가 있을 경우
		// A나라에서 섬을 통해 B나라로 이동할 수 있는 방법의 개수는?
		
		int cnt = 0;
		for(int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 4; j++)
				cnt++;
		}
		System.out.println("방법의 수"+cnt);
		System.out.println("=============");
		
		
		
		/*
		5*5 행렬의 별
		i변수 for문과 j변수 for문 모두 다섯번씩 반복하면 된다.
		이중 for문으로 중첩을 시켜놓고 j변수 for문에서는 별을 가로로 
		나열하며 출력을 해야하기 때문에 println이 아닌 print함수를 사용하고,
		별을 5개 찍은 이후에 한줄 띄어야 하므로 i변수 for문 안에서 
		println 명령을 통해 개행을 한다.
		*/

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println("=============");
		/*행은 3개, 열을 8개인 별을 찍어보도록 하자.
		여기에서 행은 가로를 나타내며, 열은 세로를 나타낸다. 3*8 행렬의 별을 찍어보자.
		여기서 조금 헷갈릴만한 문제가 바로 어느 for문이 행이고, 어느 for문이 열이라는 생각이 들때이다.
		쉽게 생각하자면 행이 첫번째 for문 즉, i변수의 for문이고, 열이 중첩된 for문 즉, j변수의 for문이다.
		그러므로 i변수가 3까지, j변수가 8까지로 조건을 달아주면 자연스럽게 3*8 행렬의 별이 찍히게 된다.*/
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println("=============");
		
		/* 
		9 * 8 행렬의 별을 찍어보자.
		간단하게 찍을 수 있을 것이다.
		이처럼 행과 열의 위치를 구분할 수 있으면 
		어떤 별이라도 찍을 수 있다.
		*/
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println("=============");
		
		for (int i = 0; i < 9; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.printf(j + "*" + "   ");
			}
			System.out.println();
		}
		System.out.println("=============");
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.printf("%d*%d ", j, i);
			}
			System.out.println();
		}
		System.out.println("=============");
		
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.printf("%d*%d=%d ", j, i, j*i);
			}
			System.out.println();
		}
		System.out.println("=============");
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("*[%d,%d]",i,j);
			}
			System.out.println();
		}
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i-1; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 6-i; k++) {
					System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.printf("*[%d,%d]",i,j);
			}
			System.out.println();
		}
		
		
		
	}
	

}
