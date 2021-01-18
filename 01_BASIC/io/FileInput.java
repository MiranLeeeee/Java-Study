package io;

import java.util.Scanner;
import java.io.*;

public class FileInput {

	public static void main(String[] args) {
		try {
			File file = new File("result.txt");
			//파일 내용을 스캔
			Scanner sc = new Scanner(file);
			while(sc.hasNextInt()) {//스캔 값이 정수값이면
				System.out.println(sc.nextInt()*100);
			}
			sc.close();
		}catch(FileNotFoundException e){//파일을 찾을 수 없으면
			e.printStackTrace();
		}
	}

}
