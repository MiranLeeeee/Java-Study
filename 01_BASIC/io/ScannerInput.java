package io;

import java.util.Scanner;

public class ScannerInput {

	public static void main(String[] args) {
		//Scanner 객체는 사용작가 입력한 값을 스캔함
		Scanner sc = new Scanner(System.in);
		//nextInt()가 나오면 정수 값을 입력할 때까지 실행이 멈춤
		int i = sc.nextInt();
		System.out.println(i);
		sc.close();
	}

}
