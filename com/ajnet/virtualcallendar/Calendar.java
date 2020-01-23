package com.ajnet.virtualcallendar;

import java.util.Scanner;

public class Calendar {
		
		public static final int [] maxday  = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		public static int getMonthDays(int month) {
		    return maxday[month-1];
		}
		
		public void printCalendar(int year, int month, String yn) {
			System.out.printf("   <<%4d %3d>> \n", year, month);
			System.out.println(" 일 월 화 수 목 금 토");
			System.out.println("---------------------");
			
			int maxDay = getMonthDays(month);
			if(yn == "y") {
				maxDay = 29;
			}
	
			for(int i = 1; i <= maxDay; i++) {
				System.out.printf("%3d", i);
				if(i % 7 == 0) {
					System.out.println();
				}
			}
			System.out.println();
			
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String PROMPT = "cal> ";
			Scanner sc = new Scanner(System.in);
			Calendar cal = new Calendar();
			int year = 0;
			int month = 1;
			String yn = "n";
			while (true) {
				System.out.println("년도를 입력하세요");
				System.out.print(PROMPT);
				year = sc.nextInt();
				if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
					System.out.println(year + "년은 윤년");
					//윤년
					yn = "y"; 
				} else {
					System.out.println(year + "년은 평년");
					//평년
					yn = "n"; 
				}
								
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
					cal.printCalendar(year, month, yn);
				}
			}
			
			System.out.println("Bye~~");
			
		}
}
