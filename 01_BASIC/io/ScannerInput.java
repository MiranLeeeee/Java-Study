package io;

import java.util.Scanner;

public class ScannerInput {

	public static void main(String[] args) {
		//Scanner ��ü�� ����۰� �Է��� ���� ��ĵ��
		Scanner sc = new Scanner(System.in);
		//nextInt()�� ������ ���� ���� �Է��� ������ ������ ����
		int i = sc.nextInt();
		System.out.println(i);
		sc.close();
	}

}
