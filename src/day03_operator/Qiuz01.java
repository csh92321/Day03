package day03_operator;

import java.util.Scanner;

public class Qiuz01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("���� �Է��ϼ��� : ");
		int su = input.nextInt();
		
		String s1 = (su%2 == 0)? "¦��" : "Ȧ��" ;
		System.out.println(s1);
		
		String s2 = (su%3 == 0)? "3�� ���" : "3�� ����� �ƴ�";
		System.out.println(s2);
		
		System.out.println("���� �Է��ϼ��� : ");
		int num1 = input.nextInt();
		System.out.println("���� �Է��ϼ��� : ");
		int num2 = input.nextInt();
		
		int s3 = (num1 > num2)? num1 : num2;
		System.out.println(s3);
	}

}
