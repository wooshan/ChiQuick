package com.chiQuick.dnfnf;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class method {
	// main Method : 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  // Console에 사용자가 입력한 값을 input으로 받아들임.
		while(sc.hasNextInt()) {  // console에 입력한 Integer 값을 기다리고 있음. Integer 이외의 값을 입력하면 False로 빠져나감.
			System.out.println(sc.nextInt()*1000);
		} 
		sc.close();
		
		try {
			File file = new File("out.txt");
			Scanner sc1 = new Scanner(file); // 파일로 부터 입력값을 가져옴.
			while(sc1.hasNextInt()) { 
				System.out.println(sc1.nextInt()*1000);
			} 
			sc1.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		System.out.println(args.length);
		for (String e : args) {
			System.out.println(e);
		}
		
		numbering();
		
		String result = numbering1(1,5);
		System.out.println(result);
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
			out.write(result);
			out.close();
		} catch (IOException e) {
			
		}
		
		String[] members = getMembers(); // 배열을 리턴값으로 받음.
		System.out.println(members.length);
		System.out.println(members);
		System.out.println(members[1]);
	}
	
	// Method = 함수(function) : 함수를 사용하여 이미 정의한 로직을 재활용함으로써 코드의 양이 줄어 들고, 유지보수 용이성이 높아진다.
	
	// 입력값인 매개변수(parameter)를 함수에 인자(argument)값으로 전달하여 함수의 재활용성을 높인다.
	// Method 출력값 제어
	public static String numbering1(int init,int limit) {
		int i = init;
		String output = ""; 
		
		while (i < limit) {
			output += i;
			i++;
		}
		return output;
	}
	
	public static String[] getMembers() {
		String[] members = {"이정희", "우승한", "최삼용", "김보경"};
		return members;
	}
	
	public static void numbering() {
		int j = 0;
		while (j < 10) {
			System.out.println(j);
			j++;
		}
		
		// String[] classGroup = {"이정희", "우승한", "최삼용", "김보경"};
		String[] classGroup = new String[4];
		classGroup[0] = "이정희";
		System.out.println(classGroup.length);
		classGroup[1] = "우승한";
		System.out.println(classGroup.length);
		classGroup[2] = "최삼용";
		System.out.println(classGroup.length);
		classGroup[3] = "김보경";
		System.out.println(classGroup.length);
				
		System.out.println(classGroup[0]);
		System.out.println(classGroup[1]);
		System.out.println(classGroup[2]);
		System.out.println(classGroup[3]);
		
		String[] members = {"이정희", "우승한", "최삼용", "김보경"};
		for (int i=0; i<members.length; i++) {
			String member = members[i];
			System.out.println(member + "이 상담을 받았습니다.");
		}
		
		// 배열의 값을 변수에 하나씩 넣으면서 For문을 반복한다.
		for (String e : members) {
			System.out.println(e + "이 고백을 받았습니다.");
		}
		
		// 예외 처리 필요성
		System.out.println(members.length);
		members[3] = "직원 A";
		System.out.println(members[3]);
		/*
		members[4] = "직원 B";
		System.out.println(members.length);
		System.out.println(members[4]);
		*/
	}
	
}
