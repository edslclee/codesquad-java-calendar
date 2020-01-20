package com.ajnet.callendar;

import java.util.Scanner;

public class CalculateDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력해 주세요");
		int month = sc.nextInt();
		int [] maxday  = {31,28,31,30,31,30,31,31,30,31,30,31};
		System.out.printf("%d월은 %d일 까지 입니다 \n", month, maxday[month-1]);
		
		/*
		if(month ==1 || month ==3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			System.out.println("days are 31");
		}
		else if(month == 2){
			System.out.println("날수는 28 또는 29일 입니다");
		}
		else {
			System.out.println("날수는 30일 입니다");
		}
		*/
		
		sc.close();
		
	}

}
