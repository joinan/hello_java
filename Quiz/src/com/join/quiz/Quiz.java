package com.join.quiz;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] ar) {

		Scanner scan = new Scanner(System.in);
		int menu;
		int flag=0;
		boolean in=true;
		boolean scd=true;
		boolean close=true;
		String ans;
		char quiz[][][] = {{{'육','두','쌍','칸'},{'짜','까','치','곱'},{'창','동','겹','파'},{'자','뽕','면','발'}},
				{{'장','훈','용','찬'},{'서','희','구','진'},{'다','호','최','유'},{'상','열','준','범'}},
				{{'건','제','검','박'},{'우','빈','공','부'},{'유','잔','상','돈'},{'훤','이','만','호'}},
				{{'지','원','주','명'},{'우','수','동','환'},{'박','성','연','인'},{'진','정','이','롱'}},
				{{'코','염','슴','치'},{'호','끼','수','지'},{'고','랑','원','린'},{'가','릴','타','문'}},
				{{'마','스','콜','두'},{'용','테','고','링'},{'축','역','프','수'},{'양','야','말','승'}},
				{{'이','플','동','에'},{'두','수','성','나'},{'글','한','케','다'},{'디','레','엘','티'}},
				{{'환','티','아','봉'},{'마','콜','운','레'},{'사','스','밀','다'},{'수','붕','제','비'}}};
		String qu[] = {"음식", "우리반 사람들 중에 한명", "남자배우", "우리반 사람들 중에 한명", "동물", "스포츠", "기업", "음료수"};
		String as[] = {"곱창", "유희상","공유","이명우","치타","승마","케이티","제티"};

		Main : while(in) {
			System.out.println("┌──────────────────┐");
			System.out.println("│      M E N U     │");
			System.out.println("│ 1.게임시작     	   │");
			System.out.println("│ 2.게임종료     	   │");
			System.out.println("└──────────────────┘");
			menu = scan.nextInt();
			if (menu == 1) {
				for(int i=0; i<8; i++) {
					flag = 0;
					System.out.println((i+1)+"번 문제 : "+qu[i]);
					System.out.println("┌───────────┐");
					for(int j=0; j<4; j++) {
						System.out.print("│ ");
						for(int l=0; l<4; l++) {
							System.out.print(quiz[i][j][l]+"　");
						}
						System.out.print("│");
						System.out.println();
					}
					System.out.println("└───────────┘");
					while (flag < 1) {
						ans = scan.next();
						if (ans.equals(as[i])){
							System.out.println("정답입니다!!");
							flag++;
						}
						else{
							System.out.println("틀렸습니다. 정답을 입력하세요.");
						}
					}
					while(scd) {
						System.out.println("게임을 계속하시겠습니까?(y/n)");
						if(scan.nextLine().equals("y")) break;
						else if(scan.nextLine().equals("n")) {
							System.out.println("게임을 종료합니다.");
							break Main;
						}else
							System.out.println("잘못 입력했습니다. 다시입력하시오.");
					}	
				}
				System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
				System.out.println("★축하합니다. 모든 문제를 맞췄습니다☆");
				System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
				while(close){
					System.out.println("게임을 다시 시작하시겠습니까?(y/n)");
					if(scan.nextLine().equals("y"))
						continue Main;
					else if(scan.nextLine().equals("n")) {
						System.out.println("게임을 종료합니다.");
						close=false;
						in=false;
					}else
						System.out.println("잘못 입력했습니다. 다시입력하세요.");
				}
			} else if (menu == 2) {
				System.out.println("게임을 종료합니다.");
				in=false;
			}
			else {
				System.out.println("잘못 입력했습니다. 다시입력하세요.");
				continue;
			}
		}		
	}
}
