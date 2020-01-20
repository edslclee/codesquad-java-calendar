package com.ajnet.callendar;

import java.util.Scanner;

public class WhileCalendar {

	public static final int [] maxday  = {31,28,31,30,31,30,31,31,30,31,30,31};
	public static int getMonthDays(int month) {
	    return maxday[month-1];
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String PROMPT = "cal> ";
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();
		int month = 1;
		
		while (true) {
			System.out.println("달을 입력하세요");
			System.out.print(PROMPT);
			month = sc.nextInt();
			if(month == -1) {
				break;
			}
			else if(month > 12){
			    continue;	
			}
			else 
			{
				System.out.printf("%d월은 %d일까지 있습니다\n", month, getMonthDays(month));
			}
		}
		
		System.out.println("Bye~~");
		
	}


}
