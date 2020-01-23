package com.ajnet.callendar;

import java.util.Scanner;

public class Prompt {
	private final static String PROMPT = "cal> ";
	
	public void runPrompt() {
		Scanner sc = new Scanner(System.in);
		WhileCalendar cal = new WhileCalendar();
		
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
				cal.printCalendar(2020,month);
			}
		}
		
		System.out.println("Bye~~");
		sc.close();
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prompt prompt = new Prompt();
		prompt.runPrompt();
	}

}
