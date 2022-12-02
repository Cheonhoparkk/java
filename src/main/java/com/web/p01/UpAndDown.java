package com.web.p01;

import java.util.Random;
import java.util.Scanner;

public class UpAndDown {

	public static void main(String[] args) {
		Random r = new Random();
		int rNum = r.nextInt(100) + 1;
		Scanner scan = new Scanner(System.in);
		for (int i = 1;; i++) {
			System.out.println("맞출 숫자를 써봐 : ");
			String numStr = scan.nextLine();
			int num = Integer.parseInt(numStr);
			if (rNum > num) {
				System.out.println("업");
			} else if (rNum < num) {
				System.out.println("다운");
			} else {
				System.out.println("정답");
				System.out.println(i + " 번째 만에 맞췄군!");
				break;
			}
		}
	}
}
