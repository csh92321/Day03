package day03_operator;

import java.util.Scanner;

public class Qiuz02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//3�� ���
		System.out.print("���� �Է��ϼ��� : ");
		int su1 = input.nextInt();
		if (su1%3==0) {
			System.out.println(su1);
		}
		
		//���밪
		System.out.print("���� �Է��ϼ��� : ");
		int su2 = input.nextInt();
		if (su2<0) {
			System.out.println(su2*-1);
		}else {
			System.out.println(su2);
		}
		
		//ū��
		System.out.print("���� �Է��ϼ��� : ");
		int num1 = input.nextInt();
		System.out.print("���� �Է��ϼ��� : ");
		int num2 = input.nextInt();
		if (num1>num2) {
			System.out.println(num1);
		}else {
			System.out.println(num2);
		}
		
		//������ �Է� �޾� ū ���� ����Ͻÿ�
		System.out.print("���� �Է��ϼ��� : ");
		int Thr1 = input.nextInt();
		System.out.print("���� �Է��ϼ��� : ");
		int Thr2 = input.nextInt();
		System.out.print("���� �Է��ϼ��� : ");
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

		//�μ��� �Է� �޾� ū ���� ¦���̸� ���
		System.out.print("���� �Է��ϼ��� : ");
		int A1 = input.nextInt();
		System.out.print("���� �Է��ϼ��� : ");
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
		
		//�μ��� �Է� �޾� ���� ¦���̰� 3�� ����� ���� ����Ͻÿ�
		System.out.print("���� �Է��ϼ��� : ");
		int A2 = input.nextInt();
		System.out.print("���� �Է��ϼ��� : ");
		int B2 = input.nextInt();
		if ((A2+B2)%2==0) {
			if ((A2+B2)%3==0) {
				System.out.println(A2);
				System.out.println(B2);
			}
		}

	}
}
