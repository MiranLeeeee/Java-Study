package io;

import java.util.Scanner;
import java.io.*;

public class FileInput {

	public static void main(String[] args) {
		try {
			File file = new File("result.txt");
			//���� ������ ��ĵ
			Scanner sc = new Scanner(file);
			while(sc.hasNextInt()) {//��ĵ ���� �������̸�
				System.out.println(sc.nextInt()*100);
			}
			sc.close();
		}catch(FileNotFoundException e){//������ ã�� �� ������
			e.printStackTrace();
		}
	}

}
