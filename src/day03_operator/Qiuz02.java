package day03_operator;

import java.util.Scanner;

public class Qiuz02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//3의 배수
		System.out.print("수를 입력하세요 : ");
		int su1 = input.nextInt();
		if (su1%3==0) {
			System.out.println(su1);
		}
		
		//절대값
		System.out.print("수를 입력하세요 : ");
		int su2 = input.nextInt();
		if (su2<0) {
			System.out.println(su2*-1);
		}else {
			System.out.println(su2);
		}
		
		//큰수
		System.out.print("수를 입력하세요 : ");
		int num1 = input.nextInt();
		System.out.print("수를 입력하세요 : ");
		int num2 = input.nextInt();
		if (num1>num2) {
			System.out.println(num1);
		}else {
			System.out.println(num2);
		}
		
		//세수를 입력 받아 큰 수를 출력하시오
		System.out.print("수를 입력하세요 : ");
		int Thr1 = input.nextInt();
		System.out.print("수를 입력하세요 : ");
		int Thr2 = input.nextInt();
		System.out.print("수를 입력하세요 : ");
		int Thr3 = input.nextInt();
		if (Thr1>Thr2) {
			if(Thr1>Thr3) {
				System.out.println(Thr1);
			}
		} else if (Thr2 > Thr3) {
			System.out.println(Thr2);
		} else {
			System.out.println(Thr3);
		}

		//두수를 입력 받아 큰 수가 짝수이면 출력
		System.out.print("수를 입력하세요 : ");
		int A1 = input.nextInt();
		System.out.print("수를 입력하세요 : ");
		int B1 = input.nextInt();
		if (A1>B1) {
			if (A1%2==0) {
				System.out.println(A1);
			}
		} else {
			if (B1%2==0) {
				System.out.println(B1);
			}
		}
		
		//두수를 입력 받아 합이 짝수이고 3의 배수인 수를 출력하시오
		System.out.print("수를 입력하세요 : ");
		int A2 = input.nextInt();
		System.out.print("수를 입력하세요 : ");
		int B2 = input.nextInt();
		if ((A2+B2)%2==0) {
			if ((A2+B2)%3==0) {
				System.out.println(A2);
				System.out.println(B2);
			}
		}

	}
}
